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
    5,    6,    6,    7,    7,    8,    9,    9,   10,   10,
   11,   11,   11,   11,   15,   13,   13,   13,   13,   14,
   14,   14,   14,   14,    3,   12,   18,   18,   19,   19,
   19,   19,   19,   20,   20,   20,   20,   25,   25,   21,
   21,   28,   26,   26,   26,   26,   26,   29,   17,   17,
   30,   32,   32,   32,   32,   32,   32,   31,   31,   27,
   27,   22,   22,   22,   22,   22,   33,   23,   34,   34,
   34,   34,   34,   36,   35,   35,   37,   37,   38,   38,
   38,   38,   38,   38,   39,   40,   40,   24,   41,   41,
   41,   42,   16,   16,   16,   43,   43,   43,   43,   44,
   44,   44,   44,   44,
};
short yylen[] = {                                         2,
    3,    2,    2,    1,    3,    2,    2,    5,    1,    2,
    3,    1,    1,    3,    1,    2,    3,    1,    6,    7,
    5,    5,    4,    4,    2,    5,    5,    4,    4,    6,
    6,    5,    4,    4,    3,    1,    2,    1,    1,    1,
    1,    1,    1,    4,    3,    4,    2,    5,    6,    4,
    6,    1,    5,    5,    4,    4,    6,    1,    3,    1,
    3,    1,    1,    1,    1,    1,    1,    1,    1,    3,
    1,    5,    5,    4,    4,    3,    1,    2,    5,    5,
    5,    4,    4,    1,    3,    1,    2,    1,    1,    1,
    1,    1,    1,    1,    2,    4,    4,    2,    3,    3,
    2,    1,    3,    3,    1,    3,    3,    1,    2,    1,
    1,    1,    1,    1,
};
short yydefred[] = {                                      0,
    0,    0,    0,    0,    3,    2,    0,   12,   13,    0,
    4,    0,    0,    0,    9,    0,    0,   10,    0,    1,
    0,    0,   16,    7,    0,    0,    0,    0,    0,   58,
   77,   84,    0,  102,    0,    0,   39,   40,   41,   42,
   43,    0,    0,    0,    0,    0,    0,    0,    5,   11,
    0,    0,    0,    0,    0,   14,   47,    0,    0,   35,
   37,    0,   71,    0,    0,  110,  113,  114,    0,    0,
    0,    0,    0,  112,    0,  111,    0,  108,    0,    0,
    0,    0,    0,   89,   90,   91,   92,   93,   78,   86,
   94,    0,    0,   98,    0,    0,    0,   25,   23,    0,
    0,   36,   45,    0,    0,    0,   52,    0,    0,    0,
    0,    0,    0,  109,   62,   63,   64,   65,   66,   67,
    0,    0,    0,    0,   68,   69,    0,    0,    0,   76,
    0,    0,    0,    0,    0,   95,    0,    0,    0,  100,
   99,   22,   21,    0,    8,    0,    0,   46,   44,   70,
   50,    0,    0,    0,    0,    0,   55,    0,    0,    0,
    0,   56,   59,  106,  107,   75,    0,   74,    0,   85,
   87,    0,   82,    0,   83,    0,    0,    0,   19,    0,
    0,    0,   97,   96,    0,    0,   54,    0,   53,   73,
   72,   81,   80,   79,   17,    0,    0,    0,    0,    0,
    0,   20,   51,    0,   48,   57,    0,   28,    0,   29,
    0,    0,    0,   49,   27,   26,   34,    0,    0,    0,
   33,   32,    0,    0,   31,   30,
};
short yydgoto[] = {                                       3,
    4,   10,   20,   11,   12,   13,   18,   14,  145,   15,
   16,  101,  147,  181,   53,   72,   73,   35,   36,   37,
   38,   39,   40,   41,   74,   42,   64,  109,   43,   75,
  127,  123,   44,   45,   89,   46,  134,  135,   91,   76,
   47,   48,   77,   78,
};
short yysindex[] = {                                   -211,
  -58,  -46,    0,  -99,    0,    0, -242,    0,    0, -225,
    0,   10, -180,  -31,    0,  -99,   14,    0,  -96,    0,
  -99, -242,    0,    0,  -38, -168, -185, -242,   25,    0,
    0,    0, -233,    0, -172,  -96,    0,    0,    0,    0,
    0, -105,  -37,  -36, -119,  -25, -225, -210,    0,    0,
  -80, -181,   89,  102,  -96,    0,    0,   53,   40,    0,
    0,  -96,    0, -134,  106,    0,    0,    0, -128,   43,
  -94,   29,  125,    0, -122,    0,    1,    0,  111,  130,
 -223, -146,  116,    0,    0,    0,    0,    0,    0,    0,
    0,   56,  138,    0, -246,  141,  163,    0,    0,  -69,
  -54,    0,    0,  153,   96,  -55,    0,  154, -105,   59,
  171,  173,  -24,    0,    0,    0,    0,    0,    0,    0,
   71,   71,   71,  -43,    0,    0,   71,  -94,  -94,    0,
  158,  175,   65,  -47, -146,    0,  178,  -35,  -49,    0,
    0,    0,    0,  179,    0,  -21, -239,    0,    0,    0,
    0,  -28,  181,  151,   74,   -8,    0, -153,    1,    1,
  156,    0,    0,    0,    0,    0,  166,    0,  167,    0,
    0,  -19,    0, -215,    0,  -69,   87,  152,    0,  -40,
  -10,  168,    0,    0,  192,  157,    0,  200,    0,    0,
    0,    0,    0,    0,    0,  227,   49,  211,   71,  231,
  232,    0,    0,  213,    0,    0,  215,    0,  218,    0,
   68,   90,  219,    0,    0,    0,    0,  220,  239,  243,
    0,    0,  238,  245,    0,    0,
};
short yyrindex[] = {                                      0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,  246,    0,    0,    0,
   27,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,  -60,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,  -34,    0,   -9,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,   34,    0,  -78,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,   41,    0,    0,    0,    0,    0,
    0,    0,    0,  248,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,   11,   18,
  103,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,
};
short yygindex[] = {                                      0,
    0,  293,  263,  295,    0,   -4,  100,    0,  147,    0,
    0,    0,    0,    0,  275,  -48,  -32,   78,  -26,  -18,
  -33,  -17,  -14,   -1,    0,    0,  205,    0,    0,    0,
    0,    0,    0,    0,    0,    0,  194,  286,    0,    0,
    0,    0,   85,  -42,
};
#define YYTABLESIZE 379
short yytable[] = {                                     199,
    5,   51,   70,   81,   71,  174,   60,   71,   26,  140,
  105,   85,    6,   93,   92,   63,  158,  200,  177,   71,
   52,   54,   58,   71,   60,  179,   84,   86,  114,   95,
   87,  105,  132,  105,   17,  105,  141,  113,   19,   59,
  193,  180,  128,   88,    1,   29,   52,  129,   85,  105,
  105,  103,  105,  103,  194,  103,  133,   28,  104,  138,
  104,  154,  104,   84,   86,    2,   33,   87,   21,  103,
  103,  121,  103,  122,  161,   22,  104,  104,   55,  104,
   88,   23,   63,   57,   71,  164,  165,   71,  119,  209,
  120,  121,   60,  122,  163,   98,   17,  178,    8,    9,
   71,   85,  188,   71,  189,  169,  186,  208,  218,   29,
   30,  103,   24,   61,   31,   71,   84,   86,   71,   83,
   87,   50,   32,  168,  107,  108,  217,   56,  197,   99,
   33,   71,  102,   88,   71,   34,   29,   30,  121,  106,
  122,   31,  100,   61,   82,  110,   83,  201,  111,   32,
   29,   30,  125,  126,  149,   31,    7,   33,   62,   29,
   30,   61,   34,   32,   31,  124,  211,    8,    9,  130,
  131,   33,   32,   65,  136,   96,   34,   24,  139,  220,
   33,  142,   66,   67,   68,   34,    8,    9,   24,   24,
   69,  184,  198,  121,  121,  122,  122,  205,  121,  121,
  122,  122,   38,  143,   38,  159,  160,  144,  146,  150,
  155,  148,  151,  156,  162,  167,  166,  170,  172,   79,
  175,  183,  176,   60,  190,  191,  203,   65,    8,    9,
   65,  182,  204,  157,  173,   60,   66,   67,   68,   66,
   67,   68,   65,   80,   69,   25,   65,   69,  105,  187,
  192,   66,   67,   68,  202,   66,   67,   68,  206,   69,
  105,  105,  105,   69,  105,  105,  105,  207,  103,  210,
  212,  214,  213,  215,  105,  104,  216,  221,  222,  223,
  103,  103,  103,  224,  103,  103,  103,  104,  104,  104,
    6,  104,  104,  104,  103,  104,  225,  101,  112,  115,
  116,  104,  117,  226,   15,   88,   18,   65,   27,   94,
   65,  137,  118,  152,  153,   49,   66,   67,   68,   66,
   67,   68,  195,   65,   69,   97,   65,   69,  171,  185,
   90,    0,   66,   67,   68,   66,   67,   68,   65,    0,
   69,   65,  196,   69,    0,  219,    0,   66,   67,   68,
   66,   67,   68,    0,   65,   69,    0,   65,   69,    0,
   61,    0,    0,   66,   67,   68,   66,   67,   68,    0,
    0,   69,   61,    0,   69,    0,    0,   61,   61,
};
short yycheck[] = {                                      40,
   59,   40,   40,   40,   45,   41,   41,   45,   40,  256,
   59,   45,   59,   46,   40,   42,   41,   58,   40,   45,
   25,   26,  256,   45,   59,  265,   45,   45,   71,   48,
   45,   41,  256,   43,  277,   45,  283,   70,  264,  273,
  256,  281,   42,   45,  256,  256,   51,   47,   82,   59,
   60,   41,   62,   43,  270,   45,  280,   44,   41,   92,
   43,  110,   45,   82,   82,  277,  277,   82,   59,   59,
   60,   43,   62,   45,  123,  256,   59,   60,  264,   62,
   82,  262,  109,   59,   45,  128,  129,   45,   60,   41,
   62,   43,  265,   45,  127,  277,  277,  146,  267,  268,
   45,  135,  256,   45,  258,   41,  155,   59,   41,  256,
  257,   59,   13,   36,  261,   45,  135,  135,   45,  266,
  135,   22,  269,   59,  259,  260,   59,   28,  177,   41,
  277,   45,   55,  135,   45,  282,  256,  257,   43,   62,
   45,  261,   41,   41,  264,   40,  266,  180,  277,  269,
  256,  257,  275,  276,   59,  261,  256,  277,  264,  256,
  257,   59,  282,  269,  261,   41,  199,  267,  268,   59,
   41,  277,  269,  268,   59,  256,  282,  256,   41,  212,
  277,   41,  277,  278,  279,  282,  267,  268,  267,  268,
  285,   41,   41,   43,   43,   45,   45,   41,   43,   43,
   45,   45,  263,   41,  265,  121,  122,  277,  263,  265,
   40,   59,   59,   41,  258,   41,   59,  265,   41,  256,
  270,   41,   44,  258,   59,   59,   59,  268,  267,  268,
  268,  260,   41,  258,  270,  270,  277,  278,  279,  277,
  278,  279,  268,  280,  285,  277,  268,  285,  258,  258,
  270,  277,  278,  279,  265,  277,  278,  279,   59,  285,
  270,  271,  272,  285,  274,  275,  276,   41,  258,   59,
   40,   59,   41,   59,  284,  258,   59,   59,   59,   41,
  270,  271,  272,   41,  274,  275,  276,  270,  271,  272,
  264,  274,  275,  276,  284,  256,   59,  264,  256,  271,
  272,  284,  274,   59,   59,  265,   59,  268,   16,   47,
  268,  256,  284,  109,  256,   21,  277,  278,  279,  277,
  278,  279,  176,  268,  285,   51,  268,  285,  135,  256,
   45,   -1,  277,  278,  279,  277,  278,  279,  268,   -1,
  285,  268,  256,  285,   -1,  256,   -1,  277,  278,  279,
  277,  278,  279,   -1,  268,  285,   -1,  268,  285,   -1,
  258,   -1,   -1,  277,  278,  279,  277,  278,  279,   -1,
   -1,  285,  270,   -1,  285,   -1,   -1,  275,  276,
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
"sentencia_declarativa : tipo_funcion '(' tipo ')' lista_funcion_como_variables",
"sentencia_declarativa : sentencia_declarativa_funcion",
"sentencia_declarativa : error lista_variables",
"sentencia_declarativa : tipo error lista_variables",
"tipo : ULONG",
"tipo : DOUBLE",
"lista_variables : ID ',' lista_variables",
"lista_variables : ID",
"tipo_funcion : tipo FUNC",
"lista_funcion_como_variables : ID ',' lista_funcion_como_variables",
"lista_funcion_como_variables : ID",
"sentencia_declarativa_funcion : cabecera_funcion bloque_declarativo BEGIN bloque_ejecutable_funcion retorno_funcion END",
"sentencia_declarativa_funcion : cabecera_funcion bloque_declarativo BEGIN bloque_ejecutable_funcion retorno_funcion postcondicion END",
"cabecera_funcion : tipo_funcion ID '(' parametro ')'",
"cabecera_funcion : tipo_funcion ID '(' error ')'",
"cabecera_funcion : tipo_funcion ID parametro ')'",
"cabecera_funcion : tipo_funcion ID '(' parametro",
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
#line 544 "gramatica.y"

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
	return tokenActual.getPrimero();
}

