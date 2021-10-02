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
    0,    1,    2,    4,    4,    5,    5,    5,    8,    8,
    9,   13,   10,   14,   14,   15,   11,   12,    6,    6,
    7,    7,    3,   18,   18,   19,   19,   19,   19,   19,
   19,   19,   20,   21,   22,   22,   17,   17,   28,   28,
   30,   30,   30,   30,   30,   30,   29,   29,   27,   27,
   23,   24,   31,   32,   32,   33,   33,   33,   33,   33,
   33,   33,   33,   34,   25,   25,   26,   35,   35,   35,
   35,   35,   35,   16,   16,   16,   36,   36,   36,   36,
   37,   37,   37,
};
final static short yylen[] = {                            2,
    3,    2,    1,    3,    2,    2,    6,    1,    6,    7,
    6,    2,    1,    3,    2,    2,    4,    6,    1,    1,
    3,    1,    3,    3,    2,    1,    1,    1,    1,    1,
    1,    1,    3,    4,    7,    9,    3,    1,    3,    1,
    1,    1,    1,    1,    1,    1,    1,    1,    3,    1,
    4,    6,    3,    3,    2,    1,    1,    1,    1,    1,
    1,    1,    1,    1,    4,    2,    4,    1,    1,    1,
    1,    1,    1,    3,    3,    1,    3,    3,    2,    1,
    1,    1,    1,
};
final static short yydefred[] = {                         0,
    0,    0,    0,    2,   19,   20,    0,    3,    0,    0,
    8,    0,    0,    1,    0,    0,    0,    6,    0,    0,
   13,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,   26,   27,   28,   29,   30,   31,   32,    4,    0,
    0,    0,   16,    0,    0,   66,    0,    0,    0,    0,
    0,    0,   68,   69,   70,   71,   72,   73,    0,   23,
    0,    0,    0,   21,    0,   14,   81,   82,   83,    0,
    0,    0,    0,    0,   80,    0,    0,    0,    0,    0,
    0,   24,    0,    0,    0,    0,    0,    0,   41,   42,
   43,   44,   45,   46,    0,    0,    0,    0,   47,   48,
    0,    0,    0,   51,   65,    0,   34,   67,   12,   11,
    7,    0,    9,    0,    0,    0,    0,    0,    0,   37,
   77,   78,    0,    0,    0,   10,    0,   50,    0,    0,
   52,   17,    0,    0,    0,   35,   64,   56,   57,   58,
   59,   60,   61,   62,    0,    0,   63,    0,   49,    0,
   53,    0,    0,   36,   54,   18,
};
final static short yydgoto[] = {                          2,
    3,    7,   14,    8,    9,   10,   18,   11,   12,   20,
   87,  115,   84,   21,   22,   71,   72,   30,   31,   32,
   33,   34,   35,   36,   37,   38,  129,   73,  101,   97,
  131,  145,  146,  147,   59,   74,   75,
};
final static short yysindex[] = {                      -255,
  -30,    0, -226,    0,    0,    0, -229,    0,    4, -201,
    0, -226, -183,    0, -226,  -39,   22,    0, -200, -177,
    0,   36,   58,   61,   85,   86,   87,    3, -115, -136,
   72,    0,    0,    0,    0,    0,    0,    0,    0,   93,
 -226, -200,    0, -229, -226,    0,   -7, -145,   -7,   -7,
   -7,   -7,    0,    0,    0,    0,    0,    0, -146,    0,
 -183, -226,  102,    0, -118,    0,    0,    0,    0,   -7,
    9,  106, -156,   42,    0,  107,   55,  109,   59,   64,
 -229,    0, -122,  115, -200,  117, -225,   42,    0,    0,
    0,    0,    0,    0,   -7,   -7,   -7, -100,    0,    0,
   -7, -187, -187,    0,    0, -111,    0,    0,    0,    0,
    0,   -7,    0,  103, -102,   42,   42,   59, -189,    0,
    0,    0,  -98,   70,  124,    0, -183,    0, -138, -117,
    0,    0,   -7,  -97, -189,    0,    0,    0,    0,    0,
    0,    0,    0,    0,  -96,  108,    0,  129,    0,  -89,
    0, -117,  113,    0,    0,    0,
};
final static short yyrindex[] = {                         0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,  -91,    0,  116,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,  -90,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
  -88,    0,    0,    0,    0,    0,    0,    0,    0,    0,
  -29,    0,  135,  -41,    0,    0,    0,    0,  -56,    0,
    0,    0,    0,    0,    0,    0,    0,  -35,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,  -15,   -9,  -21,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,  -87,    0,    0,    0,    0,
};
final static short yygindex[] = {                         0,
    0,    0,  -11,  164,    0,   19,   -3,    0,    0,    0,
    0,    0,    0,  136,    0,    6,  -36,  -44,  -73,  -24,
  -22,  -20,  -18,  -16,  -14,  -93,   45,    0,    0,    0,
    0,   30,    0,    0,    0,  -47,   21,
};
final static int YYTABLESIZE=293;
static short yytable[];
static { yytable();}
static void yytable(){
yytable = new short[]{                         76,
   41,   76,   33,   76,   53,   79,   54,   79,   55,   79,
   56,   40,   57,   78,   58,   43,   82,   76,   76,   39,
   76,    1,   88,   79,   79,   74,   79,   74,    4,   74,
   19,   75,   65,   75,   13,   75,  144,   70,   64,  113,
    5,    6,   52,   74,   74,  128,   74,  116,  117,   75,
   75,   95,   75,   96,   77,  114,   79,   80,  144,   63,
   16,  128,   15,   19,  120,   42,   23,   24,   93,  108,
   94,   25,   23,   24,  127,   17,   17,   25,   26,   27,
   83,  111,  134,  102,   26,   27,   44,   28,  103,   67,
   68,   69,   29,   28,   45,  105,  148,   95,   29,   96,
   47,   95,  118,   96,  107,  138,   95,  139,   96,  140,
  132,  141,   95,  142,   96,  143,   46,  124,   99,  100,
  135,  136,  121,  122,   48,   49,   50,  138,   60,  139,
   61,  140,   62,  141,   76,  142,   81,  143,   23,   24,
   23,   24,   85,   25,   86,   25,   98,  104,  137,  106,
   26,   27,   26,   27,  109,  110,  112,  119,  123,   28,
  125,   28,  126,  133,   29,  130,  152,  149,  151,  153,
  154,  156,    5,   15,   22,   38,   25,   55,   39,  150,
   66,  155,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,   33,   33,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,   76,   76,    0,
    0,    0,    0,   79,   79,    0,   33,    0,    0,   76,
   76,    0,   76,   76,   76,   79,   79,   40,   79,   79,
   79,   76,   76,   74,   74,   40,   40,   79,   79,   75,
   75,    0,    0,   39,   39,   74,   74,    0,   74,   74,
   74,   75,   75,    0,   75,   75,   75,   74,   74,   67,
   68,   69,    0,   75,   75,   51,    0,    0,    0,   89,
   90,    0,   91,    0,    0,    0,    0,    0,    0,    0,
    0,    0,   92,
};
}
static short yycheck[];
static { yycheck(); }
static void yycheck() {
yycheck = new short[] {                         41,
   40,   43,   59,   45,   29,   41,   29,   43,   29,   45,
   29,   41,   29,   50,   29,   19,   61,   59,   60,   41,
   62,  277,   70,   59,   60,   41,   62,   43,   59,   45,
   12,   41,   44,   43,  264,   45,  130,   45,   42,  265,
  267,  268,   40,   59,   60,  119,   62,   95,   96,   59,
   60,   43,   62,   45,   49,  281,   51,   52,  152,   41,
  262,  135,   59,   45,  101,   44,  256,  257,   60,   81,
   62,  261,  256,  257,  264,  277,  277,  261,  268,  269,
   62,   85,  127,   42,  268,  269,  264,  277,   47,  277,
  278,  279,  282,  277,   59,   41,  133,   43,  282,   45,
   40,   43,   97,   45,   41,  130,   43,  130,   45,  130,
   41,  130,   43,  130,   45,  130,   59,  112,  275,  276,
  259,  260,  102,  103,   40,   40,   40,  152,  265,  152,
   59,  152,   40,  152,  280,  152,  283,  152,  256,  257,
  256,  257,   41,  261,  263,  261,   41,   41,  266,   41,
  268,  269,  268,  269,  277,   41,   40,  258,  270,  277,
   58,  277,  265,   40,  282,  264,   59,  265,  265,   41,
  260,   59,  264,  264,   59,   41,  265,  265,   15,  135,
   45,  152,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,  259,  260,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,  259,  260,   -1,
   -1,   -1,   -1,  259,  260,   -1,  283,   -1,   -1,  271,
  272,   -1,  274,  275,  276,  271,  272,  277,  274,  275,
  276,  283,  284,  259,  260,  275,  276,  283,  284,  259,
  260,   -1,   -1,  275,  276,  271,  272,   -1,  274,  275,
  276,  271,  272,   -1,  274,  275,  276,  283,  284,  277,
  278,  279,   -1,  283,  284,  273,   -1,   -1,   -1,  271,
  272,   -1,  274,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,  284,
};
}
final static short YYFINAL=2;
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
"bloque_declarativo : sentencias_declarativas",
"sentencias_declarativas : sentencia_declarativa ';' sentencias_declarativas",
"sentencias_declarativas : sentencia_declarativa ';'",
"sentencia_declarativa : tipo lista_variables",
"sentencia_declarativa : tipo FUNC '(' tipo ')' lista_variables",
"sentencia_declarativa : sentencia_declarativa_funcion",
"sentencia_declarativa_funcion : cabecera_funcion bloque_declarativo_funcion BEGIN bloque_ejecutable retorno_funcion END",
"sentencia_declarativa_funcion : cabecera_funcion bloque_declarativo_funcion BEGIN bloque_ejecutable retorno_funcion postcondicion END",
"cabecera_funcion : tipo FUNC ID '(' parametro ')'",
"parametro : tipo ID",
"bloque_declarativo_funcion : sentencias_declarativas_en_funcion",
"sentencias_declarativas_en_funcion : sentencia_declarativa_en_funcion ';' sentencias_declarativas_en_funcion",
"sentencias_declarativas_en_funcion : sentencia_declarativa_en_funcion ';'",
"sentencia_declarativa_en_funcion : tipo lista_variables",
"retorno_funcion : RETURN '(' expresion_aritmetica ')'",
"postcondicion : POST ':' '(' condicion ')' ';'",
"tipo : ULONG",
"tipo : DOUBLE",
"lista_variables : ID ',' lista_variables",
"lista_variables : ID",
"bloque_ejecutable : BEGIN sentencias_ejecutables END",
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
"sentencia_llamado_funcion : ID '(' expresion_aritmetica ')'",
"sentencia_condicional : IF '(' condicion ')' THEN bloque_ejecutable_condicional ENDIF",
"sentencia_condicional : IF '(' condicion ')' THEN bloque_ejecutable_condicional ELSE bloque_ejecutable_condicional ENDIF",
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
"bloque_ejecutable_condicional : sentencia_ejecutable",
"sentencia_imprimir : PRINT '(' CADENA ')'",
"sentencia_iterativa : WHILE '(' condicion ')' DO bloque_ejecutable_iterativo",
"bloque_ejecutable_iterativo : BEGIN sentencias_ejecutables_iterativas END",
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
"sentencia_conversion : error ';'",
"sentencia_try_catch : TRY sentencia_ejecutable_con_anidamiento CATCH bloque_ejecutable",
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

