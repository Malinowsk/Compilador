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
   20,   21,   21,   26,   26,   22,   22,   29,   27,   27,
   27,   27,   27,   30,   18,   18,   31,   33,   33,   33,
   33,   33,   33,   32,   32,   28,   28,   23,   23,   23,
   23,   23,   34,   24,   35,   35,   35,   35,   35,   37,
   36,   36,   38,   38,   39,   39,   39,   39,   39,   39,
   40,   41,   41,   25,   42,   42,   42,   43,   44,   44,
   44,   44,   17,   17,   17,   45,   45,   45,   45,   46,
   46,   46,   46,   46,
};
short yylen[] = {                                         2,
    3,    2,    2,    1,    3,    2,    2,    6,    1,    2,
    3,    5,    6,    5,    6,    7,    6,    6,    6,    6,
    5,    5,    2,    1,    3,    2,    2,    5,    5,    4,
    4,    2,    6,    6,    5,    4,    4,    2,    1,    1,
    3,    1,    3,    1,    2,    1,    1,    1,    1,    1,
    1,    4,    3,    5,    6,    4,    6,    1,    5,    5,
    4,    4,    6,    1,    3,    1,    3,    1,    1,    1,
    1,    1,    1,    1,    1,    3,    1,    5,    5,    4,
    4,    3,    1,    2,    5,    5,    5,    4,    4,    1,
    3,    1,    2,    1,    1,    1,    1,    1,    1,    1,
    2,    4,    4,    2,    3,    3,    2,    1,    1,    1,
    1,    1,    3,    3,    1,    3,    3,    1,    2,    1,
    1,    1,    1,    1,
};
short yydefred[] = {                                      0,
    0,    0,    0,    0,    3,    2,    0,   39,   40,    0,
    4,    0,    0,    9,    0,    0,   10,    0,    1,    0,
    0,    0,    7,    0,    0,   24,    0,    0,   64,   83,
   90,    0,  108,    0,    0,   47,   48,   49,   50,   51,
    0,    0,    0,    0,    0,    0,    0,    5,    0,   11,
    0,    0,    0,    0,   27,    0,    0,   41,    0,    0,
   43,   45,    0,   77,    0,    0,  120,  123,  124,    0,
    0,    0,    0,    0,  122,    0,  121,    0,  118,    0,
    0,    0,    0,    0,   95,   96,   97,   98,   99,   84,
   92,  100,    0,    0,  104,  109,  110,  111,  112,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,   44,
   25,   53,    0,    0,   58,    0,    0,    0,    0,    0,
    0,  119,   68,   69,   70,   71,   72,   73,    0,    0,
    0,    0,   74,   75,    0,    0,    0,   82,    0,    0,
    0,    0,    0,  101,    0,    0,    0,  106,  105,    0,
    0,    0,    0,   23,   21,    0,    0,   14,   12,    0,
    0,    0,   52,   76,   56,    0,    0,    0,    0,    0,
   61,    0,    0,    0,    0,   62,   65,  116,  117,   81,
    0,   80,    0,   91,   93,    0,   88,    0,   89,   18,
   19,   20,   17,   13,    8,   32,    0,    0,    0,   15,
    0,    0,    0,  103,  102,    0,    0,   60,    0,   59,
   79,   78,   87,   86,   85,    0,    0,    0,   38,    0,
    0,    0,   16,   57,    0,   54,   63,    0,   30,    0,
   31,    0,    0,    0,   55,   29,   28,   37,    0,    0,
    0,   36,   35,    0,    0,   34,   33,
};
short yydgoto[] = {                                       3,
    4,   10,   19,   11,   12,  104,   17,   14,   15,   25,
  109,  162,  202,  105,   26,   27,   73,   74,   34,   35,
   36,   37,   38,   39,   40,   75,   41,   65,  117,   42,
   76,  135,  131,   43,   44,   90,   45,  142,  143,   92,
   77,   46,   47,  100,   78,   79,
};
short yysindex[] = {                                   -160,
  -58,  -20,    0,  -82,    0,    0, -264,    0,    0, -241,
    0,   -4, -118,    0,  -75,   14,    0, -126,    0,  -82,
 -193,    3,    0, -264, -131,    0,   77, -264,    0,    0,
    0, -240,    0, -119, -126,    0,    0,    0,    0,    0,
 -164,  -37,  -36, -127,  -25, -241, -163,    0,  163,    0,
  113,  -38,  -77,  125,    0, -126,  -75,    0,  117,   71,
    0,    0, -126,    0,  -45,  144,    0,    0,    0,  -72,
   40,  -97,   29,  171,    0,  -59,    0,  105,    0,  164,
  184, -239, -112,  173,    0,    0,    0,    0,    0,    0,
    0,    0,   43,  186,    0,    0,    0,    0,    0, -235,
  -75,  -75,  -73,  -44,  193,  209,  -31, -264, -134,    0,
    0,    0,  118,  -14,    0,  196, -164,   56,  228,  231,
  -32,    0,    0,    0,    0,    0,    0,    0,   71,   71,
   71,   15,    0,    0,   71,  -97,  -97,    0,  215,  236,
   62,   13, -112,    0,  238,  -35,   21,    0,    0,  243,
  256,  257,  263,    0,    0, -264, -264,    0,    0,  246,
  -21, -173,    0,    0,    0,   46,  266,   66,   59,   51,
    0,  -89,  105,  105,  168,    0,    0,    0,    0,    0,
  251,    0,  255,    0,    0,   53,    0, -221,    0,    0,
    0,    0,    0,    0,    0,    0,   74,  156,  267,    0,
  -40,   64,  272,    0,    0,  275,  161,    0,  273,    0,
    0,    0,    0,    0,    0,  299,  119,  286,    0,   71,
  306,  313,    0,    0,  288,    0,    0,  301,    0,  302,
    0,   69,   87,  303,    0,    0,    0,    0,  304,  317,
  326,    0,    0,  309,  311,    0,    0,
};
short yyrindex[] = {                                      0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,  312,    0,    0,    0,  109,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,  -67,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,  312,    0,
    0,    0,    0,    0,    0,    0,  112,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,  -34,    0,   -9,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,  114,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,  115,    0,    0,    0,    0,    0,    0,    0,
    0,    0,  -46,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,   11,   18,   99,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,
};
short yygindex[] = {                                      0,
    0,    0,  331,  359,    0,   42,   16,    0,    0,    0,
    0,    0,    0,  107,  324,    0,  -49,  -33,   12,  -27,
  -17,  -16,   -2,   32,  -18,    0,    0,  265,    0,    0,
    0,    0,    0,    0,    0,    0,    0,  240,  340,    0,
    0,    0,    0,    0,   89,  -50,
};
#define YYTABLESIZE 384
short yytable[] = {                                     220,
    5,  103,   71,   82,   72,  188,   66,   72,  172,  157,
  113,   94,   16,   64,   93,   59,  140,  221,  197,   72,
  148,  122,   18,   72,   66,   89,   85,   86,   23,   96,
   97,  115,   60,  115,  214,  115,   50,  121,    6,   55,
  141,   87,   53,   58,   98,   13,   62,  149,  215,  115,
  115,  113,  115,  113,   20,  113,   24,   28,  114,  146,
  114,   13,  114,   54,   89,   85,   86,  110,  168,  113,
  113,  129,  113,  130,  114,   88,  114,  114,   99,  114,
   87,  175,  199,   49,   72,  178,  179,   72,  127,   64,
  128,  200,   29,   29,  107,    1,   30,   30,   24,   63,
   72,  177,  183,   72,   31,   31,  205,  201,  129,  239,
  130,  198,   32,   32,   88,   72,    2,   33,   72,  207,
  182,  160,  158,  159,   89,   85,   86,  238,  161,   29,
   29,   72,   56,   30,   30,   57,   83,   21,   84,   67,
   87,   31,   31,   22,   29,   61,  136,  217,   30,   32,
   32,  137,  102,   84,   33,   33,   31,   67,   16,  230,
  129,  129,  130,  130,   32,  108,  209,  222,  210,   33,
   66,  194,  195,    7,   88,  112,  163,  229,  106,   67,
   68,   69,  152,  118,    8,    9,  232,   70,   46,    8,
    9,    8,    9,    8,    9,   46,  218,   46,  129,  241,
  130,  226,  101,  129,  119,  130,   28,  150,  151,  153,
  129,  132,  130,  115,  116,  133,  134,  173,  174,   80,
   22,   22,  138,   66,  139,  171,  147,   66,    8,    9,
   66,  144,  154,  155,  187,   66,   67,   68,   69,   67,
   68,   69,   66,   81,   70,   16,   66,   70,  115,  156,
  164,   67,   68,   69,  165,   67,   68,   69,   51,   70,
  115,  115,  115,   70,  115,  115,  115,  169,  113,    8,
    9,  170,  176,  180,  115,  114,  181,  184,  186,   52,
  113,  113,  113,  190,  113,  113,  113,  114,  114,  114,
  189,  114,  114,  114,  113,  120,  191,  192,  145,  123,
  124,  114,  125,  193,  196,  203,  204,   66,  208,  211,
   66,  167,  126,  212,  206,  225,   67,   68,   69,   67,
   68,   69,  213,   66,   70,  219,   66,   70,  223,  216,
  224,  227,   67,   68,   69,   67,   68,   69,   66,  228,
   70,   66,  240,   70,  231,  233,  235,   67,   68,   69,
   67,   68,   69,  234,   66,   70,   67,  244,   70,  236,
  237,  242,  243,   67,   68,   69,  245,  246,   67,  247,
   42,   70,    6,   67,   67,   26,   95,  107,   48,   94,
  111,  166,  185,   91,
};
short yycheck[] = {                                      40,
   59,   40,   40,   40,   45,   41,   41,   45,   41,   41,
   60,   45,  277,   41,   40,  256,  256,   58,   40,   45,
  256,   72,  264,   45,   59,   44,   44,   44,   13,   47,
   47,   41,  273,   43,  256,   45,   21,   71,   59,   24,
  280,   44,   40,   28,   47,    4,   35,  283,  270,   59,
   60,   41,   62,   43,   59,   45,   15,   44,   41,   93,
   43,   20,   45,   22,   83,   83,   83,   56,  118,   59,
   60,   43,   62,   45,   63,   44,   59,   60,   47,   62,
   83,  131,  256,  277,   45,  136,  137,   45,   60,  117,
   62,  265,  257,  257,   53,  256,  261,  261,   57,  264,
   45,  135,   41,   45,  269,  269,   41,  281,   43,   41,
   45,  161,  277,  277,   83,   45,  277,  282,   45,  169,
   59,  256,  107,  108,  143,  143,  143,   59,  263,  257,
  257,   45,  264,  261,  261,   59,  264,  256,  266,   41,
  143,  269,  269,  262,  257,  265,   42,  197,  261,  277,
  277,   47,   40,  266,  282,  282,  269,   59,  277,   41,
   43,   43,   45,   45,  277,   41,  256,  201,  258,  282,
  268,  156,  157,  256,  143,   59,   59,   59,  256,  277,
  278,  279,  256,   40,  267,  268,  220,  285,  256,  267,
  268,  267,  268,  267,  268,  263,   41,  265,   43,  233,
   45,   41,   40,   43,  277,   45,   44,  101,  102,  103,
   43,   41,   45,  259,  260,  275,  276,  129,  130,  256,
  267,  268,   59,  258,   41,  258,   41,  268,  267,  268,
  268,   59,  277,   41,  270,  270,  277,  278,  279,  277,
  278,  279,  268,  280,  285,  277,  268,  285,  258,   41,
  265,  277,  278,  279,   59,  277,  278,  279,  256,  285,
  270,  271,  272,  285,  274,  275,  276,   40,  258,  267,
  268,   41,  258,   59,  284,  258,   41,  265,   41,  277,
  270,  271,  272,   41,  274,  275,  276,  270,  271,  272,
  270,  274,  275,  276,  284,  256,   41,   41,  256,  271,
  272,  284,  274,   41,   59,  260,   41,  268,  258,   59,
  268,  256,  284,   59,  256,   41,  277,  278,  279,  277,
  278,  279,  270,  268,  285,   59,  268,  285,  265,  256,
   59,   59,  277,  278,  279,  277,  278,  279,  268,   41,
  285,  268,  256,  285,   59,   40,   59,  277,  278,  279,
  277,  278,  279,   41,  268,  285,  258,   41,  285,   59,
   59,   59,   59,  277,  278,  279,   41,   59,  270,   59,
   59,  285,  264,  275,  276,  264,   46,  264,   20,  265,
   57,  117,  143,   44,
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
#line 484 "y.tab.c"
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
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", tipo de variable invalida"); }
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
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
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
#line 113 "gramatica.y"
{
 			    addEstructura( "Sentencia de llamado a funcion, en la linea: " + analizadorLexico.getNroLineaToken() );
 			    yyval =  new ParserVal(crearTerceto(CALL, yyvsp[-3].ival, yyvsp[-1].ival));
 			   }
