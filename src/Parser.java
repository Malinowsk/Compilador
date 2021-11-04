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
    5,    5,    5,    5,    8,    8,    9,    9,    9,    9,
    9,    9,   13,   11,   11,   11,   11,   11,   12,   12,
   12,   12,   12,   12,    6,    6,    7,    7,    3,   10,
   16,   16,   17,   17,   17,   17,   17,   18,   18,   18,
   23,   23,   19,   19,   26,   24,   24,   24,   24,   24,
   27,   15,   15,   28,   30,   30,   30,   30,   30,   30,
   29,   29,   25,   25,   20,   20,   20,   20,   20,   31,
   21,   32,   32,   32,   32,   32,   34,   33,   33,   35,
   35,   36,   36,   36,   36,   36,   36,   37,   38,   38,
   22,   39,   39,   39,   40,   14,   14,   14,   41,   41,
   41,   41,   42,   42,   42,   42,   42,
};
final static short yylen[] = {                            2,
    3,    2,    2,    1,    3,    2,    2,    6,    1,    2,
    3,    5,    6,    5,    6,    7,    6,    6,    6,    6,
    5,    5,    2,    5,    5,    4,    4,    2,    6,    6,
    5,    4,    4,    2,    1,    1,    3,    1,    3,    1,
    2,    1,    1,    1,    1,    1,    1,    4,    3,    4,
    5,    6,    4,    6,    1,    5,    5,    4,    4,    6,
    1,    3,    1,    3,    1,    1,    1,    1,    1,    1,
    1,    1,    3,    1,    5,    5,    4,    4,    3,    1,
    2,    5,    5,    5,    4,    4,    1,    3,    1,    2,
    1,    1,    1,    1,    1,    1,    1,    2,    4,    4,
    2,    3,    3,    2,    1,    3,    3,    1,    3,    3,
    1,    2,    1,    1,    1,    1,    1,
};
final static short yydefred[] = {                         0,
    0,    0,    0,    0,    3,    2,    0,   35,   36,    0,
    4,    0,    0,    9,    0,    0,   10,    0,    1,    0,
    0,    0,    7,    0,    0,   61,   80,   87,    0,  105,
    0,    0,   43,   44,   45,   46,   47,    0,    0,    0,
    0,    0,    0,    0,    5,    0,   11,    0,    0,    0,
    0,    0,   37,    0,    0,   39,   41,    0,   74,    0,
    0,  113,  116,  117,    0,    0,    0,    0,    0,  115,
    0,  114,    0,  111,    0,    0,    0,    0,    0,   92,
   93,   94,   95,   96,   81,   89,   97,    0,    0,  101,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
   40,   49,    0,    0,    0,   55,    0,    0,    0,    0,
    0,    0,  112,   65,   66,   67,   68,   69,   70,    0,
    0,    0,    0,   71,   72,    0,    0,    0,   79,    0,
    0,    0,    0,    0,   98,    0,    0,    0,  103,  102,
    0,    0,    0,    0,   23,   21,    0,    0,   14,   12,
    0,    0,    0,   50,   48,   73,   53,    0,    0,    0,
    0,    0,   58,    0,    0,    0,    0,   59,   62,  109,
  110,   78,    0,   77,    0,   88,   90,    0,   85,    0,
   86,   18,   19,   20,   17,   13,    8,   28,    0,    0,
    0,   15,    0,    0,    0,  100,   99,    0,    0,   57,
    0,   56,   76,   75,   84,   83,   82,    0,    0,    0,
   34,    0,    0,    0,   16,   54,    0,   51,   60,    0,
   26,    0,   27,    0,    0,    0,   52,   25,   24,   33,
    0,    0,    0,   32,   31,    0,    0,   30,   29,
};
final static short yydgoto[] = {                          3,
    4,   10,   19,   11,   12,   95,   17,   14,   15,  100,
  153,  194,   96,   68,   69,   31,   32,   33,   34,   35,
   36,   37,   70,   38,   60,  108,   39,   71,  126,  122,
   40,   41,   85,   42,  133,  134,   87,   72,   43,   44,
   73,   74,
};
final static short yysindex[] = {                      -233,
  -12,   -4,    0,  -87,    0,    0, -276,    0,    0, -206,
    0,   34, -240,    0,  -87,   99,    0,  -94,    0,  -87,
 -118,    3,    0, -100, -276,    0,    0,    0, -162,    0,
  -99,  -94,    0,    0,    0,    0,    0, -124,  -37,  -36,
 -135,  -25, -206,  -90,    0,  110,    0,  149,  -38,  -82,
  151,  -94,    0,  136,   40,    0,    0,  -94,    0,  -83,
  162,    0,    0,    0,  -64,   43, -107,   29,  173,    0,
  -68,    0,   94,    0,  156,  175, -239, -109,  159,    0,
    0,    0,    0,    0,    0,    0,    0,   56,  176,    0,
 -243,  -58,  -58,  -77,  -56,  178,  181,  -31, -276, -221,
    0,    0,  164,   54,  -33,    0,  166, -124,   59,  187,
  192,  -32,    0,    0,    0,    0,    0,    0,    0,   71,
   71,   71,  -24,    0,    0,   71, -107, -107,    0,  191,
  210,   -2,    7, -109,    0,  214,  -35,    9,    0,    0,
  227,  232,  233,  236,    0,    0, -276, -276,    0,    0,
  219,  -21, -189,    0,    0,    0,    0,   24,  250,   82,
   74,   39,    0, -141,   94,   94,  106,    0,    0,    0,
    0,    0,  239,    0,  245,    0,    0,   35,    0, -208,
    0,    0,    0,    0,    0,    0,    0,    0,   87,  155,
  247,    0,  -40,   42,  251,    0,    0,  268,  158,    0,
  255,    0,    0,    0,    0,    0,    0,  275,   69,  264,
    0,   71,  286,  288,    0,    0,  272,    0,    0,  273,
    0,  281,    0,   49,   90,  295,    0,    0,    0,    0,
  298,  304,  306,    0,    0,  301,  303,    0,    0,
};
final static short yyrindex[] = {                         0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,  311,    0,    0,    0,  107,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0, -160,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,  311,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
  -34,    0,   -9,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
  113,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,   98,    0,    0,    0,    0,    0,    0,
    0,    0,    0,  -74,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,   11,   18,  103,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,
};
final static short yygindex[] = {                         0,
    0,  359,  333,  360,    0,   80,    8,    0,    0,    0,
    0,    0,  112,  -43,  -28,   17,  -27,  -14,  -13,  -10,
    4,    5,    0,    0,  274,    0,    0,    0,    0,    0,
    0,    0,    0,    0,  249,  340,    0,    0,    0,    0,
   91,  -41,
};
final static int YYTABLESIZE=383;
static short yytable[];
static { yytable();}
static void yytable(){
yytable = new short[]{                        212,
   16,   94,   66,   77,   67,  180,   63,   67,  164,  148,
   59,  104,  139,   89,   88,   21,  131,  213,  189,   67,
   23,   22,    1,   67,   63,  113,   80,   81,   47,   91,
   82,  108,   53,  108,  151,  108,   16,  112,  175,  140,
  132,  152,   50,    2,   83,   84,    5,  206,   57,  108,
  108,  106,  108,  106,    6,  106,  174,   18,  107,  137,
  107,  207,  107,   80,   81,  160,  191,   82,  101,  106,
  106,  120,  106,  121,  105,  192,  107,  107,  167,  107,
   59,   83,   84,   13,   67,  170,  171,   67,  118,  231,
  119,  193,   20,   54,   13,   42,  120,  169,  121,   13,
   67,   51,   42,   67,   42,  149,  150,  230,  190,  222,
   55,  120,  155,  121,  201,   67,  202,  199,   67,   80,
   81,   26,  197,   82,  120,   27,  121,  221,   78,   98,
   79,   67,   26,   28,   67,  127,   27,   83,   84,   58,
  128,   29,   25,   64,   28,  209,   30,   26,  120,   92,
  121,   27,   29,   25,  186,  187,   79,   30,   46,   28,
   61,   64,   26,   52,  214,   56,   27,   29,    7,   62,
   63,   64,   30,   97,   28,  106,  107,   65,  143,    8,
    9,   22,   29,  224,    8,    9,   29,   30,   93,    8,
    9,   99,   22,   22,  102,  210,  233,  120,  218,  121,
  120,  109,  121,  141,  142,  144,  124,  125,    8,    9,
  165,  166,  110,  123,  129,  130,  138,  135,  146,   75,
  145,  147,  154,   63,  157,  163,  161,   61,    8,    9,
   61,  156,  162,  168,  179,   63,   62,   63,   64,   62,
   63,   64,   61,   76,   65,   16,   61,   65,  108,  172,
  173,   62,   63,   64,  178,   62,   63,   64,   48,   65,
  108,  108,  108,   65,  108,  108,  108,  182,  106,    8,
    9,  176,  183,  184,  108,  107,  185,  188,  181,   49,
  106,  106,  106,  195,  106,  106,  106,  107,  107,  107,
  196,  107,  107,  107,  106,  103,  200,  203,  111,  114,
  115,  107,  116,  204,  205,  211,  215,   61,  217,  216,
   61,  136,  117,  219,  159,  220,   62,   63,   64,   62,
   63,   64,  223,   61,   65,  225,   61,   65,  226,  198,
  227,  228,   62,   63,   64,   62,   63,   64,   61,  229,
   65,   61,  208,   65,  236,  232,  237,   62,   63,   64,
   62,   63,   64,  234,   61,   65,  235,   61,   65,  238,
   64,  239,   91,   62,   63,   64,   62,   63,   64,   38,
    6,   65,   64,   24,   65,   90,  104,   64,   64,   45,
   86,  158,  177,
};
}
static short yycheck[];
static { yycheck(); }
static void yycheck() {
yycheck = new short[] {                         40,
  277,   40,   40,   40,   45,   41,   41,   45,   41,   41,
   38,   55,  256,   42,   40,  256,  256,   58,   40,   45,
   13,  262,  256,   45,   59,   67,   41,   41,   21,   44,
   41,   41,   25,   43,  256,   45,  277,   66,   41,  283,
  280,  263,   40,  277,   41,   41,   59,  256,   32,   59,
   60,   41,   62,   43,   59,   45,   59,  264,   41,   88,
   43,  270,   45,   78,   78,  109,  256,   78,   52,   59,
   60,   43,   62,   45,   58,  265,   59,   60,  122,   62,
  108,   78,   78,    4,   45,  127,  128,   45,   60,   41,
   62,  281,   59,  256,   15,  256,   43,  126,   45,   20,
   45,   22,  263,   45,  265,   98,   99,   59,  152,   41,
  273,   43,   59,   45,  256,   45,  258,  161,   45,  134,
  134,  257,   41,  134,   43,  261,   45,   59,  264,   50,
  266,   45,  257,  269,   45,   42,  261,  134,  134,  264,
   47,  277,   44,   41,  269,  189,  282,  257,   43,   40,
   45,  261,  277,   44,  147,  148,  266,  282,  277,  269,
  268,   59,  257,  264,  193,  265,  261,  277,  256,  277,
  278,  279,  282,  256,  269,  259,  260,  285,  256,  267,
  268,  256,  277,  212,  267,  268,  277,  282,   40,  267,
  268,   41,  267,  268,   59,   41,  225,   43,   41,   45,
   43,   40,   45,   92,   93,   94,  275,  276,  267,  268,
  120,  121,  277,   41,   59,   41,   41,   59,   41,  256,
  277,   41,   59,  258,   59,  258,   40,  268,  267,  268,
  268,  265,   41,  258,  270,  270,  277,  278,  279,  277,
  278,  279,  268,  280,  285,  277,  268,  285,  258,   59,
   41,  277,  278,  279,   41,  277,  278,  279,  256,  285,
  270,  271,  272,  285,  274,  275,  276,   41,  258,  267,
  268,  265,   41,   41,  284,  258,   41,   59,  270,  277,
  270,  271,  272,  260,  274,  275,  276,  270,  271,  272,
   41,  274,  275,  276,  284,  256,  258,   59,  256,  271,
  272,  284,  274,   59,  270,   59,  265,  268,   41,   59,
  268,  256,  284,   59,  256,   41,  277,  278,  279,  277,
  278,  279,   59,  268,  285,   40,  268,  285,   41,  256,
   59,   59,  277,  278,  279,  277,  278,  279,  268,   59,
  285,  268,  256,  285,   41,  256,   41,  277,  278,  279,
  277,  278,  279,   59,  268,  285,   59,  268,  285,   59,
  258,   59,  265,  277,  278,  279,  277,  278,  279,   59,
  264,  285,  270,   15,  285,   43,  264,  275,  276,   20,
   41,  108,  134,
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
"sentencia_declarativa : tipo FUNC '(' tipo ')' lista_variables",
"sentencia_declarativa : sentencia_declarativa_funcion",
"sentencia_declarativa : error lista_variables",
"sentencia_declarativa : tipo error lista_variables",
"sentencia_declarativa : tipo FUNC tipo ')' lista_variables",
"sentencia_declarativa : tipo FUNC '(' error ')' lista_variables",
"sentencia_declarativa : tipo FUNC '(' tipo lista_variables",
"sentencia_declarativa_funcion : cabecera_funcion bloque_declarativo BEGIN bloque_ejecutable_funcion retorno_funcion END",
"sentencia_declarativa_funcion : cabecera_funcion bloque_declarativo BEGIN bloque_ejecutable_funcion retorno_funcion postcondicion END",
"cabecera_funcion : tipo FUNC ID '(' parametro ')'",
"cabecera_funcion : tipo error ID '(' parametro ')'",
"cabecera_funcion : tipo FUNC error '(' parametro ')'",
"cabecera_funcion : tipo FUNC ID '(' error ')'",
"cabecera_funcion : tipo FUNC ID parametro ')'",
"cabecera_funcion : tipo FUNC ID '(' parametro",
"parametro : tipo ID",
"retorno_funcion : RETURN '(' expresion_aritmetica ')' ';'",
"retorno_funcion : RETURN '(' error ')' ';'",
"retorno_funcion : RETURN '(' expresion_aritmetica ';'",
"retorno_funcion : RETURN expresion_aritmetica ')' ';'",
"retorno_funcion : error ';'",
"postcondicion : POST ':' '(' condicion ')' ';'",
"postcondicion : POST ':' '(' error ')' ';'",
"postcondicion : POST '(' condicion ')' ';'",
"postcondicion : POST condicion ')' ';'",
"postcondicion : POST '(' condicion ';'",
"postcondicion : error ';'",
"tipo : ULONG",
"tipo : DOUBLE",
"lista_variables : ID ',' lista_variables",
"lista_variables : ID",
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

//#line 427 "gramatica.y"

///CODIGO JAVA

private AnalizadorLexico analizadorLexico;
private TablaSimbolo tablaSimbolo;
private ArrayList<String> estructuras = new ArrayList<String>(); //Lista de las estructuras detectadas por el parser
private ArrayList<String> erroresSintacticos = new ArrayList<String>(); //Lista de errores sintacticos detectados por el parser
private ArrayList<String> erroresSemanticos = new ArrayList<String>(); //Lista de errores semanticos detectados por el parser

private ArrayList<Terceto> tercetos = new ArrayList<Terceto>(); //Lista de tercetos generados
private Stack<Integer> pila = new Stack<Integer>(); //Pila utilizada para los tercetos

private HashMap<Integer, Integer> postCondiciones = new HashMap<Integer, Integer>();//Hashmap utilizado para guardar el id de las funciones junto a las referencias de sus postcondicion

private String ambitoActual;
private String tipoActual;

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
	System.out.println("Cantidad de tercetos generados: " + tercetos.size());
	int i = 0;
	for(Terceto t : tercetos){
		System.out.println("[" + i + "]" + t.getTerceto(tablaSimbolo));
		i++;
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

public boolean hayError(){
	return ((this.erroresSintacticos.size()>0) || (this.erroresSemanticos.size()>0));
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
//#line 566 "Parser.java"
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
case 8:
//#line 35 "gramatica.y"
{addEstructura( "Declaracion de funciones como variables, en la linea: " + analizadorLexico.getNroLineaToken() ); }
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
//#line 39 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 13:
//#line 40 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", tipo de variable invalido"); }
break;
case 14:
//#line 41 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 15:
//#line 44 "gramatica.y"
{
 					ambitoActual= ambitoActual.substring(0, ambitoActual.lastIndexOf('.'));
 				}
break;
case 16:
//#line 47 "gramatica.y"
{
                               		ambitoActual= ambitoActual.substring(0, ambitoActual.lastIndexOf('.'));
                               }
break;
case 17:
//#line 52 "gramatica.y"
{
			 String auxiliar = tablaSimbolo.obtenerToken(val_peek(3).ival).getLexema();
			 if(!tablaSimbolo.existeToken(auxiliar + '.' + ambitoActual)){
			    tablaSimbolo.obtenerToken(val_peek(3).ival).setLexema(auxiliar+'.'+ambitoActual);
			    tablaSimbolo.obtenerToken(val_peek(3).ival).setTipo(tipoActual);
			    tablaSimbolo.obtenerToken(val_peek(3).ival).setUso("funcion");
			    tablaSimbolo.obtenerToken(val_peek(3).ival).setTipoParametro(tablaSimbolo.obtenerToken(val_peek(1).ival).getTipo());
			    ambitoActual= ambitoActual + '.' + auxiliar;
			    tablaSimbolo.obtenerToken(val_peek(1).ival).setLexema(tablaSimbolo.obtenerToken(val_peek(1).ival).getLexema()+'.'+ambitoActual);
 			 }
 			 else
 			 {
 			     tablaSimbolo.borrarToken(val_peek(3).ival);
                 	     addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", funcion redeclarada");
 			     val_peek(3).ival=tablaSimbolo.obtenerReferenciaTabla(auxiliar+'.'+ ambitoActual);
 			     ambitoActual= ambitoActual + '.' + auxiliar;
 			 }
 			 addEstructura( "Declaracion de funcion, en la linea: " + analizadorLexico.getNroLineaToken() );
 		  }
break;
case 18:
//#line 71 "gramatica.y"
{ ambitoActual= ambitoActual + '.' + tablaSimbolo.obtenerToken(val_peek(3).ival).getLexema(); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", declaracion invalida");
 		  }
break;
case 19:
//#line 73 "gramatica.y"
{ ambitoActual= ambitoActual + '.' + "error"; addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", identificador invalido");
 		  }
break;
case 20:
//#line 75 "gramatica.y"
{ ambitoActual= ambitoActual + '.' + tablaSimbolo.obtenerToken(val_peek(3).ival).getLexema(); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", parametro invalido");
 		  }
