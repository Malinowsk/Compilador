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
   23,   23,   23,   23,   23,   28,   18,   18,   30,   32,
   32,   32,   32,   32,   32,   31,   31,   29,   29,   24,
   24,   24,   24,   24,   33,   25,   25,   25,   25,   25,
   25,   34,   35,   35,   36,   36,   37,   37,   37,   37,
   37,   37,   37,   37,   38,   26,   26,   26,   26,   27,
   27,   27,   39,   40,   40,   40,   40,   40,   40,   17,
   17,   17,   41,   41,   41,   41,   42,   42,   42,
};
short yylen[] = {                                         2,
    3,    2,    2,    1,    3,    2,    2,    6,    1,    2,
    3,    5,    6,    5,    6,    7,    6,    6,    6,    6,
    5,    5,    2,    1,    3,    2,    2,    5,    5,    4,
    4,    2,    6,    6,    5,    4,    4,    2,    1,    1,
    3,    1,    3,    1,    2,    1,    1,    1,    1,    1,
    1,    1,    1,    4,    3,    5,    5,    4,    4,    8,
   10,    8,    7,    7,    6,    1,    3,    1,    3,    1,
    1,    1,    1,    1,    1,    1,    1,    3,    1,    5,
    5,    4,    4,    3,    1,    6,    5,    6,    6,    5,
    5,    1,    3,    1,    2,    1,    1,    1,    1,    1,
    1,    1,    1,    1,    2,    5,    5,    4,    4,    4,
    4,    3,    1,    1,    1,    1,    1,    1,    1,    3,
    3,    1,    3,    3,    2,    1,    1,    1,    1,
};
short yydefred[] = {                                      0,
    0,    0,    0,    0,    3,    2,    0,   39,   40,    0,
    4,    0,    0,    9,    0,    0,   10,    0,    1,    0,
    0,    0,    7,    0,    0,   24,    0,    0,   66,   85,
    0,   92,    0,  113,    0,    0,   47,   48,   49,   50,
   51,   52,   53,    0,    0,    0,    0,    5,    0,   11,
    0,    0,    0,    0,   27,    0,    0,   41,  127,  128,
  129,    0,    0,    0,    0,  126,    0,    0,    0,    0,
   43,   45,    0,    0,    0,    0,    0,    0,    0,    0,
    0,  114,  115,  116,  117,  118,  119,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,   44,   25,    0,
    0,  125,    0,    0,    0,    0,    0,   55,    0,    0,
    0,    0,    0,    0,   70,   71,   72,   73,   74,   75,
    0,    0,   76,   77,    0,   84,    0,    0,    0,    0,
    0,    0,    0,    0,  112,    0,    0,    0,    0,   23,
   21,    0,    0,   14,   12,    0,    0,    0,    0,  108,
    0,  109,    0,    0,  123,  124,   54,    0,   58,    0,
   59,    0,    0,    0,    0,    0,   67,   83,    0,   82,
    0,    0,    0,    0,    0,  111,  110,   18,   19,   20,
   17,   13,    8,   32,    0,    0,    0,   15,    0,    0,
  107,  106,   57,   56,    0,    0,   79,    0,    0,    0,
    0,   81,   80,    0,    0,    0,   97,   98,   99,  100,
  101,  102,  103,   90,   94,  104,    0,    0,   87,   91,
    0,    0,    0,   38,    0,    0,    0,   16,    0,    0,
    0,   65,    0,    0,   89,    0,    0,  105,   88,   86,
    0,   30,    0,   31,    0,    0,    0,    0,   78,   63,
    0,    0,   64,   93,   95,   29,   28,   37,    0,    0,
    0,   36,   62,    0,   60,   35,    0,    0,    0,   34,
   33,   61,
};
short yydgoto[] = {                                       3,
    4,   10,   19,   11,   12,   92,   17,   14,   15,   25,
   97,  148,  190,   93,   26,   27,   74,   75,   35,  197,
   37,   38,   39,   40,   41,   42,   43,   44,  198,   76,
  125,  121,   45,   46,  214,  236,  215,  216,   47,   88,
   65,   66,
};
short yysindex[] = {                                   -213,
  -20,    7,    0, -171,    0,    0, -207,    0,    0, -163,
    0,   14, -205,    0, -255,   60,    0,  171,    0, -171,
 -170,   29,    0, -207, -147,    0,   69, -207,    0,    0,
  -30,    0,   -4,    0, -126,  171,    0,    0,    0,    0,
    0,    0,    0,   10,  -35,   13, -131,    0,  143,    0,
   93,    4,  -68,  107,    0,  171, -255,    0,    0,    0,
    0,   22, -110,  164,   74,    0,  102,   41,   26,  182,
    0,    0,   30,   -8,  129, -153,  127,  165, -197,   46,
  174,    0,    0,    0,    0,    0,    0, -234, -255, -255,
   75,  -57,  175,  191,  -38, -207, -240,    0,    0,  210,
   39,    0,  195,   41,   41, -110, -110,    0,   65,  218,
  104,  209,  236,  -40,    0,    0,    0,    0,    0,    0,
   41,   25,    0,    0,   41,    0,  225,  271,   52,  272,
  -24,   51, -163, -163,    0,  281,  287,  289,  307,    0,
    0, -207, -207,    0,    0,  290,   16, -191,  291,    0,
  292,    0,   74,   74,    0,    0,    0,  295,    0,  297,
    0,   99,  111,    9,  183,  111,    0,    0,  301,    0,
  302,   96,  147,  130,  147,    0,    0,    0,    0,    0,
    0,    0,    0,    0,   55,  393,  303,    0,    2,   98,
    0,    0,    0,    0,  111,  171,    0,  109,  308,  111,
  113,    0,    0,  147,  153,  319,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,  147,  147,    0,    0,
  340,  132,  323,    0,   41,  345,  351,    0,  135,  136,
  338,    0, -106,  343,    0,  140,  153,    0,    0,    0,
  347,    0,  359,    0,   61,   58,  361,  364,    0,    0,
  111,  366,    0,    0,    0,    0,    0,    0,  372,  392,
  396,    0,    0,  181,    0,    0,  383,  385,  386,    0,
    0,    0,
};
short yyrindex[] = {                                      0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,  387,    0,    0,    0,  185,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0, -101,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,  387,    0,
    0,    0,    0,    0,    0,    0,  186,    0,    0,    0,
    0,    0,    0,    0,  -41,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,   68,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,  -75,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,  -34,  -14,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,   40,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,  187,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,
};
short yygindex[] = {                                      0,
    0,    0,  -55,  427,    0,   72,  331,    0,    0,    0,
    0,    0,    0,  121,  394,    0,  296,  128,  -16,   59,
  -39,  -33,  -23,  -15,  166,  172,  -61,    0, -132,    0,
    0,    0,    0,    0,  -86,  217, -199,    0,    0,    0,
   92,   -1,
};
#define YYTABLESIZE 481
short yytable[] = {                                     122,
  164,  122,  143,  122,   79,  237,  120,   82,  120,   62,
  120,    8,    9,   83,   63,  146,  174,  122,  122,   72,
  122,  133,  147,   84,  120,  120,  121,  120,  121,   18,
  121,   85,  135,  201,  104,   69,  105,  237,    5,   98,
   63,  225,    1,   91,  121,  121,   63,  121,  134,   73,
   21,  119,   80,  120,   63,  185,   22,   63,  128,  226,
   63,  102,  229,    2,  187,    6,   63,  233,   53,   16,
   63,   16,   20,  188,   63,   13,   36,  176,  177,  151,
   69,  104,  129,  105,    7,   63,   24,  219,  220,  189,
   63,   13,  171,   54,   36,    8,    9,  150,   69,   63,
   18,  259,   63,   28,  155,  156,   49,  104,   68,  105,
  170,  213,  213,  213,   36,  106,   56,  235,  264,  258,
  107,  123,  124,  157,   95,   29,   68,   57,   24,   30,
  239,  240,   90,  207,  207,  207,   31,   32,   71,  208,
  208,  208,  213,  213,  160,   33,  104,   96,  105,  209,
  209,  209,  251,  252,   46,  213,  213,  210,  210,  210,
  108,   46,  159,   46,  207,  207,   59,   60,   61,  122,
  208,  208,  243,   81,  104,  213,  105,  207,  207,  230,
  209,  209,   89,  208,  208,  126,   28,   94,  210,  210,
  242,   22,   22,  209,  209,  153,  154,  207,    8,    9,
  114,  210,  210,  208,  103,  127,  104,  131,  105,  136,
  137,  139,   86,  209,  132,  141,  122,  163,   87,  140,
   77,  210,  112,  120,  104,  104,  105,  105,  122,  122,
  122,  142,  122,  122,  122,  120,  120,  120,   16,  120,
  120,  120,  122,  121,   78,  173,   59,   60,   61,  120,
  149,   67,  167,  152,   36,  121,  121,  121,  158,  121,
  121,  121,  115,  116,  199,  117,  200,  161,   68,  121,
    8,    9,   59,   60,   61,  118,  162,  100,   59,   60,
   61,  110,  166,  168,   51,  113,   59,   60,   61,   59,
   60,   61,   59,   60,   61,    8,    9,   69,   59,   60,
   61,  130,   59,   60,   61,   52,   59,   60,   61,   69,
  221,  169,  172,  260,   69,   69,  227,   59,   60,   61,
  175,  178,   59,   60,   61,   68,   64,  179,   70,  180,
  138,   59,   60,   61,   59,   60,   61,   68,  211,  211,
  211,    8,    9,   23,  212,  212,  212,  181,  184,  191,
  192,   50,  245,  193,   55,  194,  195,  101,   58,  202,
  203,  224,  228,  109,  111,  204,  232,   29,  231,  211,
  211,   30,  234,  261,  196,  212,  212,  238,   31,   32,
  241,  244,  211,  211,  246,  217,   29,   33,  212,  212,
   30,  247,   34,  205,  248,  206,  250,   31,   32,  218,
  249,  253,  211,   29,  254,  256,   33,   30,  212,   29,
  205,   34,  206,   30,   31,   32,  165,  257,  206,  262,
   31,   32,  263,   33,  265,  144,  145,   29,   34,   33,
  266,   30,  267,  223,   34,  104,  268,  105,   31,   32,
  269,  270,  186,  271,  272,   42,   48,   33,    6,   26,
   99,   96,   34,  255,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,  182,  183,    0,    0,    0,    0,    0,    0,
  222,
};
short yycheck[] = {                                      41,
   41,   43,   41,   45,   40,  205,   41,   47,   43,   40,
   45,  267,  268,   47,   45,  256,   41,   59,   60,   36,
   62,  256,  263,   47,   59,   60,   41,   62,   43,  264,
   45,   47,   88,  166,   43,   40,   45,  237,   59,   56,
   45,   40,  256,   40,   59,   60,   45,   62,  283,   40,
  256,   60,   40,   62,   45,   40,  262,   45,  256,   58,
   45,   63,  195,  277,  256,   59,   45,  200,   40,  277,
   45,  277,   59,  265,   45,    4,   18,  133,  134,   41,
   41,   43,  280,   45,  256,   45,   15,  174,  175,  281,
   45,   20,   41,   22,   36,  267,  268,   59,   59,   45,
  264,   41,   45,   44,  106,  107,  277,   43,   41,   45,
   59,  173,  174,  175,   56,   42,  264,  204,  251,   59,
   47,  275,  276,   59,   53,  257,   59,   59,   57,  261,
  217,  218,   40,  173,  174,  175,  268,  269,  265,  173,
  174,  175,  204,  205,   41,  277,   43,   41,   45,  173,
  174,  175,  259,  260,  256,  217,  218,  173,  174,  175,
   59,  263,   59,  265,  204,  205,  277,  278,  279,   41,
  204,  205,   41,   46,   43,  237,   45,  217,  218,  196,
  204,  205,   40,  217,  218,   59,   44,  256,  204,  205,
   59,  267,  268,  217,  218,  104,  105,  237,  267,  268,
   73,  217,  218,  237,   41,   41,   43,   80,   45,   89,
   90,   91,   47,  237,   41,   41,  258,  258,   47,  277,
  256,  237,   41,  258,   43,   43,   45,   45,  270,  271,
  272,   41,  274,  275,  276,  270,  271,  272,  277,  274,
  275,  276,  284,  258,  280,  270,  277,  278,  279,  284,
   41,  256,  125,   59,  196,  270,  271,  272,   41,  274,
  275,  276,  271,  272,  256,  274,  258,   59,  273,  284,
  267,  268,  277,  278,  279,  284,   41,  256,  277,  278,
  279,  256,  258,   59,  256,  256,  277,  278,  279,  277,
  278,  279,  277,  278,  279,  267,  268,  258,  277,  278,
  279,  256,  277,  278,  279,  277,  277,  278,  279,  270,
  256,   41,   41,  256,  275,  276,  189,  277,  278,  279,
  270,   41,  277,  278,  279,  258,   31,   41,   33,   41,
  256,  277,  278,  279,  277,  278,  279,  270,  173,  174,
  175,  267,  268,   13,  173,  174,  175,   41,   59,   59,
   59,   21,  225,   59,   24,   59,  258,   62,   28,   59,
   59,   59,  265,   68,   69,  270,   59,  257,  260,  204,
  205,  261,  260,  246,  264,  204,  205,   59,  268,  269,
   41,   59,  217,  218,   40,  256,  257,  277,  217,  218,
  261,   41,  282,  264,  260,  266,   59,  268,  269,  270,
  265,   59,  237,  257,  265,   59,  277,  261,  237,  257,
  264,  282,  266,  261,  268,  269,  121,   59,  266,   59,
  268,  269,   59,  277,   59,   95,   96,  257,  282,  277,
   59,  261,   41,   41,  282,   43,   41,   45,  268,  269,
  260,   59,  147,   59,   59,   59,   20,  277,  264,  264,
   57,  265,  282,  237,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,  142,  143,   -1,   -1,   -1,   -1,   -1,   -1,
  185,
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
"sentencia_condicional : if '(' condicion ')' error ';'",
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
"sentencia_conversion : DOUBLE '(' error ')' ';'",
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
#line 238 "gramatica.y"

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
#line 501 "y.tab.c"
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
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", identificador de programa invalido"); }
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
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", tipo de variable invalida"); }
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
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
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
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", identificador invalido"); }
break;
case 20:
#line 47 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", parametro invalido"); }
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
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
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
#line 123 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia condicional invalida"); }
break;
case 66:
#line 127 "gramatica.y"
{addEstructura( "Sentencia IF, en la linea: " + analizadorLexico.getNroLineaToken() );}
break;
case 81:
#line 154 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", cadena invalida"); }
break;
case 82:
#line 155 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 83:
#line 156 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 84:
#line 157 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia PRINT invalida"); }
break;
case 85:
#line 161 "gramatica.y"
{ addEstructura( "Sentencia PRINT, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 87:
#line 165 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia iterativa invalida"); }
break;
case 88:
#line 166 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia iterativa invalida"); }
break;
case 89:
#line 167 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
break;
case 90:
#line 169 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 91:
#line 170 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 92:
#line 173 "gramatica.y"
{ addEstructura( "Sentencia WHILE, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 105:
#line 194 "gramatica.y"
{ addEstructura( "Sentencia BREAK, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 106:
#line 197 "gramatica.y"
{ addEstructura( "Sentencia de conversion a DOUBLE, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 107:
#line 198 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 108:
#line 200 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 109:
#line 201 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 111:
#line 205 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia TRY-CATCH invalida"); }
break;
case 112:
#line 206 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia TRY-CATCH invalida"); }
break;
case 113:
#line 210 "gramatica.y"
{ addEstructura( "Sentencia TRY-CATCH, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
#line 869 "y.tab.c"
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
