//### This file created by BYACC 1.8(/Java extension  1.15)
//### Java capabilities added 7 Jan 97, Bob Jamison
//### Updated : 27 Nov 97  -- Bob Jamison, Joe Nieten
//###           01 Jan 98  -- Bob Jamison -- fixed generic semantic constructor
//###           01 Jun 99  -- Bob Jamison -- added Runnable support
//###           06 Aug 00  -- Bob Jamison -- made state variables class-global
//###           03 Jan 01  -- Bob Jamison -- improved flags, tracing
//###           16 May 01  -- Bob Jamison -- added custom stack sizing
//###           04 Mar 02  -- Yuval Oren  -- improved java performance, added options
//###           14 Mar 02  -- Tomas Hurka -- -d support, static initializer workaround
//### Please send bug reports to tom@hukatronic.cz
//### static char yysccsid[] = "@(#)yaccpar	1.8 (Berkeley) 01/20/90";






//#line 2 "gramatica.y"
import java.util.ArrayList;
import java.util.Stack;
import java.util.HashMap;
//#line 21 "Parser.java"




public class Parser
{

boolean yydebug;        //do I want debug output?
int yynerrs;            //number of errors so far
int yyerrflag;          //was there an error?
int yychar;             //the current working character

//########## MESSAGES ##########
//###############################################################
// method: debug
//###############################################################
void debug(String msg)
{
  if (yydebug)
    System.out.println(msg);
}

//########## STATE STACK ##########
final static int YYSTACKSIZE = 500;  //maximum stack size
int statestk[] = new int[YYSTACKSIZE]; //state stack
int stateptr;
int stateptrmax;                     //highest index of stackptr
int statemax;                        //state when highest index reached
//###############################################################
// methods: state stack push,pop,drop,peek
//###############################################################
final void state_push(int state)
{
  try {
		stateptr++;
		statestk[stateptr]=state;
	 }
	 catch (ArrayIndexOutOfBoundsException e) {
     int oldsize = statestk.length;
     int newsize = oldsize * 2;
     int[] newstack = new int[newsize];
     System.arraycopy(statestk,0,newstack,0,oldsize);
     statestk = newstack;
     statestk[stateptr]=state;
  }
}
final int state_pop()
{
  return statestk[stateptr--];
}
final void state_drop(int cnt)
{
  stateptr -= cnt; 
}
final int state_peek(int relative)
{
  return statestk[stateptr-relative];
}
//###############################################################
// method: init_stacks : allocate and prepare stacks
//###############################################################
final boolean init_stacks()
{
  stateptr = -1;
  val_init();
  return true;
}
//###############################################################
// method: dump_stacks : show n levels of the stacks
//###############################################################
void dump_stacks(int count)
{
int i;
  System.out.println("=index==state====value=     s:"+stateptr+"  v:"+valptr);
  for (i=0;i<count;i++)
    System.out.println(" "+i+"    "+statestk[i]+"      "+valstk[i]);
  System.out.println("======================");
}


//########## SEMANTIC VALUES ##########
//public class ParserVal is defined in ParserVal.java


String   yytext;//user variable to return contextual strings
ParserVal yyval; //used to return semantic vals from action routines
ParserVal yylval;//the 'lval' (result) I got from yylex()
ParserVal valstk[];
int valptr;
//###############################################################
// methods: value stack push,pop,drop,peek.
//###############################################################
void val_init()
{
  valstk=new ParserVal[YYSTACKSIZE];
  yyval=new ParserVal();
  yylval=new ParserVal();
  valptr=-1;
}
void val_push(ParserVal val)
{
  if (valptr>=YYSTACKSIZE)
    return;
  valstk[++valptr]=val;
}
ParserVal val_pop()
{
  if (valptr<0)
    return new ParserVal();
  return valstk[valptr--];
}
void val_drop(int cnt)
{
int ptr;
  ptr=valptr-cnt;
  if (ptr<0)
    return;
  valptr = ptr;
}
ParserVal val_peek(int relative)
{
int ptr;
  ptr=valptr-relative;
  if (ptr<0)
    return new ParserVal();
  return valstk[ptr];
}
final ParserVal dup_yyval(ParserVal val)
{
  ParserVal dup = new ParserVal();
  dup.ival = val.ival;
  dup.dval = val.dval;
  dup.sval = val.sval;
  dup.obj = val.obj;
  return dup;
}
//#### end semantic value section ####
public final static short IF=257;
public final static short THEN=258;
public final static short ELSE=259;
public final static short ENDIF=260;
public final static short PRINT=261;
public final static short FUNC=262;
public final static short RETURN=263;
public final static short BEGIN=264;
public final static short END=265;
public final static short BREAK=266;
public final static short ULONG=267;
public final static short DOUBLE=268;
public final static short WHILE=269;
public final static short DO=270;
public final static short COMP_MAYOR_IGUAL=271;
public final static short COMP_MENOR_IGUAL=272;
public final static short ASIG=273;
public final static short COMP_IGUAL=274;
public final static short AND=275;
public final static short OR=276;
public final static short ID=277;
public final static short CTE_ULONG=278;
public final static short CTE_DOUBLE=279;
public final static short CADENA=280;
public final static short POST=281;
public final static short TRY=282;
public final static short CATCH=283;
public final static short COMP_DISTINTO=284;
public final static short CALL=285;
public final static short YYERRCODE=256;
final static short yylhs[] = {                           -1,
    0,    1,    1,    2,    4,    4,    5,    5,    5,    5,
    5,    6,    6,    7,    7,    8,    9,    9,   10,   10,
   11,   11,   11,   11,   15,   13,   13,   13,   13,   14,
   14,   14,   14,   14,    3,   12,   18,   18,   19,   19,
   19,   19,   19,   20,   20,   20,   20,   25,   25,   21,
   21,   28,   26,   26,   26,   26,   26,   29,   17,   17,
   30,   32,   32,   32,   32,   32,   32,   31,   31,   27,
   27,   22,   22,   22,   22,   22,   33,   23,   34,   34,
   34,   34,   34,   36,   35,   35,   37,   37,   38,   38,
   38,   38,   38,   38,   39,   40,   40,   24,   41,   41,
   41,   42,   16,   16,   16,   43,   43,   43,   43,   44,
   44,   44,   44,   44,
};
final static short yylen[] = {                            2,
    3,    2,    2,    1,    3,    2,    2,    5,    1,    2,
    3,    1,    1,    3,    1,    2,    3,    1,    6,    7,
    5,    5,    4,    4,    2,    5,    5,    4,    4,    6,
    6,    5,    4,    4,    3,    1,    2,    1,    1,    1,
    1,    1,    1,    4,    3,    4,    2,    5,    6,    4,
    6,    1,    5,    5,    4,    4,    6,    1,    3,    1,
    3,    1,    1,    1,    1,    1,    1,    1,    1,    3,
    1,    5,    5,    4,    4,    3,    1,    2,    5,    5,
    5,    4,    4,    1,    3,    1,    2,    1,    1,    1,
    1,    1,    1,    1,    2,    4,    4,    2,    3,    3,
    2,    1,    3,    3,    1,    3,    3,    1,    2,    1,
    1,    1,    1,    1,
};
final static short yydefred[] = {                         0,
    0,    0,    0,    0,    3,    2,    0,   12,   13,    0,
    4,    0,    0,    0,    9,    0,    0,   10,    0,    1,
    0,    0,   16,    7,    0,    0,    0,    0,    0,   58,
   77,   84,    0,  102,    0,    0,   39,   40,   41,   42,
   43,    0,    0,    0,    0,    0,    0,    0,    5,   11,
    0,    0,    0,    0,    0,   14,   47,    0,    0,   35,
   37,    0,   71,    0,    0,  110,  113,  114,    0,    0,
    0,    0,    0,  112,    0,  111,    0,  108,    0,    0,
    0,    0,    0,   89,   90,   91,   92,   93,   78,   86,
   94,    0,    0,   98,    0,    0,    0,   25,   23,    0,
    0,   36,   45,    0,    0,    0,   52,    0,    0,    0,
    0,    0,    0,  109,   62,   63,   64,   65,   66,   67,
    0,    0,    0,    0,   68,   69,    0,    0,    0,   76,
    0,    0,    0,    0,    0,   95,    0,    0,    0,  100,
   99,   22,   21,    0,    8,    0,    0,   46,   44,   70,
   50,    0,    0,    0,    0,    0,   55,    0,    0,    0,
    0,   56,   59,  106,  107,   75,    0,   74,    0,   85,
   87,    0,   82,    0,   83,    0,    0,    0,   19,    0,
    0,    0,   97,   96,    0,    0,   54,    0,   53,   73,
   72,   81,   80,   79,   17,    0,    0,    0,    0,    0,
    0,   20,   51,    0,   48,   57,    0,   28,    0,   29,
    0,    0,    0,   49,   27,   26,   34,    0,    0,    0,
   33,   32,    0,    0,   31,   30,
};
final static short yydgoto[] = {                          3,
    4,   10,   20,   11,   12,   13,   18,   14,  145,   15,
   16,  101,  147,  181,   53,   72,   73,   35,   36,   37,
   38,   39,   40,   41,   74,   42,   64,  109,   43,   75,
  127,  123,   44,   45,   89,   46,  134,  135,   91,   76,
   47,   48,   77,   78,
};
final static short yysindex[] = {                      -211,
  -58,  -46,    0,  -99,    0,    0, -242,    0,    0, -225,
    0,   10, -180,  -31,    0,  -99,   14,    0,  -96,    0,
  -99, -242,    0,    0,  -38, -168, -185, -242,   25,    0,
    0,    0, -233,    0, -172,  -96,    0,    0,    0,    0,
    0, -105,  -37,  -36, -119,  -25, -225, -210,    0,    0,
  -80, -181,   89,  102,  -96,    0,    0,   53,   40,    0,
    0,  -96,    0, -134,  106,    0,    0,    0, -128,   43,
  -94,   29,  125,    0, -122,    0,    1,    0,  111,  130,
 -223, -146,  116,    0,    0,    0,    0,    0,    0,    0,
    0,   56,  138,    0, -246,  141,  163,    0,    0,  -69,
  -54,    0,    0,  153,   96,  -55,    0,  154, -105,   59,
  171,  173,  -24,    0,    0,    0,    0,    0,    0,    0,
   71,   71,   71,  -43,    0,    0,   71,  -94,  -94,    0,
  158,  175,   65,  -47, -146,    0,  178,  -35,  -49,    0,
    0,    0,    0,  179,    0,  -21, -239,    0,    0,    0,
    0,  -28,  181,  151,   74,   -8,    0, -153,    1,    1,
  156,    0,    0,    0,    0,    0,  166,    0,  167,    0,
    0,  -19,    0, -215,    0,  -69,   87,  152,    0,  -40,
  -10,  168,    0,    0,  192,  157,    0,  200,    0,    0,
    0,    0,    0,    0,    0,  227,   49,  211,   71,  231,
  232,    0,    0,  213,    0,    0,  215,    0,  218,    0,
   68,   90,  219,    0,    0,    0,    0,  220,  239,  243,
    0,    0,  238,  245,    0,    0,
};
final static short yyrindex[] = {                         0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,  246,    0,    0,    0,
   27,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,  -60,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,  -34,    0,   -9,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,   34,    0,  -78,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,   41,    0,    0,    0,    0,    0,
    0,    0,    0,  248,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,   11,   18,
  103,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,
};
final static short yygindex[] = {                         0,
    0,  293,  263,  295,    0,   -4,  100,    0,  147,    0,
    0,    0,    0,    0,  275,  -48,  -32,   78,  -26,  -18,
  -33,  -17,  -14,   -1,    0,    0,  205,    0,    0,    0,
    0,    0,    0,    0,    0,    0,  194,  286,    0,    0,
    0,    0,   85,  -42,
};
final static int YYTABLESIZE=379;
static short yytable[];
static { yytable();}
static void yytable(){
yytable = new short[]{                        199,
    5,   51,   70,   81,   71,  174,   60,   71,   26,  140,
  105,   85,    6,   93,   92,   63,  158,  200,  177,   71,
   52,   54,   58,   71,   60,  179,   84,   86,  114,   95,
   87,  105,  132,  105,   17,  105,  141,  113,   19,   59,
  193,  180,  128,   88,    1,   29,   52,  129,   85,  105,
  105,  103,  105,  103,  194,  103,  133,   28,  104,  138,
  104,  154,  104,   84,   86,    2,   33,   87,   21,  103,
  103,  121,  103,  122,  161,   22,  104,  104,   55,  104,
   88,   23,   63,   57,   71,  164,  165,   71,  119,  209,
  120,  121,   60,  122,  163,   98,   17,  178,    8,    9,
   71,   85,  188,   71,  189,  169,  186,  208,  218,   29,
   30,  103,   24,   61,   31,   71,   84,   86,   71,   83,
   87,   50,   32,  168,  107,  108,  217,   56,  197,   99,
   33,   71,  102,   88,   71,   34,   29,   30,  121,  106,
  122,   31,  100,   61,   82,  110,   83,  201,  111,   32,
   29,   30,  125,  126,  149,   31,    7,   33,   62,   29,
   30,   61,   34,   32,   31,  124,  211,    8,    9,  130,
  131,   33,   32,   65,  136,   96,   34,   24,  139,  220,
   33,  142,   66,   67,   68,   34,    8,    9,   24,   24,
   69,  184,  198,  121,  121,  122,  122,  205,  121,  121,
  122,  122,   38,  143,   38,  159,  160,  144,  146,  150,
  155,  148,  151,  156,  162,  167,  166,  170,  172,   79,
  175,  183,  176,   60,  190,  191,  203,   65,    8,    9,
   65,  182,  204,  157,  173,   60,   66,   67,   68,   66,
   67,   68,   65,   80,   69,   25,   65,   69,  105,  187,
  192,   66,   67,   68,  202,   66,   67,   68,  206,   69,
  105,  105,  105,   69,  105,  105,  105,  207,  103,  210,
  212,  214,  213,  215,  105,  104,  216,  221,  222,  223,
  103,  103,  103,  224,  103,  103,  103,  104,  104,  104,
    6,  104,  104,  104,  103,  104,  225,  101,  112,  115,
  116,  104,  117,  226,   15,   88,   18,   65,   27,   94,
   65,  137,  118,  152,  153,   49,   66,   67,   68,   66,
   67,   68,  195,   65,   69,   97,   65,   69,  171,  185,
   90,    0,   66,   67,   68,   66,   67,   68,   65,    0,
   69,   65,  196,   69,    0,  219,    0,   66,   67,   68,
   66,   67,   68,    0,   65,   69,    0,   65,   69,    0,
   61,    0,    0,   66,   67,   68,   66,   67,   68,    0,
    0,   69,   61,    0,   69,    0,    0,   61,   61,
};
}
static short yycheck[];
static { yycheck(); }
static void yycheck() {
yycheck = new short[] {                         40,
   59,   40,   40,   40,   45,   41,   41,   45,   40,  256,
   59,   45,   59,   46,   40,   42,   41,   58,   40,   45,
   25,   26,  256,   45,   59,  265,   45,   45,   71,   48,
   45,   41,  256,   43,  277,   45,  283,   70,  264,  273,
  256,  281,   42,   45,  256,  256,   51,   47,   82,   59,
   60,   41,   62,   43,  270,   45,  280,   44,   41,   92,
   43,  110,   45,   82,   82,  277,  277,   82,   59,   59,
   60,   43,   62,   45,  123,  256,   59,   60,  264,   62,
   82,  262,  109,   59,   45,  128,  129,   45,   60,   41,
   62,   43,  265,   45,  127,  277,  277,  146,  267,  268,
   45,  135,  256,   45,  258,   41,  155,   59,   41,  256,
  257,   59,   13,   36,  261,   45,  135,  135,   45,  266,
  135,   22,  269,   59,  259,  260,   59,   28,  177,   41,
  277,   45,   55,  135,   45,  282,  256,  257,   43,   62,
   45,  261,   41,   41,  264,   40,  266,  180,  277,  269,
  256,  257,  275,  276,   59,  261,  256,  277,  264,  256,
  257,   59,  282,  269,  261,   41,  199,  267,  268,   59,
   41,  277,  269,  268,   59,  256,  282,  256,   41,  212,
  277,   41,  277,  278,  279,  282,  267,  268,  267,  268,
  285,   41,   41,   43,   43,   45,   45,   41,   43,   43,
   45,   45,  263,   41,  265,  121,  122,  277,  263,  265,
   40,   59,   59,   41,  258,   41,   59,  265,   41,  256,
  270,   41,   44,  258,   59,   59,   59,  268,  267,  268,
  268,  260,   41,  258,  270,  270,  277,  278,  279,  277,
  278,  279,  268,  280,  285,  277,  268,  285,  258,  258,
  270,  277,  278,  279,  265,  277,  278,  279,   59,  285,
  270,  271,  272,  285,  274,  275,  276,   41,  258,   59,
   40,   59,   41,   59,  284,  258,   59,   59,   59,   41,
  270,  271,  272,   41,  274,  275,  276,  270,  271,  272,
  264,  274,  275,  276,  284,  256,   59,  264,  256,  271,
  272,  284,  274,   59,   59,  265,   59,  268,   16,   47,
  268,  256,  284,  109,  256,   21,  277,  278,  279,  277,
  278,  279,  176,  268,  285,   51,  268,  285,  135,  256,
   45,   -1,  277,  278,  279,  277,  278,  279,  268,   -1,
  285,  268,  256,  285,   -1,  256,   -1,  277,  278,  279,
  277,  278,  279,   -1,  268,  285,   -1,  268,  285,   -1,
  258,   -1,   -1,  277,  278,  279,  277,  278,  279,   -1,
   -1,  285,  270,   -1,  285,   -1,   -1,  275,  276,
};
}
final static short YYFINAL=3;
final static short YYMAXTOKEN=285;
final static String yyname[] = {
"end-of-file",null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,"'('","')'","'*'","'+'","','",
"'-'",null,"'/'",null,null,null,null,null,null,null,null,null,null,"':'","';'",
"'<'",null,"'>'",null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,"IF","THEN","ELSE","ENDIF","PRINT","FUNC",
"RETURN","BEGIN","END","BREAK","ULONG","DOUBLE","WHILE","DO","COMP_MAYOR_IGUAL",
"COMP_MENOR_IGUAL","ASIG","COMP_IGUAL","AND","OR","ID","CTE_ULONG","CTE_DOUBLE",
"CADENA","POST","TRY","CATCH","COMP_DISTINTO","CALL",
};
final static String yyrule[] = {
"$accept : programa",
"programa : cabecera_programa bloque_declarativo bloque_ejecutable",
"cabecera_programa : ID ';'",
"cabecera_programa : error ';'",
"bloque_declarativo : sentencias_declarativas",
"sentencias_declarativas : sentencia_declarativa ';' sentencias_declarativas",
"sentencias_declarativas : sentencia_declarativa ';'",
"sentencia_declarativa : tipo lista_variables",
"sentencia_declarativa : tipo_funcion '(' tipo ')' lista_funcion_como_variables",
"sentencia_declarativa : sentencia_declarativa_funcion",
"sentencia_declarativa : error lista_variables",
"sentencia_declarativa : tipo error lista_variables",
"tipo : ULONG",
"tipo : DOUBLE",
"lista_variables : ID ',' lista_variables",
"lista_variables : ID",
"tipo_funcion : tipo FUNC",
"lista_funcion_como_variables : ID ',' lista_funcion_como_variables",
"lista_funcion_como_variables : ID",
"sentencia_declarativa_funcion : cabecera_funcion bloque_declarativo BEGIN bloque_ejecutable_funcion retorno_funcion END",
"sentencia_declarativa_funcion : cabecera_funcion bloque_declarativo BEGIN bloque_ejecutable_funcion retorno_funcion postcondicion END",
"cabecera_funcion : tipo_funcion ID '(' parametro ')'",
"cabecera_funcion : tipo_funcion ID '(' error ')'",
"cabecera_funcion : tipo_funcion ID parametro ')'",
"cabecera_funcion : tipo_funcion ID '(' parametro",
"parametro : tipo ID",
"retorno_funcion : RETURN '(' expresion_aritmetica ')' ';'",
"retorno_funcion : RETURN '(' error ')' ';'",
"retorno_funcion : RETURN '(' expresion_aritmetica ';'",
"retorno_funcion : RETURN expresion_aritmetica ')' ';'",
"postcondicion : POST ':' '(' condicion ')' ';'",
"postcondicion : POST ':' '(' error ')' ';'",
"postcondicion : POST '(' condicion ')' ';'",
"postcondicion : POST condicion ')' ';'",
"postcondicion : POST '(' condicion ';'",
"bloque_ejecutable : BEGIN sentencias_ejecutables END",
"bloque_ejecutable_funcion : sentencias_ejecutables",
"sentencias_ejecutables : sentencia_ejecutable sentencias_ejecutables",
"sentencias_ejecutables : sentencia_ejecutable",
"sentencia_ejecutable : sentencia_asignacion",
"sentencia_ejecutable : sentencia_condicional",
"sentencia_ejecutable : sentencia_imprimir",
"sentencia_ejecutable : sentencia_iterativa",
"sentencia_ejecutable : sentencia_try_catch",
"sentencia_asignacion : ID ASIG expresion_aritmetica ';'",
"sentencia_asignacion : ID error ';'",
"sentencia_asignacion : ID ASIG error ';'",
"sentencia_asignacion : error ';'",
"sentencia_llamado_funcion : CALL ID '(' expresion_aritmetica ')'",
"sentencia_llamado_funcion : CALL ID '(' error ')' ';'",
"sentencia_condicional : condicional bloque_ejecutable_condicional ENDIF ';'",
"sentencia_condicional : condicional bloque_ejecutable_condicional else bloque_ejecutable_condicional ENDIF ';'",
"else : ELSE",
"condicional : if '(' condicion ')' THEN",
"condicional : if '(' error ')' THEN",
"condicional : if '(' condicion THEN",
"condicional : if condicion ')' THEN",
"condicional : if '(' condicion ')' error ';'",
"if : IF",
"condicion : expresion_booleana operacion_booleana condicion",
"condicion : expresion_booleana",
"expresion_booleana : expresion_aritmetica comparador expresion_aritmetica",
"comparador : COMP_MAYOR_IGUAL",
"comparador : COMP_MENOR_IGUAL",
"comparador : COMP_IGUAL",
"comparador : COMP_DISTINTO",
"comparador : '<'",
"comparador : '>'",
"operacion_booleana : AND",
"operacion_booleana : OR",
"bloque_ejecutable_condicional : BEGIN sentencias_ejecutables END",
"bloque_ejecutable_condicional : sentencia_ejecutable",
"sentencia_imprimir : print '(' CADENA ')' ';'",
"sentencia_imprimir : print '(' error ')' ';'",
"sentencia_imprimir : print '(' CADENA ';'",
"sentencia_imprimir : print CADENA ')' ';'",
"sentencia_imprimir : print error ';'",
"print : PRINT",
"sentencia_iterativa : iterativo bloque_ejecutable_iterativo",
"iterativo : while '(' condicion ')' DO",
"iterativo : while '(' condicion ')' error",
"iterativo : while '(' error ')' DO",
"iterativo : while '(' condicion DO",
"iterativo : while condicion ')' DO",
"while : WHILE",
"bloque_ejecutable_iterativo : BEGIN sentencias_ejecutables_iterativas END",
"bloque_ejecutable_iterativo : sentencia_ejecutable_iterativa",
"sentencias_ejecutables_iterativas : sentencia_ejecutable_iterativa sentencias_ejecutables_iterativas",
"sentencias_ejecutables_iterativas : sentencia_ejecutable_iterativa",
"sentencia_ejecutable_iterativa : sentencia_asignacion",
"sentencia_ejecutable_iterativa : sentencia_condicional",
"sentencia_ejecutable_iterativa : sentencia_imprimir",
"sentencia_ejecutable_iterativa : sentencia_iterativa",
"sentencia_ejecutable_iterativa : sentencia_try_catch",
"sentencia_ejecutable_iterativa : sentencia_break",
"sentencia_break : BREAK ';'",
"sentencia_conversion : DOUBLE '(' expresion_aritmetica ')'",
"sentencia_conversion : DOUBLE '(' error ')'",
"sentencia_try_catch : bifurcacion_try bloque_ejecutable",
"bifurcacion_try : try sentencia_asignacion CATCH",
"bifurcacion_try : try sentencia_asignacion error",
"bifurcacion_try : try sentencia_asignacion",
"try : TRY",
"expresion_aritmetica : expresion_aritmetica '+' termino",
"expresion_aritmetica : expresion_aritmetica '-' termino",
"expresion_aritmetica : termino",
"termino : termino '*' factor",
"termino : termino '/' factor",
"termino : factor",
"termino : '-' factor",
"factor : ID",
"factor : sentencia_conversion",
"factor : sentencia_llamado_funcion",
"factor : CTE_ULONG",
"factor : CTE_DOUBLE",
};

//#line 533 "gramatica.y"

///CODIGO JAVA

private AnalizadorLexico analizadorLexico;
private TablaSimbolo tablaSimbolo;
private ArrayList<String> estructuras = new ArrayList<String>(); //Lista de las estructuras detectadas por el parser
private ArrayList<String> erroresSintacticos = new ArrayList<String>(); //Lista de errores sintacticos detectados por el parser
private ArrayList<String> erroresSemanticos = new ArrayList<String>(); //Lista de errores semanticos detectados por el parser
private int indiceErrorABorrar;//entero utilizado para indicar un error a borrar que corresponde al mal uso de un identificador, en caso de que su uso sea correcto se borrara el error (esto solo sucede cuando se hace una asignacion de una un funcion a una variable de forma correcta)
private ArrayList<String> warnings = new ArrayList<String>(); //Lista de warnings detectados por el parser

private ArrayList<Terceto> tercetos = new ArrayList<Terceto>(); //Lista de tercetos generados
private Stack<Integer> pila = new Stack<Integer>(); //Pila utilizada para los tercetos

private HashMap<Integer, Integer> postCondiciones = new HashMap<Integer, Integer>();//Hashmap utilizado para guardar el id de las funciones junto a las referencias de sus postcondicion

private String ambitoActual;
private String tipoActual; //variable para saber el ultimo tipo leido
private String tipoActualdeFuncion; //Variable para saber el ultimo tipo de funcion leido

private int ultimoTry; //variable para saber cual es el ultimo terceto antes de un try, sirve por si no se encuentra ningun CALL dentro de un TRY

public void setAnalizadorLexico(AnalizadorLexico al){
	this.analizadorLexico = al;
	tablaSimbolo= analizadorLexico.getTablaSimbolo();
}

public int crearTerceto(ParserVal t1, ParserVal t2, ParserVal t3){
	tercetos.add( new Terceto(t1, t2, t3) );
	return tercetos.size()-1;
}

//Metodo usado por el Main para imprimir los tercetos
public void imprimirTercetos(){
	tablaSimbolo= analizadorLexico.getTablaSimbolo();
	int i = 0;
	for(Terceto t : tercetos){
		System.out.println("[" + i + "]" + t.getTerceto(tablaSimbolo));
		i++;
		if(t.getEtiqueta())
			System.out.println("ETIQUETA[" + i + "]");
	}
}

private void addEstructura(String e){
	estructuras.add(e);
}

//Metodo usado por el Main para imprimir las estructuras
public void imprimirEstructuras(){
	System.out.println("Cantidad de estructuras detectadas: " + estructuras.size());
	for(String e : estructuras)
		System.out.println(e);
}

private void addErrorSintactico(String e){
	erroresSintacticos.add(e);
}

private void addErrorSemantico(String e){
	erroresSemanticos.add(e);
}

private void addWarning(String w){
	warnings.add(w);
}

//Metodo usado por el Main para imprimir los erroresSintacticos lexicos
public void imprimirErroresSintacticos(){
        System.out.println("Se detectaron " + this.erroresSintacticos.size() + " errores sintacticos en el codigo");
        for(String e: this.erroresSintacticos){
            System.out.println(" - " + e);
        }
}

//Metodo usado por el Main para imprimir los erroresSemanticos lexicos
public void imprimirErroresSemanticos(){
        System.out.println("Se detectaron " + this.erroresSemanticos.size() + " errores semanticos en el codigo");
        for(String e: this.erroresSemanticos){
            System.out.println(" - " + e);
        }
}

//Metodo utilizado por el Main para imprimir los warnings semanticos detectados
public void imprimirWarningsSemanticos(){
	System.out.println("Se detectaron " + this.warnings.size() + " warnings semanticos en el codigo");
	for(String w: this.warnings){
	    System.out.println(" - " + w);
	}
}

public boolean hayError(){
	return ((this.erroresSintacticos.size()>0) || (this.erroresSemanticos.size()>0));
}

public ArrayList<Terceto> getTercetos(){
	return tercetos;
}

private int yylex(){
	Dupla<Integer, Integer> tokenActual = analizadorLexico.nextToken();
	if(tokenActual.getSegundo() != null)
		yylval = new ParserVal((int)tokenActual.getSegundo());
	//System.out.println("Token devuelto por yylex: " + tokenActual.getPrimero() );
	return tokenActual.getPrimero();
}

private void yyerror(String s){

}
//#line 579 "Parser.java"
//###############################################################
// method: yylexdebug : check lexer state
//###############################################################
void yylexdebug(int state,int ch)
{
String s=null;
  if (ch < 0) ch=0;
  if (ch <= YYMAXTOKEN) //check index bounds
     s = yyname[ch];    //now get it
  if (s==null)
    s = "illegal-symbol";
  debug("state "+state+", reading "+ch+" ("+s+")");
}





//The following are now global, to aid in error reporting
int yyn;       //next next thing to do
int yym;       //
int yystate;   //current parsing state from state table
String yys;    //current token string


//###############################################################
// method: yyparse : parse input and execute indicated items
//###############################################################
int yyparse()
{
boolean doaction;
  init_stacks();
  yynerrs = 0;
  yyerrflag = 0;
  yychar = -1;          //impossible char forces a read
  yystate=0;            //initial state
  state_push(yystate);  //save it
  val_push(yylval);     //save empty value
  while (true) //until parsing is done, either correctly, or w/error
    {
    doaction=true;
    if (yydebug) debug("loop"); 
    //#### NEXT ACTION (from reduction table)
    for (yyn=yydefred[yystate];yyn==0;yyn=yydefred[yystate])
      {
      if (yydebug) debug("yyn:"+yyn+"  state:"+yystate+"  yychar:"+yychar);
      if (yychar < 0)      //we want a char?
        {
        yychar = yylex();  //get next token
        if (yydebug) debug(" next yychar:"+yychar);
        //#### ERROR CHECK ####
        if (yychar < 0)    //it it didn't work/error
          {
          yychar = 0;      //change it to default string (no -1!)
          if (yydebug)
            yylexdebug(yystate,yychar);
          }
        }//yychar<0
      yyn = yysindex[yystate];  //get amount to shift by (shift index)
      if ((yyn != 0) && (yyn += yychar) >= 0 &&
          yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
        {
        if (yydebug)
          debug("state "+yystate+", shifting to state "+yytable[yyn]);
        //#### NEXT STATE ####
        yystate = yytable[yyn];//we are in a new state
        state_push(yystate);   //save it
        val_push(yylval);      //push our lval as the input for next rule
        yychar = -1;           //since we have 'eaten' a token, say we need another
        if (yyerrflag > 0)     //have we recovered an error?
           --yyerrflag;        //give ourselves credit
        doaction=false;        //but don't process yet
        break;   //quit the yyn=0 loop
        }

    yyn = yyrindex[yystate];  //reduce
    if ((yyn !=0 ) && (yyn += yychar) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
      {   //we reduced!
      if (yydebug) debug("reduce");
      yyn = yytable[yyn];
      doaction=true; //get ready to execute
      break;         //drop down to actions
      }
    else //ERROR RECOVERY
      {
      if (yyerrflag==0)
        {
        yyerror("syntax error");
        yynerrs++;
        }
      if (yyerrflag < 3) //low error count?
        {
        yyerrflag = 3;
        while (true)   //do until break
          {
          if (stateptr<0)   //check for under & overflow here
            {
            yyerror("stack underflow. aborting...");  //note lower case 's'
            return 1;
            }
          yyn = yysindex[state_peek(0)];
          if ((yyn != 0) && (yyn += YYERRCODE) >= 0 &&
                    yyn <= YYTABLESIZE && yycheck[yyn] == YYERRCODE)
            {
            if (yydebug)
              debug("state "+state_peek(0)+", error recovery shifting to state "+yytable[yyn]+" ");
            yystate = yytable[yyn];
            state_push(yystate);
            val_push(yylval);
            doaction=false;
            break;
            }
          else
            {
            if (yydebug)
              debug("error recovery discarding state "+state_peek(0)+" ");
            if (stateptr<0)   //check for under & overflow here
              {
              yyerror("Stack underflow. aborting...");  //capital 'S'
              return 1;
              }
            state_pop();
            val_pop();
            }
          }
        }
      else            //discard this token
        {
        if (yychar == 0)
          return 1; //yyabort
        if (yydebug)
          {
          yys = null;
          if (yychar <= YYMAXTOKEN) yys = yyname[yychar];
          if (yys == null) yys = "illegal-symbol";
          debug("state "+yystate+", error recovery discards token "+yychar+" ("+yys+")");
          }
        yychar = -1;  //read another
        }
      }//end error recovery
    }//yyn=0 loop
    if (!doaction)   //any reason not to proceed?
      continue;      //skip action
    yym = yylen[yyn];          //get count of terminals on rhs
    if (yydebug)
      debug("state "+yystate+", reducing "+yym+" by rule "+yyn+" ("+yyrule[yyn]+")");
    if (yym>0)                 //if count of rhs not 'nil'
      yyval = val_peek(yym-1); //get current semantic value
    yyval = dup_yyval(yyval); //duplicate yyval if ParserVal is used as semantic value
    switch(yyn)
      {
//########## USER-SUPPLIED ACTIONS ##########
case 2:
//#line 19 "gramatica.y"
{ addEstructura( "Declaracion de programa, en la linea: " + analizadorLexico.getNroLineaToken() );
 			      ambitoActual= tablaSimbolo.obtenerValor(val_peek(1).ival);
 			    }
break;
case 3:
//#line 22 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", identificador de programa invalido");
 		    		 ambitoActual= "error";
 		    		}
break;
case 7:
//#line 34 "gramatica.y"
{ addEstructura( "Declaracion de variables, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 10:
//#line 37 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", tipo de variable invalido"); }
break;
case 11:
//#line 38 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", declaracion invalida"); }
break;
case 12:
//#line 41 "gramatica.y"
{tipoActual= "ULONG"; yyval.sval= "ULONG";}
break;
case 13:
//#line 42 "gramatica.y"
{tipoActual= "DOUBLE"; yyval.sval= "DOUBLE";}
break;
case 14:
//#line 45 "gramatica.y"
{
                        if(!tablaSimbolo.existeToken(tablaSimbolo.obtenerToken(val_peek(2).ival).getLexema()+'.'+ambitoActual)){
			    tablaSimbolo.obtenerToken(val_peek(2).ival).setLexema(tablaSimbolo.obtenerToken(val_peek(2).ival).getLexema()+'.'+ambitoActual);
			    tablaSimbolo.obtenerToken(val_peek(2).ival).setTipo(tipoActual);
			    tablaSimbolo.obtenerToken(val_peek(2).ival).setUso("variable");
			}else{
			    tablaSimbolo.borrarToken(val_peek(2).ival);
			    addWarning("Linea " + analizadorLexico.getNroLineaToken() + ", variable redeclarada, se eliminaron las redeclaraciones pertinentes");
			}
 		 }
break;
case 15:
//#line 55 "gramatica.y"
{
                        if(!tablaSimbolo.existeToken(tablaSimbolo.obtenerToken(val_peek(0).ival).getLexema()+'.'+ambitoActual)){
            	            tablaSimbolo.obtenerToken(val_peek(0).ival).setLexema(tablaSimbolo.obtenerToken(val_peek(0).ival).getLexema()+'.'+ambitoActual);
			    tablaSimbolo.obtenerToken(val_peek(0).ival).setTipo(tipoActual);
			    tablaSimbolo.obtenerToken(val_peek(0).ival).setUso("variable");
			}
			else{
			    tablaSimbolo.borrarToken(val_peek(0).ival);
			    addWarning("Linea " + analizadorLexico.getNroLineaToken() + ", variable redeclarada, se eliminaron las redeclaraciones pertinentes");
			}
	         }
break;
case 16:
//#line 68 "gramatica.y"
{
		tipoActualdeFuncion= val_peek(1).sval;
		addEstructura( "Declaracion de funciones como variables, en la linea: " + analizadorLexico.getNroLineaToken() );
 }
break;
case 17:
//#line 74 "gramatica.y"
{
                         if(!tablaSimbolo.existeToken(tablaSimbolo.obtenerToken(val_peek(2).ival).getLexema()+'.'+ambitoActual)){
 			    tablaSimbolo.obtenerToken(val_peek(2).ival).setLexema(tablaSimbolo.obtenerToken(val_peek(2).ival).getLexema()+'.'+ambitoActual);
 			    tablaSimbolo.obtenerToken(val_peek(2).ival).setTipo(tipoActualdeFuncion);
 			    tablaSimbolo.obtenerToken(val_peek(2).ival).setUso("funcion designada a variable");
 			    tablaSimbolo.obtenerToken(val_peek(2).ival).setTipoParametro(tipoActual);
 			}else{
 			    tablaSimbolo.borrarToken(val_peek(2).ival);
 			    addWarning("Linea " + analizadorLexico.getNroLineaToken() + ", variable redeclarada, se eliminaron las redeclaraciones pertinentes");
 			}
  		 }
break;
case 18:
//#line 85 "gramatica.y"
{
                         if(!tablaSimbolo.existeToken(tablaSimbolo.obtenerToken(val_peek(0).ival).getLexema()+'.'+ambitoActual)){
             	            tablaSimbolo.obtenerToken(val_peek(0).ival).setLexema(tablaSimbolo.obtenerToken(val_peek(0).ival).getLexema()+'.'+ambitoActual);
 			    tablaSimbolo.obtenerToken(val_peek(0).ival).setTipo(tipoActualdeFuncion);
 			    tablaSimbolo.obtenerToken(val_peek(0).ival).setUso("funcion designada a variable");
 			    tablaSimbolo.obtenerToken(val_peek(0).ival).setTipoParametro(tipoActual);
 			}
 			else{
 			    tablaSimbolo.borrarToken(val_peek(0).ival);
 			    addWarning("Linea " + analizadorLexico.getNroLineaToken() + ", variable redeclarada, se eliminaron las redeclaraciones pertinentes");
 			}
 	         }
break;
case 19:
//#line 99 "gramatica.y"
{
 					crearTerceto(new ParserVal(-4), new ParserVal(-1), new ParserVal(-1));/*terceto para indicar el final de una funcion*/
 					ambitoActual= ambitoActual.substring(0, ambitoActual.lastIndexOf('.'));
 				}
break;
case 20:
//#line 103 "gramatica.y"
{
                               		crearTerceto(new ParserVal(-4), new ParserVal(-1), new ParserVal(-1));/*terceto para indicar el final de una funcion*/
                               		ambitoActual= ambitoActual.substring(0, ambitoActual.lastIndexOf('.'));
                               }
break;
case 21:
//#line 109 "gramatica.y"
{
			 String auxiliar = tablaSimbolo.obtenerToken(val_peek(3).ival).getLexema();
			 if(!tablaSimbolo.existeToken(auxiliar + '.' + ambitoActual)){
			    tablaSimbolo.obtenerToken(val_peek(3).ival).setLexema(auxiliar+'.'+ambitoActual);
			    tablaSimbolo.obtenerToken(val_peek(3).ival).setTipo(tipoActualdeFuncion);
			    tablaSimbolo.obtenerToken(val_peek(3).ival).setUso("funcion");
			    tablaSimbolo.obtenerToken(val_peek(3).ival).setTipoParametro(tablaSimbolo.obtenerToken(val_peek(1).ival).getTipo());
			    ambitoActual= ambitoActual + '.' + auxiliar;
			    tablaSimbolo.obtenerToken(val_peek(1).ival).setLexema(tablaSimbolo.obtenerToken(val_peek(1).ival).getLexema()+'.'+ambitoActual);
			    tablaSimbolo.obtenerToken(val_peek(3).ival).setParametro(tablaSimbolo.obtenerToken(val_peek(1).ival).getLexema());
 			 }
 			 else
 			 {
 			     tablaSimbolo.borrarToken(val_peek(3).ival);
                 	     addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", funcion redeclarada");
 			     val_peek(3).ival=tablaSimbolo.obtenerReferenciaTabla(auxiliar+'.'+ ambitoActual);
 			     ambitoActual= ambitoActual + '.' + auxiliar;
 			 }
 			 addEstructura( "Declaracion de funcion, en la linea: " + analizadorLexico.getNroLineaToken() );
			 crearTerceto(new ParserVal(FUNC), val_peek(3), new ParserVal(-1));
 		  }
break;
case 22:
//#line 130 "gramatica.y"
{ ambitoActual= ambitoActual + '.' + tablaSimbolo.obtenerToken(val_peek(3).ival).getLexema(); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", parametro invalido");
 		  }
break;
case 23:
//#line 132 "gramatica.y"
{ ambitoActual= ambitoActual + '.' + tablaSimbolo.obtenerToken(val_peek(2).ival).getLexema(); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura");
 		  }
break;
case 24:
//#line 134 "gramatica.y"
{ ambitoActual= ambitoActual + '.' + tablaSimbolo.obtenerToken(val_peek(2).ival).getLexema(); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre");
 		  }
break;
case 25:
//#line 138 "gramatica.y"
{
		tablaSimbolo.obtenerToken(val_peek(0).ival).setTipo(tipoActual);
		tablaSimbolo.obtenerToken(val_peek(0).ival).setUso("parametro");
		yyval.ival=val_peek(0).ival;
	}
break;
case 26:
//#line 145 "gramatica.y"
{
 				int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));

 				if(tablaSimbolo.obtenerToken(refFuncion).getTipo() != val_peek(2).sval)
 					addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles entre el retorno de la funcion y lo retornado");
 				crearTerceto(new ParserVal(RETURN), val_peek(2), new ParserVal(-1));
 				addEstructura( "Sentencia RETURN, en la linea: " + analizadorLexico.getNroLineaToken() );
 		 }
break;
case 27:
//#line 153 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 28:
//#line 154 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 29:
//#line 155 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 30:
//#line 159 "gramatica.y"
{
 			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
 			postCondiciones.put(refFuncion, tercetos.size()-1);/*Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion*/
 			addEstructura( "Sentencia POST, en la linea: " + analizadorLexico.getNroLineaToken() );
 		}
break;
case 31:
//#line 164 "gramatica.y"
{
			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
			postCondiciones.put(refFuncion, 0);/*Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion*/
			addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida");
		}
break;
case 32:
//#line 169 "gramatica.y"
{
			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
			postCondiciones.put(refFuncion, tercetos.size()-1);/*Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion*/
			addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta :");
		}
break;
case 33:
//#line 174 "gramatica.y"
{
			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
			postCondiciones.put(refFuncion, tercetos.size()-1);/*Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion*/
			addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura");
		}
break;
case 34:
//#line 179 "gramatica.y"
{
			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
			postCondiciones.put(refFuncion, tercetos.size()-1);/*Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion*/
			addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre");
		}
break;
case 44:
//#line 203 "gramatica.y"
{
 		       String auxiliar= ambitoActual;
 		       int ultimoPunto = 0;
 		       while( (!tablaSimbolo.existeToken(tablaSimbolo.obtenerToken(val_peek(3).ival).getLexema()+'.'+auxiliar)) && (ultimoPunto>=0)){
 		       		ultimoPunto = auxiliar.lastIndexOf('.');
 		       		if(ultimoPunto>0)
 		       			auxiliar = auxiliar.substring(0, ultimoPunto);
 		       }
 		       int nuevaRef = tablaSimbolo.obtenerReferenciaTabla(tablaSimbolo.obtenerToken(val_peek(3).ival).getLexema()+'.'+auxiliar);
		       if(nuevaRef == -1){
		       		addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", variable no declarada");
		       }
		       else{
		       	       tablaSimbolo.borrarToken(val_peek(3).ival);/*se borra de la tabla de simbolos la variable duplicada de la sentencia*/
		       	       val_peek(3).ival=nuevaRef;/*se le asigna la referencia a la variable original en la tabla*/

			       if(tablaSimbolo.obtenerToken(val_peek(3).ival).getUso()=="funcion")
					addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", el identificador a la izquierda de la asignacion no es una variable");

			       if(tablaSimbolo.obtenerToken(val_peek(3).ival).getUso()=="funcion designada a variable"){/*Solo se puede asignar una funcion*/
					if(val_peek(1).ival<=0){/*$3 no hace referencia a un identificador*/
						addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", solo se le puede asignar una funcion a esta variable");
					}else{
						if((tablaSimbolo.obtenerToken(val_peek(1).ival).getUso()!="funcion") && (tablaSimbolo.obtenerToken(val_peek(1).ival).getUso()!="funcion designada a variable")){
							addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", solo se le puede asignar una funcion a esta variable");
						}else{
							if(tablaSimbolo.obtenerToken(val_peek(3).ival).getTipoParametro() != tablaSimbolo.obtenerToken(val_peek(1).ival).getTipoParametro())
								addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", el parametro de la funcion es de distinto tipo que el del parametro de la variable");
							this.erroresSemanticos.remove(indiceErrorABorrar);/*se borra el error ya que se hace buen uso del identificador*/
						}
					}
				}

			       if(tablaSimbolo.obtenerToken(val_peek(3).ival).getTipo()!=val_peek(1).sval)
					addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + tablaSimbolo.obtenerToken(val_peek(3).ival).getTipo() + " := " + val_peek(1).sval );

		       }
		       yyval = new ParserVal((double)crearTerceto(new ParserVal(ASIG), val_peek(3), val_peek(1)));
		       addEstructura( "Sentencia de asignacion, en la linea: " + analizadorLexico.getNroLineaToken() );
		      }