break;
case 21:
//#line 77 "gramatica.y"
{ ambitoActual= ambitoActual + '.' + tablaSimbolo.obtenerToken(val_peek(2).ival).getLexema(); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura");
 		  }
break;
case 22:
//#line 79 "gramatica.y"
{ ambitoActual= ambitoActual + '.' + tablaSimbolo.obtenerToken(val_peek(2).ival).getLexema(); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre");
 		  }
break;
case 23:
//#line 83 "gramatica.y"
{
		tablaSimbolo.obtenerToken(val_peek(0).ival).setTipo(tipoActual);
		tablaSimbolo.obtenerToken(val_peek(0).ival).setUso("parametro");
		yyval.ival=val_peek(0).ival;
	}
break;
case 24:
//#line 90 "gramatica.y"
{ addEstructura( "Sentencia RETURN, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 25:
//#line 91 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 26:
//#line 92 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 27:
//#line 93 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 28:
//#line 94 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 29:
//#line 97 "gramatica.y"
{
 			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
 			postCondiciones.put(refFuncion, tercetos.size()-1);/*Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion*/
 			addEstructura( "Sentencia POST, en la linea: " + analizadorLexico.getNroLineaToken() );
 		}
break;
case 30:
//#line 102 "gramatica.y"
{
			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
			postCondiciones.put(refFuncion, 0);/*Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion*/
			addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida");
		}
break;
case 31:
//#line 107 "gramatica.y"
{
			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
			postCondiciones.put(refFuncion, tercetos.size()-1);/*Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion*/
			addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta :");
		}
break;
case 32:
//#line 112 "gramatica.y"
{
			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
			postCondiciones.put(refFuncion, tercetos.size()-1);/*Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion*/
			addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura");
		}
break;
case 33:
//#line 117 "gramatica.y"
{
			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
			postCondiciones.put(refFuncion, tercetos.size()-1);/*Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion*/
			addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre");
		}
break;
case 34:
//#line 122 "gramatica.y"
{
			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
			postCondiciones.put(refFuncion, 0);/*Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion*/
			addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida");
		}
break;
case 35:
//#line 129 "gramatica.y"
{tipoActual= "ULONG";}
break;
case 36:
//#line 130 "gramatica.y"
{tipoActual= "DOUBLE";}
break;
case 37:
//#line 133 "gramatica.y"
{
                        if(!tablaSimbolo.existeToken(tablaSimbolo.obtenerToken(val_peek(2).ival).getLexema()+'.'+ambitoActual)){
			    tablaSimbolo.obtenerToken(val_peek(2).ival).setLexema(tablaSimbolo.obtenerToken(val_peek(2).ival).getLexema()+'.'+ambitoActual);
			    tablaSimbolo.obtenerToken(val_peek(2).ival).setTipo(tipoActual);
			    tablaSimbolo.obtenerToken(val_peek(2).ival).setUso("variable");}
			else{
			    tablaSimbolo.borrarToken(val_peek(2).ival);
			    addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", variable redeclarada");
			}
 		 }
break;
case 38:
//#line 143 "gramatica.y"
{
                        if(!tablaSimbolo.existeToken(tablaSimbolo.obtenerToken(val_peek(0).ival).getLexema()+'.'+ambitoActual)){
            	            tablaSimbolo.obtenerToken(val_peek(0).ival).setLexema(tablaSimbolo.obtenerToken(val_peek(0).ival).getLexema()+'.'+ambitoActual);
			    tablaSimbolo.obtenerToken(val_peek(0).ival).setTipo(tipoActual);
			    tablaSimbolo.obtenerToken(val_peek(0).ival).setUso("variable");
			}
			else{
			    tablaSimbolo.borrarToken(val_peek(0).ival);
			    addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", variable redeclarada");
			}
	         }
