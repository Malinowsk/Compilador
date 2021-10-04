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
//#line 19 "Parser.java"




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
public final static short YYERRCODE=256;
final static short yylhs[] = {                           -1,
    0,    1,    1,    2,    4,    4,    5,    5,    5,    5,
    5,    5,    5,    5,    8,    8,    9,    9,    9,    9,
    9,    9,   14,   10,   15,   15,   16,   12,   12,   12,
   12,   12,   13,   13,   13,   13,   13,   13,    6,    6,
    7,    7,    3,   11,   19,   19,   20,   20,   20,   20,
   20,   20,   20,   21,   21,   22,   22,   22,   22,   23,
   23,   23,   23,   23,   28,   18,   18,   30,   32,   32,
   32,   32,   32,   32,   31,   31,   29,   29,   24,   24,
   24,   24,   33,   25,   25,   25,   25,   25,   25,   34,
   35,   35,   36,   36,   37,   37,   37,   37,   37,   37,
   37,   37,   38,   26,   26,   26,   26,   27,   27,   27,
   39,   40,   40,   40,   40,   40,   40,   17,   17,   17,
   41,   41,   41,   41,   42,   42,   42,
};
final static short yylen[] = {                            2,
    3,    2,    2,    1,    3,    2,    2,    6,    1,    2,
    3,    5,    6,    5,    6,    7,    6,    6,    6,    6,
    5,    5,    2,    1,    3,    2,    2,    5,    5,    4,
    4,    2,    6,    6,    5,    4,    4,    2,    1,    1,
    3,    1,    3,    1,    2,    1,    1,    1,    1,    1,
    1,    1,    1,    4,    3,    5,    5,    4,    4,    8,
   10,    8,    7,    7,    1,    3,    1,    3,    1,    1,
    1,    1,    1,    1,    1,    1,    3,    1,    5,    5,
    4,    4,    1,    6,    5,    6,    6,    5,    5,    1,
    3,    1,    2,    1,    1,    1,    1,    1,    1,    1,
    1,    1,    2,    5,    4,    4,    4,    4,    4,    3,
    1,    1,    1,    1,    1,    1,    1,    3,    3,    1,
    3,    3,    2,    1,    1,    1,    1,
};
final static short yydefred[] = {                         0,
    0,    0,    0,    0,    3,    2,    0,   39,   40,    0,
    4,    0,    0,    9,    0,    0,   10,    0,    1,    0,
    0,    0,    7,    0,    0,   24,    0,    0,   65,   83,
    0,   90,    0,  111,    0,    0,   47,   48,   49,   50,
   51,   52,   53,    0,    0,    0,    0,    5,    0,   11,
    0,    0,    0,    0,   27,    0,    0,   41,  125,  126,
  127,    0,    0,    0,    0,  124,    0,    0,    0,    0,
   43,   45,    0,    0,    0,    0,    0,    0,    0,    0,
  112,  113,  114,  115,  116,  117,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,   44,   25,    0,    0,
  123,    0,    0,    0,    0,    0,   55,    0,    0,    0,
    0,    0,    0,   69,   70,   71,   72,   73,   74,    0,
    0,   75,   76,    0,    0,    0,    0,    0,    0,    0,
    0,    0,  110,    0,    0,    0,    0,   23,   21,    0,
    0,   14,   12,    0,    0,    0,  105,  106,    0,  107,
    0,    0,  121,  122,   54,    0,   58,    0,   59,    0,
    0,    0,    0,    0,   66,   82,    0,   81,    0,    0,
    0,    0,    0,  109,  108,   18,   19,   20,   17,   13,
    8,   32,    0,    0,    0,   15,    0,    0,  104,   57,
   56,    0,    0,   78,    0,    0,    0,   80,   79,    0,
    0,    0,   95,   96,   97,   98,   99,  100,  101,   88,
   92,  102,    0,    0,   85,   89,    0,    0,    0,   38,
    0,    0,    0,   16,    0,    0,    0,    0,    0,   87,
    0,    0,  103,   86,   84,    0,   30,    0,   31,    0,
    0,    0,    0,   77,   63,    0,    0,   64,   91,   93,
   29,   28,   37,    0,    0,    0,   36,   62,    0,   60,
   35,    0,    0,    0,   34,   33,   61,
};
final static short yydgoto[] = {                          3,
    4,   10,   19,   11,   12,   91,   17,   14,   15,   25,
   96,  146,  188,   92,   26,   27,   74,   75,   35,  194,
   37,   38,   39,   40,   41,   42,   43,   44,  195,   76,
  124,  120,   45,   46,  210,  231,  211,  212,   47,   87,
   65,   66,
};
final static short yysindex[] = {                      -197,
  -46,  -26,    0,  -62,    0,    0, -215,    0,    0, -198,
    0,   15, -183,    0,  -52,   51,    0, -122,    0,  -62,
 -188,   29,    0, -215, -166,    0,   65, -215,    0,    0,
  -30,    0,   -4,    0, -127, -122,    0,    0,    0,    0,
    0,    0,    0,   10,  -35,   13, -140,    0,  141,    0,
  103,    4,  -60,  104,    0, -122,  -52,    0,    0,    0,
    0,   22,   76,  298,   72,    0,   92,   41,   26,  317,
    0,    0,   30,   -8,  127,  -21,  132, -193,   46,  139,
    0,    0,    0,    0,    0,    0, -234,  -52,  -52,  -54,
  -56,  148,  171,  -38, -215, -133,    0,    0,  187,  107,
    0,  192,   41,   41,   76,   76,    0,  152,  191,  113,
  200,  224,  -40,    0,    0,    0,    0,    0,    0,   41,
   19,    0,    0,   41,  258,  280,   77,  281,  -24,   61,
 -198, -198,    0,  289,  299,  301,  326,    0,    0, -215,
 -215,    0,    0,  309,   16, -242,    0,    0,  313,    0,
   72,   72,    0,    0,    0,  322,    0,  325,    0,  136,
  114,  137,  182,  114,    0,    0,  338,    0,  339,  115,
  161,  146,  161,    0,    0,    0,    0,    0,    0,    0,
    0,    0,   55,  318,  340,    0,    2,  135,    0,    0,
    0,  114, -122,    0,  144,  114,  149,    0,    0,  161,
  -90,  342,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,  161,  161,    0,    0,  365,  145,  354,    0,
   41,  377,  378,    0,  160,  159,  362,    8,  367,    0,
  166,  -90,    0,    0,    0,  373,    0,  374,    0,   90,
   58,  375,  376,    0,    0,  114,  380,    0,    0,    0,
    0,    0,    0,  381,  395,  396,    0,    0,  181,    0,
    0,  383,  385,  386,    0,    0,    0,
};
final static short yyrindex[] = {                         0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,  387,    0,    0,    0,  183,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,  -65,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,  387,    0,
    0,    0,    0,    0,    0,    0,  184,    0,    0,    0,
    0,    0,    0,    0,  -41,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,   68,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,   45,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
  -34,  -14,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,   40,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,  185,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,
};
final static short yygindex[] = {                         0,
    0,    0,  -55,  429,    0,  100,   69,    0,    0,    0,
    0,    0,    0,  276,  394,    0,   39,  -22,  -16,   60,
  -39,  -31,  156,  173,  176,  179,  -88,    0, -158,    0,
    0,    0,    0,    0, -108,  220, -189,    0,    0,    0,
  180,    5,
};
final static int YYTABLESIZE=452;
static short yytable[];
static { yytable();}
static void yytable(){
yytable = new short[]{                        120,
  162,  120,  141,  120,   78,  197,  118,   81,  118,   62,
  118,  232,    5,  185,   63,   82,  172,  120,  120,   72,
  120,  131,  186,   80,  118,  118,  119,  118,  119,   18,
  119,  133,    6,  225,  103,   69,  104,  228,  187,   97,
   63,  221,  232,   90,  119,  119,   63,  119,  132,   73,
  113,  118,   79,  119,   63,  183,  129,   63,    1,  222,
   63,   16,  126,  215,  216,   18,   63,  101,   53,   64,
   63,   70,   21,   20,   63,  174,  175,   36,   22,    2,
   68,   23,  209,  209,  209,   63,  127,  259,   49,   50,
   63,  230,   55,   16,   28,   36,   58,   56,   68,   63,
  100,  165,   63,   13,  234,  235,  108,  110,   67,  153,
  154,  209,  209,  105,   24,   36,   29,  169,  106,   13,
   30,   54,  144,   57,  209,  209,   67,   31,   32,  145,
  254,  203,  203,  203,   29,  168,   33,   71,   30,  204,
  204,  204,   89,  209,   95,   31,   32,  149,  253,  103,
  107,  104,   94,  158,   33,  103,   24,  104,  163,   34,
  203,  203,  142,  143,  223,  148,   29,  121,  204,  204,
   30,  157,  125,  203,  203,  202,  226,   31,   32,  130,
   88,  204,  204,  184,   28,  238,   33,  103,  139,  104,
   46,   34,  203,    7,  103,   93,  104,   46,  240,   46,
  204,  136,   83,  237,    8,    9,    8,    9,  180,  181,
  155,  140,    8,    9,    8,    9,  120,  161,  256,   84,
  138,  218,   85,  118,  103,   86,  104,  147,  120,  120,
  120,  156,  120,  120,  120,  118,  118,  118,   16,  118,
  118,  118,  120,  119,   77,  171,   59,   60,   61,  118,
  150,   67,   36,  122,  123,  119,  119,  119,  159,  119,
  119,  119,  114,  115,  160,  116,  246,  247,   68,  119,
    8,    9,   59,   60,   61,  117,  164,   99,   59,   60,
   61,  109,  151,  152,   51,  112,   59,   60,   61,   59,
   60,   61,   59,   60,   61,    8,    9,   68,   59,   60,
   61,  128,   59,   60,   61,   52,   59,   60,   61,   68,
  217,   22,   22,  255,   68,   68,  166,   59,   60,   61,
  167,  170,   59,   60,   61,   67,  205,  205,  205,  176,
  173,   59,   60,   61,   59,   60,   61,   67,  102,  177,
  103,  178,  104,  206,  206,  206,  207,  207,  207,  208,
  208,  208,   59,   60,   61,  205,  205,  111,  219,  103,
  103,  104,  104,  134,  135,  137,  179,  182,  205,  205,
   29,  189,  206,  206,   30,  207,  207,  193,  208,  208,
  190,   31,   32,  191,  200,  206,  206,  205,  207,  207,
   33,  208,  208,  192,  196,   34,  198,  199,  220,  224,
  233,  213,   29,  227,  206,  236,   30,  207,  229,  201,
  208,  202,  239,   31,   32,  214,  241,   29,  242,  243,
  245,   30,   33,  244,  201,  248,  202,   34,   31,   32,
  249,  251,  252,  257,  258,  262,  263,   33,  260,  261,
  264,  265,   34,  266,  267,   42,    6,   26,   48,   94,
   98,  250,
};
}
static short yycheck[];
static { yycheck(); }
static void yycheck() {
yycheck = new short[] {                         41,
   41,   43,   41,   45,   40,  164,   41,   47,   43,   40,
   45,  201,   59,  256,   45,   47,   41,   59,   60,   36,
   62,  256,  265,   46,   59,   60,   41,   62,   43,  264,
   45,   87,   59,  192,   43,   40,   45,  196,  281,   56,
   45,   40,  232,   40,   59,   60,   45,   62,  283,   40,
   73,   60,   40,   62,   45,   40,   79,   45,  256,   58,
   45,  277,  256,  172,  173,  264,   45,   63,   40,   31,
   45,   33,  256,   59,   45,  131,  132,   18,  262,  277,
   41,   13,  171,  172,  173,   45,  280,  246,  277,   21,
   45,  200,   24,  277,   44,   36,   28,  264,   59,   45,
   62,  124,   45,    4,  213,  214,   68,   69,   41,  105,
  106,  200,  201,   42,   15,   56,  257,   41,   47,   20,
  261,   22,  256,   59,  213,  214,   59,  268,  269,  263,
   41,  171,  172,  173,  257,   59,  277,  265,  261,  171,
  172,  173,   40,  232,   41,  268,  269,   41,   59,   43,
   59,   45,   53,   41,  277,   43,   57,   45,  120,  282,
  200,  201,   94,   95,  187,   59,  257,   41,  200,  201,
  261,   59,   41,  213,  214,  266,  193,  268,  269,   41,
   40,  213,  214,  145,   44,   41,  277,   43,   41,   45,
  256,  282,  232,  256,   43,  256,   45,  263,  221,  265,
  232,  256,   47,   59,  267,  268,  267,  268,  140,  141,
   59,   41,  267,  268,  267,  268,  258,  258,  241,   47,
  277,  183,   47,  258,   43,   47,   45,   41,  270,  271,
  272,   41,  274,  275,  276,  270,  271,  272,  277,  274,
  275,  276,  284,  258,  280,  270,  277,  278,  279,  284,
   59,  256,  193,  275,  276,  270,  271,  272,   59,  274,
  275,  276,  271,  272,   41,  274,  259,  260,  273,  284,
  267,  268,  277,  278,  279,  284,  258,  256,  277,  278,
  279,  256,  103,  104,  256,  256,  277,  278,  279,  277,
  278,  279,  277,  278,  279,  267,  268,  258,  277,  278,
  279,  256,  277,  278,  279,  277,  277,  278,  279,  270,
  256,  267,  268,  256,  275,  276,   59,  277,  278,  279,
   41,   41,  277,  278,  279,  258,  171,  172,  173,   41,
  270,  277,  278,  279,  277,  278,  279,  270,   41,   41,
   43,   41,   45,  171,  172,  173,  171,  172,  173,  171,
  172,  173,  277,  278,  279,  200,  201,   41,   41,   43,
   43,   45,   45,   88,   89,   90,   41,   59,  213,  214,
  257,   59,  200,  201,  261,  200,  201,  264,  200,  201,
   59,  268,  269,   59,  270,  213,  214,  232,  213,  214,
  277,  213,  214,  258,  258,  282,   59,   59,   59,  265,
   59,  256,  257,  260,  232,   41,  261,  232,  260,  264,
  232,  266,   59,  268,  269,  270,   40,  257,   41,  260,
   59,  261,  277,  265,  264,   59,  266,  282,  268,  269,
  265,   59,   59,   59,   59,   41,   41,  277,   59,   59,
  260,   59,  282,   59,   59,   59,  264,  264,   20,  265,
   57,  232,
};
}
final static short YYFINAL=3;
final static short YYMAXTOKEN=284;
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
"CADENA","POST","TRY","CATCH","COMP_DISTINTO",
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
"sentencia_ejecutable : sentencia_llamado_funcion",
"sentencia_ejecutable : sentencia_condicional",
"sentencia_ejecutable : sentencia_imprimir",
"sentencia_ejecutable : sentencia_iterativa",
"sentencia_ejecutable : sentencia_conversion",
"sentencia_ejecutable : sentencia_try_catch",
"sentencia_asignacion : ID ASIG expresion_aritmetica ';'",
"sentencia_asignacion : ID error ';'",
"sentencia_llamado_funcion : ID '(' expresion_aritmetica ')' ';'",
"sentencia_llamado_funcion : ID '(' error ')' ';'",
"sentencia_llamado_funcion : ID '(' expresion_aritmetica ';'",
"sentencia_llamado_funcion : ID expresion_aritmetica ')' ';'",
"sentencia_condicional : if '(' condicion ')' THEN bloque_ejecutable_condicional ENDIF ';'",
"sentencia_condicional : if '(' condicion ')' THEN bloque_ejecutable_condicional ELSE bloque_ejecutable_condicional ENDIF ';'",
"sentencia_condicional : if '(' error ')' THEN bloque_ejecutable_condicional ENDIF ';'",
"sentencia_condicional : if '(' condicion THEN bloque_ejecutable_condicional ENDIF ';'",
"sentencia_condicional : if condicion ')' THEN bloque_ejecutable_condicional ENDIF ';'",
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
"sentencia_ejecutable_iterativa : sentencia_llamado_funcion",
"sentencia_ejecutable_iterativa : sentencia_condicional",
"sentencia_ejecutable_iterativa : sentencia_imprimir",
"sentencia_ejecutable_iterativa : sentencia_iterativa",
"sentencia_ejecutable_iterativa : sentencia_conversion",
"sentencia_ejecutable_iterativa : sentencia_try_catch",
"sentencia_ejecutable_iterativa : sentencia_break",
"sentencia_break : BREAK ';'",
"sentencia_conversion : DOUBLE '(' expresion_aritmetica ')' ';'",
"sentencia_conversion : DOUBLE '(' error ')'",
"sentencia_conversion : DOUBLE '(' expresion_aritmetica ';'",
"sentencia_conversion : DOUBLE expresion_aritmetica ')' ';'",
"sentencia_try_catch : try sentencia_ejecutable_con_anidamiento CATCH bloque_ejecutable",
"sentencia_try_catch : try sentencia_ejecutable_con_anidamiento error bloque_ejecutable",
"sentencia_try_catch : try sentencia_ejecutable_con_anidamiento bloque_ejecutable",
"try : TRY",
"sentencia_ejecutable_con_anidamiento : sentencia_asignacion",
"sentencia_ejecutable_con_anidamiento : sentencia_llamado_funcion",
"sentencia_ejecutable_con_anidamiento : sentencia_condicional",
"sentencia_ejecutable_con_anidamiento : sentencia_imprimir",
"sentencia_ejecutable_con_anidamiento : sentencia_iterativa",
"sentencia_ejecutable_con_anidamiento : sentencia_conversion",
"expresion_aritmetica : expresion_aritmetica '+' termino",
"expresion_aritmetica : expresion_aritmetica '-' termino",
"expresion_aritmetica : termino",
"termino : termino '*' factor",
"termino : termino '/' factor",
"termino : '-' factor",
"termino : factor",
"factor : ID",
"factor : CTE_ULONG",
"factor : CTE_DOUBLE",
};