break;
case 45:
//#line 243 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 46:
//#line 244 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 47:
//#line 245 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida");}
break;
case 48:
//#line 248 "gramatica.y"
{
                String auxiliar= ambitoActual;
                int ultimoPunto = 0;
                while( (!tablaSimbolo.existeToken(tablaSimbolo.obtenerToken(val_peek(3).ival).getLexema()+'.'+auxiliar)) && (ultimoPunto>=0)){
                    ultimoPunto = auxiliar.lastIndexOf('.');
                    if(ultimoPunto>0)
                        auxiliar = auxiliar.substring(0, ultimoPunto);
                }
		int nuevaRef = tablaSimbolo.obtenerReferenciaTabla(tablaSimbolo.obtenerToken(val_peek(3).ival).getLexema()+'.'+auxiliar);

		if(nuevaRef == -1){
			addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", funcion no declarada");
		}
		else{
			tablaSimbolo.borrarToken(val_peek(3).ival);/*se borra de la tabla de simbolos la variable duplicada de la sentencia*/
			val_peek(3).ival=nuevaRef;/*se le asigna la referencia a la variable original en la tabla*/
			Token tFuncion = tablaSimbolo.obtenerToken(val_peek(3).ival);
			if(tFuncion.getUso()=="funcion" || tFuncion.getUso()=="funcion designada a variable"){
			    val_peek(3).sval = tFuncion.getTipo();
				if(val_peek(1).sval!= tFuncion.getTipoParametro())
					addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", Error en la invocacion a funcion : El tipo de parametro real no coincide con el formal");
			}else{
				addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", se intenta invocar una variable que no es funcion " + tFuncion.getLexema());
			}
		}

		addEstructura( "Sentencia de llamado a funcion, en la linea: " + analizadorLexico.getNroLineaToken() );
 		yyval = new ParserVal((double)crearTerceto(new ParserVal(CALL), val_peek(3), val_peek(1)));
		yyval.sval = tablaSimbolo.obtenerToken(val_peek(3).ival).getTipo();
	   }
