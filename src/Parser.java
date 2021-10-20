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
   23,   23,   23,   23,   34,   24,   24,   24,   24,   24,
   24,   35,   36,   36,   37,   37,   38,   38,   38,   38,
   38,   38,   39,   40,   40,   40,   40,   25,   25,   25,
   41,   42,   42,   42,   42,   17,   17,   17,   43,   43,
   43,   43,   44,   44,   44,   44,   44,
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
    5,    4,    4,    3,    1,    6,    5,    6,    6,    5,
    5,    1,    3,    1,    2,    1,    1,    1,    1,    1,
    1,    1,    2,    5,    5,    4,    4,    4,    4,    3,
    1,    1,    1,    1,    1,    3,    3,    1,    3,    3,
    1,    2,    1,    1,    1,    1,    1,
};
final static short yydefred[] = {                         0,
    0,    0,    0,    0,    3,    2,    0,   39,   40,    0,
    4,    0,    0,    9,    0,    0,   10,    0,    1,    0,
    0,    0,    7,    0,    0,   24,    0,    0,   66,   85,
   92,    0,  111,    0,    0,   47,   48,   49,   50,   51,
    0,    0,    0,    0,    0,    5,    0,   11,    0,    0,
    0,    0,   27,    0,    0,   41,    0,    0,   43,   45,
    0,   79,    0,    0,  123,  126,  127,    0,    0,    0,
    0,    0,  125,    0,  124,    0,  121,    0,    0,    0,
    0,    0,  112,  113,  114,  115,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,   44,   25,   53,    0,
    0,   60,    0,    0,    0,    0,    0,    0,    0,  122,
   70,   71,   72,   73,   74,   75,    0,    0,    0,    0,
   76,   77,    0,    0,    0,   84,    0,    0,    0,    0,
    0,    0,    0,    0,  110,    0,    0,    0,    0,   23,
   21,    0,    0,   14,   12,    0,    0,    0,   52,   78,
   58,    0,    0,    0,    0,    0,    0,    0,   63,    0,
    0,    0,    0,   64,   67,  119,  120,   83,    0,   82,
    0,    0,    0,    0,    0,  109,  108,   18,   19,   20,
   17,   13,    8,   32,    0,    0,    0,   15,    0,    0,
    0,    0,  106,    0,  107,    0,    0,    0,   62,    0,
   61,   81,   80,    0,    0,    0,   97,   98,   99,  100,
  101,   90,   94,  102,    0,    0,   87,   91,    0,    0,
    0,   38,    0,    0,    0,   16,   59,  105,  104,    0,
   56,    0,   57,   65,   89,    0,    0,  103,   88,   86,
    0,   30,    0,   31,    0,    0,    0,   55,   54,   93,
   95,   29,   28,   37,    0,    0,    0,   36,   35,    0,
    0,   34,   33,
};
final static short yydgoto[] = {                          3,
    4,   10,   19,   11,   12,   91,   17,   14,   15,   25,
   96,  148,  190,   92,   26,   27,   71,   72,   34,   35,
  207,  208,  209,  210,  211,   73,   41,   63,  104,   42,
   74,  123,  119,   43,   44,  212,  236,  213,  214,   75,
   45,   87,   76,   77,
};
final static short yysindex[] = {                      -227,
   11,   14,    0,  -46,    0,    0, -190,    0,    0, -185,
    0,   37, -234,    0, -212,   63,    0,  173,    0,  -46,
 -173,   92,    0, -190, -125,    0,   94, -190,    0,    0,
    0, -226,    0, -105,  173,    0,    0,    0,    0,    0,
  154,  -37,  -36,  -25,  -88,    0,  -17,    0,  143,  -38,
   70,  152,    0,  173, -212,    0,  126,  114,    0,    0,
  173,    0, -133,  -21,    0,    0,    0,  -82,   68,  169,
   49,  164,    0, -141,    0,   51,    0,  157,  165, -239,
   72,  182,    0,    0,    0,    0, -243, -212, -212,   76,
  -52,  191,  193,  -31, -190, -198,    0,    0,    0,   71,
  -81,    0,  190,  154,   86,  220,   -9,  209,  -32,    0,
    0,    0,    0,    0,    0,    0,  114,  114,  114,   -3,
    0,    0,  114,  169,  169,    0,  208,  234,  -27,  236,
  -35,   10, -185, -185,    0,  241,  244,  248,  255,    0,
    0, -190, -190,    0,    0,  246,   -6, -102,    0,    0,
    0,   56,  262,  159,  250,   99,  261,   53,    0, -108,
   51,   51,  125,    0,    0,    0,    0,    0,  263,    0,
  266,   59,  -70,  144,  -70,    0,    0,    0,    0,    0,
    0,    0,    0,    0,  102,  267,  271,    0,  -40,   66,
  275,  276,    0,  280,    0,  300,  168,  293,    0,  297,
    0,    0,    0,  -70,  163,  302,    0,    0,    0,    0,
    0,    0,    0,    0,  -70,  -70,    0,    0,  321,  174,
  307,    0,  114,  328,  331,    0,    0,    0,    0,  315,
    0,  316,    0,    0,    0,  118,  163,    0,    0,    0,
  327,    0,  329,    0,   -8,  117,  330,    0,    0,    0,
    0,    0,    0,    0,  338,  349,  357,    0,    0,  344,
  345,    0,    0,
};
final static short yyrindex[] = {                         0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,  347,    0,    0,    0,  145,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0, -203,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,  347,    0,    0,    0,
    0,    0,    0,    0,  148,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,  -34,    0,   16,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,  -93,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
   23,   43,    8,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,  142,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,
};
final static short yygindex[] = {                         0,
    0,    0,    4,  396,    0,  121,   24,    0,    0,    0,
    0,    0,    0,   32,  362,    0,    5,  -43,  -19,  -30,
   36,   54,   88,  110,  147,    0,    0,  318,    0,    0,
    0,    0,    0,    0,    0,  -18,  188, -193,    0,    0,
    0,    0,   60,  -24,
};
final static int YYTABLESIZE=455;
static short yytable[];
static { yytable();}
static void yytable(){
yytable = new short[]{                        223,
   82,   90,   69,   80,   70,  174,   68,   70,  160,  143,
   62,  237,  133,  171,   81,   60,  128,  224,  105,   70,
   18,   21,   88,   70,   68,  109,   28,   22,    1,   57,
  156,  170,  255,  185,   97,   70,   23,  131,   70,  134,
  129,  101,   16,  237,   48,  110,   58,   53,   69,    2,
  254,   56,   46,   36,    8,    9,  118,  146,  118,   46,
  118,   46,  100,  116,  147,  116,   69,  116,  106,    5,
   36,   37,    6,   62,  118,  118,   36,  118,   18,  165,
   83,  116,  116,  117,  116,  117,   16,  117,   37,   36,
  135,  117,  124,  118,   37,   20,   36,  125,   84,  166,
  167,  117,  117,   47,  117,   38,   28,   37,  115,  154,
  116,  157,   70,  117,   37,  118,   70,  144,  145,  136,
  137,  139,   38,  163,   13,  102,  103,   39,   38,  149,
   70,   51,   85,  121,  122,   24,  176,  177,   54,   36,
   13,   38,   52,   70,   39,  225,   70,  200,   38,  201,
   39,  186,   55,  187,   86,  217,  218,   37,   70,   59,
  197,   70,  188,   39,   40,  182,  183,  117,   29,  118,
   39,   94,   30,   22,   22,   24,  161,  162,  189,  245,
   31,   40,   89,  150,   99,  235,   29,   40,   32,  220,
   30,   38,   95,  205,  107,  206,  239,  240,   31,  194,
   40,  117,  257,  118,  120,  127,   32,   40,  232,    7,
  117,   33,  118,   39,  243,  126,  117,  193,  118,   78,
    8,    9,  132,   68,  140,  159,  231,   64,    8,    9,
   64,  141,  242,  142,  173,   68,   65,   66,   67,   65,
   66,   67,   64,   79,   68,   16,   64,   68,  151,  158,
   40,   65,   66,   67,  164,   65,   66,   67,   64,   68,
  155,   64,  117,   68,  118,   69,  168,   65,   66,   67,
   65,   66,   67,  118,  169,   68,  172,   69,   68,  175,
  116,  178,   69,   69,  179,  118,  118,  118,  180,  118,
  118,  118,  116,  116,  116,  181,  116,  116,  116,  118,
  117,  198,  192,  117,  184,  118,  116,  221,  195,  117,
  199,  118,  117,  117,  117,  191,  117,  117,  117,  111,
  112,  202,  113,  108,  203,   93,  117,  130,  204,  222,
  226,  138,  114,  227,  228,   64,    8,    9,  229,   64,
  230,  153,    8,    9,   65,   66,   67,   49,   65,   66,
   67,  233,   68,   64,  196,  234,   68,  219,    8,    9,
  238,  241,   65,   66,   67,  244,   64,  246,   50,   64,
   68,  247,  256,  248,  249,   65,   66,   67,   65,   66,
   67,   64,  250,   68,   64,  252,   68,  253,  258,  260,
   65,   66,   67,   65,   66,   67,  259,  261,   68,  215,
   29,   68,  262,  263,   30,   42,   96,  205,    6,  206,
   29,   26,   31,  216,   30,   46,   98,   61,    0,   29,
   32,  152,   31,   30,  251,   33,    0,    0,  206,   29,
   32,   31,    0,   30,    0,   33,   64,    0,    0,   32,
    0,   31,    0,    0,   33,   65,   66,   67,    0,   32,
    0,    0,    0,   68,   33,
};
}
static short yycheck[];
static { yycheck(); }
static void yycheck() {
yycheck = new short[] {                         40,
   44,   40,   40,   40,   45,   41,   41,   45,   41,   41,
   41,  205,  256,   41,   40,   35,  256,   58,   40,   45,
  264,  256,   40,   45,   59,   69,   44,  262,  256,  256,
   40,   59,   41,   40,   54,   45,   13,   81,   45,  283,
  280,   61,  277,  237,   21,   70,  273,   24,   41,  277,
   59,   28,  256,   18,  267,  268,   41,  256,   43,  263,
   45,  265,   58,   41,  263,   43,   59,   45,   64,   59,
   35,   18,   59,  104,   59,   60,   41,   62,  264,  123,
   45,   59,   60,   41,   62,   43,  277,   45,   35,   54,
   87,   43,   42,   45,   41,   59,   61,   47,   45,  124,
  125,   59,   60,  277,   62,   18,   44,   54,   60,  105,
   62,  107,   45,   43,   61,   45,   45,   94,   95,   88,
   89,   90,   35,  119,    4,  259,  260,   18,   41,   59,
   45,   40,   45,  275,  276,   15,  133,  134,  264,  104,
   20,   54,   22,   45,   35,  189,   45,  256,   61,  258,
   41,  147,   59,  256,   45,  174,  175,  104,   45,  265,
  156,   45,  265,   54,   18,  142,  143,   43,  257,   45,
   61,   51,  261,  267,  268,   55,  117,  118,  281,  223,
  269,   35,   40,  265,   59,  204,  257,   41,  277,  185,
  261,  104,   41,  264,  277,  266,  215,  216,  269,   41,
   54,   43,  246,   45,   41,   41,  277,   61,   41,  256,
   43,  282,   45,  104,   41,   59,   43,   59,   45,  256,
  267,  268,   41,  258,  277,  258,   59,  268,  267,  268,
  268,   41,   59,   41,  270,  270,  277,  278,  279,  277,
  278,  279,  268,  280,  285,  277,  268,  285,   59,   41,
  104,  277,  278,  279,  258,  277,  278,  279,  268,  285,
   41,  268,   43,  285,   45,  258,   59,  277,  278,  279,
  277,  278,  279,  258,   41,  285,   41,  270,  285,  270,
  258,   41,  275,  276,   41,  270,  271,  272,   41,  274,
  275,  276,  270,  271,  272,   41,  274,  275,  276,  284,
  258,   41,   41,   43,   59,   45,  284,   41,   59,   43,
  258,   45,  270,  271,  272,  260,  274,  275,  276,  271,
  272,   59,  274,  256,   59,  256,  284,  256,  270,   59,
  265,  256,  284,   59,   59,  268,  267,  268,   59,  268,
   41,  256,  267,  268,  277,  278,  279,  256,  277,  278,
  279,   59,  285,  268,  256,   59,  285,  256,  267,  268,
   59,   41,  277,  278,  279,   59,  268,   40,  277,  268,
  285,   41,  256,   59,   59,  277,  278,  279,  277,  278,
  279,  268,  265,  285,  268,   59,  285,   59,   59,   41,
  277,  278,  279,  277,  278,  279,   59,   41,  285,  256,
  257,  285,   59,   59,  261,   59,  265,  264,  264,  266,
  257,  264,  269,  270,  261,   20,   55,  264,   -1,  257,
  277,  104,  269,  261,  237,  282,   -1,   -1,  266,  257,
  277,  269,   -1,  261,   -1,  282,  268,   -1,   -1,  277,
   -1,  269,   -1,   -1,  282,  277,  278,  279,   -1,  277,
   -1,   -1,   -1,  285,  282,
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
"sentencia_iterativa : while '(' condicion ')' DO bloque_ejecutable_iterativo",
"sentencia_iterativa : while '(' condicion ')' bloque_ejecutable_iterativo",
"sentencia_iterativa : while '(' condicion ')' error bloque_ejecutable_iterativo",
"sentencia_iterativa : while '(' error ')' DO bloque_ejecutable_iterativo",
"sentencia_iterativa : while '(' condicion DO bloque_ejecutable_iterativo",
"sentencia_iterativa : while condicion ')' DO bloque_ejecutable_iterativo",
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
"sentencia_try_catch : try sentencia_ejecutable_con_anidamiento CATCH bloque_ejecutable",
"sentencia_try_catch : try sentencia_ejecutable_con_anidamiento error bloque_ejecutable",
"sentencia_try_catch : try sentencia_ejecutable_con_anidamiento bloque_ejecutable",
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

//#line 272 "gramatica.y"

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
//#line 571 "Parser.java"
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
{ addEstructura( "Sentencia POST, en la linea: " + analizadorLexico.getNroLineaToken() ); }
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
{addEstructura( "Sentencia de asignacion, en la linea: " + analizadorLexico.getNroLineaToken() );
							  yyval = new ParserVal(crearTerceto(ASIG, val_peek(3).ival, val_peek(1).ival));}
break;
case 53:
//#line 108 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia asignacion invalida"); }
break;
case 54:
//#line 111 "gramatica.y"
{ addEstructura( "Sentencia de llamado a funcion, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 55:
//#line 112 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 56:
//#line 113 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 57:
//#line 114 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 58:
//#line 118 "gramatica.y"
{
 			tercetos.get(pila.pop()).setT3(tercetos.size()+1);
 			}
break;
case 59:
//#line 121 "gramatica.y"
{
			 tercetos.get(pila.pop()).setT2(tercetos.size());
			}
break;
case 60:
//#line 128 "gramatica.y"
{
	tercetos.get(pila.pop()).setT3(tercetos.size()+1);
	int refTerceto =crearTerceto(-2, -1, -1);/*-2 es BI*/
	pila.push(refTerceto);
	yyval = new ParserVal(refTerceto);
	}
break;
case 61:
//#line 137 "gramatica.y"
{
 					 int refTerceto = crearTerceto(-1, val_peek(2).ival, -1);/*el primer-1 es BF*/
					 pila.push(refTerceto);
 					 yyval = new ParserVal(refTerceto);
 					 }
break;
case 62:
//#line 142 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
break;
case 63:
//#line 143 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 64:
//#line 144 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 65:
//#line 145 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia condicional invalida"); }
break;
case 66:
//#line 148 "gramatica.y"
{addEstructura( "Sentencia IF, en la linea: " + analizadorLexico.getNroLineaToken() );
 	  yyval = val_peek(0);}
break;
case 67:
//#line 152 "gramatica.y"
{
	  	yyval = new ParserVal(crearTerceto(val_peek(1).ival, val_peek(2).ival, val_peek(0).ival));
	  	}
break;
case 68:
//#line 155 "gramatica.y"
{yyval = val_peek(0);}
break;
case 69:
//#line 158 "gramatica.y"
{
			yyval = new ParserVal(crearTerceto(val_peek(1).ival, val_peek(2).ival, val_peek(0).ival));
			}
break;
case 70:
//#line 163 "gramatica.y"
{yyval.ival = COMP_MAYOR_IGUAL;}
break;
case 71:
//#line 164 "gramatica.y"
{yyval.ival = COMP_MENOR_IGUAL;}
break;
case 72:
//#line 165 "gramatica.y"
{yyval.ival = COMP_IGUAL;}
break;
case 73:
//#line 166 "gramatica.y"
{yyval.ival = COMP_DISTINTO;}
break;
case 74:
//#line 167 "gramatica.y"
{yyval.ival = '<';}
break;
case 75:
//#line 168 "gramatica.y"
{yyval.ival = '>';}
break;
case 76:
//#line 171 "gramatica.y"
{yyval = val_peek(0);}
break;
case 77:
//#line 172 "gramatica.y"
{yyval = val_peek(0);}
break;
case 81:
//#line 180 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", cadena invalida"); }
break;
case 82:
//#line 181 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 83:
//#line 182 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 84:
//#line 183 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia PRINT invalida"); }
break;
case 85:
//#line 187 "gramatica.y"
{ addEstructura( "Sentencia PRINT, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 87:
//#line 191 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia iterativa invalida"); }
break;
case 88:
//#line 192 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia iterativa invalida"); }
break;
case 89:
//#line 193 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
break;
case 90:
//#line 195 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 91:
//#line 196 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 92:
//#line 199 "gramatica.y"
{ addEstructura( "Sentencia WHILE, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 103:
//#line 218 "gramatica.y"
{ addEstructura( "Sentencia BREAK, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 104:
//#line 221 "gramatica.y"
{ addEstructura( "Sentencia de conversion a DOUBLE, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 105:
//#line 222 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 106:
//#line 224 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 107:
//#line 225 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 109:
//#line 229 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia TRY-CATCH invalida"); }
break;
case 110:
//#line 230 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia TRY-CATCH invalida"); }
break;
case 111:
//#line 234 "gramatica.y"
{ addEstructura( "Sentencia TRY-CATCH, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 116:
//#line 243 "gramatica.y"
{
							  yyval = new ParserVal(crearTerceto('+', val_peek(2).ival, val_peek(0).ival));
 							 }
break;
case 117:
//#line 246 "gramatica.y"
{
					      yyval = new ParserVal(crearTerceto('-', val_peek(2).ival, val_peek(0).ival));
					     }
break;
case 118:
//#line 249 "gramatica.y"
{ yyval = val_peek(0) ; }
break;
case 119:
//#line 252 "gramatica.y"
{
			     yyval = new ParserVal(crearTerceto('*', val_peek(2).ival, val_peek(0).ival));
			     }
break;
case 120:
//#line 255 "gramatica.y"
{
			     yyval = new ParserVal(crearTerceto('/', val_peek(2).ival, val_peek(0).ival));
			     }
break;
case 121:
//#line 258 "gramatica.y"
{yyval = val_peek(0);}
break;
case 122:
//#line 259 "gramatica.y"
{
		      yyval = new ParserVal(crearTerceto('*', -1, val_peek(0).ival));
		      }
break;
case 123:
//#line 264 "gramatica.y"
{yyval = val_peek(0);}
break;
case 124:
//#line 265 "gramatica.y"
{yyval = val_peek(0);}
break;
case 125:
//#line 266 "gramatica.y"
{yyval = val_peek(0);}
break;
case 126:
//#line 267 "gramatica.y"
{yyval = val_peek(0);}
break;
case 127:
//#line 268 "gramatica.y"
{yyval = val_peek(0);}
break;
//#line 1085 "Parser.java"
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
