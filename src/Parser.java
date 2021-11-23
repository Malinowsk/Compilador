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
    5,    6,    6,    7,    7,    8,    8,    8,    8,    9,
    9,   10,   10,   11,   11,   11,   11,   11,   11,   15,
   13,   13,   13,   13,   14,   14,   14,   14,   14,    3,
   12,   18,   18,   19,   19,   19,   19,   19,   20,   20,
   20,   20,   25,   25,   21,   21,   28,   26,   26,   26,
   26,   26,   29,   17,   17,   30,   32,   32,   32,   32,
   32,   32,   31,   31,   27,   27,   22,   22,   22,   22,
   22,   33,   23,   34,   34,   34,   34,   34,   36,   35,
   35,   37,   37,   38,   38,   38,   38,   38,   38,   39,
   40,   40,   24,   41,   41,   41,   42,   16,   16,   16,
   43,   43,   43,   43,   44,   44,   44,   44,   44,
};
final static short yylen[] = {                            2,
    3,    2,    2,    1,    3,    2,    2,    2,    1,    2,
    3,    1,    1,    3,    1,    5,    5,    6,    5,    3,
    1,    6,    7,    6,    6,    6,    6,    5,    5,    2,
    5,    5,    4,    4,    6,    6,    5,    4,    4,    3,
    1,    2,    1,    1,    1,    1,    1,    1,    4,    3,
    4,    2,    5,    6,    4,    6,    1,    5,    5,    4,
    4,    6,    1,    3,    1,    3,    1,    1,    1,    1,
    1,    1,    1,    1,    3,    1,    5,    5,    4,    4,
    3,    1,    2,    5,    5,    5,    4,    4,    1,    3,
    1,    2,    1,    1,    1,    1,    1,    1,    1,    2,
    4,    4,    2,    3,    3,    2,    1,    3,    3,    1,
    3,    3,    1,    2,    1,    1,    1,    1,    1,
};
final static short yydefred[] = {                         0,
    0,    0,    0,    0,    3,    2,    0,   12,   13,    0,
    4,    0,    0,    0,    9,    0,    0,   10,    0,    1,
    0,    0,    0,    7,    0,    8,    0,    0,    0,   63,
   82,   89,    0,  107,    0,    0,   44,   45,   46,   47,
   48,    0,    0,    0,    0,    0,    0,    0,    5,    0,
   11,    0,    0,    0,    0,    0,    0,   14,   52,    0,
    0,   40,   42,    0,   76,    0,    0,  115,  118,  119,
    0,    0,    0,    0,    0,  117,    0,  116,    0,  113,
    0,    0,    0,    0,    0,   94,   95,   96,   97,   98,
   83,   91,   99,    0,    0,  103,    0,    0,    0,    0,
    0,    0,    0,    0,    0,   20,    0,   41,   50,    0,
    0,    0,   57,    0,    0,    0,    0,    0,    0,  114,
   67,   68,   69,   70,   71,   72,    0,    0,    0,    0,
   73,   74,    0,    0,    0,   81,    0,    0,    0,    0,
    0,  100,    0,    0,    0,  105,  104,    0,    0,    0,
    0,   30,   28,    0,   16,   19,   17,    0,    0,   51,
   49,   75,   55,    0,    0,    0,    0,    0,   60,    0,
    0,    0,    0,   61,   64,  111,  112,   80,    0,   79,
    0,   90,   92,    0,   87,    0,   88,   25,   26,   27,
   24,   18,    0,    0,   22,    0,    0,    0,  102,  101,
    0,    0,   59,    0,   58,   78,   77,   86,   85,   84,
    0,    0,    0,    0,    0,    0,   23,   56,    0,   53,
   62,    0,   33,    0,   34,    0,    0,    0,   54,   32,
   31,   39,    0,    0,    0,   38,   37,    0,    0,   36,
   35,
};
final static short yydgoto[] = {                          3,
    4,   10,   20,   11,   12,  101,   18,   14,   26,   15,
   16,  107,  159,  197,  102,   74,   75,   35,   36,   37,
   38,   39,   40,   41,   76,   42,   66,  115,   43,   77,
  133,  129,   44,   45,   91,   46,  140,  141,   93,   78,
   47,   48,   79,   80,
};
final static short yysindex[] = {                      -209,
  -14,   23,    0,  -97,    0,    0, -255,    0,    0, -180,
    0,   28, -229, -164,    0,  -97,   79,    0,  -88,    0,
  -97, -141,    3,    0,   97,    0, -118, -255,   95,    0,
    0,    0, -235,    0, -108,  -88,    0,    0,    0,    0,
    0, -162,  -37,  -36, -119,  -25, -180, -181,    0,  109,
    0,  120,  -38,  -81,  124, -164,  -88,    0,    0,  108,
   40,    0,    0,  -88,    0, -130,  145,    0,    0,    0,
  -89,   43,  -78,   29,  154,    0,  -96,    0,   -7,    0,
  137,  157, -239, -105,  156,    0,    0,    0,    0,    0,
    0,    0,    0,   56,  176,    0, -244,  -85,  -85,  -65,
  -59,  184,  186,  -31, -255,    0,  -13,    0,    0,  175,
   69,  -10,    0,  192, -162,   59,  228,  231,  -32,    0,
    0,    0,    0,    0,    0,    0,   71,   71,   71,   16,
    0,    0,   71,  -78,  -78,    0,  214,  236,   68,   13,
 -105,    0,  238,  -35,   14,    0,    0,  250,  256,  257,
  263,    0,    0, -255,    0,    0,    0,  -21, -219,    0,
    0,    0,    0,   45,  265,  165,   74,   49,    0, -201,
   -7,   -7,   15,    0,    0,    0,    0,    0,  251,    0,
  255,    0,    0,   39,    0, -122,    0,    0,    0,    0,
    0,    0,   87,  168,    0,  -40,   51,  264,    0,    0,
  285,  171,    0,  270,    0,    0,    0,    0,    0,    0,
  290,  133,  273,   71,  300,  304,    0,    0,  288,    0,
    0,  295,    0,  298,    0,   80,   90,  301,    0,    0,
    0,    0,  303,  322,  329,    0,    0,  312,  315,    0,
    0,
};
final static short yyrindex[] = {                         0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,  -58,    0,    0,    0,
  112,    0,    0,    0,   28,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0, -173,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,  318,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,  -34,    0,   -9,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,  116,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
  117,    0,    0,    0,    0,    0,    0,    0,    0,    0,
  -63,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
   11,   18,  103,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,
};
final static short yygindex[] = {                         0,
    0,  365,  336,  363,    0,   77,    1,    0,  330,    0,
    0,    0,    0,    0,  123,  -50,  -30,   61,  -29,  -17,
  -19,  -15,   -8,   -1,    0,    0,  272,    0,    0,    0,
    0,    0,    0,    0,    0,    0,  244,  343,    0,    0,
    0,    0,  105,  -24,
};
final static int YYTABLESIZE=388;
static short yytable[];
static { yytable();}
static void yytable(){
yytable = new short[]{                        214,
   15,  100,   72,   83,   73,  186,   65,   73,  170,  155,
  111,  146,   65,   24,   94,   95,  138,  215,  193,   73,
   60,   17,   51,   73,   65,   87,   22,   86,   58,   88,
   97,  110,   23,  110,  134,  110,   89,   61,  147,  135,
  139,  119,   54,   90,    5,  195,    1,   17,  120,  110,
  110,  108,  110,  108,  204,  108,  205,  127,  109,  128,
  109,  196,  109,  144,   87,  166,   86,    2,   88,  108,
  108,  127,  108,  128,   29,   89,  109,  109,  173,  109,
   13,    6,   90,   19,   73,   65,   21,   73,  125,   43,
  126,   43,   13,   29,   30,   33,   63,   13,   31,   55,
   73,   64,  175,   73,  156,  157,   32,  194,  181,  176,
  177,  127,   25,  128,   33,   73,  202,  108,   73,   34,
  233,   87,   28,   86,  112,   88,  180,  161,  113,  114,
  104,   73,   89,  209,   73,   50,   29,   30,  232,   90,
   56,   31,  212,   66,   84,   57,   85,  210,   98,   32,
   29,   30,   28,   59,  192,   31,   62,   33,    7,   99,
   85,   66,   34,   32,  105,  216,  109,   29,   30,    8,
    9,   33,   31,  224,  103,  127,   34,  128,  131,  132,
   32,    8,    9,  226,  116,    8,    9,  117,   33,   67,
  150,  223,   29,   34,  130,  136,  235,  137,   68,   69,
   70,    8,    9,   29,   29,  200,   71,  127,  213,  128,
  127,  220,  128,  127,  142,  128,  145,  152,   15,   81,
  148,  149,  151,   65,  153,  169,  154,   67,    8,    9,
   67,  171,  172,  160,  185,   65,   68,   69,   70,   68,
   69,   70,   67,   82,   71,   17,   67,   71,  110,  158,
  163,   68,   69,   70,  162,   68,   69,   70,   52,   71,
  110,  110,  110,   71,  110,  110,  110,  167,  108,    8,
    9,  168,  178,  174,  110,  109,  179,  182,  184,   53,
  108,  108,  108,  187,  108,  108,  108,  109,  109,  109,
  188,  109,  109,  109,  108,  110,  189,  190,  118,  121,
  122,  109,  123,  191,  198,  199,  203,   67,  208,  206,
   67,  143,  124,  207,  165,  217,   68,   69,   70,   68,
   69,   70,  218,   67,   71,  219,   67,   71,  221,  201,
  222,  225,   68,   69,   70,   68,   69,   70,   67,  227,
   71,   67,  211,   71,  228,  234,  229,   68,   69,   70,
   68,   69,   70,  230,   67,   71,  231,   67,   71,  236,
   66,  237,  238,   68,   69,   70,   68,   69,   70,  239,
  240,   71,   66,  241,   71,    6,   15,   66,   66,  106,
   27,   93,   96,   49,  183,  106,  164,   92,
};
}
static short yycheck[];
static { yycheck(); }
static void yycheck() {
yycheck = new short[] {                         40,
   59,   40,   40,   40,   45,   41,   41,   45,   41,   41,
   61,  256,   42,   13,   40,   46,  256,   58,   40,   45,
  256,  277,   22,   45,   59,   45,  256,   45,   28,   45,
   48,   41,  262,   43,   42,   45,   45,  273,  283,   47,
  280,   72,   40,   45,   59,  265,  256,  277,   73,   59,
   60,   41,   62,   43,  256,   45,  258,   43,   41,   45,
   43,  281,   45,   94,   84,  116,   84,  277,   84,   59,
   60,   43,   62,   45,  256,   84,   59,   60,  129,   62,
    4,   59,   84,  264,   45,  115,   59,   45,   60,  263,
   62,  265,   16,  256,  257,  277,   36,   21,  261,   23,
   45,  264,  133,   45,  104,  105,  269,  158,   41,  134,
  135,   43,  277,   45,  277,   45,  167,   57,   45,  282,
   41,  141,   44,  141,   64,  141,   59,   59,  259,  260,
   54,   45,  141,  256,   45,  277,  256,  257,   59,  141,
   44,  261,  193,   41,  264,  264,  266,  270,   40,  269,
  256,  257,   44,   59,  154,  261,  265,  277,  256,   40,
  266,   59,  282,  269,   41,  196,   59,  256,  257,  267,
  268,  277,  261,   41,  256,   43,  282,   45,  275,  276,
  269,  267,  268,  214,   40,  267,  268,  277,  277,  268,
  256,   59,  256,  282,   41,   59,  227,   41,  277,  278,
  279,  267,  268,  267,  268,   41,  285,   43,   41,   45,
   43,   41,   45,   43,   59,   45,   41,  277,  277,  256,
   98,   99,  100,  258,   41,  258,   41,  268,  267,  268,
  268,  127,  128,   59,  270,  270,  277,  278,  279,  277,
  278,  279,  268,  280,  285,  277,  268,  285,  258,  263,
   59,  277,  278,  279,  265,  277,  278,  279,  256,  285,
  270,  271,  272,  285,  274,  275,  276,   40,  258,  267,
  268,   41,   59,  258,  284,  258,   41,  265,   41,  277,
  270,  271,  272,  270,  274,  275,  276,  270,  271,  272,
   41,  274,  275,  276,  284,  256,   41,   41,  256,  271,
  272,  284,  274,   41,  260,   41,  258,  268,  270,   59,
  268,  256,  284,   59,  256,  265,  277,  278,  279,  277,
  278,  279,   59,  268,  285,   41,  268,  285,   59,  256,
   41,   59,  277,  278,  279,  277,  278,  279,  268,   40,
  285,  268,  256,  285,   41,  256,   59,  277,  278,  279,
  277,  278,  279,   59,  268,  285,   59,  268,  285,   59,
  258,   59,   41,  277,  278,  279,  277,  278,  279,   41,
   59,  285,  270,   59,  285,  264,   59,  275,  276,  264,
   16,  265,   47,   21,  141,   56,  115,   45,
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
"sentencia_declarativa : tipo_funcion lista_funcion_como_variables",
"sentencia_declarativa : sentencia_declarativa_funcion",
"sentencia_declarativa : error lista_variables",
"sentencia_declarativa : tipo error lista_variables",
"tipo : ULONG",
"tipo : DOUBLE",
"lista_variables : ID ',' lista_variables",
"lista_variables : ID",
"tipo_funcion : tipo FUNC '(' tipo ')'",
"tipo_funcion : tipo FUNC tipo ')' lista_variables",
"tipo_funcion : tipo FUNC '(' error ')' lista_variables",
"tipo_funcion : tipo FUNC '(' tipo lista_variables",
"lista_funcion_como_variables : ID ',' lista_funcion_como_variables",
"lista_funcion_como_variables : ID",
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

//#line 542 "gramatica.y"

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
	System.out.println("Cantidad de tercetos generados: " + tercetos.size());
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
//#line 593 "Parser.java"
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
		tipoActualdeFuncion= val_peek(4).sval;
		addEstructura( "Declaracion de funciones como variables, en la linea: " + analizadorLexico.getNroLineaToken() );
 }
break;
case 17:
//#line 72 "gramatica.y"
{ tipoActualdeFuncion=tablaSimbolo.obtenerValor(val_peek(4).ival); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 18:
//#line 73 "gramatica.y"
{ tipoActualdeFuncion=tablaSimbolo.obtenerValor(val_peek(5).ival); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", tipo de variable invalido"); }
break;
case 19:
//#line 74 "gramatica.y"
{ tipoActualdeFuncion=tablaSimbolo.obtenerValor(val_peek(4).ival); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 20:
//#line 77 "gramatica.y"
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
case 21:
//#line 88 "gramatica.y"
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
case 22:
//#line 102 "gramatica.y"
{
 					crearTerceto(new ParserVal(-4), new ParserVal(-1), new ParserVal(-1));/*terceto para indicar el final de una funcion*/
 					ambitoActual= ambitoActual.substring(0, ambitoActual.lastIndexOf('.'));
 				}
break;
case 23:
//#line 106 "gramatica.y"
{
                               		crearTerceto(new ParserVal(-4), new ParserVal(-1), new ParserVal(-1));/*terceto para indicar el final de una funcion*/
                               		ambitoActual= ambitoActual.substring(0, ambitoActual.lastIndexOf('.'));
                               }
break;
case 24:
//#line 112 "gramatica.y"
{
			 String auxiliar = tablaSimbolo.obtenerToken(val_peek(3).ival).getLexema();
			 if(!tablaSimbolo.existeToken(auxiliar + '.' + ambitoActual)){
			    tablaSimbolo.obtenerToken(val_peek(3).ival).setLexema(auxiliar+'.'+ambitoActual);
			    tablaSimbolo.obtenerToken(val_peek(3).ival).setTipo(tipoActual);
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
case 25:
//#line 133 "gramatica.y"
{ ambitoActual= ambitoActual + '.' + tablaSimbolo.obtenerToken(val_peek(3).ival).getLexema(); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", declaracion invalida");
 		  }
break;
case 26:
//#line 135 "gramatica.y"
{ ambitoActual= ambitoActual + '.' + "error"; addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", identificador invalido");
 		  }
break;
case 27:
//#line 137 "gramatica.y"
{ ambitoActual= ambitoActual + '.' + tablaSimbolo.obtenerToken(val_peek(3).ival).getLexema(); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", parametro invalido");
 		  }
break;
case 28:
//#line 139 "gramatica.y"
{ ambitoActual= ambitoActual + '.' + tablaSimbolo.obtenerToken(val_peek(2).ival).getLexema(); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura");
 		  }
break;
case 29:
//#line 141 "gramatica.y"
{ ambitoActual= ambitoActual + '.' + tablaSimbolo.obtenerToken(val_peek(2).ival).getLexema(); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre");
 		  }
break;
case 30:
//#line 145 "gramatica.y"
{
		tablaSimbolo.obtenerToken(val_peek(0).ival).setTipo(tipoActual);
		tablaSimbolo.obtenerToken(val_peek(0).ival).setUso("parametro");
		yyval.ival=val_peek(0).ival;
	}
break;
case 31:
//#line 152 "gramatica.y"
{
 				int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
 				if(tablaSimbolo.obtenerToken(refFuncion).getTipo() != val_peek(2).sval)
 					addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles entre el retorno de la funcion y lo retornado");
 				crearTerceto(new ParserVal(RETURN), val_peek(2), new ParserVal(-1));/*TODO: NO CREAR SINO GUARDAR EN AUXILIAR RETORNOACTUAL*/
 				addEstructura( "Sentencia RETURN, en la linea: " + analizadorLexico.getNroLineaToken() );
 		 }
break;
case 32:
//#line 159 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 33:
//#line 160 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 34:
//#line 161 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 35:
//#line 165 "gramatica.y"
{
 			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
 			postCondiciones.put(refFuncion, tercetos.size()-1);/*Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion*/
 			addEstructura( "Sentencia POST, en la linea: " + analizadorLexico.getNroLineaToken() );
 			/*TODO: VER SI CREAR TERCETO PARA EL POST*/
 		}
break;
case 36:
//#line 171 "gramatica.y"
{
			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
			postCondiciones.put(refFuncion, 0);/*Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion*/
			addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida");
		}
break;
case 37:
//#line 176 "gramatica.y"
{
			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
			postCondiciones.put(refFuncion, tercetos.size()-1);/*Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion*/
			addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta :");
		}
break;
case 38:
//#line 181 "gramatica.y"
{
			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
			postCondiciones.put(refFuncion, tercetos.size()-1);/*Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion*/
			addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura");
		}
break;
case 39:
//#line 186 "gramatica.y"
{
			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
			postCondiciones.put(refFuncion, tercetos.size()-1);/*Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion*/
			addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre");
		}
break;
case 49:
//#line 210 "gramatica.y"
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

			       if(tablaSimbolo.obtenerToken(val_peek(3).ival).getUso()=="funcion designada a variable")/*Solo se puede asignar una funcion*/
					if(val_peek(1).ival<=0){/*$3 no hace referencia a un identificador*/
						addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", solo se le puede asignar una funcion a esta variable");
					}else{
						if((tablaSimbolo.obtenerToken(val_peek(1).ival).getUso()!="funcion") && (tablaSimbolo.obtenerToken(val_peek(1).ival).getUso()!="funcion designada a variable")){
							addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", solo se le puede asignar una funcion a esta variable");
						}else{
							if(tablaSimbolo.obtenerToken(val_peek(3).ival).getTipoParametro() != tablaSimbolo.obtenerToken(val_peek(1).ival).getTipoParametro())
								addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", el parametro de la funcion es de distinto tipo que el del parametro de la variable");
							this.erroresSemanticos.remove(indiceErrorABorrar);/*se borra el error ya que se hace buen uso del identificador*/

							tablaSimbolo.obtenerToken(val_peek(3).ival).setParametro(tablaSimbolo.obtenerToken(val_peek(1).ival).getParametro());
							tablaSimbolo.obtenerToken(val_peek(3).ival).setTipoParametro(tablaSimbolo.obtenerToken(val_peek(1).ival).getTipoParametro());
						}
					}

			       if(tablaSimbolo.obtenerToken(val_peek(3).ival).getTipo()!=val_peek(1).sval)
					addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + tablaSimbolo.obtenerToken(val_peek(3).ival).getTipo() + " := " + val_peek(1).sval );

		       }
		       yyval = new ParserVal((double)crearTerceto(new ParserVal(ASIG), val_peek(3), val_peek(1)));
		       addEstructura( "Sentencia de asignacion, en la linea: " + analizadorLexico.getNroLineaToken() );
		      }