//#line 175 "gramatica.y"

///CODIGO JAVA

private AnalizadorLexico analizadorLexico;
private ArrayList<String> estructuras = new ArrayList<String>();


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

private int yylex(){
	Dupla<Integer, Integer> tokenActual = analizadorLexico.getSiguienteToken();
	if(tokenActual.getSegundo() != null)
		yylval = new ParserVal(tokenActual.getSegundo());
	//System.out.println("Token devuelto por yylex: " + tokenActual.getPrimero() );
	return tokenActual.getPrimero();
}

private void yyerror(String s){

}
//#line 422 "Parser.java"
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
{ addEstructura( "Declaracion de programa, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 6:
//#line 27 "gramatica.y"
{ addEstructura( "Declaracion de variables, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 7:
//#line 28 "gramatica.y"
{ estructuras.add( "Declaracion de funciones como variables, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 11:
//#line 36 "gramatica.y"
{ addEstructura( "Declaracion de funcion, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 16:
//#line 49 "gramatica.y"
{ addEstructura( "Declaracion de variables, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 17:
//#line 52 "gramatica.y"
{ addEstructura( "Sentencia RETURN, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 18:
//#line 55 "gramatica.y"
{ addEstructura( "Sentencia POST, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 33:
//#line 82 "gramatica.y"
{ addEstructura( "Sentencia de asignacion, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 34:
//#line 85 "gramatica.y"
{ addEstructura( "Sentencia de llamado a funcion, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 35:
//#line 88 "gramatica.y"
{ addEstructura( "Sentencia IF, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 36:
//#line 89 "gramatica.y"
{ addEstructura( "Sentencia IF con ELSE, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 51:
//#line 116 "gramatica.y"
{ addEstructura( "Sentencia PRINT, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 52:
//#line 119 "gramatica.y"
{ addEstructura( "Sentencia WHILE, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 64:
//#line 140 "gramatica.y"
{ addEstructura( "Sentencia BREAK, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 65:
//#line 143 "gramatica.y"
{ addEstructura( "Sentencia de conversion a DOUBLE, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 66:
//#line 144 "gramatica.y"
{}
break;
case 67:
//#line 147 "gramatica.y"
{ addEstructura( "Sentencia TRY CATCH, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 79:
//#line 165 "gramatica.y"
{/*$$ = -1 * $2*/}
break;
//#line 643 "Parser.java"
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
