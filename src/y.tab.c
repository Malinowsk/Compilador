#ifndef lint
static char yysccsid[] = "@(#)yaccpar	1.8 (Berkeley) 01/20/90";
#endif
#define YYBYACC 1
#line 2 "gramatica.y"
import java.util.ArrayList;
import java.util.Stack;
import java.util.HashMap;
#line 10 "y.tab.c"
#define IF 257
#define THEN 258
#define ELSE 259
#define ENDIF 260
#define PRINT 261
#define FUNC 262
#define RETURN 263
#define BEGIN 264
#define END 265
#define BREAK 266
#define ULONG 267
#define DOUBLE 268
#define WHILE 269
#define DO 270
#define COMP_MAYOR_IGUAL 271
#define COMP_MENOR_IGUAL 272
#define ASIG 273
#define COMP_IGUAL 274
#define AND 275
#define OR 276
#define ID 277
#define CTE_ULONG 278
#define CTE_DOUBLE 279
#define CADENA 280
#define POST 281
#define TRY 282
#define CATCH 283
#define COMP_DISTINTO 284
#define CALL 285
#define YYERRCODE 256
short yylhs[] = {                                        -1,
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
short yylen[] = {                                         2,
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
short yydefred[] = {                                      0,
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
short yydgoto[] = {                                       3,
    4,   10,   19,   11,   12,   95,   17,   14,   15,  100,
  153,  194,   96,   68,   69,   31,   32,   33,   34,   35,
   36,   37,   70,   38,   60,  108,   39,   71,  126,  122,
   40,   41,   85,   42,  133,  134,   87,   72,   43,   44,
   73,   74,
};
short yysindex[] = {                                   -233,
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
short yyrindex[] = {                                      0,
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
short yygindex[] = {                                      0,
    0,  359,  333,  360,    0,   80,    8,    0,    0,    0,
    0,    0,  112,  -43,  -28,   17,  -27,  -14,  -13,  -10,
    4,    5,    0,    0,  274,    0,    0,    0,    0,    0,
    0,    0,    0,    0,  249,  340,    0,    0,    0,    0,
   91,  -41,
};
#define YYTABLESIZE 383
short yytable[] = {                                     212,
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
short yycheck[] = {                                      40,
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
#define YYFINAL 3
#ifndef YYDEBUG
#define YYDEBUG 0
#endif
#define YYMAXTOKEN 285
#if YYDEBUG
char *yyname[] = {
"end-of-file",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,"'('","')'","'*'","'+'","','","'-'",0,"'/'",0,0,0,0,0,0,0,0,0,0,
"':'","';'","'<'",0,"'>'",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,"IF","THEN","ELSE","ENDIF","PRINT","FUNC","RETURN","BEGIN","END",
"BREAK","ULONG","DOUBLE","WHILE","DO","COMP_MAYOR_IGUAL","COMP_MENOR_IGUAL",
"ASIG","COMP_IGUAL","AND","OR","ID","CTE_ULONG","CTE_DOUBLE","CADENA","POST",
"TRY","CATCH","COMP_DISTINTO","CALL",
};
char *yyrule[] = {
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
#endif
#ifndef YYSTYPE
typedef int YYSTYPE;
#endif
#define yyclearin (yychar=(-1))
#define yyerrok (yyerrflag=0)
#ifdef YYSTACKSIZE
#ifndef YYMAXDEPTH
#define YYMAXDEPTH YYSTACKSIZE
#endif
#else
#ifdef YYMAXDEPTH
#define YYSTACKSIZE YYMAXDEPTH
#else
#define YYSTACKSIZE 500
#define YYMAXDEPTH 500
#endif
#endif
int yydebug;
int yynerrs;
int yyerrflag;
int yychar;
short *yyssp;
YYSTYPE *yyvsp;
YYSTYPE yyval;
YYSTYPE yylval;
short yyss[YYSTACKSIZE];
YYSTYPE yyvs[YYSTACKSIZE];
#define yystacksize YYSTACKSIZE
#line 427 "gramatica.y"

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
#line 502 "y.tab.c"
#define YYABORT goto yyabort
#define YYACCEPT goto yyaccept
#define YYERROR goto yyerrlab
int
yyparse()
{
    register int yym, yyn, yystate;
#if YYDEBUG
    register char *yys;
    extern char *getenv();

    if (yys = getenv("YYDEBUG"))
    {
        yyn = *yys;
        if (yyn >= '0' && yyn <= '9')
            yydebug = yyn - '0';
    }
#endif

    yynerrs = 0;
    yyerrflag = 0;
    yychar = (-1);

    yyssp = yyss;
    yyvsp = yyvs;
    *yyssp = yystate = 0;

yyloop:
    if (yyn = yydefred[yystate]) goto yyreduce;
    if (yychar < 0)
    {
        if ((yychar = yylex()) < 0) yychar = 0;
#if YYDEBUG
        if (yydebug)
        {
            yys = 0;
            if (yychar <= YYMAXTOKEN) yys = yyname[yychar];
            if (!yys) yys = "illegal-symbol";
            printf("yydebug: state %d, reading %d (%s)\n", yystate,
                    yychar, yys);
        }
#endif
    }
    if ((yyn = yysindex[yystate]) && (yyn += yychar) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
    {
#if YYDEBUG
        if (yydebug)
            printf("yydebug: state %d, shifting to state %d (%s)\n",
                    yystate, yytable[yyn],yyrule[yyn]);
#endif
        if (yyssp >= yyss + yystacksize - 1)
        {
            goto yyoverflow;
        }
        *++yyssp = yystate = yytable[yyn];
        *++yyvsp = yylval;
        yychar = (-1);
        if (yyerrflag > 0)  --yyerrflag;
        goto yyloop;
    }
    if ((yyn = yyrindex[yystate]) && (yyn += yychar) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
    {
        yyn = yytable[yyn];
        goto yyreduce;
    }
    if (yyerrflag) goto yyinrecovery;
#ifdef lint
    goto yynewerror;
#endif
yynewerror:
    yyerror("syntax error");
#ifdef lint
    goto yyerrlab;
#endif
yyerrlab:
    ++yynerrs;
yyinrecovery:
    if (yyerrflag < 3)
    {
        yyerrflag = 3;
        for (;;)
        {
            if ((yyn = yysindex[*yyssp]) && (yyn += YYERRCODE) >= 0 &&
                    yyn <= YYTABLESIZE && yycheck[yyn] == YYERRCODE)
            {
#if YYDEBUG
                if (yydebug)
                    printf("yydebug: state %d, error recovery shifting\
 to state %d\n", *yyssp, yytable[yyn]);
#endif
                if (yyssp >= yyss + yystacksize - 1)
                {
                    goto yyoverflow;
                }
                *++yyssp = yystate = yytable[yyn];
                *++yyvsp = yylval;
                goto yyloop;
            }
            else
            {
#if YYDEBUG
                if (yydebug)
                    printf("yydebug: error recovery discarding state %d\n",
                            *yyssp);
#endif
                if (yyssp <= yyss) goto yyabort;
                --yyssp;
                --yyvsp;
            }
        }
    }
    else
    {
        if (yychar == 0) goto yyabort;
#if YYDEBUG
        if (yydebug)
        {
            yys = 0;
            if (yychar <= YYMAXTOKEN) yys = yyname[yychar];
            if (!yys) yys = "illegal-symbol";
            printf("yydebug: state %d, error recovery discards token %d (%s)\n",
                    yystate, yychar, yys);
        }
#endif
        yychar = (-1);
        goto yyloop;
    }
yyreduce:
#if YYDEBUG
    if (yydebug)
        printf("yydebug: state %d, reducing by rule %d (%s)\n",
                yystate, yyn, yyrule[yyn]);
#endif
    yym = yylen[yyn];
    yyval = yyvsp[1-yym];
    switch (yyn)
    {
case 2:
#line 19 "gramatica.y"
{ addEstructura( "Declaracion de programa, en la linea: " + analizadorLexico.getNroLineaToken() );
 			      ambitoActual= tablaSimbolo.obtenerValor(yyvsp[-1].ival);
 			    }
break;
case 3:
#line 22 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", identificador de programa invalido");
 		    		 ambitoActual= "error";
 		    		}
break;
case 7:
#line 34 "gramatica.y"
{ addEstructura( "Declaracion de variables, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 8:
#line 35 "gramatica.y"
{addEstructura( "Declaracion de funciones como variables, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 10:
#line 37 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", tipo de variable invalido"); }
break;
case 11:
#line 38 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", declaracion invalida"); }
break;
case 12:
#line 39 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 13:
#line 40 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", tipo de variable invalido"); }
break;
case 14:
#line 41 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 15:
#line 44 "gramatica.y"
{
 					ambitoActual= ambitoActual.substring(0, ambitoActual.lastIndexOf('.'));
 				}
break;
case 16:
#line 47 "gramatica.y"
{
                               		ambitoActual= ambitoActual.substring(0, ambitoActual.lastIndexOf('.'));
                               }
break;
case 17:
#line 52 "gramatica.y"
{
			 String auxiliar = tablaSimbolo.obtenerToken(yyvsp[-3].ival).getLexema();
			 if(!tablaSimbolo.existeToken(auxiliar + '.' + ambitoActual)){
			    tablaSimbolo.obtenerToken(yyvsp[-3].ival).setLexema(auxiliar+'.'+ambitoActual);
			    tablaSimbolo.obtenerToken(yyvsp[-3].ival).setTipo(tipoActual);
			    tablaSimbolo.obtenerToken(yyvsp[-3].ival).setUso("funcion");
			    tablaSimbolo.obtenerToken(yyvsp[-3].ival).setTipoParametro(tablaSimbolo.obtenerToken(yyvsp[-1].ival).getTipo());
			    ambitoActual= ambitoActual + '.' + auxiliar;
			    tablaSimbolo.obtenerToken(yyvsp[-1].ival).setLexema(tablaSimbolo.obtenerToken(yyvsp[-1].ival).getLexema()+'.'+ambitoActual);
 			 }
 			 else
 			 {
 			     tablaSimbolo.borrarToken(yyvsp[-3].ival);
                 	     addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", funcion redeclarada");
 			     yyvsp[-3].ival=tablaSimbolo.obtenerReferenciaTabla(auxiliar+'.'+ ambitoActual);
 			     ambitoActual= ambitoActual + '.' + auxiliar;
 			 }
 			 addEstructura( "Declaracion de funcion, en la linea: " + analizadorLexico.getNroLineaToken() );
 		  }
break;
case 18:
#line 71 "gramatica.y"
{ ambitoActual= ambitoActual + '.' + tablaSimbolo.obtenerToken(yyvsp[-3].ival).getLexema(); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", declaracion invalida");
 		  }
break;
case 19:
#line 73 "gramatica.y"
{ ambitoActual= ambitoActual + '.' + "error"; addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", identificador invalido");
 		  }
break;
case 20:
#line 75 "gramatica.y"
{ ambitoActual= ambitoActual + '.' + tablaSimbolo.obtenerToken(yyvsp[-3].ival).getLexema(); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", parametro invalido");
 		  }
break;
case 21:
#line 77 "gramatica.y"
{ ambitoActual= ambitoActual + '.' + tablaSimbolo.obtenerToken(yyvsp[-2].ival).getLexema(); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura");
 		  }
break;
case 22:
#line 79 "gramatica.y"
{ ambitoActual= ambitoActual + '.' + tablaSimbolo.obtenerToken(yyvsp[-2].ival).getLexema(); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre");
 		  }
break;
case 23:
#line 83 "gramatica.y"
{
		tablaSimbolo.obtenerToken(yyvsp[0].ival).setTipo(tipoActual);
		tablaSimbolo.obtenerToken(yyvsp[0].ival).setUso("parametro");
		yyval.ival=yyvsp[0].ival;
	}
break;
case 24:
#line 90 "gramatica.y"
{ addEstructura( "Sentencia RETURN, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 25:
#line 91 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 26:
#line 92 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 27:
#line 93 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 28:
#line 94 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 29:
#line 97 "gramatica.y"
{
 			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
 			postCondiciones.put(refFuncion, tercetos.size()-1);/*Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion*/
 			addEstructura( "Sentencia POST, en la linea: " + analizadorLexico.getNroLineaToken() );
 		}
break;
case 30:
#line 102 "gramatica.y"
{
			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
			postCondiciones.put(refFuncion, 0);/*Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion*/
			addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida");
		}
break;
case 31:
#line 107 "gramatica.y"
{
			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
			postCondiciones.put(refFuncion, tercetos.size()-1);/*Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion*/
			addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta :");
		}
break;
case 32:
#line 112 "gramatica.y"
{
			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
			postCondiciones.put(refFuncion, tercetos.size()-1);/*Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion*/
			addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura");
		}
break;
case 33:
#line 117 "gramatica.y"
{
			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
			postCondiciones.put(refFuncion, tercetos.size()-1);/*Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion*/
			addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre");
		}
break;
case 34:
#line 122 "gramatica.y"
{
			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
			postCondiciones.put(refFuncion, 0);/*Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion*/
			addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida");
		}
break;
case 35:
#line 129 "gramatica.y"
{tipoActual= "ULONG";}
break;
case 36:
#line 130 "gramatica.y"
{tipoActual= "DOUBLE";}
break;
case 37:
#line 133 "gramatica.y"
{
                        if(!tablaSimbolo.existeToken(tablaSimbolo.obtenerToken(yyvsp[-2].ival).getLexema()+'.'+ambitoActual)){
			    tablaSimbolo.obtenerToken(yyvsp[-2].ival).setLexema(tablaSimbolo.obtenerToken(yyvsp[-2].ival).getLexema()+'.'+ambitoActual);
			    tablaSimbolo.obtenerToken(yyvsp[-2].ival).setTipo(tipoActual);
			    tablaSimbolo.obtenerToken(yyvsp[-2].ival).setUso("variable");}
			else{
			    tablaSimbolo.borrarToken(yyvsp[-2].ival);
			    addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", variable redeclarada");
			}
 		 }
break;
case 38:
#line 143 "gramatica.y"
{
                        if(!tablaSimbolo.existeToken(tablaSimbolo.obtenerToken(yyvsp[0].ival).getLexema()+'.'+ambitoActual)){
            	            tablaSimbolo.obtenerToken(yyvsp[0].ival).setLexema(tablaSimbolo.obtenerToken(yyvsp[0].ival).getLexema()+'.'+ambitoActual);
			    tablaSimbolo.obtenerToken(yyvsp[0].ival).setTipo(tipoActual);
			    tablaSimbolo.obtenerToken(yyvsp[0].ival).setUso("variable");
			}
			else{
			    tablaSimbolo.borrarToken(yyvsp[0].ival);
			    addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", variable redeclarada");
			}
	         }
break;
case 48:
#line 173 "gramatica.y"
{
 		       String auxiliar= ambitoActual;
 		       int ultimoPunto = 0;
 		       while( (!tablaSimbolo.existeToken(tablaSimbolo.obtenerToken(yyvsp[-3].ival).getLexema()+'.'+auxiliar)) && (ultimoPunto>=0)){
 		       		ultimoPunto = auxiliar.lastIndexOf('.');
 		       		if(ultimoPunto>0)
 		       			auxiliar = auxiliar.substring(0, ultimoPunto);
 		       }
 		       int nuevaRef = tablaSimbolo.obtenerReferenciaTabla(tablaSimbolo.obtenerToken(yyvsp[-3].ival).getLexema()+'.'+auxiliar);
		       if(nuevaRef == -1){
		       		addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", variable no declarada");
		       }
		       else{
		       		tablaSimbolo.borrarToken(yyvsp[-3].ival);/*se borra de la tabla de simbolos la variable duplicada de la sentencia*/
		       		yyvsp[-3].ival=nuevaRef;/*se le asigna la referencia a la variable original en la tabla*/
		       }

		        /*VER SI HAY QUE AGREGAR EL VALOR AL TOKEN*/
 		       addEstructura( "Sentencia de asignacion, en la linea: " + analizadorLexico.getNroLineaToken() );
		       if(tablaSimbolo.obtenerToken(yyvsp[-3].ival).getTipo()!=yyvsp[-1].sval)
                	        addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + tablaSimbolo.obtenerToken(yyvsp[-3].ival).getTipo() + " := " + yyvsp[-1].sval );
		       yyval = new ParserVal((double)crearTerceto(new ParserVal(ASIG), yyvsp[-3], yyvsp[-1]));
		      }
break;
case 49:
#line 196 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia asignacion invalida"); }
break;
case 50:
#line 197 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 51:
#line 200 "gramatica.y"
{
                String auxiliar= ambitoActual;
                int ultimoPunto = 0;
                while( (!tablaSimbolo.existeToken(tablaSimbolo.obtenerToken(yyvsp[-3].ival).getLexema()+'.'+auxiliar)) && (ultimoPunto>=0)){
                    ultimoPunto = auxiliar.lastIndexOf('.');
                    if(ultimoPunto>0)
                        auxiliar = auxiliar.substring(0, ultimoPunto);
                }
		int nuevaRef = tablaSimbolo.obtenerReferenciaTabla(tablaSimbolo.obtenerToken(yyvsp[-3].ival).getLexema()+'.'+auxiliar);
		if(nuevaRef == -1){
			addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", funcion no declarada");
		}
		else{
			tablaSimbolo.borrarToken(yyvsp[-3].ival);/*se borra de la tabla de simbolos la variable duplicada de la sentencia*/
			yyvsp[-3].ival=nuevaRef;/*se le asigna la referencia a la variable original en la tabla*/
			if(yyvsp[-1].sval!=tablaSimbolo.obtenerToken(yyvsp[-3].ival).getTipoParametro())
				addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", Error en la invocacion a funcion : El tipo de parametro real no coincide con el formal");
		}
		addEstructura( "Sentencia de llamado a funcion, en la linea: " + analizadorLexico.getNroLineaToken() );
		yyval = new ParserVal((double)crearTerceto(new ParserVal(CALL), yyvsp[-3], yyvsp[-1]));
		yyval.sval = tablaSimbolo.obtenerToken(yyvsp[-3].ival).getTipo();
	   }
break;
case 52:
#line 222 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 53:
#line 225 "gramatica.y"
{
 			 tercetos.get(pila.pop()).setT3(new ParserVal((double)tercetos.size()));
 			}
break;
case 54:
#line 228 "gramatica.y"
{
			 tercetos.get(pila.pop()).setT2(new ParserVal((double)tercetos.size()));
			}
break;
case 55:
#line 233 "gramatica.y"
{
	tercetos.get(pila.pop()).setT3(new ParserVal((double)tercetos.size()+1));
	int refTerceto =crearTerceto(new ParserVal(-2), new ParserVal(-1), new ParserVal(-1));/*-2 es BI*/
	pila.push(refTerceto);
	yyval = new ParserVal((double)refTerceto);
	}
break;
case 56:
#line 241 "gramatica.y"
{
 					 int refTerceto = crearTerceto(new ParserVal(-1), yyvsp[-2], new ParserVal(-1));/*el primer-1 es BF*/
					 pila.push(refTerceto);
 					 yyval = new ParserVal((double)refTerceto);
 					 }
break;
case 57:
#line 246 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
break;
case 58:
#line 247 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 59:
#line 248 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 60:
#line 249 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia condicional invalida"); }
break;
case 61:
#line 252 "gramatica.y"
{addEstructura( "Sentencia IF, en la linea: " + analizadorLexico.getNroLineaToken() );
 	  yyval = yyvsp[0];}
break;
case 62:
#line 256 "gramatica.y"
{
	  	yyval = new ParserVal((double)crearTerceto(yyvsp[-1], yyvsp[-2], yyvsp[0]));
	  	}
break;
case 63:
#line 259 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 64:
#line 262 "gramatica.y"
{
			yyval = new ParserVal((double)crearTerceto(yyvsp[-1], yyvsp[-2], yyvsp[0]));
			}
break;
case 65:
#line 267 "gramatica.y"
{yyval.ival = COMP_MAYOR_IGUAL;}
break;
case 66:
#line 268 "gramatica.y"
{yyval.ival = COMP_MENOR_IGUAL;}
break;
case 67:
#line 269 "gramatica.y"
{yyval.ival = COMP_IGUAL;}
break;
case 68:
#line 270 "gramatica.y"
{yyval.ival = COMP_DISTINTO;}
break;
case 69:
#line 271 "gramatica.y"
{yyval.ival = '<';}
break;
case 70:
#line 272 "gramatica.y"
{yyval.ival = '>';}
break;
case 71:
#line 275 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 72:
#line 276 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 75:
#line 283 "gramatica.y"
{crearTerceto(yyvsp[-4], yyvsp[-2], new ParserVal(-1));}
break;
case 76:
#line 284 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", cadena invalida"); }
break;
case 77:
#line 285 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 78:
#line 286 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 79:
#line 287 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia PRINT invalida"); }
break;
case 80:
#line 290 "gramatica.y"
{
 		addEstructura( "Sentencia PRINT, en la linea: " + analizadorLexico.getNroLineaToken() );
 		yyval = new ParserVal((int)PRINT);
 		}
break;
case 81:
#line 296 "gramatica.y"
{
							     tercetos.get(pila.pop()).setT3(new ParserVal((double)tercetos.size()+1));/*Se modifica el BF, agregandole la referencia correspondiente al proximo terceto despues de la ultima sentencia del bloque*/
							     crearTerceto(new ParserVal(-2), new ParserVal((double)pila.pop()), new ParserVal(-1));/*-2 es BI, se crea un BI al terceto que calcula la condicion del while*/
							    }
break;
case 82:
#line 302 "gramatica.y"
{
					 int refTerceto = crearTerceto(new ParserVal(-1), yyvsp[-2], new ParserVal(-1));/*el primer-1 es BF*/
					 pila.push(refTerceto);
					 yyval = new ParserVal((double)refTerceto);
					}
break;
case 83:
#line 307 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia iterativa invalida"); }
break;
case 84:
#line 308 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
break;
case 85:
#line 309 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 86:
#line 310 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 87:
#line 312 "gramatica.y"
{ addEstructura( "Sentencia WHILE, en la linea: " + analizadorLexico.getNroLineaToken() );
 		 pila.push(tercetos.size());
 	         yyval=yyvsp[0]; }
break;
case 98:
#line 333 "gramatica.y"
{ addEstructura( "Sentencia BREAK, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 99:
#line 336 "gramatica.y"
{
 			 addEstructura( "Sentencia de conversion a DOUBLE, en la linea: " + analizadorLexico.getNroLineaToken() );
 			 yyval =  new ParserVal((double)crearTerceto(new ParserVal(DOUBLE), yyvsp[-1], new ParserVal(-1)));
 			 yyval.sval = "DOUBLE";
 			}
break;
case 100:
#line 341 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 101:
#line 344 "gramatica.y"
{
 		      int t = pila.pop();
 		      tercetos.get(t).setT3(new ParserVal((double)tercetos.size()));/*Completa el BT del try*/
		     }
break;
case 102:
#line 350 "gramatica.y"
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
#line 358 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia TRY-CATCH invalida"); }
break;
case 104:
#line 359 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia TRY-CATCH invalida"); }
break;
case 105:
#line 362 "gramatica.y"
{ addEstructura( "Sentencia TRY-CATCH, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 106:
#line 365 "gramatica.y"
{
                              if(yyvsp[-2].sval!=yyvsp[0].sval)
				addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + yyvsp[-2].sval + " + " + yyvsp[0].sval );
			      yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'+'), yyvsp[-2], yyvsp[0]));
			      yyval.sval=yyvsp[-2].sval;
 		      }
break;
case 107:
#line 371 "gramatica.y"
{
				 if(yyvsp[-2].sval!=yyvsp[0].sval)
					addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + yyvsp[-2].sval + " - " + yyvsp[0].sval );
				 yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'-'), yyvsp[-2], yyvsp[0]));
				 yyval.sval=yyvsp[-2].sval;
		      }
break;
case 108:
#line 377 "gramatica.y"
{ yyval = yyvsp[0] ; }
break;
case 109:
#line 380 "gramatica.y"
{
             if(yyvsp[-2].sval!=yyvsp[0].sval)
                   addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + yyvsp[-2].sval + " * " + yyvsp[0].sval );
	     yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'*'), yyvsp[-2], yyvsp[0]));
	     yyval.sval=yyvsp[-2].sval;
	 }
