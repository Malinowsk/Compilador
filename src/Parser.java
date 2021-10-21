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
//#line 20 "Parser.java"




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
    9,    9,   14,   10,   15,   15,   16,   12,   12,   12,
   12,   12,   13,   13,   13,   13,   13,   13,    6,    6,
    7,    7,    3,   11,   19,   19,   20,   20,   20,   20,
   20,   21,   21,   26,   26,   26,   26,   22,   22,   29,
   27,   27,   27,   27,   27,   30,   18,   18,   31,   33,
   33,   33,   33,   33,   33,   32,   32,   28,   28,   23,
   23,   23,   23,   23,   34,   24,   35,   35,   35,   35,
   35,   37,   36,   36,   38,   38,   39,   39,   39,   39,
   39,   39,   40,   41,   41,   41,   41,   25,   42,   42,
   42,   43,   44,   44,   44,   44,   17,   17,   17,   45,
   45,   45,   45,   46,   46,   46,   46,   46,
};
final static short yylen[] = {                            2,
    3,    2,    2,    1,    3,    2,    2,    6,    1,    2,
    3,    5,    6,    5,    6,    7,    6,    6,    6,    6,
    5,    5,    2,    1,    3,    2,    2,    5,    5,    4,
    4,    2,    6,    6,    5,    4,    4,    2,    1,    1,
    3,    1,    3,    1,    2,    1,    1,    1,    1,    1,
    1,    4,    3,    6,    6,    5,    5,    4,    6,    1,
    5,    5,    4,    4,    6,    1,    3,    1,    3,    1,
    1,    1,    1,    1,    1,    1,    1,    3,    1,    5,
    5,    4,    4,    3,    1,    2,    5,    5,    5,    4,
    4,    1,    3,    1,    2,    1,    1,    1,    1,    1,
    1,    1,    2,    5,    5,    4,    4,    2,    3,    3,
    2,    1,    1,    1,    1,    1,    3,    3,    1,    3,
    3,    1,    2,    1,    1,    1,    1,    1,
};
final static short yydefred[] = {                         0,
    0,    0,    0,    0,    3,    2,    0,   39,   40,    0,
    4,    0,    0,    9,    0,    0,   10,    0,    1,    0,
    0,    0,    7,    0,    0,   24,    0,    0,   66,   85,
   92,    0,  112,    0,    0,   47,   48,   49,   50,   51,
    0,    0,    0,    0,    0,    0,    0,    5,    0,   11,
    0,    0,    0,    0,   27,    0,    0,   41,    0,    0,
   43,   45,    0,   79,    0,    0,  124,  127,  128,    0,
    0,    0,    0,    0,  126,    0,  125,    0,  122,    0,
    0,    0,    0,    0,   97,   98,   99,  100,  101,   86,
   94,  102,    0,    0,  108,  113,  114,  115,  116,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,   44,
   25,   53,    0,    0,   60,    0,    0,    0,    0,    0,
    0,    0,  123,   70,   71,   72,   73,   74,   75,    0,
    0,    0,    0,   76,   77,    0,    0,    0,   84,    0,
    0,    0,    0,    0,  103,    0,    0,    0,  110,  109,
    0,    0,    0,    0,   23,   21,    0,    0,   14,   12,
    0,    0,    0,   52,   78,   58,    0,    0,    0,    0,
    0,    0,    0,   63,    0,    0,    0,    0,   64,   67,
  120,  121,   83,    0,   82,    0,   93,   95,    0,   90,
    0,   91,   18,   19,   20,   17,   13,    8,   32,    0,
    0,    0,   15,    0,    0,    0,    0,  106,    0,  107,
    0,    0,    0,   62,    0,   61,   81,   80,   89,   88,
   87,    0,    0,    0,   38,    0,    0,    0,   16,   59,
  105,  104,    0,   56,    0,   57,   65,    0,   30,    0,
   31,    0,    0,    0,   55,   54,   29,   28,   37,    0,
    0,    0,   36,   35,    0,    0,   34,   33,
};
final static short yydgoto[] = {                          3,
    4,   10,   19,   11,   12,  104,   17,   14,   15,   25,
  109,  163,  205,  105,   26,   27,   73,   74,   34,   35,
   36,   37,   38,   39,   40,   75,   41,   65,  117,   42,
   76,  136,  132,   43,   44,   90,   45,  143,  144,   92,
   77,   46,   47,  100,   78,   79,
};
final static short yysindex[] = {                      -245,
  -43,  -33,    0, -101,    0,    0, -264,    0,    0, -209,
    0,   12, -204,    0, -103,   35,    0,  -80,    0, -101,
 -180,   92,    0, -264, -165,    0,   48, -264,    0,    0,
    0, -211,    0, -155,  -80,    0,    0,    0,    0,    0,
  -82,  -37,  -36, -108,  -25, -209,  -73,    0,   74,    0,
   89,  -38,  -46,  105,    0,  -80, -103,    0,   84,  114,
    0,    0,  -80,    0,  -74,  -21,    0,    0,    0, -144,
   68, -140,   49,  116,    0,  -63,    0,   54,    0,  101,
  132, -233, -142,  119,    0,    0,    0,    0,    0,    0,
    0,    0,   72,  142,    0,    0,    0,    0,    0, -255,
 -103, -103,   70,  -86,  152,  158,  -31, -264, -234,    0,
    0,    0,   61,  -62,    0,  147,  -82,   86,  220,   -9,
  176,  -32,    0,    0,    0,    0,    0,    0,    0,  114,
  114,  114,  -39,    0,    0,  114, -140, -140,    0,  164,
  186,   15,  -10, -142,    0,  210,  -35,    5,    0,    0,
  226,  236,  239,  241,    0,    0, -264, -264,    0,    0,
  230,   -6, -244,    0,    0,    0,   25,  268,  149,  252,
   99,  261,   58,    0, -186,   54,   54,   91,    0,    0,
    0,    0,    0,  263,    0,  266,    0,    0,   62,    0,
 -179,    0,    0,    0,    0,    0,    0,    0,    0,  102,
  267,  275,    0,  -40,   76,  276,  280,    0,  284,    0,
  303,  166,  293,    0,  297,    0,    0,    0,    0,    0,
    0,  320,  173,  307,    0,  114,  322,  327,    0,    0,
    0,    0,  313,    0,  315,    0,    0,  316,    0,  324,
    0,   22,  117,  329,    0,    0,    0,    0,    0,  330,
  345,  349,    0,    0,  338,  339,    0,    0,
};
final static short yyrindex[] = {                         0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,  341,    0,    0,    0,  137,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,   40,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,  341,    0,
    0,    0,    0,    0,    0,    0,  139,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,  -34,    0,   16,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,  140,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,  141,    0,    0,    0,    0,    0,    0,
    0,    0,    0,  -18,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,   23,   43,    8,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,
};
final static short yygindex[] = {                         0,
    0,    0,  359,  387,    0,  148,   14,    0,    0,    0,
    0,    0,    0,  228,  351,    0,  -20,  -28,   60,  -27,
  -14,   -3,    4,    6,   10,    0,    0,  292,    0,    0,
    0,    0,    0,    0,    0,    0,    0,  269,  366,    0,
    0,    0,    0,    0,  103,  -12,
};
final static int YYTABLESIZE=413;
static short yytable[];
static { yytable();}
static void yytable(){
yytable = new short[]{                        226,
  149,  103,   71,   82,   72,  191,   68,   72,  175,  158,
    1,  202,   16,   64,   93,    5,   94,  227,  118,   72,
  203,  161,  141,   72,   68,    6,   23,  150,  162,   85,
  171,    2,   96,  200,   50,   72,  204,   55,   72,  113,
   86,   58,  122,   97,   59,  119,  142,   87,   69,   88,
   98,   21,   99,   89,   18,  186,  119,   22,  119,  123,
  119,   60,  250,  117,  147,  117,   69,  117,   85,  215,
   20,  216,   16,  185,  119,  119,  220,  119,   28,   86,
  249,  117,  117,  118,  117,  118,   87,  118,   88,   64,
  221,  130,   89,  131,   62,  137,   49,  169,   56,  172,
  138,  118,  118,  130,  118,  131,   57,  180,  128,   61,
  129,  178,   72,  101,   29,  110,   72,   28,   30,  164,
  159,  160,  114,   84,  181,  182,   31,   66,  102,   85,
   72,   53,  120,  130,   32,  131,   67,   68,   69,   33,
   86,  201,  112,   72,   70,  108,   72,   87,   29,   88,
  212,   13,   30,   89,    7,   83,  133,   84,   72,  139,
   31,   72,   24,    8,    9,    8,    9,   13,   32,   54,
  197,  198,  140,   33,   29,  228,   29,  145,   30,  223,
   30,   63,  148,   29,  115,  116,   31,   30,   31,  209,
  155,  130,  156,  131,   32,   31,   32,  242,  157,   33,
  107,   33,  165,   32,   24,  166,  235,  208,  130,  106,
  131,  134,  135,  240,  252,  130,  173,  131,  179,   80,
    8,    9,  183,   68,  234,  174,  184,   66,    8,    9,
   66,  239,  176,  177,  190,   68,   67,   68,   69,   67,
   68,   69,   66,   81,   70,   16,   66,   70,   22,   22,
  189,   67,   68,   69,  187,   67,   68,   69,   66,   70,
  170,   66,  130,   70,  131,   69,  193,   67,   68,   69,
   67,   68,   69,  119,  192,   70,  194,   69,   70,  195,
  117,  196,   69,   69,  206,  119,  119,  119,  199,  119,
  119,  119,  117,  117,  117,   46,  117,  117,  117,  119,
  118,  213,   46,  130,   46,  131,  117,  224,  207,  130,
  210,  131,  118,  118,  118,  214,  118,  118,  118,  124,
  125,  217,  126,  121,  218,  153,  118,  146,  151,  152,
  154,  219,  127,  225,  230,   66,    8,    9,  231,   66,
  229,  168,  232,  233,   67,   68,   69,   51,   67,   68,
   69,  236,   70,   66,  211,  237,   70,  222,    8,    9,
  238,  243,   67,   68,   69,  241,   66,  244,   52,   66,
   70,  245,  251,  246,  247,   67,   68,   69,   67,   68,
   69,   66,  248,   70,   66,  255,   70,  253,  254,  256,
   67,   68,   69,   67,   68,   69,  257,  258,   70,   42,
    6,   70,   26,  111,   95,   96,   48,  111,  167,   91,
    0,    0,  188,
};
}
static short yycheck[];
static { yycheck(); }
static void yycheck() {
yycheck = new short[] {                         40,
  256,   40,   40,   40,   45,   41,   41,   45,   41,   41,
  256,  256,  277,   41,   40,   59,   45,   58,   40,   45,
  265,  256,  256,   45,   59,   59,   13,  283,  263,   44,
   40,  277,   47,   40,   21,   45,  281,   24,   45,   60,
   44,   28,   71,   47,  256,   66,  280,   44,   41,   44,
   47,  256,   47,   44,  264,   41,   41,  262,   43,   72,
   45,  273,   41,   41,   93,   43,   59,   45,   83,  256,
   59,  258,  277,   59,   59,   60,  256,   62,   44,   83,
   59,   59,   60,   41,   62,   43,   83,   45,   83,  117,
  270,   43,   83,   45,   35,   42,  277,  118,  264,  120,
   47,   59,   60,   43,   62,   45,   59,  136,   60,  265,
   62,  132,   45,   40,  257,   56,   45,   44,  261,   59,
  107,  108,   63,  266,  137,  138,  269,  268,   40,  144,
   45,   40,  277,   43,  277,   45,  277,  278,  279,  282,
  144,  162,   59,   45,  285,   41,   45,  144,  257,  144,
  171,    4,  261,  144,  256,  264,   41,  266,   45,   59,
  269,   45,   15,  267,  268,  267,  268,   20,  277,   22,
  157,  158,   41,  282,  257,  204,  257,   59,  261,  200,
  261,  264,   41,  257,  259,  260,  269,  261,  269,   41,
  277,   43,   41,   45,  277,  269,  277,  226,   41,  282,
   53,  282,  265,  277,   57,   59,   41,   59,   43,  256,
   45,  275,  276,   41,  243,   43,   41,   45,  258,  256,
  267,  268,   59,  258,   59,  258,   41,  268,  267,  268,
  268,   59,  130,  131,  270,  270,  277,  278,  279,  277,
  278,  279,  268,  280,  285,  277,  268,  285,  267,  268,
   41,  277,  278,  279,  265,  277,  278,  279,  268,  285,
   41,  268,   43,  285,   45,  258,   41,  277,  278,  279,
  277,  278,  279,  258,  270,  285,   41,  270,  285,   41,
  258,   41,  275,  276,  260,  270,  271,  272,   59,  274,
  275,  276,  270,  271,  272,  256,  274,  275,  276,  284,
  258,   41,  263,   43,  265,   45,  284,   41,   41,   43,
   59,   45,  270,  271,  272,  258,  274,  275,  276,  271,
  272,   59,  274,  256,   59,  256,  284,  256,  101,  102,
  103,  270,  284,   59,   59,  268,  267,  268,   59,  268,
  265,  256,   59,   41,  277,  278,  279,  256,  277,  278,
  279,   59,  285,  268,  256,   59,  285,  256,  267,  268,
   41,   40,  277,  278,  279,   59,  268,   41,  277,  268,
  285,   59,  256,   59,   59,  277,  278,  279,  277,  278,
  279,  268,   59,  285,  268,   41,  285,   59,   59,   41,
  277,  278,  279,  277,  278,  279,   59,   59,  285,   59,
  264,  285,  264,  264,   46,  265,   20,   57,  117,   44,
   -1,   -1,  144,
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
"sentencia_declarativa_funcion : cabecera_funcion bloque_declarativo_funcion BEGIN bloque_ejecutable_funcion retorno_funcion END",
"sentencia_declarativa_funcion : cabecera_funcion bloque_declarativo_funcion BEGIN bloque_ejecutable_funcion retorno_funcion postcondicion END",
"cabecera_funcion : tipo FUNC ID '(' parametro ')'",
"cabecera_funcion : tipo error ID '(' parametro ')'",
"cabecera_funcion : tipo FUNC error '(' parametro ')'",
"cabecera_funcion : tipo FUNC ID '(' error ')'",
"cabecera_funcion : tipo FUNC ID parametro ')'",
"cabecera_funcion : tipo FUNC ID '(' parametro",
"parametro : tipo ID",
"bloque_declarativo_funcion : sentencias_declarativas_en_funcion",
"sentencias_declarativas_en_funcion : sentencia_declarativa_en_funcion ';' sentencias_declarativas_en_funcion",
"sentencias_declarativas_en_funcion : sentencia_declarativa_en_funcion ';'",
"sentencia_declarativa_en_funcion : tipo lista_variables",
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
"sentencia_llamado_funcion : CALL ID '(' expresion_aritmetica ')' ';'",
"sentencia_llamado_funcion : CALL ID '(' error ')' ';'",
"sentencia_llamado_funcion : CALL ID '(' expresion_aritmetica ';'",
"sentencia_llamado_funcion : CALL ID expresion_aritmetica ')' ';'",
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
"sentencia_conversion : DOUBLE '(' expresion_aritmetica ')' ';'",
"sentencia_conversion : DOUBLE '(' error ')' ';'",
"sentencia_conversion : DOUBLE '(' expresion_aritmetica ';'",
"sentencia_conversion : DOUBLE expresion_aritmetica ')' ';'",
"sentencia_try_catch : bifurcacion_try bloque_ejecutable",
"bifurcacion_try : try sentencia_ejecutable_con_anidamiento CATCH",
"bifurcacion_try : try sentencia_ejecutable_con_anidamiento error",
"bifurcacion_try : try sentencia_ejecutable_con_anidamiento",
"try : TRY",
"sentencia_ejecutable_con_anidamiento : sentencia_asignacion",
"sentencia_ejecutable_con_anidamiento : sentencia_condicional",
"sentencia_ejecutable_con_anidamiento : sentencia_imprimir",
"sentencia_ejecutable_con_anidamiento : sentencia_iterativa",
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

//#line 291 "gramatica.y"

///CODIGO JAVA

private AnalizadorLexico analizadorLexico;
private ArrayList<String> estructuras = new ArrayList<String>(); //Lista de las estructuras detectadas por el parser
private ArrayList<String> errores = new ArrayList<String>(); //Lista de errores sintacticos detectados por el parser

private ArrayList<Terceto> tercetos = new ArrayList<Terceto>(); //Lista de tercetos generados
private Stack<Integer> pila = new Stack<Integer>(); //Pila utilizada para los tercetos

public void setAnalizadorLexico(AnalizadorLexico al){
	this.analizadorLexico = al;
}

public int crearTerceto(int t1, int t2, int t3){
	tercetos.add( new Terceto(t1, t2, t3) );
	return tercetos.size()-1;
}

//Metodo usado por el Main para imprimir los tercetos
public void imprimirTercetos(){
	System.out.println("Cantidad de tercetos generados: " + tercetos.size());
	for(Terceto t : tercetos)
		System.out.println(t.getTerceto());
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
        System.out.println("Se encontraron " + this.errores.size() + " errores sintacticos en el codigo:");
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
//#line 561 "Parser.java"
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
//#line 18 "gramatica.y"
{ addEstructura( "Declaracion de programa, en la linea: " + analizadorLexico.getNroLineaToken() );}
break;
case 3:
//#line 19 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", identificador de programa invalido"); }
break;
case 7:
//#line 29 "gramatica.y"
{ addEstructura( "Declaracion de variables, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 8:
//#line 30 "gramatica.y"
{ addEstructura( "Declaracion de funciones como variables, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 10:
//#line 32 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", tipo de variable invalida"); }
break;
case 11:
//#line 33 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", declaracion invalida"); }
break;
case 12:
//#line 34 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 13:
//#line 35 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
break;
case 14:
//#line 36 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 17:
//#line 45 "gramatica.y"
{ addEstructura( "Declaracion de funcion, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 18:
//#line 46 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", declaracion invalida"); }
break;
case 19:
//#line 47 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", identificador invalido"); }
break;
case 20:
//#line 48 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", parametro invalido"); }
break;
case 21:
//#line 49 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 22:
//#line 50 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 27:
//#line 63 "gramatica.y"
{ addEstructura( "Declaracion de variables, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 28:
//#line 66 "gramatica.y"
{ addEstructura( "Sentencia RETURN, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 29:
//#line 67 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 30:
//#line 68 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 31:
//#line 69 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 32:
//#line 70 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 33:
//#line 73 "gramatica.y"
{ addEstructura( "Sentencia POST, en la linea: " + analizadorLexico.getNroLineaToken() ); /*¡POSTCONDICION_VAR= $3.ival?*/}
break;
case 34:
//#line 74 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
break;
case 35:
//#line 75 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta :"); }
break;
case 36:
//#line 76 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 37:
//#line 77 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 38:
//#line 78 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 52:
//#line 106 "gramatica.y"
{
 		       addEstructura( "Sentencia de asignacion, en la linea: " + analizadorLexico.getNroLineaToken() );
		       crearTerceto(ASIG, val_peek(3).ival, val_peek(1).ival);
		      }
break;
case 53:
//#line 110 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia asignacion invalida"); }
break;
case 54:
//#line 113 "gramatica.y"
{
 			    addEstructura( "Sentencia de llamado a funcion, en la linea: " + analizadorLexico.getNroLineaToken() );
 			    yyval =  new ParserVal(crearTerceto(CALL, val_peek(4).ival, val_peek(2).ival));
 			   }
break;
case 55:
//#line 117 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 56:
//#line 118 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 57:
//#line 119 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 58:
//#line 122 "gramatica.y"
{
 			 tercetos.get(pila.pop()).setT3(tercetos.size());
 			}
break;
case 59:
//#line 125 "gramatica.y"
{
			 tercetos.get(pila.pop()).setT2(tercetos.size());
			}
break;
case 60:
//#line 130 "gramatica.y"
{
	tercetos.get(pila.pop()).setT3(tercetos.size()+1);
	int refTerceto =crearTerceto(-2, -1, -1);/*-2 es BI*/
	pila.push(refTerceto);
	yyval = new ParserVal(refTerceto);
	}
break;
case 61:
//#line 139 "gramatica.y"
{
 					 int refTerceto = crearTerceto(-1, val_peek(2).ival, -1);/*el primer-1 es BF*/
					 pila.push(refTerceto);
 					 yyval = new ParserVal(refTerceto);
 					 }
break;
case 62:
//#line 144 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
break;
case 63:
//#line 145 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 64:
//#line 146 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 65:
//#line 147 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia condicional invalida"); }
break;
case 66:
//#line 150 "gramatica.y"
{addEstructura( "Sentencia IF, en la linea: " + analizadorLexico.getNroLineaToken() );
 	  yyval = val_peek(0);}
break;
case 67:
//#line 154 "gramatica.y"
{
	  	yyval = new ParserVal(crearTerceto(val_peek(1).ival, val_peek(2).ival, val_peek(0).ival));
	  	}
break;
case 68:
//#line 157 "gramatica.y"
{yyval = val_peek(0);}
break;
case 69:
//#line 160 "gramatica.y"
{
			yyval = new ParserVal(crearTerceto(val_peek(1).ival, val_peek(2).ival, val_peek(0).ival));
			}
break;
case 70:
//#line 165 "gramatica.y"
{yyval.ival = COMP_MAYOR_IGUAL;}
break;
case 71:
//#line 166 "gramatica.y"
{yyval.ival = COMP_MENOR_IGUAL;}
break;
case 72:
//#line 167 "gramatica.y"
{yyval.ival = COMP_IGUAL;}
break;
case 73:
//#line 168 "gramatica.y"
{yyval.ival = COMP_DISTINTO;}
break;
case 74:
//#line 169 "gramatica.y"
{yyval.ival = '<';}
break;
case 75:
//#line 170 "gramatica.y"
{yyval.ival = '>';}
break;
case 76:
//#line 173 "gramatica.y"
{yyval = val_peek(0);}
break;
case 77:
//#line 174 "gramatica.y"
{yyval = val_peek(0);}
break;
case 81:
//#line 182 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", cadena invalida"); }
break;
case 82:
//#line 183 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 83:
//#line 184 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 84:
//#line 185 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia PRINT invalida"); }
break;
case 85:
//#line 189 "gramatica.y"
{ addEstructura( "Sentencia PRINT, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 86:
//#line 192 "gramatica.y"
{
							     tercetos.get(pila.pop()).setT3(tercetos.size()+1);/*Se modifica el BF, agregandole la referencia correspondiente al proximo terceto despues de la ultima sentencia del bloque*/
							     int refTerceto = crearTerceto(-2, pila.pop(), -1);/*-2 es BI, se crea un BI al terceto que calcula la condicion del while*/
							    }
break;
case 87:
//#line 198 "gramatica.y"
{
					 int refTerceto = crearTerceto(-1, val_peek(2).ival, -1);/*el primer-1 es BF*/
					 pila.push(refTerceto);
					 yyval = new ParserVal(refTerceto);
					}
break;
case 88:
//#line 203 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia iterativa invalida"); }
break;
case 89:
//#line 204 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
break;
case 90:
//#line 205 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 91:
//#line 206 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 92:
//#line 208 "gramatica.y"
{ addEstructura( "Sentencia WHILE, en la linea: " + analizadorLexico.getNroLineaToken() );
 		 pila.push(tercetos.size());
 	         yyval=val_peek(0); }
break;
case 103:
//#line 229 "gramatica.y"
{ addEstructura( "Sentencia BREAK, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 104:
//#line 232 "gramatica.y"
{
 			 addEstructura( "Sentencia de conversion a DOUBLE, en la linea: " + analizadorLexico.getNroLineaToken() );
 			 yyval =  new ParserVal(crearTerceto(DOUBLE, val_peek(2).ival, -1));
 			}
break;
case 105:
//#line 236 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 106:
//#line 237 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 107:
//#line 238 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 108:
//#line 241 "gramatica.y"
{
		      tercetos.get(pila.pop()).setT3(tercetos.size());
		     }
break;
case 109:
//#line 246 "gramatica.y"
{
		  /*pila.push(crearTerceto(-1, ¿POSTCONDICION_VAR?, -1));//el primer -1 es BF*/
		 }
break;
case 110:
//#line 249 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia TRY-CATCH invalida"); }
break;
case 111:
//#line 250 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia TRY-CATCH invalida"); }
break;
case 112:
//#line 253 "gramatica.y"
{ addEstructura( "Sentencia TRY-CATCH, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 117:
//#line 262 "gramatica.y"
{
							  yyval = new ParserVal(crearTerceto('+', val_peek(2).ival, val_peek(0).ival));
 							 }
break;
case 118:
//#line 265 "gramatica.y"
{
		  				         yyval = new ParserVal(crearTerceto('-', val_peek(2).ival, val_peek(0).ival));
						        }
break;
case 119:
//#line 268 "gramatica.y"
{ yyval = val_peek(0) ; }
break;
case 120:
//#line 271 "gramatica.y"
{
			     yyval = new ParserVal(crearTerceto('*', val_peek(2).ival, val_peek(0).ival));
			     }
break;
case 121:
//#line 274 "gramatica.y"
{
			     yyval = new ParserVal(crearTerceto('/', val_peek(2).ival, val_peek(0).ival));
			     }
break;
case 122:
//#line 277 "gramatica.y"
{yyval = val_peek(0);}
break;
case 123:
//#line 278 "gramatica.y"
{
		      yyval = new ParserVal(crearTerceto('*', -1, val_peek(0).ival));
		      }
break;
case 124:
//#line 283 "gramatica.y"
{yyval = val_peek(0);}
break;
case 125:
//#line 284 "gramatica.y"
{yyval = val_peek(0);}
break;
case 126:
//#line 285 "gramatica.y"
{yyval = val_peek(0);}
break;
case 127:
//#line 286 "gramatica.y"
{yyval = val_peek(0);}
break;
case 128:
//#line 287 "gramatica.y"
{yyval = val_peek(0);}
break;
//#line 1108 "Parser.java"
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