private void yyerror(String s){

}
#line 514 "y.tab.c"
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
#line 36 "gramatica.y"
{ addEstructura( "Declaracion de variables, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 10:
#line 39 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", tipo de variable invalido"); }
break;
case 11:
#line 40 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", declaracion invalida"); }
break;
case 12:
#line 43 "gramatica.y"
{tipoActual= "ULONG"; yyval.sval= "ULONG";}
break;
case 13:
#line 44 "gramatica.y"
{tipoActual= "DOUBLE"; yyval.sval= "DOUBLE";}
break;
case 14:
#line 47 "gramatica.y"
{
                        if(!tablaSimbolo.existeToken(tablaSimbolo.obtenerToken(yyvsp[-2].ival).getLexema()+'.'+ambitoActual)){ /* chekeamos que no este esa variable redefiniciendose*/
			    tablaSimbolo.obtenerToken(yyvsp[-2].ival).setLexema(tablaSimbolo.obtenerToken(yyvsp[-2].ival).getLexema()+'.'+ambitoActual);
			    tablaSimbolo.obtenerToken(yyvsp[-2].ival).setTipo(tipoActual);
			    tablaSimbolo.obtenerToken(yyvsp[-2].ival).setUso("variable");
			}else{ /* si la variable ya esta declarada , se agrega a la lista de warning errores detectado por el parser*/
			    tablaSimbolo.borrarToken(yyvsp[-2].ival);
			    addWarning("Linea " + analizadorLexico.getNroLineaToken() + ", variable redeclarada, se eliminaron las redeclaraciones pertinentes");
			}
 		 }
break;
case 15:
#line 57 "gramatica.y"
{
                        if(!tablaSimbolo.existeToken(tablaSimbolo.obtenerToken(yyvsp[0].ival).getLexema()+'.'+ambitoActual)){
            	            tablaSimbolo.obtenerToken(yyvsp[0].ival).setLexema(tablaSimbolo.obtenerToken(yyvsp[0].ival).getLexema()+'.'+ambitoActual);
			    tablaSimbolo.obtenerToken(yyvsp[0].ival).setTipo(tipoActual);
			    tablaSimbolo.obtenerToken(yyvsp[0].ival).setUso("variable");
			}
			else{
			    tablaSimbolo.borrarToken(yyvsp[0].ival);
			    addWarning("Linea " + analizadorLexico.getNroLineaToken() + ", variable redeclarada, se eliminaron las redeclaraciones pertinentes");
			}
	         }
break;
case 16:
#line 70 "gramatica.y"
{
		tipoActualdeFuncion= yyvsp[-1].sval;
		addEstructura( "Declaracion de funciones como variables, en la linea: " + analizadorLexico.getNroLineaToken() );
 }
break;
case 17:
#line 76 "gramatica.y"
{
                         if(!tablaSimbolo.existeToken(tablaSimbolo.obtenerToken(yyvsp[-2].ival).getLexema()+'.'+ambitoActual)){
 			    tablaSimbolo.obtenerToken(yyvsp[-2].ival).setLexema(tablaSimbolo.obtenerToken(yyvsp[-2].ival).getLexema()+'.'+ambitoActual);
 			    tablaSimbolo.obtenerToken(yyvsp[-2].ival).setTipo(tipoActualdeFuncion);
 			    tablaSimbolo.obtenerToken(yyvsp[-2].ival).setUso("funcion designada a variable");
 			    tablaSimbolo.obtenerToken(yyvsp[-2].ival).setTipoParametro(tipoActual);
 			}else{
 			    tablaSimbolo.borrarToken(yyvsp[-2].ival);
 			    addWarning("Linea " + analizadorLexico.getNroLineaToken() + ", variable redeclarada, se eliminaron las redeclaraciones pertinentes");
 			}
  		 }
break;
case 18:
#line 87 "gramatica.y"
{
                         if(!tablaSimbolo.existeToken(tablaSimbolo.obtenerToken(yyvsp[0].ival).getLexema()+'.'+ambitoActual)){
             	            tablaSimbolo.obtenerToken(yyvsp[0].ival).setLexema(tablaSimbolo.obtenerToken(yyvsp[0].ival).getLexema()+'.'+ambitoActual);
 			    tablaSimbolo.obtenerToken(yyvsp[0].ival).setTipo(tipoActualdeFuncion);
 			    tablaSimbolo.obtenerToken(yyvsp[0].ival).setUso("funcion designada a variable");
 			    tablaSimbolo.obtenerToken(yyvsp[0].ival).setTipoParametro(tipoActual);
 			}
 			else{
 			    tablaSimbolo.borrarToken(yyvsp[0].ival);
 			    addWarning("Linea " + analizadorLexico.getNroLineaToken() + ", variable redeclarada, se eliminaron las redeclaraciones pertinentes");
 			}
 	         }
break;
case 19:
#line 103 "gramatica.y"
{
 					crearTerceto(new ParserVal(-4), new ParserVal(-1), new ParserVal(-1));/*terceto para indicar el final de una funcion*/
 					ambitoActual= ambitoActual.substring(0, ambitoActual.lastIndexOf('.'));
 				}
break;
case 20:
#line 107 "gramatica.y"
{
                               		crearTerceto(new ParserVal(-4), new ParserVal(-1), new ParserVal(-1));/*terceto para indicar el final de una funcion*/
                               		ambitoActual= ambitoActual.substring(0, ambitoActual.lastIndexOf('.'));
                               }
break;
case 21:
#line 113 "gramatica.y"
{
			 String auxiliar = tablaSimbolo.obtenerToken(yyvsp[-3].ival).getLexema();
			 if(!tablaSimbolo.existeToken(auxiliar + '.' + ambitoActual)){  /* chekeamos que no este redeclaradose la funcion*/
			    tablaSimbolo.obtenerToken(yyvsp[-3].ival).setLexema(auxiliar+'.'+ambitoActual);  /* seteamos el nombre , agregandole el ambito al que pertenece*/
			    tablaSimbolo.obtenerToken(yyvsp[-3].ival).setTipo(tipoActualdeFuncion); /* seteamos el tipo de la funcion*/
			    tablaSimbolo.obtenerToken(yyvsp[-3].ival).setUso("funcion");
			    tablaSimbolo.obtenerToken(yyvsp[-3].ival).setTipoParametro(tablaSimbolo.obtenerToken(yyvsp[-1].ival).getTipo()); /* set al topo del parametro*/
			    ambitoActual= ambitoActual + '.' + auxiliar; /* el ambito cambia al entrar a una declaracion de funcion*/
			    tablaSimbolo.obtenerToken(yyvsp[-1].ival).setLexema(tablaSimbolo.obtenerToken(yyvsp[-1].ival).getLexema()+'.'+ambitoActual);
			    tablaSimbolo.obtenerToken(yyvsp[-3].ival).setParametro(tablaSimbolo.obtenerToken(yyvsp[-1].ival).getLexema());
 			 }
 			 else
 			 {
 			     tablaSimbolo.borrarToken(yyvsp[-3].ival);
                 	     addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", funcion redeclarada");
 			     yyvsp[-3].ival=tablaSimbolo.obtenerReferenciaTabla(auxiliar+'.'+ ambitoActual);
 			     ambitoActual= ambitoActual + '.' + auxiliar;
 			 }
 			 addEstructura( "Declaracion de funcion, en la linea: " + analizadorLexico.getNroLineaToken() );
			 crearTerceto(new ParserVal(FUNC), yyvsp[-3], new ParserVal(-1));  /* terceto que indica comienzo de funcion , con su identificador en segunda posicion , el tercer lugar queda nulo*/
 		  }
break;
case 22:
#line 134 "gramatica.y"
{ ambitoActual= ambitoActual + '.' + tablaSimbolo.obtenerToken(yyvsp[-3].ival).getLexema(); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", parametro invalido");
 		  }