break;
case 110:
#line 386 "gramatica.y"
{
                if(yyvsp[-2].sval!=yyvsp[0].sval)
                     	addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + yyvsp[-2].sval + " / " + yyvsp[0].sval );
		yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'/'), yyvsp[-2], yyvsp[0]));
		yyval.sval=yyvsp[-2].sval;
	 }
break;
case 111:
#line 392 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 112:
#line 393 "gramatica.y"
{
		      yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'*'), new ParserVal(-1), yyvsp[0]));
		      yyval.sval=yyvsp[-1].sval;
	 }
break;
case 113:
#line 399 "gramatica.y"
{
       String auxiliar= ambitoActual;
       int ultimoPunto = 0;
       while( (!tablaSimbolo.existeToken(tablaSimbolo.obtenerToken(yyvsp[0].ival).getLexema()+'.'+auxiliar)) && (ultimoPunto>=0)){
		ultimoPunto = auxiliar.lastIndexOf('.');
		if(ultimoPunto>0)
			auxiliar = auxiliar.substring(0, ultimoPunto);
       }
       int nuevaRef = tablaSimbolo.obtenerReferenciaTabla(tablaSimbolo.obtenerToken(yyvsp[0].ival).getLexema()+'.'+auxiliar);
       if(nuevaRef == -1){
		addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", variable no declarada");
       }
       else{
		tablaSimbolo.borrarToken(yyvsp[0].ival);/*se borra de la tabla de simbolos la variable duplicada de la sentencia*/
		yyvsp[0].ival=nuevaRef;/*se le asigna la referencia a la variable original en la tabla*/
       }
       yyval = yyvsp[0];
       yyval.sval=tablaSimbolo.obtenerToken(yyvsp[0].ival).getTipo();
     }
