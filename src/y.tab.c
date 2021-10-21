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
   20,   21,   21,   26,   26,   26,   26,   22,   22,   29,
   27,   27,   27,   27,   27,   30,   18,   18,   31,   33,
   33,   33,   33,   33,   33,   32,   32,   28,   28,   23,
   23,   23,   23,   23,   34,   24,   35,   35,   35,   35,
   35,   37,   36,   36,   38,   38,   39,   39,   39,   39,
   39,   39,   40,   41,   41,   41,   41,   25,   25,   25,
   42,   43,   43,   43,   43,   17,   17,   17,   44,   44,
   44,   44,   45,   45,   45,   45,   45,
};
short yylen[] = {                                         2,
    3,    2,    2,    1,    3,    2,    2,    6,    1,    2,
    3,    5,    6,    5,    6,    7,    6,    6,    6,    6,
    5,    5,    2,    1,    3,    2,    2,    5,    5,    4,
    4,    2,    6,    6,    5,    4,    4,    2,    1,    1,
    3,    1,    3,    1,    2,    1,    1,    1,    1,    1,
    1,    4,    3,    6,    6,    5,    5,    4,    6,    1,
    5,    5,    4,    4,    6,    1,    3,    1,    3,    1,
    1,    1,    1,    1,    1,    1,    1,    3,    1,    5,
    5,    4,    4,    3,    1,    2,    5,    5,    5,    4,
    4,    1,    3,    1,    2,    1,    1,    1,    1,    1,
    1,    1,    2,    5,    5,    4,    4,    4,    4,    3,
    1,    1,    1,    1,    1,    3,    3,    1,    3,    3,
    1,    2,    1,    1,    1,    1,    1,
};
short yydefred[] = {                                      0,
    0,    0,    0,    0,    3,    2,    0,   39,   40,    0,
    4,    0,    0,    9,    0,    0,   10,    0,    1,    0,
    0,    0,    7,    0,    0,   24,    0,    0,   66,   85,
   92,    0,  111,    0,    0,   47,   48,   49,   50,   51,
    0,    0,    0,    0,    0,    0,    5,    0,   11,    0,
    0,    0,    0,   27,    0,    0,   41,    0,    0,   43,
   45,    0,   79,    0,    0,  123,  126,  127,    0,    0,
    0,    0,    0,  125,    0,  124,    0,  121,    0,    0,
    0,    0,    0,   97,   98,   99,  100,  101,   86,   94,
  102,    0,    0,  112,  113,  114,  115,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,   44,   25,   53,
    0,    0,   60,    0,    0,    0,    0,    0,    0,    0,
  122,   70,   71,   72,   73,   74,   75,    0,    0,    0,
    0,   76,   77,    0,    0,    0,   84,    0,    0,    0,
    0,    0,  103,    0,    0,    0,    0,    0,  110,    0,
    0,    0,    0,   23,   21,    0,    0,   14,   12,    0,
    0,    0,   52,   78,   58,    0,    0,    0,    0,    0,
    0,    0,   63,    0,    0,    0,    0,   64,   67,  119,
  120,   83,    0,   82,    0,   93,   95,    0,   90,    0,
   91,  109,  108,   18,   19,   20,   17,   13,    8,   32,
    0,    0,    0,   15,    0,    0,    0,    0,  106,    0,
  107,    0,    0,    0,   62,    0,   61,   81,   80,   89,
   88,   87,    0,    0,    0,   38,    0,    0,    0,   16,
   59,  105,  104,    0,   56,    0,   57,   65,    0,   30,
    0,   31,    0,    0,    0,   55,   54,   29,   28,   37,
    0,    0,    0,   36,   35,    0,    0,   34,   33,
};
short yydgoto[] = {                                       3,
    4,   10,   19,   11,   12,  102,   17,   14,   15,   25,
  107,  162,  206,  103,   26,   27,   72,   73,   34,   35,
   36,   37,   38,   39,   40,   74,   41,   64,  115,   42,
   75,  134,  130,   43,   44,   89,   45,  141,  142,   91,
   76,   46,   98,   77,   78,
};
short yysindex[] = {                                   -205,
  -47,  -19,    0,  -83,    0,    0, -249,    0,    0, -214,
    0,   22, -239,    0, -122,   57,    0,  -79,    0,  -83,
 -155,   92,    0, -249, -154,    0,   69, -249,    0,    0,
    0, -157,    0, -124,  -79,    0,    0,    0,    0,    0,
 -127,  -37,  -36,  -90,  -25,  -62,    0,   89,    0,  111,
  -38,  -51,  113,    0,  -79, -122,    0,   98,  114,    0,
    0,  -79,    0,  -96,  -21,    0,    0,    0, -102,   68,
  129,   49,  140,    0, -106,    0,  101,    0,  127,  150,
 -245,  -89,  138,    0,    0,    0,    0,    0,    0,    0,
    0,   72,  169,    0,    0,    0,    0, -210, -122, -122,
   70,  -65,  184,  208,  -31, -249, -194,    0,    0,    0,
   93,  -15,    0,  192, -127,   86,  220,   -9,  214,  -32,
    0,    0,    0,    0,    0,    0,    0,  114,  114,  114,
   17,    0,    0,  114,  129,  129,    0,  218,  226,    4,
   20,  -89,    0,  239,  -35,   12, -214, -214,    0,  248,
  255,  262,  264,    0,    0, -249, -249,    0,    0,  250,
   -6, -158,    0,    0,    0,   51,  275,   15,  263,   99,
  261,   67,    0, -167,  101,  101,  151,    0,    0,    0,
    0,    0,  270,    0,  271,    0,    0,   61,    0, -135,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
  102,  267,  273,    0,  -40,   74,  276,  282,    0,  284,
    0,  293,  163,  285,    0,  297,    0,    0,    0,    0,
    0,    0,  311,  168,  302,    0,  114,  322,  325,    0,
    0,    0,    0,  309,    0,  313,    0,    0,  315,    0,
  316,    0,   36,  117,  324,    0,    0,    0,    0,    0,
  327,  347,  348,    0,    0,  331,  339,    0,    0,
};
short yyrindex[] = {                                      0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,  341,    0,    0,    0,  137,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,  -42,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,  341,    0,    0,
    0,    0,    0,    0,    0,  139,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,  -34,    0,   16,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,  144,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,  -66,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,   23,   43,    8,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,
};
short yygindex[] = {                                      0,
    0,    0,  -77,  384,    0,  104,    9,    0,    0,    0,
    0,    0,    0,  133,  349,    0,  -12,  -44,   65,  -28,
  -30,  -17,   -3,   -2,   11,    0,    0,  295,    0,    0,
    0,    0,    0,    0,    0,    0,    0,  269,  368,    0,
    0,    0,    0,   90,  -39,
};
#define YYTABLESIZE 414
short yytable[] = {                                     227,
   93,  101,   70,   81,   71,  190,   68,   71,  174,  157,
  139,    5,   63,   84,   92,   94,   21,  228,  116,   71,
  149,   23,   22,   71,   68,  120,   85,   16,   95,   49,
  170,  121,   54,  201,  140,   71,   57,   16,   71,    6,
   86,   87,   96,   97,  185,  147,  111,  145,   69,   18,
    1,   84,  117,   18,   88,  210,  118,  128,  118,  129,
  118,  160,  184,  116,   85,  116,   69,  116,  161,  192,
  193,    2,  148,  209,  118,  118,  251,  118,   86,   87,
   20,  116,  116,  117,  116,  117,   63,  117,  216,  179,
  217,  128,   88,  129,  250,  180,  181,  203,   58,   61,
   28,  117,  117,  168,  117,  171,  204,   13,  126,   55,
  127,   84,   71,  158,  159,   59,   71,  177,   24,  108,
  221,   48,  205,   13,   85,   53,  112,   56,   99,   29,
   71,   52,   28,   30,  222,  128,   62,  129,   86,   87,
   60,   31,  135,   71,    8,    9,   71,  136,  202,   32,
  100,  163,   88,  106,   33,  105,  110,  213,   71,   24,
  229,   71,  113,  114,  198,  199,   29,   29,  132,  133,
   30,   30,    7,   82,  118,   83,   83,   29,   31,   31,
  131,   30,  243,    8,    9,  137,   32,   32,  224,   31,
  138,   33,   33,  128,   29,  129,  143,   32,   30,  253,
   22,   22,   33,  236,  104,  128,   31,  129,  241,  146,
  128,  154,  129,   46,   32,    8,    9,  175,  176,   79,
   46,  235,   46,   68,  155,  173,  240,   65,    8,    9,
   65,  150,  151,  153,  189,   68,   66,   67,   68,   66,
   67,   68,   65,   80,   69,   16,   65,   69,  156,  164,
  165,   66,   67,   68,  172,   66,   67,   68,   65,   69,
  169,   65,  128,   69,  129,   69,  183,   66,   67,   68,
   66,   67,   68,  118,  178,   69,  182,   69,   69,  188,
  116,  191,   69,   69,  186,  118,  118,  118,  194,  118,
  118,  118,  116,  116,  116,  195,  116,  116,  116,  118,
  117,  214,  196,  128,  197,  129,  116,  225,  200,  128,
  207,  129,  117,  117,  117,  208,  117,  117,  117,  122,
  123,  211,  124,  119,  215,  152,  117,  144,  218,  219,
  220,  226,  125,  234,  231,   65,    8,    9,  230,   65,
  232,  167,  233,  237,   66,   67,   68,   50,   66,   67,
   68,  239,   69,   65,  212,  238,   69,  223,    8,    9,
  242,  244,   66,   67,   68,  245,   65,  246,   51,   65,
   69,  247,  252,  248,  249,   66,   67,   68,   66,   67,
   68,   65,  254,   69,   65,  255,   69,  256,  257,  258,
   66,   67,   68,   66,   67,   68,   65,  259,   69,   42,
    6,   69,   26,   47,  109,   66,   67,   68,   96,  166,
  187,   90,    0,   69,
};
short yycheck[] = {                                      40,
   45,   40,   40,   40,   45,   41,   41,   45,   41,   41,
  256,   59,   41,   44,   40,   46,  256,   58,   40,   45,
   98,   13,  262,   45,   59,   70,   44,  277,   46,   21,
   40,   71,   24,   40,  280,   45,   28,  277,   45,   59,
   44,   44,   46,   46,   41,  256,   59,   92,   41,  264,
  256,   82,   65,  264,   44,   41,   41,   43,   43,   45,
   45,  256,   59,   41,   82,   43,   59,   45,  263,  147,
  148,  277,  283,   59,   59,   60,   41,   62,   82,   82,
   59,   59,   60,   41,   62,   43,  115,   45,  256,  134,
  258,   43,   82,   45,   59,  135,  136,  256,  256,   35,
   44,   59,   60,  116,   62,  118,  265,    4,   60,  264,
   62,  142,   45,  105,  106,  273,   45,  130,   15,   55,
  256,  277,  281,   20,  142,   22,   62,   59,   40,  257,
   45,   40,   44,  261,  270,   43,  264,   45,  142,  142,
  265,  269,   42,   45,  267,  268,   45,   47,  161,  277,
   40,   59,  142,   41,  282,   52,   59,  170,   45,   56,
  205,   45,  259,  260,  156,  157,  257,  257,  275,  276,
  261,  261,  256,  264,  277,  266,  266,  257,  269,  269,
   41,  261,  227,  267,  268,   59,  277,  277,  201,  269,
   41,  282,  282,   43,  257,   45,   59,  277,  261,  244,
  267,  268,  282,   41,  256,   43,  269,   45,   41,   41,
   43,  277,   45,  256,  277,  267,  268,  128,  129,  256,
  263,   59,  265,  258,   41,  258,   59,  268,  267,  268,
  268,   99,  100,  101,  270,  270,  277,  278,  279,  277,
  278,  279,  268,  280,  285,  277,  268,  285,   41,  265,
   59,  277,  278,  279,   41,  277,  278,  279,  268,  285,
   41,  268,   43,  285,   45,  258,   41,  277,  278,  279,
  277,  278,  279,  258,  258,  285,   59,  270,  285,   41,
  258,  270,  275,  276,  265,  270,  271,  272,   41,  274,
  275,  276,  270,  271,  272,   41,  274,  275,  276,  284,
  258,   41,   41,   43,   41,   45,  284,   41,   59,   43,
  260,   45,  270,  271,  272,   41,  274,  275,  276,  271,
  272,   59,  274,  256,  258,  256,  284,  256,   59,   59,
  270,   59,  284,   41,   59,  268,  267,  268,  265,  268,
   59,  256,   59,   59,  277,  278,  279,  256,  277,  278,
  279,   41,  285,  268,  256,   59,  285,  256,  267,  268,
   59,   40,  277,  278,  279,   41,  268,   59,  277,  268,
  285,   59,  256,   59,   59,  277,  278,  279,  277,  278,
  279,  268,   59,  285,  268,   59,  285,   41,   41,   59,
  277,  278,  279,  277,  278,  279,  268,   59,  285,   59,
  264,  285,  264,   20,   56,  277,  278,  279,  265,  115,
  142,   44,   -1,  285,
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
#line 279 "gramatica.y"

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
#line 496 "y.tab.c"
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
{ addEstructura( "Sentencia POST, en la linea: " + analizadorLexico.getNroLineaToken() ); }
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
{addEstructura( "Sentencia de asignacion, en la linea: " + analizadorLexico.getNroLineaToken() );
							  crearTerceto(ASIG, yyvsp[-3].ival, yyvsp[-1].ival);}
break;
case 53:
#line 108 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia asignacion invalida"); }
break;
case 54:
#line 111 "gramatica.y"
{ addEstructura( "Sentencia de llamado a funcion, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 55:
#line 112 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 56:
#line 113 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 57:
#line 114 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 58:
#line 118 "gramatica.y"
{
 			 tercetos.get(pila.pop()).setT3(tercetos.size());
 			}
break;
case 59:
#line 121 "gramatica.y"
{
			 tercetos.get(pila.pop()).setT2(tercetos.size());
			}
break;
case 60:
#line 126 "gramatica.y"
{
	tercetos.get(pila.pop()).setT3(tercetos.size()+1);
	int refTerceto =crearTerceto(-2, -1, -1);/*-2 es BI*/
	pila.push(refTerceto);
	yyval = new ParserVal(refTerceto);
	}
break;
case 61:
#line 135 "gramatica.y"
{
 					 int refTerceto = crearTerceto(-1, yyvsp[-2].ival, -1);/*el primer-1 es BF*/
					 pila.push(refTerceto);
 					 yyval = new ParserVal(refTerceto);
 					 }
break;
case 62:
#line 140 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
break;
case 63:
#line 141 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 64:
#line 142 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 65:
#line 143 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia condicional invalida"); }
break;
case 66:
#line 146 "gramatica.y"
{addEstructura( "Sentencia IF, en la linea: " + analizadorLexico.getNroLineaToken() );
 	  yyval = yyvsp[0];}
break;
case 67:
#line 150 "gramatica.y"
{
	  	yyval = new ParserVal(crearTerceto(yyvsp[-1].ival, yyvsp[-2].ival, yyvsp[0].ival));
	  	}
break;
case 68:
#line 153 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 69:
#line 156 "gramatica.y"
{
			yyval = new ParserVal(crearTerceto(yyvsp[-1].ival, yyvsp[-2].ival, yyvsp[0].ival));
			}
break;
case 70:
#line 161 "gramatica.y"
{yyval.ival = COMP_MAYOR_IGUAL;}
break;
case 71:
#line 162 "gramatica.y"
{yyval.ival = COMP_MENOR_IGUAL;}
break;
case 72:
#line 163 "gramatica.y"
{yyval.ival = COMP_IGUAL;}
break;
case 73:
#line 164 "gramatica.y"
{yyval.ival = COMP_DISTINTO;}
break;
case 74:
#line 165 "gramatica.y"
{yyval.ival = '<';}
break;
case 75:
#line 166 "gramatica.y"
{yyval.ival = '>';}
break;
case 76:
#line 169 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 77:
#line 170 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 81:
#line 178 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", cadena invalida"); }
break;
case 82:
#line 179 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 83:
#line 180 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 84:
#line 181 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia PRINT invalida"); }
break;
case 85:
#line 185 "gramatica.y"
{ addEstructura( "Sentencia PRINT, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 86:
#line 188 "gramatica.y"
{
							     tercetos.get(pila.pop()).setT3(tercetos.size()+1);/*Se modifica el BF, agregandole la referencia correspondiente al proximo terceto despues de la ultima sentencia del bloque*/
							     int refTerceto = crearTerceto(-2, pila.pop(), -1);/*-2 es BI, se crea un BI al terceto que calcula la condicion del while*/
							    }
break;
case 87:
#line 194 "gramatica.y"
{
					 int refTerceto = crearTerceto(-1, yyvsp[-2].ival, -1);/*el primer-1 es BF*/
					 pila.push(refTerceto);
					 yyval = new ParserVal(refTerceto);
					}
break;
case 88:
#line 199 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia iterativa invalida"); }
break;
case 89:
#line 200 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
break;
case 90:
#line 201 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 91:
#line 202 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 92:
#line 204 "gramatica.y"
{ addEstructura( "Sentencia WHILE, en la linea: " + analizadorLexico.getNroLineaToken() );
 		 pila.push(tercetos.size());
 	         yyval=yyvsp[0]; }
break;
case 103:
#line 225 "gramatica.y"
{ addEstructura( "Sentencia BREAK, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 104:
#line 228 "gramatica.y"
{ addEstructura( "Sentencia de conversion a DOUBLE, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 105:
#line 229 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 106:
#line 231 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 107:
#line 232 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 109:
#line 236 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia TRY-CATCH invalida"); }
break;
case 110:
#line 237 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia TRY-CATCH invalida"); }
break;
case 111:
#line 241 "gramatica.y"
{ addEstructura( "Sentencia TRY-CATCH, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 116:
#line 250 "gramatica.y"
{
							  yyval = new ParserVal(crearTerceto('+', yyvsp[-2].ival, yyvsp[0].ival));
 							 }
break;
case 117:
#line 253 "gramatica.y"
{
					      yyval = new ParserVal(crearTerceto('-', yyvsp[-2].ival, yyvsp[0].ival));
					     }
break;
case 118:
#line 256 "gramatica.y"
{ yyval = yyvsp[0] ; }
break;
case 119:
#line 259 "gramatica.y"
{
			     yyval = new ParserVal(crearTerceto('*', yyvsp[-2].ival, yyvsp[0].ival));
			     }
break;
case 120:
#line 262 "gramatica.y"
{
			     yyval = new ParserVal(crearTerceto('/', yyvsp[-2].ival, yyvsp[0].ival));
			     }
break;
case 121:
#line 265 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 122:
#line 266 "gramatica.y"
{
		      yyval = new ParserVal(crearTerceto('*', -1, yyvsp[0].ival));
		      }
break;
case 123:
#line 271 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 124:
#line 272 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 125:
#line 273 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 126:
#line 274 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 127:
#line 275 "gramatica.y"
{yyval = yyvsp[0];}
break;
#line 1014 "y.tab.c"
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