break;
case 23:
#line 136 "gramatica.y"
{ ambitoActual= ambitoActual + '.' + tablaSimbolo.obtenerToken(yyvsp[-2].ival).getLexema(); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura");
 		  }
break;
case 24:
#line 138 "gramatica.y"
{ ambitoActual= ambitoActual + '.' + tablaSimbolo.obtenerToken(yyvsp[-2].ival).getLexema(); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre");
 		  }
break;
case 25:
#line 143 "gramatica.y"
{
		tablaSimbolo.obtenerToken(yyvsp[0].ival).setTipo(tipoActual);
		tablaSimbolo.obtenerToken(yyvsp[0].ival).setUso("parametro");
		yyval.ival=yyvsp[0].ival; /* le pasamos al NT(paramentro) el valor de la clave que contiene el token identificador*/
	}
break;
case 26:
#line 150 "gramatica.y"
{                               /* ejemplo = Main.funcion1.funcion2*/
 				int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));

 				if(tablaSimbolo.obtenerToken(refFuncion).getTipo() != yyvsp[-2].sval)  /* chekeo que el tipo de funcion sea el mismo que estoy retornando*/
 					addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles entre el retorno de la funcion y lo retornado");
 				crearTerceto(new ParserVal(RETURN), yyvsp[-2], new ParserVal(-1));     /* terceto que indica retorno de funcion , con su valor a retornar en la segunda posicion , el tercer lugar queda nulo*/
 				addEstructura( "Sentencia RETURN, en la linea: " + analizadorLexico.getNroLineaToken() );
 		 }
