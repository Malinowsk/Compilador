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
   22,   39,   39,   39,   40,   41,   14,   14,   14,   42,
   42,   42,   42,   43,   43,   43,   43,   43,
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
    2,    3,    3,    2,    1,    1,    3,    3,    1,    3,
    3,    1,    2,    1,    1,    1,    1,    1,
};
short yydefred[] = {                                      0,
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
short yydgoto[] = {                                       3,
    4,   10,   19,   11,   12,   96,   17,   14,   15,  101,
  154,  195,   97,   68,   69,   31,   32,   33,   34,   35,
   36,   37,   70,   38,   60,  109,   39,   71,  127,  123,
   40,   41,   85,   42,  134,  135,   87,   72,   43,   44,
   92,   73,   74,
};
short yysindex[] = {                                   -219,
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
short yyrindex[] = {                                      0,
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
short yygindex[] = {                                      0,
    0,  361,  334,  360,    0,   78,    8,    0,    0,    0,
    0,    0,  119,  -44,  -28,   23,  -22,  -14,  -29,  -13,
  -10,   -2,    0,    0,  274,    0,    0,    0,    0,    0,
    0,    0,    0,    0,  246,  341,    0,    0,    0,    0,
    0,   94,  -45,
};
#define YYTABLESIZE 383
short yytable[] = {                                     213,
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
short yycheck[] = {                                      40,
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
#line 294 "gramatica.y"

///CODIGO JAVA

private AnalizadorLexico analizadorLexico;
private ArrayList<String> estructuras = new ArrayList<String>(); //Lista de las estructuras detectadas por el parser
private ArrayList<String> errores = new ArrayList<String>(); //Lista de errores sintacticos detectados por el parser

private ArrayList<Terceto> tercetos = new ArrayList<Terceto>(); //Lista de tercetos generados
private Stack<Integer> pila = new Stack<Integer>(); //Pila utilizada para los tercetos

private HashMap<Integer, Integer> postCondiciones = new HashMap<Integer, Integer>();//Hashmap utilizado para guardar el id de las funciones junto a las referencias de sus postcondicion
private Stack<Integer> pilaFunciones = new Stack<Integer>(); //Pila utilizada para guardar los identificadores de las funciones

boolean hayCall = false;//variable para que el try catch sepa si hay un call dentro

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
#line 479 "y.tab.c"
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
{ addEstructura( "Declaracion de programa, en la linea: " + analizadorLexico.getNroLineaToken() );}
break;
case 3:
#line 20 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", identificador de programa invalido"); }
break;
case 7:
#line 30 "gramatica.y"
{ addEstructura( "Declaracion de variables, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 8:
#line 31 "gramatica.y"
{ addEstructura( "Declaracion de funciones como variables, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 10:
#line 33 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", tipo de variable invalido"); }
break;
case 11:
#line 34 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", declaracion invalida"); }
break;
case 12:
#line 35 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 13:
#line 36 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", tipo de variable invalido"); }
break;
case 14:
#line 37 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 15:
#line 40 "gramatica.y"
{pilaFunciones.pop();}
break;
case 17:
#line 44 "gramatica.y"
{
 			 addEstructura( "Declaracion de funcion, en la linea: " + analizadorLexico.getNroLineaToken() );
 			 pilaFunciones.push(yyvsp[-3].ival);/*se guarda el id en la pila para la postcondicion*/
 			}
break;
case 18:
#line 48 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", declaracion invalida"); }
break;
case 19:
#line 49 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", identificador invalido"); }
break;
case 20:
#line 50 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", parametro invalido"); }
break;
case 21:
#line 51 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 22:
#line 52 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 24:
#line 58 "gramatica.y"
{ addEstructura( "Sentencia RETURN, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 25:
#line 59 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 26:
#line 60 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 27:
#line 61 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 28:
#line 62 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 29:
#line 65 "gramatica.y"
{
 			postCondiciones.put(pilaFunciones.pop(), tercetos.size()-1);/*Se guarda en el hashmap la posicion del terceto de condicion con la clave= ID de la funcion*/
 			addEstructura( "Sentencia POST, en la linea: " + analizadorLexico.getNroLineaToken() ); /*¡POSTCONDICION_VAR= $3.ival?*/}
break;
case 30:
#line 68 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
break;
case 31:
#line 69 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta :"); }
break;
case 32:
#line 70 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 33:
#line 71 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 34:
#line 72 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 48:
#line 100 "gramatica.y"
{
 		       addEstructura( "Sentencia de asignacion, en la linea: " + analizadorLexico.getNroLineaToken() );
		       yyval = new ParserVal(crearTerceto(ASIG, yyvsp[-3].ival, yyvsp[-1].ival));
		      }
break;
case 49:
#line 104 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia asignacion invalida"); }
break;
case 50:
#line 105 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 51:
#line 108 "gramatica.y"
{
 			    addEstructura( "Sentencia de llamado a funcion, en la linea: " + analizadorLexico.getNroLineaToken() );
 			    hayCall = true;
 			    yyval = new ParserVal(crearTerceto(CALL, yyvsp[-3].ival, yyvsp[-1].ival));
 			   }
break;
case 52:
#line 113 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 53:
#line 116 "gramatica.y"
{
 			 tercetos.get(pila.pop()).setT3(tercetos.size());
 			}
break;
case 54:
#line 119 "gramatica.y"
{
			 tercetos.get(pila.pop()).setT2(tercetos.size());
			}
break;
case 55:
#line 124 "gramatica.y"
{
	tercetos.get(pila.pop()).setT3(tercetos.size()+1);
	int refTerceto =crearTerceto(-2, -1, -1);/*-2 es BI*/
	pila.push(refTerceto);
	yyval = new ParserVal(refTerceto);
	}
break;
case 56:
#line 133 "gramatica.y"
{
 					 int refTerceto = crearTerceto(-1, yyvsp[-2].ival, -1);/*el primer-1 es BF*/
					 pila.push(refTerceto);
 					 yyval = new ParserVal(refTerceto);
 					 }
break;
case 57:
#line 138 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
break;
case 58:
#line 139 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 59:
#line 140 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 60:
#line 141 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia condicional invalida"); }
break;
case 61:
#line 144 "gramatica.y"
{addEstructura( "Sentencia IF, en la linea: " + analizadorLexico.getNroLineaToken() );
 	  yyval = yyvsp[0];}
break;
case 62:
#line 148 "gramatica.y"
{
	  	yyval = new ParserVal(crearTerceto(yyvsp[-1].ival, yyvsp[-2].ival, yyvsp[0].ival));
	  	}
break;
case 63:
#line 151 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 64:
#line 154 "gramatica.y"
{
			yyval = new ParserVal(crearTerceto(yyvsp[-1].ival, yyvsp[-2].ival, yyvsp[0].ival));
			}
break;
case 65:
#line 159 "gramatica.y"
{yyval.ival = COMP_MAYOR_IGUAL;}
break;
case 66:
#line 160 "gramatica.y"
{yyval.ival = COMP_MENOR_IGUAL;}
break;
case 67:
#line 161 "gramatica.y"
{yyval.ival = COMP_IGUAL;}
break;
case 68:
#line 162 "gramatica.y"
{yyval.ival = COMP_DISTINTO;}
break;
case 69:
#line 163 "gramatica.y"
{yyval.ival = '<';}
break;
case 70:
#line 164 "gramatica.y"
{yyval.ival = '>';}
break;
case 71:
#line 167 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 72:
#line 168 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 75:
#line 175 "gramatica.y"
{crearTerceto(yyvsp[-4].ival, yyvsp[-2].ival, -1);}
break;
case 76:
#line 176 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", cadena invalida"); }
break;
case 77:
#line 177 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 78:
#line 178 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 79:
#line 179 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia PRINT invalida"); }
break;
case 80:
#line 182 "gramatica.y"
{
 		addEstructura( "Sentencia PRINT, en la linea: " + analizadorLexico.getNroLineaToken() );
 		yyval = yyvsp[0];
 		}
break;
case 81:
#line 188 "gramatica.y"
{
							     tercetos.get(pila.pop()).setT3(tercetos.size()+1);/*Se modifica el BF, agregandole la referencia correspondiente al proximo terceto despues de la ultima sentencia del bloque*/
							     int refTerceto = crearTerceto(-2, pila.pop(), -1);/*-2 es BI, se crea un BI al terceto que calcula la condicion del while*/
							    }
break;
case 82:
#line 194 "gramatica.y"
{
					 int refTerceto = crearTerceto(-1, yyvsp[-2].ival, -1);/*el primer-1 es BF*/
					 pila.push(refTerceto);
					 yyval = new ParserVal(refTerceto);
					}
break;
case 83:
#line 199 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia iterativa invalida"); }
break;
case 84:
#line 200 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
break;
case 85:
#line 201 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 86:
#line 202 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 87:
#line 204 "gramatica.y"
{ addEstructura( "Sentencia WHILE, en la linea: " + analizadorLexico.getNroLineaToken() );
 		 pila.push(tercetos.size());
 	         yyval=yyvsp[0]; }
break;
case 98:
#line 225 "gramatica.y"
{ addEstructura( "Sentencia BREAK, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 99:
#line 228 "gramatica.y"
{
 			 addEstructura( "Sentencia de conversion a DOUBLE, en la linea: " + analizadorLexico.getNroLineaToken() );
 			 yyval =  new ParserVal(crearTerceto(DOUBLE, yyvsp[-1].ival, -1));
 			}
break;
case 100:
#line 232 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 101:
#line 235 "gramatica.y"
{
 		      int t = pila.pop();
 		      if(tercetos.get(t).getT1()==-3) /*habia llamado a funcion en el try*/
		      	tercetos.get(t).setT3(tercetos.size());/*Completa el BT del try*/
		      else
		      	tercetos.get(t).setT2(tercetos.size());/*Completa el BI del try*/
		     }
break;
case 102:
#line 244 "gramatica.y"
{
 		  /*Primero buscamos el id de la funcion invocada en el try recorriendo la lista de tercetos*/
 		  if(hayCall){
			  int i = tercetos.size()-1;
			  while( (tercetos.get(i).getT1() != CALL) )
				i--;
			  pila.push(crearTerceto(-3, postCondiciones.get(tercetos.get(i).getT2()), -1));/*el primer -3 es BT, el 2do parametro hace referencia al ID de la funcion invocada*/
		  }
		  else /*si no se llamo a una funcion es salto incondicional*/
		  	pila.push(crearTerceto(-2, -1, -1));
		 }
break;
case 103:
#line 255 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia TRY-CATCH invalida"); }
break;
case 104:
#line 256 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia TRY-CATCH invalida"); }
break;
case 105:
#line 259 "gramatica.y"
{ addEstructura( "Sentencia TRY-CATCH, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 106:
#line 262 "gramatica.y"
{yyval=yyvsp[0];}
break;
case 107:
#line 265 "gramatica.y"
{
							  yyval = new ParserVal(crearTerceto('+', yyvsp[-2].ival, yyvsp[0].ival));
 							 }
break;
case 108:
#line 268 "gramatica.y"
{
		  				         yyval = new ParserVal(crearTerceto('-', yyvsp[-2].ival, yyvsp[0].ival));
						        }
break;
case 109:
#line 271 "gramatica.y"
{ yyval = yyvsp[0] ; }
break;
case 110:
#line 274 "gramatica.y"
{
			     yyval = new ParserVal(crearTerceto('*', yyvsp[-2].ival, yyvsp[0].ival));
			     }
break;
case 111:
#line 277 "gramatica.y"
{
			     yyval = new ParserVal(crearTerceto('/', yyvsp[-2].ival, yyvsp[0].ival));
			     }
break;
case 112:
#line 280 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 113:
#line 281 "gramatica.y"
{
		      yyval = new ParserVal(crearTerceto('*', -1, yyvsp[0].ival));
		      }
break;
case 114:
#line 286 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 115:
#line 287 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 116:
#line 288 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 117:
#line 289 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 118:
#line 290 "gramatica.y"
{yyval = yyvsp[0];}
break;
#line 1034 "y.tab.c"
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