//#line 236 "gramatica.y"

///CODIGO JAVA

private AnalizadorLexico analizadorLexico;
private ArrayList<String> estructuras = new ArrayList<String>(); //Lista de las estructuras detectadas por el parser
private ArrayList<String> errores = new ArrayList<String>(); //Lista de errores sintacticos detectados por el parser

public void setAnalizadorLexico(AnalizadorLexico al){
	this.analizadorLexico = al;
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
		yylval = new ParserVal(tokenActual.getSegundo());
	//System.out.println("Token devuelto por yylex: " + tokenActual.getPrimero() );
	return tokenActual.getPrimero();
}

private void yyerror(String s){

}
//#line 554 "Parser.java"
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
//#line 17 "gramatica.y"
{ addEstructura( "Declaracion de programa, en la linea: " + analizadorLexico.getNroLineaToken() );}
break;
case 3:
//#line 18 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", identificador de programa no valido"); }
break;
case 7:
//#line 28 "gramatica.y"
{ addEstructura( "Declaracion de variables, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 8:
//#line 29 "gramatica.y"
{ addEstructura( "Declaracion de funciones como variables, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 10:
//#line 31 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", tipo de variable no valido"); }
break;
case 11:
//#line 32 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", declaracion invalida"); }
break;
case 12:
//#line 33 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 13:
//#line 34 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", error en la condicion"); }
break;
case 14:
//#line 35 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 17:
//#line 44 "gramatica.y"
{ addEstructura( "Declaracion de funcion, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 18:
//#line 45 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", declaracion invalida"); }
break;
case 19:
//#line 46 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", identificador no valido"); }
break;
case 20:
//#line 47 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", parametro no valido"); }
break;
case 21:
//#line 48 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 22:
//#line 49 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 27:
//#line 62 "gramatica.y"
{ addEstructura( "Declaracion de variables, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 28:
//#line 65 "gramatica.y"
{ addEstructura( "Sentencia RETURN, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 29:
//#line 66 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 30:
//#line 67 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 31:
//#line 68 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 32:
//#line 69 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 33:
//#line 72 "gramatica.y"
{ addEstructura( "Sentencia POST, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 34:
//#line 73 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
break;
case 35:
//#line 74 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta :"); }
break;
case 36:
//#line 75 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 37:
//#line 76 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 38:
//#line 77 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 54:
//#line 107 "gramatica.y"
{ addEstructura( "Sentencia de asignacion, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 55:
//#line 108 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia asignacion invalida"); }
break;
case 56:
//#line 111 "gramatica.y"
{ addEstructura( "Sentencia de llamado a funcion, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 57:
//#line 112 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 58:
//#line 113 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 59:
//#line 114 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 62:
//#line 120 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion no valida"); }
break;
case 63:
//#line 121 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 64:
//#line 122 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 65:
//#line 126 "gramatica.y"
{addEstructura( "Sentencia IF, en la linea: " + analizadorLexico.getNroLineaToken() );}
break;
case 80:
//#line 153 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", cadena no valida"); }
break;
case 81:
//#line 154 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 82:
//#line 155 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 83:
//#line 159 "gramatica.y"
{ addEstructura( "Sentencia PRINT, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 85:
//#line 163 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 86:
//#line 164 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 87:
//#line 165 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion no valida"); }
break;
case 88:
//#line 167 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 89:
//#line 168 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 90:
//#line 171 "gramatica.y"
{ addEstructura( "Sentencia WHILE, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 103:
//#line 192 "gramatica.y"
{ addEstructura( "Sentencia BREAK, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 104:
//#line 195 "gramatica.y"
{ addEstructura( "Sentencia de conversion a DOUBLE, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 105:
//#line 196 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica no valida"); }
break;
case 106:
//#line 198 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 107:
//#line 199 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 109:
//#line 203 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 110:
//#line 204 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 111:
//#line 208 "gramatica.y"
{ addEstructura( "Sentencia TRY-CATCH, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
//#line 923 "Parser.java"
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