break;
case 27:
#line 158 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 28:
#line 159 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 29:
#line 160 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 30:
#line 164 "gramatica.y"
{                                          /* ejemplo = Main.funcion1.funcion2*/
 			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));  /* obtengo la clave en la tabla de simbolos de el identificador de la funcion*/
 				/* uso un hasmap "postcondiciones" para guardar el identif de la funcion y su condicion*/
 			postCondiciones.put(refFuncion, tercetos.size()-1);/*Se guarda en el hashmap la posicion (indice de la lista tercetos) del terceto de la condicion (ult terceto agregado en este punto) con la clave= ID de la funcion*/
 			addEstructura( "Sentencia POST, en la linea: " + analizadorLexico.getNroLineaToken() );
 		}
break;
case 31:
#line 170 "gramatica.y"
{
			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
			postCondiciones.put(refFuncion, 0);/*Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion*/
			addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida");
		}
break;
case 32:
#line 175 "gramatica.y"
{
			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
			postCondiciones.put(refFuncion, tercetos.size()-1);/*Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion*/
			addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta :");
		}
break;
case 33:
#line 180 "gramatica.y"
{
			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
			postCondiciones.put(refFuncion, tercetos.size()-1);/*Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion*/
			addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura");
		}
break;
case 34:
#line 185 "gramatica.y"
{
			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
			postCondiciones.put(refFuncion, tercetos.size()-1);/*Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion*/
			addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre");
		}