break;
case 48:
//#line 173 "gramatica.y"
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
		       }

		        /*VER SI HAY QUE AGREGAR EL VALOR AL TOKEN*/
 		       addEstructura( "Sentencia de asignacion, en la linea: " + analizadorLexico.getNroLineaToken() );
		       if(tablaSimbolo.obtenerToken(val_peek(3).ival).getTipo()!=val_peek(1).sval)
                	        addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + tablaSimbolo.obtenerToken(val_peek(3).ival).getTipo() + " := " + val_peek(1).sval );
		       yyval = new ParserVal((double)crearTerceto(new ParserVal(ASIG), val_peek(3), val_peek(1)));
		      }
break;
case 49:
//#line 196 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia asignacion invalida"); }
break;
case 50:
//#line 197 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 51:
//#line 200 "gramatica.y"
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
			if(val_peek(1).sval!=tablaSimbolo.obtenerToken(val_peek(3).ival).getTipoParametro())
				addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", Error en la invocacion a funcion : El tipo de parametro real no coincide con el formal");
		}
		addEstructura( "Sentencia de llamado a funcion, en la linea: " + analizadorLexico.getNroLineaToken() );
		yyval = new ParserVal((double)crearTerceto(new ParserVal(CALL), val_peek(3), val_peek(1)));
		yyval.sval = tablaSimbolo.obtenerToken(val_peek(3).ival).getTipo();
	   }
