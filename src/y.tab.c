#ifndef lint
static char yysccsid[] = "@(#)yaccpar	1.8 (Berkeley) 01/20/90";
#endif
#define YYBYACC 1
#line 2 "gramatica.y"
import java.util.ArrayList;
#line 8 "y.tab.c"
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
#define YYERRCODE 256
short yylhs[] = {                                        -1,
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
short yylen[] = {                                         2,
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
short yydefred[] = {                                      0,
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
short yydgoto[] = {                                       3,
    4,   10,   19,   11,   12,   91,   17,   14,   15,   25,
   96,  146,  188,   92,   26,   27,   74,   75,   35,  194,
   37,   38,   39,   40,   41,   42,   43,   44,  195,   76,
  124,  120,   45,   46,  210,  231,  211,  212,   47,   87,
   65,   66,
};
short yysindex[] = {                                   -197,
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
short yyrindex[] = {                                      0,
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
short yygindex[] = {                                      0,
    0,    0,  -55,  429,    0,  100,   69,    0,    0,    0,
    0,    0,    0,  276,  394,    0,   39,  -22,  -16,   60,
  -39,  -31,  156,  173,  176,  179,  -88,    0, -158,    0,
    0,    0,    0,    0, -108,  220, -189,    0,    0,    0,
  180,    5,
};
#define YYTABLESIZE 452
short yytable[] = {                                     120,
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
short yycheck[] = {                                      41,
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
#define YYFINAL 3
#ifndef YYDEBUG
#define YYDEBUG 0
#endif
#define YYMAXTOKEN 284
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
"TRY","CATCH","COMP_DISTINTO",
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
#line 236 "gramatica.y"

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
#line 490 "y.tab.c"
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
#line 17 "gramatica.y"
{ addEstructura( "Declaracion de programa, en la linea: " + analizadorLexico.getNroLineaToken() );}
break;
case 3:
#line 18 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", identificador de programa no valido"); }
break;
case 7:
#line 28 "gramatica.y"
{ addEstructura( "Declaracion de variables, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 8:
#line 29 "gramatica.y"
{ addEstructura( "Declaracion de funciones como variables, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 10:
#line 31 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", tipo de variable no valido"); }
break;
case 11:
#line 32 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", declaracion invalida"); }
break;
case 12:
#line 33 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 13:
#line 34 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", error en la condicion"); }
break;
case 14:
#line 35 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 17:
#line 44 "gramatica.y"
{ addEstructura( "Declaracion de funcion, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 18:
#line 45 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", declaracion invalida"); }
break;
case 19:
#line 46 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", identificador no valido"); }
break;
case 20:
#line 47 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", parametro no valido"); }
break;
case 21:
#line 48 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 22:
#line 49 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 27:
#line 62 "gramatica.y"
{ addEstructura( "Declaracion de variables, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 28:
#line 65 "gramatica.y"
{ addEstructura( "Sentencia RETURN, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 29:
#line 66 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 30:
#line 67 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 31:
#line 68 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 32:
#line 69 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 33:
#line 72 "gramatica.y"
{ addEstructura( "Sentencia POST, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 34:
#line 73 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
break;
case 35:
#line 74 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta :"); }
break;
case 36:
#line 75 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 37:
#line 76 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 38:
#line 77 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 54:
#line 107 "gramatica.y"
{ addEstructura( "Sentencia de asignacion, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 55:
#line 108 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia asignacion invalida"); }
break;
case 56:
#line 111 "gramatica.y"
{ addEstructura( "Sentencia de llamado a funcion, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 57:
#line 112 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 58:
#line 113 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 59:
#line 114 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 62:
#line 120 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion no valida"); }
break;
case 63:
#line 121 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 64:
#line 122 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 65:
#line 126 "gramatica.y"
{addEstructura( "Sentencia IF, en la linea: " + analizadorLexico.getNroLineaToken() );}
break;
case 80:
#line 153 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", cadena no valida"); }
break;
case 81:
#line 154 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 82:
#line 155 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 83:
#line 159 "gramatica.y"
{ addEstructura( "Sentencia PRINT, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 85:
#line 163 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 86:
#line 164 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 87:
#line 165 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion no valida"); }
break;
case 88:
#line 167 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 89:
#line 168 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 90:
#line 171 "gramatica.y"
{ addEstructura( "Sentencia WHILE, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 103:
#line 192 "gramatica.y"
{ addEstructura( "Sentencia BREAK, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 104:
#line 195 "gramatica.y"
{ addEstructura( "Sentencia de conversion a DOUBLE, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 105:
#line 196 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica no valida"); }
break;
case 106:
#line 198 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 107:
#line 199 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 109:
#line 203 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 110:
#line 204 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 111:
#line 208 "gramatica.y"
{ addEstructura( "Sentencia TRY-CATCH, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
#line 850 "y.tab.c"
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