break;
case 44:
#line 212 "gramatica.y"
{				/* aux:= expresion;*/
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

			       if(tablaSimbolo.obtenerToken(yyvsp[-3].ival).getUso()=="funcion")
					addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", el identificador a la izquierda de la asignacion no es una variable");

			       if(tablaSimbolo.obtenerToken(yyvsp[-3].ival).getUso()=="funcion designada a variable"){/*Solo se puede asignar una funcion*/
					if(yyvsp[-1].ival<=0){/*$3 no hace referencia a un identificador*/
						addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", solo se le puede asignar una funcion a esta variable");
					}else{
						if((tablaSimbolo.obtenerToken(yyvsp[-1].ival).getUso()!="funcion") && (tablaSimbolo.obtenerToken(yyvsp[-1].ival).getUso()!="funcion designada a variable")){
							addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", solo se le puede asignar una funcion a esta variable");
						}else{
							if(tablaSimbolo.obtenerToken(yyvsp[-3].ival).getTipoParametro() != tablaSimbolo.obtenerToken(yyvsp[-1].ival).getTipoParametro())
								addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", el parametro de la funcion es de distinto tipo que el del parametro de la variable");
							this.erroresSemanticos.remove(indiceErrorABorrar);/*se borra el error ya que se hace buen uso del identificador*/
						}
					}
				}

			       if(tablaSimbolo.obtenerToken(yyvsp[-3].ival).getTipo()!=yyvsp[-1].sval)
					addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + tablaSimbolo.obtenerToken(yyvsp[-3].ival).getTipo() + " := " + yyvsp[-1].sval );

		       }

		       yyval = new ParserVal((double)crearTerceto(new ParserVal(ASIG), yyvsp[-3], yyvsp[-1]));  /* terceto que indica una asignacion (ASIG) , con su identificador a asignar en segunda posicion , y el identificador que se debe asignar en tercera posicion*/
		       addEstructura( "Sentencia de asignacion, en la linea: " + analizadorLexico.getNroLineaToken() );
		      }