break;
case 50:
//#line 252 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 51:
//#line 253 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 52:
//#line 254 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida");}
break;
case 53:
//#line 257 "gramatica.y"
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
case 54:
//#line 287 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 55:
//#line 290 "gramatica.y"
{
 			 /*if(tercetos.get(pila.peek()).getT2().ival==-2)//verifico si el bloque tiene break
 			 	tercetos.get(pila.pop()).setT2(new ParserVal((double)tercetos.size()+1));//Completo el BI del break
			 */

 			 tercetos.get(pila.pop()).setT3(new ParserVal((double)tercetos.size()));/*Completo el BF del if*/
 			 tercetos.get(tercetos.size()-1).setEtiqueta();
 			}
break;
case 56:
//#line 298 "gramatica.y"
{
                         /*if(tercetos.get(pila.peek()).getT2().ival==-2)//verifico si el bloque tiene break
                        	tercetos.get(pila.pop()).setT2(new ParserVal((double)tercetos.size()+1));//Completo el BI del break
			 */

			 tercetos.get(pila.pop()).setT2(new ParserVal((double)tercetos.size()));/*Completo el BI del else*/
			 tercetos.get(tercetos.size()-1).setEtiqueta();
			}
break;
case 57:
//#line 308 "gramatica.y"
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
case 58:
//#line 321 "gramatica.y"
{
 					 int refTerceto = crearTerceto(new ParserVal(-1), val_peek(2), new ParserVal(-1));/*el primer-1 es BF*/
					 pila.push(refTerceto);
 					 yyval = new ParserVal((double)refTerceto);
 					 }