break;
case 52:
//#line 222 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 53:
//#line 225 "gramatica.y"
{
 			 tercetos.get(pila.pop()).setT3(new ParserVal((double)tercetos.size()));
 			}
break;
case 54:
//#line 228 "gramatica.y"
{
			 tercetos.get(pila.pop()).setT2(new ParserVal((double)tercetos.size()));
			}
break;
case 55:
//#line 233 "gramatica.y"
{
	tercetos.get(pila.pop()).setT3(new ParserVal((double)tercetos.size()+1));
	int refTerceto =crearTerceto(new ParserVal(-2), new ParserVal(-1), new ParserVal(-1));/*-2 es BI*/
	pila.push(refTerceto);
	yyval = new ParserVal((double)refTerceto);
	}
break;
case 56:
//#line 241 "gramatica.y"
{
 					 int refTerceto = crearTerceto(new ParserVal(-1), val_peek(2), new ParserVal(-1));/*el primer-1 es BF*/
					 pila.push(refTerceto);
 					 yyval = new ParserVal((double)refTerceto);
 					 }
break;
case 57:
//#line 246 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
break;
case 58:
//#line 247 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 59:
//#line 248 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 60:
//#line 249 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia condicional invalida"); }
break;
case 61:
//#line 252 "gramatica.y"
{addEstructura( "Sentencia IF, en la linea: " + analizadorLexico.getNroLineaToken() );
 	  yyval = val_peek(0);}