break;
case 49:
//#line 278 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 50:
//#line 281 "gramatica.y"
{
 			 /*if(tercetos.get(pila.peek()).getT2().ival==-2)//verifico si el bloque tiene break
 			 	tercetos.get(pila.pop()).setT2(new ParserVal((double)tercetos.size()+1));//Completo el BI del break
			 */

 			 tercetos.get(pila.pop()).setT3(new ParserVal((double)tercetos.size()));/*Completo el BF del if*/
 			 tercetos.get(tercetos.size()-1).setEtiqueta();
 			}
break;
case 51:
//#line 289 "gramatica.y"
{
                         /*if(tercetos.get(pila.peek()).getT2().ival==-2)//verifico si el bloque tiene break
                        	tercetos.get(pila.pop()).setT2(new ParserVal((double)tercetos.size()+1));//Completo el BI del break
			 */

			 tercetos.get(pila.pop()).setT2(new ParserVal((double)tercetos.size()));/*Completo el BI del else*/
			 tercetos.get(tercetos.size()-1).setEtiqueta();
			}
break;
case 52:
//#line 299 "gramatica.y"
{
 	/*if(tercetos.get(pila.peek()).getT2().ival==-2)//verifico si el bloque tiene break
        	tercetos.get(pila.pop()).setT2(new ParserVal((double)tercetos.size()+1));//Completo el BI del break
	*/

	tercetos.get(pila.pop()).setT3(new ParserVal((double)tercetos.size()+1));/*Completo el BF del if*/
	int refTerceto =crearTerceto(new ParserVal(-2), new ParserVal(-1), new ParserVal(-1));/*-2 es BI*/
	tercetos.get(tercetos.size()-1).setEtiqueta();
	pila.push(refTerceto);
	yyval = new ParserVal((double)refTerceto);
	}