break;
case 59:
//#line 326 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
break;
case 60:
//#line 327 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 61:
//#line 328 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 62:
//#line 329 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia condicional invalida"); }
break;
case 63:
//#line 332 "gramatica.y"
{addEstructura( "Sentencia IF, en la linea: " + analizadorLexico.getNroLineaToken() );
 	  yyval = val_peek(0);}
break;
case 64:
//#line 336 "gramatica.y"
{
	  	yyval = new ParserVal((double)crearTerceto(val_peek(1), val_peek(2), val_peek(0)));
	  	}
break;
case 65:
//#line 339 "gramatica.y"
{yyval = val_peek(0);}
break;
case 66:
//#line 342 "gramatica.y"
{
 			if(val_peek(2).sval!=val_peek(0).sval)
				addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles en la comparacion");
			yyval = new ParserVal((double)crearTerceto(val_peek(1), val_peek(2), val_peek(0)));
		}
break;
case 67:
//#line 349 "gramatica.y"
{yyval.ival = COMP_MAYOR_IGUAL;}
break;
case 68:
//#line 350 "gramatica.y"
{yyval.ival = COMP_MENOR_IGUAL;}
break;
case 69:
//#line 351 "gramatica.y"
{yyval.ival = COMP_IGUAL;}
break;
case 70:
//#line 352 "gramatica.y"
{yyval.ival = COMP_DISTINTO;}
break;
case 71:
//#line 353 "gramatica.y"
{yyval.ival = '<';}
break;
case 72:
//#line 354 "gramatica.y"
{yyval.ival = '>';}
break;
case 73:
//#line 357 "gramatica.y"
{yyval.ival = AND;}
break;
case 74:
//#line 358 "gramatica.y"
{yyval.ival = OR;}
break;
case 77:
//#line 365 "gramatica.y"
{crearTerceto(val_peek(4), val_peek(2), new ParserVal(-1));}
break;
case 78:
//#line 366 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", cadena invalida"); }
break;
case 79:
//#line 367 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 80:
//#line 368 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 81:
//#line 369 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia PRINT invalida"); }
break;
case 82:
//#line 372 "gramatica.y"
{
 		addEstructura( "Sentencia PRINT, en la linea: " + analizadorLexico.getNroLineaToken() );
 		yyval = new ParserVal((int)PRINT);
 		}