break;
case 62:
//#line 256 "gramatica.y"
{
	  	yyval = new ParserVal((double)crearTerceto(val_peek(1), val_peek(2), val_peek(0)));
	  	}
break;
case 63:
//#line 259 "gramatica.y"
{yyval = val_peek(0);}
break;
case 64:
//#line 262 "gramatica.y"
{
			yyval = new ParserVal((double)crearTerceto(val_peek(1), val_peek(2), val_peek(0)));
			}
break;
case 65:
//#line 267 "gramatica.y"
{yyval.ival = COMP_MAYOR_IGUAL;}
break;
case 66:
//#line 268 "gramatica.y"
{yyval.ival = COMP_MENOR_IGUAL;}
break;
case 67:
//#line 269 "gramatica.y"
{yyval.ival = COMP_IGUAL;}
break;
case 68:
//#line 270 "gramatica.y"
{yyval.ival = COMP_DISTINTO;}
break;
case 69:
//#line 271 "gramatica.y"
{yyval.ival = '<';}
break;
case 70:
//#line 272 "gramatica.y"
{yyval.ival = '>';}
break;
case 71:
//#line 275 "gramatica.y"
{yyval = val_peek(0);}
break;
case 72:
//#line 276 "gramatica.y"
{yyval = val_peek(0);}
break;
case 75:
//#line 283 "gramatica.y"
{crearTerceto(val_peek(4), val_peek(2), new ParserVal(-1));}
break;
case 76:
//#line 284 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", cadena invalida"); }
break;
case 77:
//#line 285 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 78:
//#line 286 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 79:
//#line 287 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia PRINT invalida"); }
break;
case 80:
//#line 290 "gramatica.y"
{
 		addEstructura( "Sentencia PRINT, en la linea: " + analizadorLexico.getNroLineaToken() );
 		yyval = new ParserVal((int)PRINT);
 		}