break;
case 53:
//#line 312 "gramatica.y"
{
 					 int refTerceto = crearTerceto(new ParserVal(-1), val_peek(2), new ParserVal(-1));/*el primer-1 es BF*/
					 pila.push(refTerceto);
 					 yyval = new ParserVal((double)refTerceto);
 					 }
break;
case 54:
//#line 317 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
break;
case 55:
//#line 318 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 56:
//#line 319 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 57:
//#line 320 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia condicional invalida"); }
break;
case 58:
//#line 323 "gramatica.y"
{addEstructura( "Sentencia IF, en la linea: " + analizadorLexico.getNroLineaToken() );
 	  yyval = val_peek(0);}
break;
case 59:
//#line 327 "gramatica.y"
{
	  	yyval = new ParserVal((double)crearTerceto(val_peek(1), val_peek(2), val_peek(0)));
	  	}
break;
case 60:
//#line 330 "gramatica.y"
{yyval = val_peek(0);}
break;
case 61:
//#line 333 "gramatica.y"
{
 			if(val_peek(2).sval!=val_peek(0).sval)
				addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles en la comparacion");
			yyval = new ParserVal((double)crearTerceto(val_peek(1), val_peek(2), val_peek(0)));
		}
break;
case 62:
//#line 340 "gramatica.y"
{yyval.ival = COMP_MAYOR_IGUAL;}
break;
case 63:
//#line 341 "gramatica.y"
{yyval.ival = COMP_MENOR_IGUAL;}
break;
case 64:
//#line 342 "gramatica.y"
{yyval.ival = COMP_IGUAL;}
break;
case 65:
//#line 343 "gramatica.y"
{yyval.ival = COMP_DISTINTO;}
break;
case 66:
//#line 344 "gramatica.y"
{yyval.ival = '<';}
break;
case 67:
//#line 345 "gramatica.y"
{yyval.ival = '>';}
break;
case 68:
//#line 348 "gramatica.y"
{yyval.ival = AND;}
break;
case 69:
//#line 349 "gramatica.y"
{yyval.ival = OR;}
break;
case 72:
//#line 356 "gramatica.y"
{crearTerceto(val_peek(4), val_peek(2), new ParserVal(-1));}
break;
case 73:
//#line 357 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", cadena invalida"); }
break;
case 74:
//#line 358 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 75:
//#line 359 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 76:
//#line 360 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia PRINT invalida"); }
break;
case 77:
//#line 363 "gramatica.y"
{
 		addEstructura( "Sentencia PRINT, en la linea: " + analizadorLexico.getNroLineaToken() );
 		yyval = new ParserVal((int)PRINT);
 		}
