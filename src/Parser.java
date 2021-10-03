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
   20,   20,   20,   21,   21,   21,   22,   22,   22,   22,
   22,   23,   23,   23,   23,   23,   23,   28,   18,   18,
   30,   30,   32,   32,   32,   32,   32,   32,   31,   31,
   29,   29,   24,   24,   24,   24,   24,   33,   25,   25,
   25,   25,   25,   25,   25,   34,   35,   35,   36,   36,
   37,   37,   37,   37,   37,   37,   37,   37,   38,   26,
   26,   26,   26,   26,   27,   27,   27,   27,   39,   40,
   40,   40,   40,   40,   40,   17,   17,   17,   41,   41,
   41,   41,   42,   42,   42,
};
final static short yylen[] = {                            2,
    3,    2,    2,    1,    3,    2,    2,    6,    1,    2,
    3,    5,    6,    5,    6,    7,    6,    6,    6,    6,
    5,    5,    2,    1,    3,    2,    2,    5,    5,    4,
    4,    2,    6,    6,    5,    4,    4,    2,    1,    1,
    3,    1,    3,    1,    3,    2,    1,    1,    1,    1,
    1,    1,    1,    3,    2,    3,    4,    5,    4,    4,
    2,    7,    9,    7,    6,    6,    7,    1,    3,    1,
    3,    1,    1,    1,    1,    1,    1,    1,    1,    1,
    3,    2,    4,    4,    3,    3,    4,    1,    6,    5,
    6,    6,    6,    5,    5,    1,    3,    2,    3,    2,
    1,    1,    1,    1,    1,    1,    1,    1,    1,    4,
    5,    5,    4,    4,    4,    4,    3,    3,    1,    1,
    1,    1,    1,    1,    1,    3,    3,    1,    3,    3,
    2,    1,    1,    1,    1,
};
final static short yydefred[] = {                         0,
    0,    0,    0,    0,    3,    2,    0,   39,   40,    0,
    4,    0,    0,    9,    0,    0,   10,    0,    1,    0,
    0,    0,    7,    0,    0,   24,    0,    0,    0,   68,
   88,    0,   96,    0,  119,    0,    0,   47,   48,   49,
   50,   51,   52,   53,    0,    0,    0,    0,    5,    0,
   11,    0,    0,    0,    0,   27,    0,    0,   41,    0,
    0,   61,    0,  133,  134,  135,    0,    0,    0,    0,
  132,    0,    0,    0,   43,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,  120,  121,  122,  123,  124,
  125,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,   44,   25,    0,  118,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
   45,    0,    0,   73,   74,   75,   76,   77,   78,    0,
    0,   79,   80,    0,   86,    0,    0,    0,    0,    0,
    0,    0,  117,    0,    0,    0,    0,   23,   21,    0,
    0,   14,   12,    0,    0,    0,   87,    0,    0,    0,
  113,  110,  114,    0,    0,  129,  130,    0,   59,   57,
   60,    0,    0,    0,    0,    0,   69,   84,   83,    0,
    0,    0,    0,  116,  115,   18,   19,   20,   17,   13,
    8,   32,    0,    0,    0,   15,    0,    0,  112,    0,
    0,  111,   58,    0,    0,    0,    0,    0,    0,    0,
    0,  109,  101,  102,  103,  104,  105,  106,  107,   94,
    0,  108,    0,    0,   90,   95,    0,    0,    0,   38,
    0,    0,    0,   16,    0,   93,    0,    0,   82,   65,
    0,   66,   92,    0,    0,   98,   91,   89,    0,   30,
    0,   31,    0,    0,    0,   67,   64,   81,    0,   62,
   97,    0,   29,   28,   37,    0,    0,    0,   36,    0,
   99,   35,    0,    0,   63,   34,   33,
};
final static short yydgoto[] = {                          3,
    4,   10,   19,   11,   12,   96,   17,   14,   15,   25,
  101,  156,  198,   97,   26,   27,   78,   79,   36,  206,
   38,   39,   40,   41,   42,   43,   44,   45,  207,   80,
  134,  130,   46,   47,  220,  244,  221,  222,   48,   92,
   70,   71,
};
final static short yysindex[] = {                      -202,
  -25,   55,    0, -139,    0,    0, -265,    0,    0, -217,
    0,   71, -136,    0, -168,   94,    0,  171,    0, -139,
 -201,   85,    0, -265, -146,    0,   91, -265,  -29,    0,
    0,   13,    0,   -7,    0, -103,  117,    0,    0,    0,
    0,    0,    0,    0,   27,  -39,   58,  -61,    0,   17,
    0,  142,   -5, -120,  151,    0,  171, -168,    0,   90,
 -217,    0,   68,    0,    0,    0,   86,   90,  363,   32,
    0,   90,   95,  379,    0,  171,   98,   59,  160, -131,
  164, -225,  101,  168,  -23,    0,    0,    0,    0,    0,
    0, -241, -168, -168,  -96,  -66,  177,  178,  -28, -265,
 -183,    0,    0,   47,    0,  184,   50,  185,  186,  118,
   32,  179,   90,   90, -196, -196,   47,  217,  161,  201,
    0,  228,  -36,    0,    0,    0,    0,    0,    0,   90,
  -89,    0,    0,   90,    0,  239,  241,  244,  -38,   28,
 -217, -217,    0,  270,  272,  276,  277,    0,    0, -265,
 -265,    0,    0,  261,   61, -187,    0,  266, -221,  267,
    0,    0,    0,   32,   32,    0,    0,  296,    0,    0,
    0,   69,  308,  100,   47,  308,    0,    0,    0,   89,
  -83,  243,  -83,    0,    0,    0,    0,    0,    0,    0,
    0,    0,  104,  411,  297,    0,  -31,  105,    0,  308,
  -83,    0,    0,  308,  171,  312,  131,  308,  135,  -83,
  339,    0,    0,    0,    0,    0,    0,    0,    0,    0,
  331,    0,   46,  -83,    0,    0,  355,  169,  338,    0,
   90,  360,  366,    0,  149,    0,  150,  158,    0,    0,
 -106,    0,    0,  176,  367,    0,    0,    0,  374,    0,
  375,    0,   -9,  110,  383,    0,    0,    0,  308,    0,
    0,  339,    0,    0,    0,  386,  373,  384,    0,  156,
    0,    0,  398,  399,    0,    0,    0,
};
final static short yyrindex[] = {                         0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,  402,    0,    0,    0,  198,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,  402,
    0,    0,    0,    0,    0,    0,    0,  204,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,  -41,
    0,    0,    0,  -43,    0, -126,    0,   18,    0,  -34,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,  128,    0,    0, -108,    0,    0,    0,
  -19,    0,    0,    0,    0,    0,  129,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,  130,    0,    0,    0,
    0,    0,    0,    0,    0,    0,  -88,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    3,   25,    0,    0,    0,    0,    0,
    0,    0,    0,    0,   74,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,  200,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,
};
final static short yygindex[] = {                         0,
    0,    0,  -53,  452,    0,  112,  442,    0,    0,    0,
    0,    0,    0,   14,  415,    0,  404,  352,  -47,  -12,
  220,  236,  268,  313,  350,  357,  -59,    0, -148,    0,
    0,    0,    0,    0,  -26,  212, -191,    0,    0,    0,
  -17,   75,
};
final static int YYTABLESIZE=621;
static short yytable[];
static { yytable();}
static void yytable(){
yytable = new short[]{                        128,
   82,  128,  182,  128,  174,   37,   70,  105,  231,  102,
   63,   16,  151,   68,  141,   55,   63,  128,  128,  245,
  128,  131,   18,  131,   70,  131,  232,  209,  121,   62,
  136,  266,   73,    5,   95,   62,  200,   68,  143,  131,
  131,  142,  131,  126,   37,  126,   18,  126,  201,  265,
  111,  235,   67,    1,  137,  237,   93,   68,   72,  241,
   28,  126,  126,   37,  126,  127,   77,  127,  195,  127,
  245,   68,  154,  115,    2,   50,   72,  196,  116,  155,
   64,   65,   66,  127,  127,   63,  127,  184,  185,  113,
  158,  114,  113,  197,  114,  164,  165,   83,    8,    9,
  193,  113,   68,  114,   62,   68,  144,  145,  147,  128,
  270,  129,   68,    6,   71,   13,    7,   57,  128,   21,
  129,  219,  219,  219,   54,   22,   24,    8,    9,   20,
   68,   13,   71,   55,   68,   98,   46,   28,   46,   68,
   16,  219,   68,  132,  133,   68,    8,    9,   68,   58,
  219,  219,  259,  260,   68,  225,  226,  238,  162,  146,
  113,   75,  114,  219,  219,   99,   72,   72,  176,   24,
    8,    9,   29,   30,  236,   76,  161,   31,   22,   22,
  211,   94,  212,  243,   32,   33,   56,   54,   85,  166,
  167,  100,   37,   34,   85,   30,  247,  248,   35,   31,
  131,  170,  219,  113,  135,  114,   32,   33,  140,  251,
  148,  113,   55,  114,  128,   34,  128,  149,  150,  169,
   55,  173,  128,   70,  157,  159,  160,  250,  128,  128,
  128,  181,  128,  128,  128,   70,  131,  163,  131,   55,
   81,  128,  128,   60,  131,   64,   65,   66,   16,   60,
  131,  131,  131,   61,  131,  131,  131,  168,  126,  171,
  126,    8,    9,  131,  131,   72,  126,   86,  172,   64,
   65,   66,  126,  126,  126,   72,  126,  126,  126,  178,
  127,  179,  127,   87,  180,  126,  126,   72,  127,   64,
   65,   66,   72,   72,  127,  127,  127,  183,  127,  127,
  127,   29,   30,   64,   65,   66,   31,  127,  127,  211,
  186,  212,  187,   32,   33,   88,  188,  189,   60,  192,
  124,  125,   34,  126,  199,  202,  204,   35,   61,  124,
  125,   71,  126,  127,   64,   65,   66,   64,   65,   66,
   52,  109,  127,   71,   64,   65,   66,  106,   71,   71,
  118,    8,    9,  122,  203,  230,  138,  208,  210,  227,
   89,   53,   64,   65,   66,  267,   64,   65,   66,  234,
  239,   64,   65,   66,   64,   65,   66,   64,   65,   66,
   64,   65,   66,   56,   54,   85,   64,   65,   66,  246,
  240,   56,   54,   85,  242,  249,  252,   90,   84,  254,
  213,  213,  213,  112,   91,  113,  255,  114,  256,  257,
   56,   54,   85,  273,  108,  275,  214,  214,  214,  120,
  213,  113,  258,  114,  274,  262,   29,   30,  123,  213,
  213,   31,  263,  264,  139,   69,  214,   74,   32,   33,
  261,  269,  213,  213,  272,  214,  214,   34,  215,  215,
  215,  229,   35,  113,   23,  114,  276,  277,  214,  214,
   42,    6,   51,  104,  100,   56,  107,   26,  215,   59,
  110,   49,  103,  271,    0,  117,  119,  215,  215,    0,
    0,  213,    0,    0,    0,  177,    0,    0,    0,    0,
  215,  215,    0,  216,  216,  216,    0,  214,  223,   30,
    0,    0,    0,   31,    0,    0,  211,    0,  212,    0,
   32,   33,  224,  216,    0,    0,    0,    0,    0,   34,
    0,    0,  216,  216,   35,    0,    0,    0,    0,  215,
  217,  217,  217,  175,    0,  216,  216,  218,  218,  218,
  152,  153,    0,    0,    0,    0,    0,    0,  233,    0,
  217,    0,    0,    0,    0,    0,    0,  218,  194,  217,
  217,    0,    0,   29,   30,    0,  218,  218,   31,    0,
    0,  205,  217,  217,  216,   32,   33,    0,    0,  218,
  218,    0,  253,    0,   34,    0,    0,    0,    0,   35,
    0,  190,  191,    0,   29,   30,  228,    0,    0,   31,
    0,    0,    0,    0,  212,  268,   32,   33,    0,    0,
    0,  217,    0,    0,    0,   34,    0,    0,  218,    0,
   35,
};
}
static short yycheck[];
static { yycheck(); }
static void yycheck() {
yycheck = new short[] {                         41,
   40,   43,   41,   45,   41,   18,   41,   61,   40,   57,
   40,  277,   41,   45,  256,   59,   40,   59,   60,  211,
   62,   41,  264,   43,   59,   45,   58,  176,   76,   59,
  256,   41,   40,   59,   40,   59,  258,   45,   92,   59,
   60,  283,   62,   41,   57,   43,  264,   45,  270,   59,
   68,  200,   40,  256,  280,  204,   40,   45,   41,  208,
   44,   59,   60,   76,   62,   41,   40,   43,  256,   45,
  262,   45,  256,   42,  277,  277,   59,  265,   47,  263,
  277,  278,  279,   59,   60,   40,   62,  141,  142,   43,
   41,   45,   43,  281,   45,  113,  114,   40,  267,  268,
   40,   43,   45,   45,   59,   45,   93,   94,   95,   60,
  259,   62,   45,   59,   41,    4,  256,  264,   60,  256,
   62,  181,  182,  183,   40,  262,   15,  267,  268,   59,
   45,   20,   59,   22,   45,  256,  263,   44,  265,   45,
  277,  201,   45,  275,  276,   45,  267,  268,   45,   59,
  210,  211,  259,  260,   45,  182,  183,  205,   41,  256,
   43,  265,   45,  223,  224,   54,  275,  276,  258,   58,
  267,  268,  256,  257,  201,   59,   59,  261,  267,  268,
  264,   40,  266,  210,  268,  269,   59,   59,   59,  115,
  116,   41,  205,  277,  256,  257,  223,  224,  282,  261,
   41,   41,  262,   43,   41,   45,  268,  269,   41,   41,
  277,   43,  256,   45,  256,  277,  258,   41,   41,   59,
  264,  258,  264,  258,   41,   41,   41,   59,  270,  271,
  272,  270,  274,  275,  276,  270,  256,   59,  258,  283,
  280,  283,  284,  273,  264,  277,  278,  279,  277,  273,
  270,  271,  272,  283,  274,  275,  276,   41,  256,   59,
  258,  267,  268,  283,  284,  273,  264,   48,   41,  277,
  278,  279,  270,  271,  272,  258,  274,  275,  276,   41,
  256,   41,  258,   48,   41,  283,  284,  270,  264,  277,
  278,  279,  275,  276,  270,  271,  272,  270,  274,  275,
  276,  256,  257,  277,  278,  279,  261,  283,  284,  264,
   41,  266,   41,  268,  269,   48,   41,   41,  273,   59,
  271,  272,  277,  274,   59,   59,  258,  282,  283,  271,
  272,  258,  274,  284,  277,  278,  279,  277,  278,  279,
  256,  256,  284,  270,  277,  278,  279,  280,  275,  276,
  256,  267,  268,  256,   59,   59,  256,  258,  270,  256,
   48,  277,  277,  278,  279,  256,  277,  278,  279,  265,
   59,  277,  278,  279,  277,  278,  279,  277,  278,  279,
  277,  278,  279,  256,  256,  256,  277,  278,  279,   59,
  260,  264,  264,  264,  260,   41,   59,   48,   47,   40,
  181,  182,  183,   41,   48,   43,   41,   45,  260,  260,
  283,  283,  283,   41,   63,  260,  181,  182,  183,   41,
  201,   43,  265,   45,   41,   59,  256,  257,   77,  210,
  211,  261,   59,   59,   83,   32,  201,   34,  268,  269,
  265,   59,  223,  224,   59,  210,  211,  277,  181,  182,
  183,   41,  282,   43,   13,   45,   59,   59,  223,  224,
   59,  264,   21,   60,  265,   24,   63,  264,  201,   28,
   67,   20,   58,  262,   -1,   72,   73,  210,  211,   -1,
   -1,  262,   -1,   -1,   -1,  134,   -1,   -1,   -1,   -1,
  223,  224,   -1,  181,  182,  183,   -1,  262,  256,  257,
   -1,   -1,   -1,  261,   -1,   -1,  264,   -1,  266,   -1,
  268,  269,  270,  201,   -1,   -1,   -1,   -1,   -1,  277,
   -1,   -1,  210,  211,  282,   -1,   -1,   -1,   -1,  262,
  181,  182,  183,  130,   -1,  223,  224,  181,  182,  183,
   99,  100,   -1,   -1,   -1,   -1,   -1,   -1,  197,   -1,
  201,   -1,   -1,   -1,   -1,   -1,   -1,  201,  155,  210,
  211,   -1,   -1,  256,  257,   -1,  210,  211,  261,   -1,
   -1,  264,  223,  224,  262,  268,  269,   -1,   -1,  223,
  224,   -1,  231,   -1,  277,   -1,   -1,   -1,   -1,  282,
   -1,  150,  151,   -1,  256,  257,  193,   -1,   -1,  261,
   -1,   -1,   -1,   -1,  266,  254,  268,  269,   -1,   -1,
   -1,  262,   -1,   -1,   -1,  277,   -1,   -1,  262,   -1,
  282,
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
"sentencias_ejecutables : sentencia_ejecutable ';' sentencias_ejecutables",
"sentencias_ejecutables : sentencia_ejecutable ';'",
"sentencia_ejecutable : sentencia_asignacion",
"sentencia_ejecutable : sentencia_llamado_funcion",
"sentencia_ejecutable : sentencia_condicional",
"sentencia_ejecutable : sentencia_imprimir",
"sentencia_ejecutable : sentencia_iterativa",
"sentencia_ejecutable : sentencia_conversion",
"sentencia_ejecutable : sentencia_try_catch",
"sentencia_asignacion : ID ASIG expresion_aritmetica",
"sentencia_asignacion : ID expresion_aritmetica",
"sentencia_asignacion : error ASIG expresion_aritmetica",
"sentencia_llamado_funcion : ID '(' expresion_aritmetica ')'",
"sentencia_llamado_funcion : ID '(' error ')' ';'",
"sentencia_llamado_funcion : ID '(' expresion_aritmetica ';'",
"sentencia_llamado_funcion : ID expresion_aritmetica ')' ';'",
"sentencia_llamado_funcion : error ';'",
"sentencia_condicional : if '(' condicion ')' THEN bloque_ejecutable_condicional ENDIF",
"sentencia_condicional : if '(' condicion ')' THEN bloque_ejecutable_condicional ELSE bloque_ejecutable_condicional ENDIF",
"sentencia_condicional : if '(' error ')' THEN bloque_ejecutable_condicional ENDIF",
"sentencia_condicional : if '(' condicion THEN bloque_ejecutable_condicional ENDIF",
"sentencia_condicional : if condicion ')' THEN bloque_ejecutable_condicional ENDIF",
"sentencia_condicional : error '(' condicion ')' THEN bloque_ejecutable_condicional ENDIF",
"if : IF",
"condicion : expresion_booleana operacion_booleana condicion",
"condicion : expresion_booleana",
"expresion_booleana : expresion_aritmetica comparador expresion_aritmetica",
"expresion_booleana : expresion_aritmetica",
"comparador : COMP_MAYOR_IGUAL",
"comparador : COMP_MENOR_IGUAL",
"comparador : COMP_IGUAL",
"comparador : COMP_DISTINTO",
"comparador : '<'",
"comparador : '>'",
"operacion_booleana : AND",
"operacion_booleana : OR",
"bloque_ejecutable_condicional : BEGIN sentencias_ejecutables END",
"bloque_ejecutable_condicional : sentencia_ejecutable ';'",
"sentencia_imprimir : print '(' CADENA ')'",
"sentencia_imprimir : print '(' error ')'",
"sentencia_imprimir : print '(' CADENA",
"sentencia_imprimir : print CADENA ')'",
"sentencia_imprimir : error '(' CADENA ')'",
"print : PRINT",
"sentencia_iterativa : while '(' condicion ')' DO bloque_ejecutable_iterativo",
"sentencia_iterativa : while '(' condicion ')' bloque_ejecutable_iterativo",
"sentencia_iterativa : while '(' condicion ')' error bloque_ejecutable_iterativo",
"sentencia_iterativa : while '(' error ')' DO bloque_ejecutable_iterativo",
"sentencia_iterativa : error '(' condicion ')' DO bloque_ejecutable_iterativo",
"sentencia_iterativa : while '(' condicion DO bloque_ejecutable_iterativo",
"sentencia_iterativa : while condicion ')' DO bloque_ejecutable_iterativo",
"while : WHILE",
"bloque_ejecutable_iterativo : BEGIN sentencias_ejecutables_iterativas END",
"bloque_ejecutable_iterativo : sentencia_ejecutable_iterativa ';'",
"sentencias_ejecutables_iterativas : sentencia_ejecutable_iterativa ';' sentencias_ejecutables_iterativas",
"sentencias_ejecutables_iterativas : sentencia_ejecutable_iterativa ';'",
"sentencia_ejecutable_iterativa : sentencia_asignacion",
"sentencia_ejecutable_iterativa : sentencia_llamado_funcion",
"sentencia_ejecutable_iterativa : sentencia_condicional",
"sentencia_ejecutable_iterativa : sentencia_imprimir",
"sentencia_ejecutable_iterativa : sentencia_iterativa",
"sentencia_ejecutable_iterativa : sentencia_conversion",
"sentencia_ejecutable_iterativa : sentencia_try_catch",
"sentencia_ejecutable_iterativa : sentencia_break",
"sentencia_break : BREAK",
"sentencia_conversion : DOUBLE '(' expresion_aritmetica ')'",
"sentencia_conversion : DOUBLE '(' error ')' ';'",
"sentencia_conversion : error '(' expresion_aritmetica ')' ';'",
"sentencia_conversion : DOUBLE '(' expresion_aritmetica ';'",
"sentencia_conversion : DOUBLE expresion_aritmetica ')' ';'",
"sentencia_try_catch : try sentencia_ejecutable_con_anidamiento CATCH bloque_ejecutable",
"sentencia_try_catch : try sentencia_ejecutable_con_anidamiento error bloque_ejecutable",
"sentencia_try_catch : try sentencia_ejecutable_con_anidamiento bloque_ejecutable",
"sentencia_try_catch : error CATCH bloque_ejecutable",
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
"termino : '-' termino",
"termino : factor",
"factor : ID",
"factor : CTE_ULONG",
"factor : CTE_DOUBLE",
};

//#line 241 "gramatica.y"

///CODIGO JAVA

private AnalizadorLexico analizadorLexico;
private ArrayList<String> estructuras = new ArrayList<String>();
private ArrayList<String> errores = new ArrayList<String>();

public void setAnalizadorLexico(AnalizadorLexico al){
	this.analizadorLexico = al;
}

private void addEstructura(String e){
	estructuras.add(e);
}

public void imprimirEstructuras(){
	System.out.println("Cantidad de estructuras detectadas: " + estructuras.size());
	for(String e : estructuras)
		System.out.println(e);
}

private void addError(String e){
	errores.add(e);
}

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
//#line 599 "Parser.java"
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
//#line 19 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", identificador de programa no valido"); }
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
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", tipo de variable no valido"); }
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
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", error en la condicion"); }
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
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", identificador no valido"); }
break;
case 20:
//#line 48 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", parametro no valido"); }
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
case 54:
//#line 110 "gramatica.y"
{ addEstructura( "Sentencia de asignacion, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 55:
//#line 111 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta :="); }
break;
case 56:
//#line 112 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", identificador no valido"); }
break;
case 57:
//#line 115 "gramatica.y"
{ addEstructura( "Sentencia de llamado a funcion, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 58:
//#line 116 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 59:
//#line 117 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 60:
//#line 118 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 61:
//#line 119 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 64:
//#line 124 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion no valida"); }
break;
case 65:
//#line 125 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 66:
//#line 126 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 67:
//#line 127 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 68:
//#line 130 "gramatica.y"
{addEstructura( "Sentencia IF, en la linea: " + analizadorLexico.getNroLineaToken() );}
break;
case 84:
//#line 158 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", cadena no valida"); }
break;
case 85:
//#line 159 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 86:
//#line 160 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 87:
//#line 161 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 88:
//#line 164 "gramatica.y"
{ addEstructura( "Sentencia PRINT, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 90:
//#line 168 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 91:
//#line 169 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 92:
//#line 170 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion no valida"); }
break;
case 93:
//#line 171 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 94:
//#line 172 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 95:
//#line 173 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 96:
//#line 176 "gramatica.y"
{ addEstructura( "Sentencia WHILE, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 109:
//#line 197 "gramatica.y"
{ addEstructura( "Sentencia BREAK, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 110:
//#line 200 "gramatica.y"
{ addEstructura( "Sentencia de conversion a DOUBLE, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 111:
//#line 201 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica no valida"); }
break;
case 112:
//#line 202 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 113:
//#line 203 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 114:
//#line 204 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 116:
//#line 208 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 117:
//#line 209 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 118:
//#line 210 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 119:
//#line 213 "gramatica.y"
{ addEstructura( "Sentencia TRY-CATCH, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 131:
//#line 231 "gramatica.y"
{/*$$ = -1 * $2*/}
break;
//#line 1000 "Parser.java"
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