break;
case 83:
//#line 378 "gramatica.y"
{
 	     while(tercetos.get(pila.peek()).getT2().ival==-2)/*verifico si el bloque tiene break*/
		    tercetos.get(pila.pop()).setT2(new ParserVal((double)tercetos.size()+1));/*Completo el BI del break*/

	     tercetos.get(pila.pop()).setT3(new ParserVal((double)tercetos.size()+1));/*Completo el BF del while*/
	     crearTerceto(new ParserVal(-2), new ParserVal((double)pila.pop()), new ParserVal(-1));/*-2 es BI*/
	     tercetos.get(tercetos.size()-1).setEtiqueta();
 }
break;
case 84:
//#line 388 "gramatica.y"
{
					 int refTerceto = crearTerceto(new ParserVal(-1), val_peek(2), new ParserVal(-1));/*el primer-1 es BF*/
					 pila.push(refTerceto);
					 yyval = new ParserVal((double)refTerceto);
					}
break;
case 85:
//#line 393 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia iterativa invalida"); }
break;
case 86:
//#line 394 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
break;
case 87:
//#line 395 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 88:
//#line 396 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 89:
//#line 399 "gramatica.y"
{ addEstructura( "Sentencia WHILE, en la linea: " + analizadorLexico.getNroLineaToken() );
 		 pila.push(tercetos.size());
 		 tercetos.get(tercetos.size()-1).setEtiqueta();
 	         yyval=val_peek(0); }