break;
case 114:
#line 418 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 115:
#line 419 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 116:
#line 420 "gramatica.y"
{  yyval = yyvsp[0];
                       yyval.sval="ULONG";}
break;
case 117:
#line 422 "gramatica.y"
{yyval = yyvsp[0];
                      yyval.sval="DOUBLE";}
break;
#line 1214 "y.tab.c"
    }
    yyssp -= yym;
    yystate = *yyssp;
    yyvsp -= yym;
    yym = yylhs[yyn];
    if (yystate == 0 && yym == 0)
    {
#if YYDEBUG
        if (yydebug)
            printf("yydebug: after reduction, shifting from state 0 to\
 state %d\n", YYFINAL);
#endif
        yystate = YYFINAL;
        *++yyssp = YYFINAL;
        *++yyvsp = yyval;
        if (yychar < 0)
        {
            if ((yychar = yylex()) < 0) yychar = 0;
#if YYDEBUG
            if (yydebug)
            {
                yys = 0;
                if (yychar <= YYMAXTOKEN) yys = yyname[yychar];
                if (!yys) yys = "illegal-symbol";
                printf("yydebug: state %d, reading %d (%s)\n",
                        YYFINAL, yychar, yys);
            }
#endif
        }
        if (yychar == 0) goto yyaccept;
        goto yyloop;
    }
    if ((yyn = yygindex[yym]) && (yyn += yystate) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yystate)
        yystate = yytable[yyn];
    else
        yystate = yydgoto[yym];
#if YYDEBUG
    if (yydebug)
        printf("yydebug: after reduction, shifting from state %d \
to state %d\n", *yyssp, yystate);
#endif
    if (yyssp >= yyss + yystacksize - 1)
    {
        goto yyoverflow;
    }
    *++yyssp = yystate;
    *++yyvsp = yyval;
    goto yyloop;
yyoverflow:
    yyerror("yacc stack overflow");
yyabort:
    return (1);
yyaccept:
    return (0);
}