break;
case 45:
#line 253 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 46:
#line 254 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 47:
#line 255 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida");}
break;
case 48:
#line 259 "gramatica.y"
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

			Token tFuncion = tablaSimbolo.obtenerToken(yyvsp[-3].ival);
			if(tFuncion.getUso()=="funcion" || tFuncion.getUso()=="funcion designada a variable"){
			    yyvsp[-3].sval = tFuncion.getTipo();
				if(yyvsp[-1].sval!= tFuncion.getTipoParametro())
					addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", Error en la invocacion a funcion : El tipo de parametro real no coincide con el formal");
			}else{
				addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", se intenta invocar una variable que no es funcion " + tFuncion.getLexema());
			}
		}

		addEstructura( "Sentencia de llamado a funcion, en la linea: " + analizadorLexico.getNroLineaToken() );
 		yyval = new ParserVal((double)crearTerceto(new ParserVal(CALL), yyvsp[-3], yyvsp[-1]));
		yyval.sval = tablaSimbolo.obtenerToken(yyvsp[-3].ival).getTipo();
	   }
break;
case 49:
#line 290 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 50:
#line 294 "gramatica.y"
{              /* IF () THEN ... ENDIF;*/
			 tercetos.get(pila.pop()).setT3(new ParserVal((double)tercetos.size()));/*Completo el BF del if*/
			 tercetos.get(tercetos.size()-1).setEtiqueta();
			}
break;
case 51:
#line 299 "gramatica.y"
{
			 tercetos.get(pila.pop()).setT2(new ParserVal((double)tercetos.size()));/*Completo el BI del else*/
			 tercetos.get(tercetos.size()-1).setEtiqueta();
			}
break;
case 52:
#line 305 "gramatica.y"
{
	tercetos.get(pila.pop()).setT3(new ParserVal((double)tercetos.size()+1));/*Completo el BF del if*/
	int refTerceto =crearTerceto(new ParserVal(-2), new ParserVal(-1), new ParserVal(-1));/*-2 es BI*/
	tercetos.get(tercetos.size()-1).setEtiqueta();
	pila.push(refTerceto);
	yyval = new ParserVal((double)refTerceto);
	}
break;
case 53:
#line 314 "gramatica.y"
{
		 int refTerceto = crearTerceto(new ParserVal(-1), yyvsp[-2], new ParserVal(-1));/*el primer-1 es BF*/
		 pila.push(refTerceto);
		 yyval = new ParserVal((double)refTerceto);
		 }
break;
case 54:
#line 320 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
break;
case 55:
#line 321 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 56:
#line 322 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 57:
#line 323 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia condicional invalida"); }
break;
case 58:
#line 326 "gramatica.y"
{addEstructura( "Sentencia IF, en la linea: " + analizadorLexico.getNroLineaToken() );
 	  yyval = yyvsp[0];}
break;
case 59:
#line 331 "gramatica.y"
{
	  	yyval = new ParserVal((double)crearTerceto(yyvsp[-1], yyvsp[-2], yyvsp[0]));
	  	}