break;
case 100:
//#line 421 "gramatica.y"
{
 			addEstructura( "Sentencia BREAK, en la linea: " + analizadorLexico.getNroLineaToken() );
 			int refTerceto =crearTerceto(new ParserVal(-2), new ParserVal(-2), new ParserVal(-1));/*El primer -2 es BI, el segundo es para diferenciarlo de otros BI (luego se pisa por la dir a saltar)*/
			pila.push(refTerceto);
 }
break;
case 101:
//#line 428 "gramatica.y"
{
 			 addEstructura( "Sentencia de conversion a DOUBLE, en la linea: " + analizadorLexico.getNroLineaToken() );
 			 yyval =  new ParserVal((double)crearTerceto(new ParserVal(DOUBLE), val_peek(1), new ParserVal(-1)));
 			 yyval.sval = "DOUBLE";
 			}
break;
case 102:
//#line 433 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 103:
//#line 436 "gramatica.y"
{
 		      /*if(tercetos.get(pila.peek()).getT2().ival==-2)//verifico si el bloque tiene break
                             tercetos.get(pila.pop()).setT2(new ParserVal((double)tercetos.size()+1));//Completo el BI del break
                      */

 		      tercetos.get(tercetos.size()-1).setEtiqueta();
 		      tercetos.get(pila.pop()).setT3(new ParserVal((double)tercetos.size()));/*Completa el BT del try*/
		     }