break;
case 78:
//#line 369 "gramatica.y"
{
 	     while(tercetos.get(pila.peek()).getT2().ival==-2)/*verifico si el bloque tiene break*/
		    tercetos.get(pila.pop()).setT2(new ParserVal((double)tercetos.size()+1));/*Completo el BI del break*/

	     tercetos.get(pila.pop()).setT3(new ParserVal((double)tercetos.size()+1));/*Completo el BF del while*/
	     crearTerceto(new ParserVal(-2), new ParserVal((double)pila.pop()), new ParserVal(-1));/*-2 es BI*/
	     tercetos.get(tercetos.size()-1).setEtiqueta();
 }
break;
case 79:
//#line 379 "gramatica.y"
{
					 int refTerceto = crearTerceto(new ParserVal(-1), val_peek(2), new ParserVal(-1));/*el primer-1 es BF*/
					 pila.push(refTerceto);
					 yyval = new ParserVal((double)refTerceto);
					}
break;
case 80:
//#line 384 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia iterativa invalida"); }
break;
case 81:
//#line 385 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
break;
case 82:
//#line 386 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 83:
//#line 387 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 84:
//#line 390 "gramatica.y"
{ addEstructura( "Sentencia WHILE, en la linea: " + analizadorLexico.getNroLineaToken() );
 		 pila.push(tercetos.size());
 		 tercetos.get(tercetos.size()-1).setEtiqueta();
 	         yyval=val_peek(0); }