break;
case 81:
//#line 296 "gramatica.y"
{
							     tercetos.get(pila.pop()).setT3(new ParserVal((double)tercetos.size()+1));/*Se modifica el BF, agregandole la referencia correspondiente al proximo terceto despues de la ultima sentencia del bloque*/
							     crearTerceto(new ParserVal(-2), new ParserVal((double)pila.pop()), new ParserVal(-1));/*-2 es BI, se crea un BI al terceto que calcula la condicion del while*/
							    }
break;
case 82:
//#line 302 "gramatica.y"
{
					 int refTerceto = crearTerceto(new ParserVal(-1), val_peek(2), new ParserVal(-1));/*el primer-1 es BF*/
					 pila.push(refTerceto);
					 yyval = new ParserVal((double)refTerceto);
					}
break;
case 83:
//#line 307 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia iterativa invalida"); }
break;
case 84:
//#line 308 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
break;
case 85:
//#line 309 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 86:
//#line 310 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 87:
//#line 312 "gramatica.y"
{ addEstructura( "Sentencia WHILE, en la linea: " + analizadorLexico.getNroLineaToken() );
 		 pila.push(tercetos.size());
 	         yyval=val_peek(0); }
break;
case 98:
//#line 333 "gramatica.y"
{ addEstructura( "Sentencia BREAK, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 99:
//#line 336 "gramatica.y"
{
 			 addEstructura( "Sentencia de conversion a DOUBLE, en la linea: " + analizadorLexico.getNroLineaToken() );
 			 yyval =  new ParserVal((double)crearTerceto(new ParserVal(DOUBLE), val_peek(1), new ParserVal(-1)));
 			 yyval.sval = "DOUBLE";
 			}
break;
case 100:
//#line 341 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 101:
//#line 344 "gramatica.y"
{
 		      int t = pila.pop();
 		      tercetos.get(t).setT3(new ParserVal((double)tercetos.size()));/*Completa el BT del try*/
		     }
break;
case 102:
//#line 350 "gramatica.y"
{
 		  /*Primero buscamos el id de la funcion invocada en el try recorriendo la lista de tercetos*/
		  int i = tercetos.size()-1;
		  while( (tercetos.get(i).getT1().ival != CALL) && (i >= 0) )
			i--;
		  /*TODO: AGREGAR IF PARA VERIFICAR SI HAY POSTCONDICION O NO*/
		  pila.push(crearTerceto(new ParserVal(-3), new ParserVal((double)postCondiciones.get(tercetos.get(i).getT2().ival)), new ParserVal(-1)));/*el primer -3 es BT, el 2do parametro hace referencia a la postcondicion de la funcion invocada*/
		 }
break;
case 103:
//#line 358 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia TRY-CATCH invalida"); }
break;
case 104:
//#line 359 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia TRY-CATCH invalida"); }
break;
case 105:
//#line 362 "gramatica.y"
{ addEstructura( "Sentencia TRY-CATCH, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 106:
//#line 365 "gramatica.y"
{
                              if(val_peek(2).sval!=val_peek(0).sval)
				addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + val_peek(2).sval + " + " + val_peek(0).sval );
			      yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'+'), val_peek(2), val_peek(0)));
			      yyval.sval=val_peek(2).sval;
 		      }