break;
case 60:
#line 334 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 61:
#line 337 "gramatica.y"
{
 			if(yyvsp[-2].sval!=yyvsp[0].sval)
				addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles en la comparacion");
			yyval = new ParserVal((double)crearTerceto(yyvsp[-1], yyvsp[-2], yyvsp[0]));
		}
break;
case 62:
#line 344 "gramatica.y"
{yyval.ival = COMP_MAYOR_IGUAL;}
break;
case 63:
#line 345 "gramatica.y"
{yyval.ival = COMP_MENOR_IGUAL;}
break;
case 64:
#line 346 "gramatica.y"
{yyval.ival = COMP_IGUAL;}
break;
case 65:
#line 347 "gramatica.y"
{yyval.ival = COMP_DISTINTO;}
break;
case 66:
#line 348 "gramatica.y"
{yyval.ival = '<';}
break;
case 67:
#line 349 "gramatica.y"
{yyval.ival = '>';}
break;
case 68:
#line 352 "gramatica.y"
{yyval.ival = AND;}
break;
case 69:
#line 353 "gramatica.y"
{yyval.ival = OR;}
break;
case 72:
#line 362 "gramatica.y"
{crearTerceto(yyvsp[-4], yyvsp[-2], new ParserVal(-1));}
break;
case 73:
#line 363 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", cadena invalida"); }
break;
case 74:
#line 364 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 75:
#line 365 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 76:
#line 366 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia PRINT invalida"); }
break;
case 77:
#line 369 "gramatica.y"
{
 		addEstructura( "Sentencia PRINT, en la linea: " + analizadorLexico.getNroLineaToken() );
 		yyval = new ParserVal((int)PRINT);
 		}
break;
case 78:
#line 376 "gramatica.y"
{   /* WHILE()DO BEGIN END*/

 	     while(tercetos.get(pila.peek()).getT2().ival==-2)/*verifico si el bloque tiene break*/
		    tercetos.get(pila.pop()).setT2(new ParserVal((double)tercetos.size()+1));/*Completo el BI del break*/

	     tercetos.get(pila.pop()).setT3(new ParserVal((double)tercetos.size()+1));/*Completo el BF del while*/
	     crearTerceto(new ParserVal(-2), new ParserVal((double)pila.pop()), new ParserVal(-1));/*-2 es BI*/
	     tercetos.get(tercetos.size()-1).setEtiqueta();
 }
break;
case 79:
#line 387 "gramatica.y"
{
					 int refTerceto = crearTerceto(new ParserVal(-1), yyvsp[-2], new ParserVal(-1));/*el primer-1 es BF*/
					 pila.push(refTerceto);
					 yyval = new ParserVal((double)refTerceto);
					}
break;
case 80:
#line 393 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia iterativa invalida"); }
break;
case 81:
#line 394 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
break;
case 82:
#line 395 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 83:
#line 396 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 84:
#line 399 "gramatica.y"
{ addEstructura( "Sentencia WHILE, en la linea: " + analizadorLexico.getNroLineaToken() );
 		 pila.push(tercetos.size());  /* agrego el indice donde salta el terceto BI que voy a crear luego*/
 		 tercetos.get(tercetos.size()-1).setEtiqueta();
 	         yyval=yyvsp[0]; }
break;
case 95:
#line 422 "gramatica.y"
{
 			addEstructura( "Sentencia BREAK, en la linea: " + analizadorLexico.getNroLineaToken() );
 			int refTerceto =crearTerceto(new ParserVal(-2), new ParserVal(-2), new ParserVal(-1));/*El primer -2 es BI, el segundo es para diferenciarlo de otros BI (luego se pisa por la dir a saltar)*/
			pila.push(refTerceto);
 }
break;
case 96:
#line 430 "gramatica.y"
{
 			 addEstructura( "Sentencia de conversion a DOUBLE, en la linea: " + analizadorLexico.getNroLineaToken() );
 			 /* le asigno al NT sentencia_conversion (usando el atributo dval), la posicion (indice de la lista tercetos) del terceto correspondiente al terceto conversion*/
 			 yyval =  new ParserVal((double)crearTerceto(new ParserVal(DOUBLE), yyvsp[-1], new ParserVal(-1)));  /* terceto que indica una conversion (DOUBLE) , con su valor a retornar en la segunda posicion , el tercer lugar queda nulo*/
 			 yyval.sval = "DOUBLE";  /* le asigno al NT sentencia_conversion (usando el atributo sval) , el valor DOUBLE correspondiente al tipo de la expresion*/
 			}
break;
case 97:
#line 436 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 98:
#line 440 "gramatica.y"
{

 		      tercetos.get(tercetos.size()-1).setEtiqueta();
 		      tercetos.get(pila.pop()).setT3(new ParserVal((double)tercetos.size()));/*Completa el BT del try*/
		     }
