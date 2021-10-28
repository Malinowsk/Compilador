#ifndef lint
static char yysccsid[] = "@(#)yaccpar	1.8 (Berkeley) 01/20/90";
#endif
#define YYBYACC 1
#line 2 "gramatica.y"
import java.util.ArrayList;
import java.util.Stack;
#line 9 "y.tab.c"
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
    9,    9,   14,   10,   15,   15,   16,   12,   12,   12,
   12,   12,   13,   13,   13,   13,   13,   13,    6,    6,
    7,    7,    3,   11,   19,   19,   20,   20,   20,   20,
   20,   21,   21,   21,   26,   26,   22,   22,   29,   27,
   27,   27,   27,   27,   30,   18,   18,   31,   33,   33,
   33,   33,   33,   33,   32,   32,   28,   28,   23,   23,
   23,   23,   23,   34,   24,   35,   35,   35,   35,   35,
   37,   36,   36,   38,   38,   39,   39,   39,   39,   39,
   39,   40,   41,   41,   25,   42,   42,   42,   43,   44,
   44,   44,   44,   17,   17,   17,   45,   45,   45,   45,
   46,   46,   46,   46,   46,
};
short yylen[] = {                                         2,
    3,    2,    2,    1,    3,    2,    2,    6,    1,    2,
    3,    5,    6,    5,    6,    7,    6,    6,    6,    6,
    5,    5,    2,    1,    3,    2,    2,    5,    5,    4,
    4,    2,    6,    6,    5,    4,    4,    2,    1,    1,
    3,    1,    3,    1,    2,    1,    1,    1,    1,    1,
    1,    4,    3,    4,    5,    6,    4,    6,    1,    5,
    5,    4,    4,    6,    1,    3,    1,    3,    1,    1,
    1,    1,    1,    1,    1,    1,    3,    1,    5,    5,
    4,    4,    3,    1,    2,    5,    5,    5,    4,    4,
    1,    3,    1,    2,    1,    1,    1,    1,    1,    1,
    1,    2,    4,    4,    2,    3,    3,    2,    1,    1,
    1,    1,    1,    3,    3,    1,    3,    3,    1,    2,
    1,    1,    1,    1,    1,
};
short yydefred[] = {                                      0,
    0,    0,    0,    0,    3,    2,    0,   39,   40,    0,
    4,    0,    0,    9,    0,    0,   10,    0,    1,    0,
    0,    0,    7,    0,    0,   24,    0,    0,   65,   84,
   91,    0,  109,    0,    0,   47,   48,   49,   50,   51,
    0,    0,    0,    0,    0,    0,    0,    5,    0,   11,
    0,    0,    0,    0,   27,    0,    0,   41,    0,    0,
   43,   45,    0,   78,    0,    0,  121,  124,  125,    0,
    0,    0,    0,    0,  123,    0,  122,    0,  119,    0,
    0,    0,    0,    0,   96,   97,   98,   99,  100,   85,
   93,  101,    0,    0,  105,  110,  111,  112,  113,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,   44,
   25,   53,    0,    0,    0,   59,    0,    0,    0,    0,
    0,    0,  120,   69,   70,   71,   72,   73,   74,    0,
    0,    0,    0,   75,   76,    0,    0,    0,   83,    0,
    0,    0,    0,    0,  102,    0,    0,    0,  107,  106,
    0,    0,    0,    0,   23,   21,    0,    0,   14,   12,
    0,    0,    0,   54,   52,   77,   57,    0,    0,    0,
    0,    0,   62,    0,    0,    0,    0,   63,   66,  117,
  118,   82,    0,   81,    0,   92,   94,    0,   89,    0,
   90,   18,   19,   20,   17,   13,    8,   32,    0,    0,
    0,   15,    0,    0,    0,  104,  103,    0,    0,   61,
    0,   60,   80,   79,   88,   87,   86,    0,    0,    0,
   38,    0,    0,    0,   16,   58,    0,   55,   64,    0,
   30,    0,   31,    0,    0,    0,   56,   29,   28,   37,
    0,    0,    0,   36,   35,    0,    0,   34,   33,
};
short yydgoto[] = {                                       3,
    4,   10,   19,   11,   12,  104,   17,   14,   15,   25,
  109,  163,  204,  105,   26,   27,   73,   74,   34,   35,
   36,   37,   38,   39,   40,   75,   41,   65,  118,   42,
   76,  136,  132,   43,   44,   90,   45,  143,  144,   92,
   77,   46,   47,  100,   78,   79,
};
short yysindex[] = {                                   -235,
   27,   62,    0, -201,    0,    0, -136,    0,    0,  -96,
    0,  123, -169,    0, -255,  142,    0,  -94,    0, -201,
  -85,    3,    0, -136,  -59,    0,  150, -136,    0,    0,
    0, -215,    0,  -49,  -94,    0,    0,    0,    0,    0,
 -111,  -37,  -36, -130,  -25,  -96, -152,    0,  121,    0,
  177,  -38, -161,  178,    0,  -94, -255,    0,  159,   40,
    0,    0,  -94,    0,  -52,  181,    0,    0,    0,  -54,
   43,  -84,   29,  184,    0,  -65,    0,   96,    0,  163,
  186, -234,  -97,  173,    0,    0,    0,    0,    0,    0,
    0,    0,   56,  192,    0,    0,    0,    0,    0, -245,
 -255, -255, -119,  -43,  209,  210,  -31, -136, -228,    0,
    0,    0,  196,  144,    7,    0,  214, -111,   59,  228,
  233,  -32,    0,    0,    0,    0,    0,    0,    0,   71,
   71,   71,   19,    0,    0,   71,  -84,  -84,    0,  219,
  238,   70,   26,  -97,    0,  243,  -35,   28,    0,    0,
  256,  263,  264,  265,    0,    0, -136, -136,    0,    0,
  248,  -21, -242,    0,    0,    0,    0,   49,  269,  136,
   74,   58,    0, -194,   96,   96,  111,    0,    0,    0,
    0,    0,  255,    0,  267,    0,    0,   53,    0, -173,
    0,    0,    0,    0,    0,    0,    0,    0,   87,  155,
  270,    0,  -40,   66,  273,    0,    0,  299,  161,    0,
  286,    0,    0,    0,    0,    0,    0,  306,   69,  295,
    0,   71,  317,  319,    0,    0,  303,    0,    0,  304,
    0,  311,    0,   81,   90,  312,    0,    0,    0,    0,
  315,  335,  336,    0,    0,  321,  322,    0,    0,
};
short yyrindex[] = {                                      0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,  323,    0,    0,    0,  119,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,  -66,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,  323,    0,
    0,    0,    0,    0,    0,    0,  120,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,  -34,    0,   -9,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,  122,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,  124,    0,    0,    0,    0,    0,    0,
    0,    0,    0,  -55,    0,    0,    0,    0,    0,    0,
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
    0,    0,  339,  367,    0,   98,   16,    0,    0,    0,
    0,    0,    0,   -3,  331,    0,  -29,  -44,   12,  -24,
  -14,    1,   13,   32,  -18,    0,    0,  272,    0,    0,
    0,    0,    0,    0,    0,    0,    0,  247,  348,    0,
    0,    0,    0,    0,   84,  -56,
};
#define YYTABLESIZE 392
short yytable[] = {                                     222,
   94,  103,   71,   82,   72,  190,   67,   72,  174,  158,
  149,    8,    9,  201,   93,  123,   64,  223,  199,   72,
    1,  141,  202,   72,   67,   89,  122,  161,   23,   85,
  114,  116,   96,  116,  162,  116,   50,  150,  203,   55,
   59,    2,   53,   58,   86,  142,   62,   97,  147,  116,
  116,  114,  116,  114,    7,  114,   87,   60,  115,   98,
  115,  211,  115,  212,   89,    8,    9,  110,   85,  114,
  114,  130,  114,  131,  115,   88,  115,  115,   99,  115,
  180,  181,  216,   86,   72,    5,   21,   72,  128,  170,
  129,  179,   22,   64,  106,   87,  217,  151,  152,  154,
   72,   13,  177,   72,   29,    8,    9,   16,   30,  232,
  185,  130,   24,  131,   88,   72,   31,   13,   72,   54,
    6,  241,  159,  160,   32,   89,   29,  231,  184,   85,
   30,   72,  200,   83,   72,   84,  153,  137,   31,  240,
   16,  209,  138,   68,   86,   29,   32,    8,    9,   30,
  107,   33,   63,  130,   24,  131,   87,   31,  224,   29,
  101,   68,   29,   30,   28,   32,   30,   18,   84,  219,
   33,   31,  196,  197,   31,   88,  207,  234,  130,   32,
  131,   20,   32,   66,   33,   28,  130,   33,  131,   46,
  243,   49,   67,   68,   69,  220,   46,  130,   46,  131,
   70,  228,  165,  130,   56,  131,  116,  117,   57,  134,
  135,   22,   22,  175,  176,   61,  102,  112,  108,   80,
  119,  139,  120,   67,  133,  173,  140,   66,    8,    9,
   66,  145,  148,  155,  189,   67,   67,   68,   69,   67,
   68,   69,   66,   81,   70,   16,   66,   70,  116,  156,
  157,   67,   68,   69,  164,   67,   68,   69,   51,   70,
  116,  116,  116,   70,  116,  116,  116,  171,  114,    8,
    9,  166,  167,  172,  116,  115,  178,  182,  183,   52,
  114,  114,  114,  188,  114,  114,  114,  115,  115,  115,
  186,  115,  115,  115,  114,  113,  192,  191,  121,  124,
  125,  115,  126,  193,  194,  195,  198,   66,  205,  206,
   66,  146,  127,  213,  169,  210,   67,   68,   69,   67,
   68,   69,  215,   66,   70,  214,   66,   70,  221,  208,
  225,  226,   67,   68,   69,   67,   68,   69,   66,  227,
   70,   66,  218,   70,  229,  242,  230,   67,   68,   69,
   67,   68,   69,  233,   66,   70,  235,   66,   70,  236,
   68,  237,  238,   67,   68,   69,   67,   68,   69,  239,
  244,   70,   68,  245,   70,  246,  247,   68,   68,  248,
  249,   42,    6,   26,   95,  108,   48,  111,   95,  168,
  187,   91,
};
short yycheck[] = {                                      40,
   45,   40,   40,   40,   45,   41,   41,   45,   41,   41,
  256,  267,  268,  256,   40,   72,   41,   58,   40,   45,
  256,  256,  265,   45,   59,   44,   71,  256,   13,   44,
   60,   41,   47,   43,  263,   45,   21,  283,  281,   24,
  256,  277,   40,   28,   44,  280,   35,   47,   93,   59,
   60,   41,   62,   43,  256,   45,   44,  273,   41,   47,
   43,  256,   45,  258,   83,  267,  268,   56,   83,   59,
   60,   43,   62,   45,   63,   44,   59,   60,   47,   62,
  137,  138,  256,   83,   45,   59,  256,   45,   60,  119,
   62,  136,  262,  118,  256,   83,  270,  101,  102,  103,
   45,    4,  132,   45,  257,  267,  268,  277,  261,   41,
   41,   43,   15,   45,   83,   45,  269,   20,   45,   22,
   59,   41,  107,  108,  277,  144,  257,   59,   59,  144,
  261,   45,  162,  264,   45,  266,  256,   42,  269,   59,
  277,  171,   47,   41,  144,  257,  277,  267,  268,  261,
   53,  282,  264,   43,   57,   45,  144,  269,  203,  257,
   40,   59,  257,  261,   44,  277,  261,  264,  266,  199,
  282,  269,  157,  158,  269,  144,   41,  222,   43,  277,
   45,   59,  277,  268,  282,   44,   43,  282,   45,  256,
  235,  277,  277,  278,  279,   41,  263,   43,  265,   45,
  285,   41,   59,   43,  264,   45,  259,  260,   59,  275,
  276,  267,  268,  130,  131,  265,   40,   59,   41,  256,
   40,   59,  277,  258,   41,  258,   41,  268,  267,  268,
  268,   59,   41,  277,  270,  270,  277,  278,  279,  277,
  278,  279,  268,  280,  285,  277,  268,  285,  258,   41,
   41,  277,  278,  279,   59,  277,  278,  279,  256,  285,
  270,  271,  272,  285,  274,  275,  276,   40,  258,  267,
  268,  265,   59,   41,  284,  258,  258,   59,   41,  277,
  270,  271,  272,   41,  274,  275,  276,  270,  271,  272,
  265,  274,  275,  276,  284,  256,   41,  270,  256,  271,
  272,  284,  274,   41,   41,   41,   59,  268,  260,   41,
  268,  256,  284,   59,  256,  258,  277,  278,  279,  277,
  278,  279,  270,  268,  285,   59,  268,  285,   59,  256,
  265,   59,  277,  278,  279,  277,  278,  279,  268,   41,
  285,  268,  256,  285,   59,  256,   41,  277,  278,  279,
  277,  278,  279,   59,  268,  285,   40,  268,  285,   41,
  258,   59,   59,  277,  278,  279,  277,  278,  279,   59,
   59,  285,  270,   59,  285,   41,   41,  275,  276,   59,
   59,   59,  264,  264,   46,  264,   20,   57,  265,  118,
  144,   44,
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
#line 287 "gramatica.y"

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
#line 487 "y.tab.c"
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
#line 18 "gramatica.y"
{ addEstructura( "Declaracion de programa, en la linea: " + analizadorLexico.getNroLineaToken() );}
break;
case 3:
#line 19 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", identificador de programa invalido"); }
break;
case 7:
#line 29 "gramatica.y"
{ addEstructura( "Declaracion de variables, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 8:
#line 30 "gramatica.y"
{ addEstructura( "Declaracion de funciones como variables, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 10:
#line 32 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", tipo de variable invalido"); }
break;
case 11:
#line 33 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", declaracion invalida"); }
break;
case 12:
#line 34 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 13:
#line 35 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", tipo de variable invalido"); }
break;
case 14:
#line 36 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 17:
#line 45 "gramatica.y"
{ addEstructura( "Declaracion de funcion, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 18:
#line 46 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", declaracion invalida"); }
break;
case 19:
#line 47 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", identificador invalido"); }
break;
case 20:
#line 48 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", parametro invalido"); }
break;
case 21:
#line 49 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 22:
#line 50 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 27:
#line 63 "gramatica.y"
{ addEstructura( "Declaracion de variables, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 28:
#line 66 "gramatica.y"
{ addEstructura( "Sentencia RETURN, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 29:
#line 67 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 30:
#line 68 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 31:
#line 69 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 32:
#line 70 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 33:
#line 73 "gramatica.y"
{ addEstructura( "Sentencia POST, en la linea: " + analizadorLexico.getNroLineaToken() ); /*¡POSTCONDICION_VAR= $3.ival?*/}
break;
case 34:
#line 74 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
break;
case 35:
#line 75 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta :"); }
break;
case 36:
#line 76 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 37:
#line 77 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 38:
#line 78 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 52:
#line 106 "gramatica.y"
{
 		       addEstructura( "Sentencia de asignacion, en la linea: " + analizadorLexico.getNroLineaToken() );
		       crearTerceto(ASIG, yyvsp[-3].ival, yyvsp[-1].ival);
		      }
break;
case 53:
#line 110 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia asignacion invalida"); }
break;
case 54:
#line 111 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 55:
#line 114 "gramatica.y"
{
 			    addEstructura( "Sentencia de llamado a funcion, en la linea: " + analizadorLexico.getNroLineaToken() );
 			    yyval =  new ParserVal(crearTerceto(CALL, yyvsp[-3].ival, yyvsp[-1].ival));
 			   }
break;
case 56:
#line 118 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 57:
#line 121 "gramatica.y"
{
 			 tercetos.get(pila.pop()).setT3(tercetos.size());
 			}
break;
case 58:
#line 124 "gramatica.y"
{
			 tercetos.get(pila.pop()).setT2(tercetos.size());
			}
break;
case 59:
#line 129 "gramatica.y"
{
	tercetos.get(pila.pop()).setT3(tercetos.size()+1);
	int refTerceto =crearTerceto(-2, -1, -1);/*-2 es BI*/
	pila.push(refTerceto);
	yyval = new ParserVal(refTerceto);
	}
break;
case 60:
#line 138 "gramatica.y"
{
 					 int refTerceto = crearTerceto(-1, yyvsp[-2].ival, -1);/*el primer-1 es BF*/
					 pila.push(refTerceto);
 					 yyval = new ParserVal(refTerceto);
 					 }
break;
case 61:
#line 143 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
break;
case 62:
#line 144 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 63:
#line 145 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 64:
#line 146 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia condicional invalida"); }
break;
case 65:
#line 149 "gramatica.y"
{addEstructura( "Sentencia IF, en la linea: " + analizadorLexico.getNroLineaToken() );
 	  yyval = yyvsp[0];}
break;
case 66:
#line 153 "gramatica.y"
{
	  	yyval = new ParserVal(crearTerceto(yyvsp[-1].ival, yyvsp[-2].ival, yyvsp[0].ival));
	  	}
break;
case 67:
#line 156 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 68:
#line 159 "gramatica.y"
{
			yyval = new ParserVal(crearTerceto(yyvsp[-1].ival, yyvsp[-2].ival, yyvsp[0].ival));
			}
break;
case 69:
#line 164 "gramatica.y"
{yyval.ival = COMP_MAYOR_IGUAL;}
break;
case 70:
#line 165 "gramatica.y"
{yyval.ival = COMP_MENOR_IGUAL;}
break;
case 71:
#line 166 "gramatica.y"
{yyval.ival = COMP_IGUAL;}
break;
case 72:
#line 167 "gramatica.y"
{yyval.ival = COMP_DISTINTO;}
break;
case 73:
#line 168 "gramatica.y"
{yyval.ival = '<';}
break;
case 74:
#line 169 "gramatica.y"
{yyval.ival = '>';}
break;
case 75:
#line 172 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 76:
#line 173 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 80:
#line 181 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", cadena invalida"); }
break;
case 81:
#line 182 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 82:
#line 183 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 83:
#line 184 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia PRINT invalida"); }
break;
case 84:
#line 187 "gramatica.y"
{ addEstructura( "Sentencia PRINT, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 85:
#line 190 "gramatica.y"
{
							     tercetos.get(pila.pop()).setT3(tercetos.size()+1);/*Se modifica el BF, agregandole la referencia correspondiente al proximo terceto despues de la ultima sentencia del bloque*/
							     int refTerceto = crearTerceto(-2, pila.pop(), -1);/*-2 es BI, se crea un BI al terceto que calcula la condicion del while*/
							    }
break;
case 86:
#line 196 "gramatica.y"
{
					 int refTerceto = crearTerceto(-1, yyvsp[-2].ival, -1);/*el primer-1 es BF*/
					 pila.push(refTerceto);
					 yyval = new ParserVal(refTerceto);
					}
break;
case 87:
#line 201 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia iterativa invalida"); }
break;
case 88:
#line 202 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
break;
case 89:
#line 203 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 90:
#line 204 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 91:
#line 206 "gramatica.y"
{ addEstructura( "Sentencia WHILE, en la linea: " + analizadorLexico.getNroLineaToken() );
 		 pila.push(tercetos.size());
 	         yyval=yyvsp[0]; }
break;
case 102:
#line 227 "gramatica.y"
{ addEstructura( "Sentencia BREAK, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 103:
#line 230 "gramatica.y"
{
 			 addEstructura( "Sentencia de conversion a DOUBLE, en la linea: " + analizadorLexico.getNroLineaToken() );
 			 yyval =  new ParserVal(crearTerceto(DOUBLE, yyvsp[-1].ival, -1));
 			}
break;
case 104:
#line 234 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 105:
#line 237 "gramatica.y"
{
		      /*tercetos.get(pila.pop()).setT3(tercetos.size());*/
		     }
break;
case 106:
#line 242 "gramatica.y"
{
		  /*pila.push(crearTerceto(-1, ¿POSTCONDICION_VAR?, -1));//el primer -1 es BF*/
		 }
break;
case 107:
#line 245 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia TRY-CATCH invalida"); }
break;
case 108:
#line 246 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia TRY-CATCH invalida"); }
break;
case 109:
#line 249 "gramatica.y"
{ addEstructura( "Sentencia TRY-CATCH, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 114:
#line 258 "gramatica.y"
{
							  yyval = new ParserVal(crearTerceto('+', yyvsp[-2].ival, yyvsp[0].ival));
 							 }
break;
case 115:
#line 261 "gramatica.y"
{
		  				         yyval = new ParserVal(crearTerceto('-', yyvsp[-2].ival, yyvsp[0].ival));
						        }
break;
case 116:
#line 264 "gramatica.y"
{ yyval = yyvsp[0] ; }
break;
case 117:
#line 267 "gramatica.y"
{
			     yyval = new ParserVal(crearTerceto('*', yyvsp[-2].ival, yyvsp[0].ival));
			     }
break;
case 118:
#line 270 "gramatica.y"
{
			     yyval = new ParserVal(crearTerceto('/', yyvsp[-2].ival, yyvsp[0].ival));
			     }
break;
case 119:
#line 273 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 120:
#line 274 "gramatica.y"
{
		      yyval = new ParserVal(crearTerceto('*', -1, yyvsp[0].ival));
		      }
break;
case 121:
#line 279 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 122:
#line 280 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 123:
#line 281 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 124:
#line 282 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 125:
#line 283 "gramatica.y"
{yyval = yyvsp[0];}
break;
#line 1013 "y.tab.c"
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