break;
case 95:
//#line 412 "gramatica.y"
{
 			addEstructura( "Sentencia BREAK, en la linea: " + analizadorLexico.getNroLineaToken() );
 			int refTerceto =crearTerceto(new ParserVal(-2), new ParserVal(-2), new ParserVal(-1));/*El primer -2 es BI, el segundo es para diferenciarlo de otros BI (luego se pisa por la dir a saltar)*/
			pila.push(refTerceto);
 }
break;
case 96:
//#line 419 "gramatica.y"
{
 			 addEstructura( "Sentencia de conversion a DOUBLE, en la linea: " + analizadorLexico.getNroLineaToken() );
 			 yyval =  new ParserVal((double)crearTerceto(new ParserVal(DOUBLE), val_peek(1), new ParserVal(-1)));
 			 yyval.sval = "DOUBLE";
 			}
break;
case 97:
//#line 424 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 98:
//#line 427 "gramatica.y"
{
 		      /*if(tercetos.get(pila.peek()).getT2().ival==-2)//verifico si el bloque tiene break
                             tercetos.get(pila.pop()).setT2(new ParserVal((double)tercetos.size()+1));//Completo el BI del break
                      */

 		      tercetos.get(tercetos.size()-1).setEtiqueta();
 		      tercetos.get(pila.pop()).setT3(new ParserVal((double)tercetos.size()));/*Completa el BT del try*/
		     }