break;
case 99:
#line 447 "gramatica.y"
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
case 100:
#line 464 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia TRY-CATCH invalida"); }
break;
case 101:
#line 465 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia TRY-CATCH invalida"); }
break;
case 102:
#line 468 "gramatica.y"
{
 	addEstructura( "Sentencia TRY-CATCH, en la linea: " + analizadorLexico.getNroLineaToken() );
 	ultimoTry = tercetos.size()-1;/*Se guarda la referencia del ultimo tercetos antes del try*/
 }
break;
case 103:
#line 475 "gramatica.y"
{
                              if(yyvsp[-2].sval!=yyvsp[0].sval)
				addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + yyvsp[-2].sval + " + " + yyvsp[0].sval );
			      yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'+'), yyvsp[-2], yyvsp[0]));
			      yyval.sval=yyvsp[-2].sval;
 		      }
break;
case 104:
#line 481 "gramatica.y"
{
				 if(yyvsp[-2].sval!=yyvsp[0].sval)
					addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + yyvsp[-2].sval + " - " + yyvsp[0].sval );
				 yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'-'), yyvsp[-2], yyvsp[0]));
				 yyval.sval=yyvsp[-2].sval;
		      }
break;
case 105:
#line 487 "gramatica.y"
{ yyval = yyvsp[0] ; }
break;
case 106:
#line 490 "gramatica.y"
{
             if(yyvsp[-2].sval!=yyvsp[0].sval)
                   addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + yyvsp[-2].sval + " * " + yyvsp[0].sval );
	     yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'*'), yyvsp[-2], yyvsp[0]));
	     yyval.sval=yyvsp[-2].sval;
	 }
break;
case 107:
#line 496 "gramatica.y"
{
                if(yyvsp[-2].sval!=yyvsp[0].sval)
                     	addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + yyvsp[-2].sval + " / " + yyvsp[0].sval );
		yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'/'), yyvsp[-2], yyvsp[0]));
		yyval.sval=yyvsp[-2].sval;
	 }
break;
case 108:
#line 502 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 109:
#line 503 "gramatica.y"
{
		      yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'*'), new ParserVal(-1), yyvsp[0]));
		      yyval.sval=yyvsp[-1].sval;
	 }
break;
case 110:
#line 509 "gramatica.y"
{
       String auxiliar= ambitoActual;
       int ultimoPunto = 0;
       while( (!tablaSimbolo.existeToken(tablaSimbolo.obtenerToken(yyvsp[0].ival).getLexema()+'.'+auxiliar)) && (ultimoPunto>=0)){
		ultimoPunto = auxiliar.lastIndexOf('.');
		if(ultimoPunto>0)
			auxiliar = auxiliar.substring(0, ultimoPunto);
       }
       int nuevaRef = tablaSimbolo.obtenerReferenciaTabla(tablaSimbolo.obtenerToken(yyvsp[0].ival).getLexema()+'.'+auxiliar);

       if(nuevaRef == -1){ /* si la variable no fue declarada*/
		addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", variable no declarada");
       }
       else{ /* si la variable fue declarada*/
		tablaSimbolo.borrarToken(yyvsp[0].ival);/*se borra de la tabla de simbolos la variable duplicada de la sentencia*/
		yyvsp[0].ival=nuevaRef;/*se le asigna la referencia a la variable original en la tabla*/

		Token tVariable = tablaSimbolo.obtenerToken(yyvsp[0].ival);
		if(tVariable.getUso()!="variable" && tVariable.getUso()!="parametro"){
			addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", mal uso del identificador " + tVariable.getLexema());/*este error puede llegar a borrarse si ocurre el unico caso en el que el identificador tiene un buen uso*/
			indiceErrorABorrar= this.erroresSemanticos.size()-1;/*se usa para borrar el error en caso de que el uso sea correcto, es decir que se asigne correctamente a una variable de funcion designada*/
		}
       }
       yyval = yyvsp[0];   /* le asigno al NT Factor (usando el atributo ival) , la clave en tabla del simbolos que contiene el Token correspondiente al identificador (que posiblemente sea variable o parametro)*/
       yyval.sval=tablaSimbolo.obtenerToken(yyvsp[0].ival).getTipo(); /* le asigno al NT Factor (usando el atributo sval) , el valor correspondiente al tipo que posee el identificador*/
     }
break;
case 111:
#line 535 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 112:
#line 536 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 113:
#line 537 "gramatica.y"
{  yyval = yyvsp[0];            	/* le asigno al NT Factor (usando el atributo ival) , la clave en tabla del simbolos que contiene el Token correspondiente a la constante*/
                       yyval.sval="ULONG";}
break;
case 114:
#line 539 "gramatica.y"
{yyval = yyvsp[0];		   	/* le asigno al NT Factor (usando el atributo ival) , la clave en tabla del simbolos que contiene el Token correspondiente a la constante*/
                      yyval.sval="DOUBLE";}
break;
#line 1303 "y.tab.c"
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