break;
case 55:
#line 117 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 56:
#line 120 "gramatica.y"
{
 			 tercetos.get(pila.pop()).setT3(tercetos.size());
 			}
break;
case 57:
#line 123 "gramatica.y"
{
			 tercetos.get(pila.pop()).setT2(tercetos.size());
			}
break;
case 58:
#line 128 "gramatica.y"
{
	tercetos.get(pila.pop()).setT3(tercetos.size()+1);
	int refTerceto =crearTerceto(-2, -1, -1);/*-2 es BI*/
	pila.push(refTerceto);
	yyval = new ParserVal(refTerceto);
	}
break;
case 59:
#line 137 "gramatica.y"
{
 					 int refTerceto = crearTerceto(-1, yyvsp[-2].ival, -1);/*el primer-1 es BF*/
					 pila.push(refTerceto);
 					 yyval = new ParserVal(refTerceto);
 					 }
break;
case 60:
#line 142 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
break;
case 61:
#line 143 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 62:
#line 144 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 63:
#line 145 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia condicional invalida"); }
break;
case 64:
#line 148 "gramatica.y"
{addEstructura( "Sentencia IF, en la linea: " + analizadorLexico.getNroLineaToken() );
 	  yyval = yyvsp[0];}
break;
case 65:
#line 152 "gramatica.y"
{
	  	yyval = new ParserVal(crearTerceto(yyvsp[-1].ival, yyvsp[-2].ival, yyvsp[0].ival));
	  	}