break;
case 99:
//#line 437 "gramatica.y"
{
 		  /*Primero buscamos el id de la funcion invocada en el try recorriendo la lista de tercetos*/
		  int i = tercetos.size()-1;
		  boolean noHayCallConPost = (tercetos.get(i).getT1().ival != CALL);
		  while( noHayCallConPost && (i > ultimoTry) ){
			i--;
			if(tercetos.get(i).getT1().ival == CALL)
				noHayCallConPost= (postCondiciones.get(tercetos.get(i).getT2().ival)==null);/*si el call no tiene post condicion*/
		  }
		  /*Verificamos que haya un llamado a funcion con postcondicion*/
		  if(noHayCallConPost){
			addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", no se invoca funcion con post condicion dentro del TRY");
			pila.push(crearTerceto(new ParserVal(-3), new ParserVal((double)0), new ParserVal(-1)));/*el primer -3 es BT, el 2do parametro es erroneo*/
		  }else{
			pila.push(crearTerceto(new ParserVal(-3), new ParserVal((double)postCondiciones.get(tercetos.get(i).getT2().ival)), new ParserVal(-1)));/*el primer -3 es BT, el 2do parametro hace referencia a la postcondicion de la funcion invocada*/
		  }
		 }
break;
case 100:
//#line 454 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia TRY-CATCH invalida"); }
break;
case 101:
//#line 455 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia TRY-CATCH invalida"); }
break;
case 102:
//#line 458 "gramatica.y"
{
 	addEstructura( "Sentencia TRY-CATCH, en la linea: " + analizadorLexico.getNroLineaToken() );
 	ultimoTry = tercetos.size()-1;/*Se guarda la referencia del ultimo tercetos antes del try*/
 }