break;
case 107:
//#line 371 "gramatica.y"
{
				 if(val_peek(2).sval!=val_peek(0).sval)
					addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + val_peek(2).sval + " - " + val_peek(0).sval );
				 yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'-'), val_peek(2), val_peek(0)));
				 yyval.sval=val_peek(2).sval;
		      }
break;
case 108:
//#line 377 "gramatica.y"
{ yyval = val_peek(0) ; }
break;
case 109:
//#line 380 "gramatica.y"
{
             if(val_peek(2).sval!=val_peek(0).sval)
                   addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + val_peek(2).sval + " * " + val_peek(0).sval );
	     yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'*'), val_peek(2), val_peek(0)));
	     yyval.sval=val_peek(2).sval;
	 }
break;
case 110:
//#line 386 "gramatica.y"
{
                if(val_peek(2).sval!=val_peek(0).sval)
                     	addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + val_peek(2).sval + " / " + val_peek(0).sval );
		yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'/'), val_peek(2), val_peek(0)));
		yyval.sval=val_peek(2).sval;
	 }
break;
case 111:
//#line 392 "gramatica.y"
{yyval = val_peek(0);}
break;
case 112:
//#line 393 "gramatica.y"
{
		      yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'*'), new ParserVal(-1), val_peek(0)));
		      yyval.sval=val_peek(1).sval;
	 }
break;
case 113:
//#line 399 "gramatica.y"
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
       }
       yyval = val_peek(0);
       yyval.sval=tablaSimbolo.obtenerToken(val_peek(0).ival).getTipo();
     }
break;
case 114:
//#line 418 "gramatica.y"
{yyval = val_peek(0);}
break;
case 115:
//#line 419 "gramatica.y"
{yyval = val_peek(0);}
break;
case 116:
//#line 420 "gramatica.y"
{  yyval = val_peek(0);
                       yyval.sval="ULONG";}
break;
case 117:
//#line 422 "gramatica.y"
{yyval = val_peek(0);
                      yyval.sval="DOUBLE";}
break;
//#line 1287 "Parser.java"
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