break;
case 66:
#line 155 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 67:
#line 158 "gramatica.y"
{
			yyval = new ParserVal(crearTerceto(yyvsp[-1].ival, yyvsp[-2].ival, yyvsp[0].ival));
			}
break;
case 68:
#line 163 "gramatica.y"
{yyval.ival = COMP_MAYOR_IGUAL;}
break;
case 69:
#line 164 "gramatica.y"
{yyval.ival = COMP_MENOR_IGUAL;}
break;
case 70:
#line 165 "gramatica.y"
{yyval.ival = COMP_IGUAL;}
break;
case 71:
#line 166 "gramatica.y"
{yyval.ival = COMP_DISTINTO;}
break;
case 72:
#line 167 "gramatica.y"
{yyval.ival = '<';}
break;
case 73:
#line 168 "gramatica.y"
{yyval.ival = '>';}
break;
case 74:
#line 171 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 75:
#line 172 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 79:
#line 180 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", cadena invalida"); }
break;
case 80:
#line 181 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 81:
#line 182 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 82:
#line 183 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia PRINT invalida"); }
break;
case 83:
#line 187 "gramatica.y"
{ addEstructura( "Sentencia PRINT, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 84:
#line 190 "gramatica.y"
{
							     tercetos.get(pila.pop()).setT3(tercetos.size()+1);/*Se modifica el BF, agregandole la referencia correspondiente al proximo terceto despues de la ultima sentencia del bloque*/
							     int refTerceto = crearTerceto(-2, pila.pop(), -1);/*-2 es BI, se crea un BI al terceto que calcula la condicion del while*/
							    }
break;
case 85:
#line 196 "gramatica.y"
{
					 int refTerceto = crearTerceto(-1, yyvsp[-2].ival, -1);/*el primer-1 es BF*/
					 pila.push(refTerceto);
					 yyval = new ParserVal(refTerceto);
					}
break;
case 86:
#line 201 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia iterativa invalida"); }
break;
case 87:
#line 202 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
break;
case 88:
#line 203 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 89:
#line 204 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 90:
#line 206 "gramatica.y"
{ addEstructura( "Sentencia WHILE, en la linea: " + analizadorLexico.getNroLineaToken() );
 		 pila.push(tercetos.size());
 	         yyval=yyvsp[0]; }
break;
case 101:
#line 227 "gramatica.y"
{ addEstructura( "Sentencia BREAK, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 102:
#line 230 "gramatica.y"
{
 			 addEstructura( "Sentencia de conversion a DOUBLE, en la linea: " + analizadorLexico.getNroLineaToken() );
 			 yyval =  new ParserVal(crearTerceto(DOUBLE, yyvsp[-1].ival, -1));
 			}
break;
case 103:
#line 234 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 104:
#line 237 "gramatica.y"
{
		      /*tercetos.get(pila.pop()).setT3(tercetos.size());*/
		     }
break;
case 105:
#line 242 "gramatica.y"
{
		  /*pila.push(crearTerceto(-1, ¿POSTCONDICION_VAR?, -1));//el primer -1 es BF*/
		 }
break;
case 106:
#line 245 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia TRY-CATCH invalida"); }
break;
case 107:
#line 246 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia TRY-CATCH invalida"); }
break;
case 108:
#line 249 "gramatica.y"
{ addEstructura( "Sentencia TRY-CATCH, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 113:
#line 258 "gramatica.y"
{
							  yyval = new ParserVal(crearTerceto('+', yyvsp[-2].ival, yyvsp[0].ival));
 							 }
break;
case 114:
#line 261 "gramatica.y"
{
		  				         yyval = new ParserVal(crearTerceto('-', yyvsp[-2].ival, yyvsp[0].ival));
						        }
break;
case 115:
#line 264 "gramatica.y"
{ yyval = yyvsp[0] ; }
break;
case 116:
#line 267 "gramatica.y"
{
			     yyval = new ParserVal(crearTerceto('*', yyvsp[-2].ival, yyvsp[0].ival));
			     }
break;
case 117:
#line 270 "gramatica.y"
{
			     yyval = new ParserVal(crearTerceto('/', yyvsp[-2].ival, yyvsp[0].ival));
			     }
break;
case 118:
#line 273 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 119:
#line 274 "gramatica.y"
{
		      yyval = new ParserVal(crearTerceto('*', -1, yyvsp[0].ival));
		      }
break;
case 120:
#line 279 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 121:
#line 280 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 122:
#line 281 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 123:
#line 282 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 124:
#line 283 "gramatica.y"
{yyval = yyvsp[0];}
break;
#line 1006 "y.tab.c"
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
