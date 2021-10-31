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
   22,   39,   39,   39,   40,   41,   14,   14,   14,   42,
   42,   42,   42,   43,   43,   43,   43,   43,
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
    2,    3,    3,    2,    1,    1,    3,    3,    1,    3,
    3,    1,    2,    1,    1,    1,    1,    1,
};
final static short yydefred[] = {                         0,
    0,    0,    0,    0,    3,    2,    0,   35,   36,    0,
    4,    0,    0,    9,    0,    0,   10,    0,    1,    0,
    0,    0,    7,    0,    0,   61,   80,   87,    0,  105,
    0,    0,   43,   44,   45,   46,   47,    0,    0,    0,
    0,    0,    0,    0,    5,    0,   11,    0,    0,    0,
    0,    0,   37,    0,    0,   39,   41,    0,   74,    0,
    0,  114,  117,  118,    0,    0,    0,    0,    0,  116,
    0,  115,    0,  112,    0,    0,    0,    0,    0,   92,
   93,   94,   95,   96,   81,   89,   97,    0,    0,  101,
  106,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,   40,   49,    0,    0,    0,   55,    0,    0,    0,
    0,    0,    0,  113,   65,   66,   67,   68,   69,   70,
    0,    0,    0,    0,   71,   72,    0,    0,    0,   79,
    0,    0,    0,    0,    0,   98,    0,    0,    0,  103,
  102,    0,    0,    0,    0,   23,   21,    0,    0,   14,
   12,    0,    0,    0,   50,   48,   73,   53,    0,    0,
    0,    0,    0,   58,    0,    0,    0,    0,   59,   62,
  110,  111,   78,    0,   77,    0,   88,   90,    0,   85,
    0,   86,   18,   19,   20,   17,   13,    8,   28,    0,
    0,    0,   15,    0,    0,    0,  100,   99,    0,    0,
   57,    0,   56,   76,   75,   84,   83,   82,    0,    0,
    0,   34,    0,    0,    0,   16,   54,    0,   51,   60,
    0,   26,    0,   27,    0,    0,    0,   52,   25,   24,
   33,    0,    0,    0,   32,   31,    0,    0,   30,   29,
};
final static short yydgoto[] = {                          3,
    4,   10,   19,   11,   12,   96,   17,   14,   15,  101,
  154,  195,   97,   68,   69,   31,   32,   33,   34,   35,
   36,   37,   70,   38,   60,  109,   39,   71,  127,  123,
   40,   41,   85,   42,  134,  135,   87,   72,   43,   44,
   92,   73,   74,
};
final static short yysindex[] = {                      -219,
  -58,  -24,    0, -144,    0,    0, -220,    0,    0, -178,
    0,   33, -151,    0, -144,   76,    0, -106,    0, -144,
 -140,    3,    0, -122, -220,    0,    0,    0, -211,    0,
 -117, -106,    0,    0,    0,    0,    0, -167,  -37,  -36,
 -130,  -25, -178, -127,    0,  124,    0,  127,  -38,  -84,
  132, -106,    0,  116,   40,    0,    0, -106,    0,  -68,
  138,    0,    0,    0,  -91,   43,  -98,   29,  166,    0,
 -146,    0,  118,    0,  150,  170, -233, -108,  158,    0,
    0,    0,    0,    0,    0,    0,    0,   56,  177,    0,
    0, -243,  -72,  -72,  -79,  -56,  178,  181,  -31, -220,
 -215,    0,    0,  164,   95,  -33,    0,  168, -167,   59,
  185,  192,  -32,    0,    0,    0,    0,    0,    0,    0,
   71,   71,   71,   -8,    0,    0,   71,  -98,  -98,    0,
  175,  210,   54,    7, -108,    0,  214,  -35,    4,    0,
    0,  227,  232,  236,  237,    0,    0, -220, -220,    0,
    0,  220,  -21, -239,    0,    0,    0,    0,   31,  243,
  159,   74,   39,    0, -212,  118,  118,   24,    0,    0,
    0,    0,    0,  239,    0,  245,    0,    0,   35,    0,
 -153,    0,    0,    0,    0,    0,    0,    0,    0,   87,
  160,  247,    0,  -40,   42,  250,    0,    0,  269,  165,
    0,  255,    0,    0,    0,    0,    0,    0,  275,  100,
  264,    0,   71,  286,  288,    0,    0,  272,    0,    0,
  273,    0,  281,    0,   55,   90,  295,    0,    0,    0,
    0,  298,  304,  306,    0,    0,  301,  303,    0,    0,
};
final static short yyrindex[] = {                         0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,  311,    0,    0,    0,   99,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,  -66,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,  311,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
  -34,    0,   -9,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,  107,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,  109,    0,    0,    0,    0,    0,
    0,    0,    0,    0,  -74,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,   11,   18,  103,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
};
final static short yygindex[] = {                         0,
    0,  361,  334,  360,    0,   78,    8,    0,    0,    0,
    0,    0,  119,  -44,  -28,   23,  -22,  -14,  -29,  -13,
  -10,   -2,    0,    0,  274,    0,    0,    0,    0,    0,
    0,    0,    0,    0,  246,  341,    0,    0,    0,    0,
    0,   94,  -45,
};
final static int YYTABLESIZE=383;
static short yytable[];
static { yytable();}
static void yytable(){
yytable = new short[]{                        213,
    5,   95,   66,   77,   67,  181,   63,   67,  165,  149,
  105,   81,  140,   89,   88,   59,  192,  214,  190,   67,
   23,  114,  132,   67,   63,  193,   80,   82,   47,   91,
   83,  109,   53,  109,    6,  109,    1,  113,   84,  141,
  152,  194,   50,  202,   54,  203,  133,  153,   81,  109,
  109,  107,  109,  107,   57,  107,   16,    2,  108,  138,
  108,   55,  108,   80,   82,  161,  121,   83,  122,  107,
  107,  121,  107,  122,  102,   84,  108,  108,  168,  108,
  106,   13,  171,  172,   67,   18,   59,   67,  119,   26,
  120,   20,   13,   27,  176,  232,   58,   13,  170,   51,
   67,   28,  207,   67,   21,   81,  150,  151,  191,   29,
   22,    7,  175,  231,   30,   67,  208,  200,   67,   25,
   80,   82,    8,    9,   83,   16,   26,   99,  125,  126,
   27,   67,   84,   78,   67,   79,   46,  121,   28,  122,
  223,   52,  121,   64,  122,  210,   29,   56,   26,   29,
   26,   30,   27,  156,   27,  187,  188,   79,  222,  128,
   28,   64,   28,   93,  129,  215,   94,   25,   29,   61,
   29,   98,  100,   30,  103,   30,  144,  110,   62,   63,
   64,   22,    8,    9,  225,  111,   65,    8,    9,   42,
  107,  108,   22,   22,    8,    9,   42,  234,   42,  198,
  211,  121,  121,  122,  122,  219,  124,  121,  130,  122,
  131,  142,  143,  145,  166,  167,  136,  139,  147,   75,
  146,  148,  155,   63,  162,  164,  158,   61,    8,    9,
   61,  157,  163,  173,  180,   63,   62,   63,   64,   62,
   63,   64,   61,   76,   65,   16,   61,   65,  109,  169,
  174,   62,   63,   64,  179,   62,   63,   64,   48,   65,
  109,  109,  109,   65,  109,  109,  109,  183,  107,    8,
    9,  177,  184,  182,  109,  108,  185,  186,  189,   49,
  107,  107,  107,  197,  107,  107,  107,  108,  108,  108,
  196,  108,  108,  108,  107,  104,  201,  204,  112,  115,
  116,  108,  117,  205,  206,  212,  216,   61,  217,  218,
   61,  137,  118,  220,  160,  221,   62,   63,   64,   62,
   63,   64,  224,   61,   65,  226,   61,   65,  227,  199,
  228,  229,   62,   63,   64,   62,   63,   64,   61,  230,
   65,   61,  209,   65,  237,  233,  238,   62,   63,   64,
   62,   63,   64,  235,   61,   65,  236,   61,   65,  239,
   64,  240,    6,   62,   63,   64,   62,   63,   64,   38,
  104,   65,   64,   91,   65,   24,   90,   64,   64,   45,
  178,   86,  159,
};
}
static short yycheck[];
static { yycheck(); }
static void yycheck() {
yycheck = new short[] {                         40,
   59,   40,   40,   40,   45,   41,   41,   45,   41,   41,
   55,   41,  256,   42,   40,   38,  256,   58,   40,   45,
   13,   67,  256,   45,   59,  265,   41,   41,   21,   44,
   41,   41,   25,   43,   59,   45,  256,   66,   41,  283,
  256,  281,   40,  256,  256,  258,  280,  263,   78,   59,
   60,   41,   62,   43,   32,   45,  277,  277,   41,   88,
   43,  273,   45,   78,   78,  110,   43,   78,   45,   59,
   60,   43,   62,   45,   52,   78,   59,   60,  123,   62,
   58,    4,  128,  129,   45,  264,  109,   45,   60,  257,
   62,   59,   15,  261,   41,   41,  264,   20,  127,   22,
   45,  269,  256,   45,  256,  135,   99,  100,  153,  277,
  262,  256,   59,   59,  282,   45,  270,  162,   45,   44,
  135,  135,  267,  268,  135,  277,  257,   50,  275,  276,
  261,   45,  135,  264,   45,  266,  277,   43,  269,   45,
   41,  264,   43,   41,   45,  190,  277,  265,  257,  277,
  257,  282,  261,   59,  261,  148,  149,  266,   59,   42,
  269,   59,  269,   40,   47,  194,   40,   44,  277,  268,
  277,  256,   41,  282,   59,  282,  256,   40,  277,  278,
  279,  256,  267,  268,  213,  277,  285,  267,  268,  256,
  259,  260,  267,  268,  267,  268,  263,  226,  265,   41,
   41,   43,   43,   45,   45,   41,   41,   43,   59,   45,
   41,   93,   94,   95,  121,  122,   59,   41,   41,  256,
  277,   41,   59,  258,   40,  258,   59,  268,  267,  268,
  268,  265,   41,   59,  270,  270,  277,  278,  279,  277,
  278,  279,  268,  280,  285,  277,  268,  285,  258,  258,
   41,  277,  278,  279,   41,  277,  278,  279,  256,  285,
  270,  271,  272,  285,  274,  275,  276,   41,  258,  267,
  268,  265,   41,  270,  284,  258,   41,   41,   59,  277,
  270,  271,  272,   41,  274,  275,  276,  270,  271,  272,
  260,  274,  275,  276,  284,  256,  258,   59,  256,  271,
  272,  284,  274,   59,  270,   59,  265,  268,   59,   41,
  268,  256,  284,   59,  256,   41,  277,  278,  279,  277,
  278,  279,   59,  268,  285,   40,  268,  285,   41,  256,
   59,   59,  277,  278,  279,  277,  278,  279,  268,   59,
  285,  268,  256,  285,   41,  256,   41,  277,  278,  279,
  277,  278,  279,   59,  268,  285,   59,  268,  285,   59,
  258,   59,  264,  277,  278,  279,  277,  278,  279,   59,
  264,  285,  270,  265,  285,   15,   43,  275,  276,   20,
  135,   41,  109,
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
"bifurcacion_try : try sentencia_ejecutable_con_anidamiento CATCH",
"bifurcacion_try : try sentencia_ejecutable_con_anidamiento error",
"bifurcacion_try : try sentencia_ejecutable_con_anidamiento",
"try : TRY",
"sentencia_ejecutable_con_anidamiento : sentencia_asignacion",
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

//#line 296 "gramatica.y"

///CODIGO JAVA

private AnalizadorLexico analizadorLexico;
private TablaSimbolo tablaSimbolo;
private ArrayList<String> estructuras = new ArrayList<String>(); //Lista de las estructuras detectadas por el parser
private ArrayList<String> errores = new ArrayList<String>(); //Lista de errores sintacticos detectados por el parser

private ArrayList<Terceto> tercetos = new ArrayList<Terceto>(); //Lista de tercetos generados
private Stack<Integer> pila = new Stack<Integer>(); //Pila utilizada para los tercetos

private HashMap<Integer, Integer> postCondiciones = new HashMap<Integer, Integer>();//Hashmap utilizado para guardar el id de las funciones junto a las referencias de sus postcondicion
private Stack<Integer> pilaFunciones = new Stack<Integer>(); //Pila utilizada para guardar los identificadores de las funciones

public void setAnalizadorLexico(AnalizadorLexico al){
	this.analizadorLexico = al;
}

public int crearTerceto(ParserVal t1, ParserVal t2, ParserVal t3){
	tercetos.add( new Terceto(t1, t2, t3) );
	return tercetos.size()-1;
}

//Metodo usado por el Main para imprimir los tercetos
public void imprimirTercetos(){
	tablaSimbolo= analizadorLexico.getTablaSimbolo();
	System.out.println("Cantidad de tercetos generados: " + tercetos.size());
	for(Terceto t : tercetos)
		System.out.println(t.getTerceto(tablaSimbolo));
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

private void addError(String e){
	errores.add(e);
}

//Metodo usado por el Main para imprimir los errores lexicos
public void imprimirErroresSintacticos(){
        System.out.println("Se encontraron " + this.errores.size() + " errores sintacticos en el codigo");
        for(String e: this.errores){
            System.out.println(" - " + e);
        }
}

private int yylex(){
	Dupla<Integer, Integer> tokenActual = analizadorLexico.getSiguienteToken();
	if(tokenActual.getSegundo() != null)
		yylval = new ParserVal((int)tokenActual.getSegundo());
	//System.out.println("Token devuelto por yylex: " + tokenActual.getPrimero() );
	return tokenActual.getPrimero();
}

private void yyerror(String s){

}
//#line 543 "Parser.java"
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
{ addEstructura( "Declaracion de programa, en la linea: " + analizadorLexico.getNroLineaToken() );}
break;
case 3:
//#line 20 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", identificador de programa invalido"); }
break;
case 7:
//#line 30 "gramatica.y"
{ addEstructura( "Declaracion de variables, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 8:
//#line 31 "gramatica.y"
{ addEstructura( "Declaracion de funciones como variables, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 10:
//#line 33 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", tipo de variable invalido"); }
break;
case 11:
//#line 34 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", declaracion invalida"); }
break;
case 12:
//#line 35 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 13:
//#line 36 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", tipo de variable invalido"); }
break;
case 14:
//#line 37 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 15:
//#line 40 "gramatica.y"
{pilaFunciones.pop();}
break;
case 17:
//#line 44 "gramatica.y"
{
 			 addEstructura( "Declaracion de funcion, en la linea: " + analizadorLexico.getNroLineaToken() );
 			 pilaFunciones.push(val_peek(3).ival);/*se guarda el id en la pila para la postcondicion*/
 			}
break;
case 18:
//#line 48 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", declaracion invalida");
 		  				      pilaFunciones.push(-1);/*se guarda el id en la pila para la postcondicion*/
 		  				    }
break;
case 19:
//#line 51 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", identificador invalido");
 		  					pilaFunciones.push(-1);/*se guarda el id en la pila para la postcondicion*/
 		  				}
break;
case 20:
//#line 54 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", parametro invalido");
 		  				 pilaFunciones.push(-1);/*se guarda el id en la pila para la postcondicion*/
 		  			}
break;
case 21:
//#line 57 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura");
 		  				 pilaFunciones.push(-1);/*se guarda el id en la pila para la postcondicion*/
 		  			}
break;
case 22:
//#line 60 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre");
 		  				 pilaFunciones.push(-1);/*se guarda el id en la pila para la postcondicion*/
 		  			}
break;
case 24:
//#line 68 "gramatica.y"
{ addEstructura( "Sentencia RETURN, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 25:
//#line 69 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 26:
//#line 70 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 27:
//#line 71 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 28:
//#line 72 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 29:
//#line 75 "gramatica.y"
{
 			postCondiciones.put(pilaFunciones.pop(), tercetos.size()-1);/*Se guarda en el hashmap la posicion del terceto de condicion con la clave= ID de la funcion*/
 			addEstructura( "Sentencia POST, en la linea: " + analizadorLexico.getNroLineaToken() ); /*¡POSTCONDICION_VAR= $3.ival?*/}
break;
case 30:
//#line 78 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
break;
case 31:
//#line 79 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta :"); }
break;
case 32:
//#line 80 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 33:
//#line 81 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 34:
//#line 82 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 48:
//#line 110 "gramatica.y"
{
 		       addEstructura( "Sentencia de asignacion, en la linea: " + analizadorLexico.getNroLineaToken() );
		       yyval = new ParserVal((double)crearTerceto(new ParserVal(ASIG), val_peek(3), val_peek(1)));
		      }
break;
case 49:
//#line 114 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia asignacion invalida"); }
break;
case 50:
//#line 115 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 51:
//#line 118 "gramatica.y"
{
 			    addEstructura( "Sentencia de llamado a funcion, en la linea: " + analizadorLexico.getNroLineaToken() );
 			    yyval = new ParserVal((double)crearTerceto(new ParserVal(CALL), val_peek(3), val_peek(1)));
 			   }
break;
case 52:
//#line 122 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 53:
//#line 125 "gramatica.y"
{
 			 tercetos.get(pila.pop()).setT3(new ParserVal((double)tercetos.size()));
 			}
break;
case 54:
//#line 128 "gramatica.y"
{
			 tercetos.get(pila.pop()).setT2(new ParserVal((double)tercetos.size()));
			}
break;
case 55:
//#line 133 "gramatica.y"
{
	tercetos.get(pila.pop()).setT3(new ParserVal((double)tercetos.size()+1));
	int refTerceto =crearTerceto(new ParserVal(-2), new ParserVal(-1), new ParserVal(-1));/*-2 es BI*/
	pila.push(refTerceto);
	yyval = new ParserVal((double)refTerceto);
	}
break;
case 56:
//#line 142 "gramatica.y"
{
 					 int refTerceto = crearTerceto(new ParserVal(-1), val_peek(2), new ParserVal(-1));/*el primer-1 es BF*/
					 pila.push(refTerceto);
 					 yyval = new ParserVal((double)refTerceto);
 					 }
break;
case 57:
//#line 147 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
break;
case 58:
//#line 148 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 59:
//#line 149 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 60:
//#line 150 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia condicional invalida"); }
break;
case 61:
//#line 153 "gramatica.y"
{addEstructura( "Sentencia IF, en la linea: " + analizadorLexico.getNroLineaToken() );
 	  yyval = val_peek(0);}
break;
case 62:
//#line 157 "gramatica.y"
{
	  	yyval = new ParserVal((double)crearTerceto(val_peek(1), val_peek(2), val_peek(0)));
	  	}
break;
case 63:
//#line 160 "gramatica.y"
{yyval = val_peek(0);}
break;
case 64:
//#line 163 "gramatica.y"
{
			yyval = new ParserVal((double)crearTerceto(val_peek(1), val_peek(2), val_peek(0)));
			}
break;
case 65:
//#line 168 "gramatica.y"
{yyval.ival = COMP_MAYOR_IGUAL;}
break;
case 66:
//#line 169 "gramatica.y"
{yyval.ival = COMP_MENOR_IGUAL;}
break;
case 67:
//#line 170 "gramatica.y"
{yyval.ival = COMP_IGUAL;}
break;
case 68:
//#line 171 "gramatica.y"
{yyval.ival = COMP_DISTINTO;}
break;
case 69:
//#line 172 "gramatica.y"
{yyval.ival = '<';}
break;
case 70:
//#line 173 "gramatica.y"
{yyval.ival = '>';}
break;
case 71:
//#line 176 "gramatica.y"
{yyval = val_peek(0);}
break;
case 72:
//#line 177 "gramatica.y"
{yyval = val_peek(0);}
break;
case 75:
//#line 184 "gramatica.y"
{crearTerceto(val_peek(4), val_peek(2), new ParserVal(-1));}
break;
case 76:
//#line 185 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", cadena invalida"); }
break;
case 77:
//#line 186 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 78:
//#line 187 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 79:
//#line 188 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia PRINT invalida"); }
break;
case 80:
//#line 191 "gramatica.y"
{
 		addEstructura( "Sentencia PRINT, en la linea: " + analizadorLexico.getNroLineaToken() );
 		yyval = new ParserVal((int)PRINT);
 		}
break;
case 81:
//#line 197 "gramatica.y"
{
							     tercetos.get(pila.pop()).setT3(new ParserVal((double)tercetos.size()+1));/*Se modifica el BF, agregandole la referencia correspondiente al proximo terceto despues de la ultima sentencia del bloque*/
							     crearTerceto(new ParserVal(-2), new ParserVal((double)pila.pop()), new ParserVal(-1));/*-2 es BI, se crea un BI al terceto que calcula la condicion del while*/
							    }
break;
case 82:
//#line 203 "gramatica.y"
{
					 int refTerceto = crearTerceto(new ParserVal(-1), val_peek(2), new ParserVal(-1));/*el primer-1 es BF*/
					 pila.push(refTerceto);
					 yyval = new ParserVal((double)refTerceto);
					}
break;
case 83:
//#line 208 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia iterativa invalida"); }
break;
case 84:
//#line 209 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
break;
case 85:
//#line 210 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 86:
//#line 211 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 87:
//#line 213 "gramatica.y"
{ addEstructura( "Sentencia WHILE, en la linea: " + analizadorLexico.getNroLineaToken() );
 		 pila.push(tercetos.size());
 	         yyval=val_peek(0); }
break;
case 98:
//#line 234 "gramatica.y"
{ addEstructura( "Sentencia BREAK, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 99:
//#line 237 "gramatica.y"
{
 			 addEstructura( "Sentencia de conversion a DOUBLE, en la linea: " + analizadorLexico.getNroLineaToken() );
 			 yyval =  new ParserVal((double)crearTerceto(new ParserVal(DOUBLE), val_peek(1), new ParserVal(-1)));
 			}
break;
case 100:
//#line 241 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 101:
//#line 244 "gramatica.y"
{
 		      int t = pila.pop();
 		      tercetos.get(t).setT3(new ParserVal((double)tercetos.size()));/*Completa el BT del try*/
		     }
break;
case 102:
//#line 250 "gramatica.y"
{
 		  /*Primero buscamos el id de la funcion invocada en el try recorriendo la lista de tercetos*/
		  int i = tercetos.size()-1;
		  while( (tercetos.get(i).getT1().ival != CALL) && (i >= 0) )
			i--;
		  pila.push(crearTerceto(new ParserVal(-3), new ParserVal((double)postCondiciones.get(tercetos.get(i).getT2().ival)), new ParserVal(-1)));/*el primer -3 es BT, el 2do parametro hace referencia al ID de la funcion invocada*/
		 }
break;
case 103:
//#line 257 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia TRY-CATCH invalida"); }
break;
case 104:
//#line 258 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia TRY-CATCH invalida"); }
break;
case 105:
//#line 261 "gramatica.y"
{ addEstructura( "Sentencia TRY-CATCH, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 106:
//#line 264 "gramatica.y"
{yyval=val_peek(0);}
break;
case 107:
//#line 267 "gramatica.y"
{
							  yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'+'), val_peek(2), val_peek(0)));
 							 }
break;
case 108:
//#line 270 "gramatica.y"
{
		  				         yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'-'), val_peek(2), val_peek(0)));
						        }
break;
case 109:
//#line 273 "gramatica.y"
{ yyval = val_peek(0) ; }
break;
case 110:
//#line 276 "gramatica.y"
{
			     yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'*'), val_peek(2), val_peek(0)));
			     }
break;
case 111:
//#line 279 "gramatica.y"
{
			     yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'/'), val_peek(2), val_peek(0)));
			     }
break;
case 112:
//#line 282 "gramatica.y"
{yyval = val_peek(0);}
break;
case 113:
//#line 283 "gramatica.y"
{
		      yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'*'), new ParserVal(-1), val_peek(0)));
		      }
break;
case 114:
//#line 288 "gramatica.y"
{yyval = val_peek(0);}
break;
case 115:
//#line 289 "gramatica.y"
{yyval = val_peek(0);}
break;
case 116:
//#line 290 "gramatica.y"
{yyval = val_peek(0);}
break;
case 117:
//#line 291 "gramatica.y"
{yyval = val_peek(0);}
break;
case 118:
//#line 292 "gramatica.y"
{yyval = val_peek(0);}
break;
//#line 1109 "Parser.java"
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