break;
case 104:
//#line 446 "gramatica.y"
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
case 105:
//#line 463 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia TRY-CATCH invalida"); }
break;
case 106:
//#line 464 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia TRY-CATCH invalida"); }
break;
case 107:
//#line 467 "gramatica.y"
{
 	addEstructura( "Sentencia TRY-CATCH, en la linea: " + analizadorLexico.getNroLineaToken() );
 	ultimoTry = tercetos.size()-1;/*Se guarda la referencia del ultimo tercetos antes del try*/
 }
break;
case 108:
//#line 473 "gramatica.y"
{
                              if(val_peek(2).sval!=val_peek(0).sval)
				addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + val_peek(2).sval + " + " + val_peek(0).sval );
			      yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'+'), val_peek(2), val_peek(0)));
			      yyval.sval=val_peek(2).sval;
 		      }
break;
case 109:
//#line 479 "gramatica.y"
{
				 if(val_peek(2).sval!=val_peek(0).sval)
					addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + val_peek(2).sval + " - " + val_peek(0).sval );
				 yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'-'), val_peek(2), val_peek(0)));
				 yyval.sval=val_peek(2).sval;
		      }
break;
case 110:
//#line 485 "gramatica.y"
{ yyval = val_peek(0) ; }
break;
case 111:
//#line 488 "gramatica.y"
{
             if(val_peek(2).sval!=val_peek(0).sval)
                   addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + val_peek(2).sval + " * " + val_peek(0).sval );
	     yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'*'), val_peek(2), val_peek(0)));
	     yyval.sval=val_peek(2).sval;
	 }
break;
case 112:
//#line 494 "gramatica.y"
{
                if(val_peek(2).sval!=val_peek(0).sval)
                     	addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + val_peek(2).sval + " / " + val_peek(0).sval );
		yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'/'), val_peek(2), val_peek(0)));
		yyval.sval=val_peek(2).sval;
	 }
break;
case 113:
//#line 500 "gramatica.y"
{yyval = val_peek(0);}
break;
case 114:
//#line 501 "gramatica.y"
{
		      yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'*'), new ParserVal(-1), val_peek(0)));
		      yyval.sval=val_peek(1).sval;
	 }
break;
case 115:
//#line 507 "gramatica.y"
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
case 116:
//#line 533 "gramatica.y"
{yyval = val_peek(0);}
break;
case 117:
//#line 534 "gramatica.y"
{yyval = val_peek(0);}
break;
case 118:
//#line 535 "gramatica.y"
{  yyval = val_peek(0);
                       yyval.sval="ULONG";}
break;
case 119:
//#line 537 "gramatica.y"
{yyval = val_peek(0);
                      yyval.sval="DOUBLE";}
break;
//#line 1425 "Parser.java"
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