break;
case 103:
//#line 464 "gramatica.y"
{
                              if(val_peek(2).sval!=val_peek(0).sval)
				addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + val_peek(2).sval + " + " + val_peek(0).sval );
			      yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'+'), val_peek(2), val_peek(0)));
			      yyval.sval=val_peek(2).sval;
 		      }
break;
case 104:
//#line 470 "gramatica.y"
{
				 if(val_peek(2).sval!=val_peek(0).sval)
					addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + val_peek(2).sval + " - " + val_peek(0).sval );
				 yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'-'), val_peek(2), val_peek(0)));
				 yyval.sval=val_peek(2).sval;
		      }
break;
case 105:
//#line 476 "gramatica.y"
{ yyval = val_peek(0) ; }
break;
case 106:
//#line 479 "gramatica.y"
{
             if(val_peek(2).sval!=val_peek(0).sval)
                   addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + val_peek(2).sval + " * " + val_peek(0).sval );
	     yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'*'), val_peek(2), val_peek(0)));
	     yyval.sval=val_peek(2).sval;
	 }
break;
case 107:
//#line 485 "gramatica.y"
{
                if(val_peek(2).sval!=val_peek(0).sval)
                     	addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + val_peek(2).sval + " / " + val_peek(0).sval );
		yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'/'), val_peek(2), val_peek(0)));
		yyval.sval=val_peek(2).sval;
	 }
break;
case 108:
//#line 491 "gramatica.y"
{yyval = val_peek(0);}
break;
case 109:
//#line 492 "gramatica.y"
{
		      yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'*'), new ParserVal(-1), val_peek(0)));
		      yyval.sval=val_peek(1).sval;
	 }
break;
case 110:
//#line 498 "gramatica.y"
{
       String auxiliar= ambitoActual;
       int ultimoPunto = 0;
       while( (!tablaSimbolo.existeToken(tablaSimbolo.obtenerToken(val_peek(0).ival).getLexema()+'.'+auxiliar)) && (ultimoPunto>=0)){
		ultimoPunto = auxiliar.lastIndexOf('.');
		if(ultimoPunto>0)
			auxiliar = auxiliar.substring(0, ultimoPunto);
       }
       int nuevaRef = tablaSimbolo.obtenerReferenciaTabla(tablaSimbolo.obtenerToken(val_peek(0).ival).getLexema()+'.'+auxiliar);

       if(nuevaRef == -1){
		addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", variable no declarada");
       }
       else{
		tablaSimbolo.borrarToken(val_peek(0).ival);/*se borra de la tabla de simbolos la variable duplicada de la sentencia*/
		val_peek(0).ival=nuevaRef;/*se le asigna la referencia a la variable original en la tabla*/

		Token tVariable = tablaSimbolo.obtenerToken(val_peek(0).ival);
		if(tVariable.getUso()!="variable" && tVariable.getUso()!="parametro"){
			addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", mal uso del identificador " + tVariable.getLexema());/*este error puede llegar a borrarse si ocurre el unico caso en el que el identificador tiene un buen uso*/
			indiceErrorABorrar= this.erroresSemanticos.size()-1;/*se usa para borrar el error en caso de que el uso sea correcto, es decir que se asigne correctamente a una variable de funcion designada*/
		}
       }
       yyval = val_peek(0);
       yyval.sval=tablaSimbolo.obtenerToken(val_peek(0).ival).getTipo();
     }
break;
case 111:
//#line 524 "gramatica.y"
{yyval = val_peek(0);}
break;
case 112:
//#line 525 "gramatica.y"
{yyval = val_peek(0);}
break;
case 113:
//#line 526 "gramatica.y"
{  yyval = val_peek(0);
                       yyval.sval="ULONG";}
break;
case 114:
//#line 528 "gramatica.y"
{yyval = val_peek(0);
                      yyval.sval="DOUBLE";}
break;
//#line 1387 "Parser.java"
//########## END OF USER-SUPPLIED ACTIONS ##########
    }//switch
    //#### Now let's reduce... ####
    if (yydebug) debug("reduce");
    state_drop(yym);             //we just reduced yylen states
    yystate = state_peek(0);     //get new state
    val_drop(yym);               //corresponding value drop
    yym = yylhs[yyn];            //select next TERMINAL(on lhs)
    if (yystate == 0 && yym == 0)//done? 'rest' state and at first TERMINAL
      {
      if (yydebug) debug("After reduction, shifting from state 0 to state "+YYFINAL+"");
      yystate = YYFINAL;         //explicitly say we're done
      state_push(YYFINAL);       //and save it
      val_push(yyval);           //also save the semantic value of parsing
      if (yychar < 0)            //we want another character?
        {
        yychar = yylex();        //get next character
        if (yychar<0) yychar=0;  //clean, if necessary
        if (yydebug)
          yylexdebug(yystate,yychar);
        }
      if (yychar == 0)          //Good exit (if lex returns 0 ;-)
         break;                 //quit the loop--all DONE
      }//if yystate
    else                        //else not done yet
      {                         //get next state and push, for next yydefred[]
      yyn = yygindex[yym];      //find out where to go
      if ((yyn != 0) && (yyn += yystate) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yystate)
        yystate = yytable[yyn]; //get new state
      else
        yystate = yydgoto[yym]; //else go to new defred
      if (yydebug) debug("after reduction, shifting from state "+state_peek(0)+" to state "+yystate+"");
      state_push(yystate);     //going again, so push state & val...
      val_push(yyval);         //for next action
      }
    }//main loop
  return 0;//yyaccept!!
}
//## end of method parse() ######################################



//## run() --- for Thread #######################################
/**
 * A default run method, used for operating this parser
 * object in the background.  It is intended for extending Thread
 * or implementing Runnable.  Turn off with -Jnorun .
 */
public void run()
{
  yyparse();
}
//## end of method run() ########################################



//## Constructors ###############################################
/**
 * Default constructor.  Turn off with -Jnoconstruct .

 */
public Parser()
{
  //nothing to do
}


/**
 * Create a parser, setting the debug to true or false.
 * @param debugMe true for debugging, false for no debug.
 */
public Parser(boolean debugMe)
{
  yydebug=debugMe;
}
//###############################################################



}
//################### END OF CLASS ##############################
