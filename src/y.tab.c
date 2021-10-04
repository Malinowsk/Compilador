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
    3,    1,    3,    1,    3,    2,    1,    1,    1,    1,
    1,    1,    1,    3,    2,    4,    5,    4,    4,    7,
    9,    7,    6,    6,    1,    3,    1,    3,    1,    1,
    1,    1,    1,    1,    1,    1,    3,    2,    4,    4,
    3,    3,    1,    6,    5,    6,    6,    5,    5,    1,
    3,    2,    3,    2,    1,    1,    1,    1,    1,    1,
    1,    1,    1,    4,    5,    4,    4,    4,    4,    3,
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
  127,    0,    0,    0,    0,  124,   55,    0,    0,    0,
   43,    0,    0,    0,    0,    0,    0,    0,    0,    0,
  112,  113,  114,  115,  116,  117,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,   44,   25,    0,    0,
  123,    0,    0,    0,    0,    0,    0,    0,    0,    0,
   45,    0,    0,   69,   70,   71,   72,   73,   74,    0,
    0,   75,   76,    0,   82,    0,    0,    0,    0,    0,
    0,    0,  110,    0,    0,    0,    0,   23,   21,    0,
    0,   14,   12,    0,    0,    0,    0,  106,  104,  107,
    0,    0,  121,  122,    0,   58,   56,   59,    0,    0,
    0,    0,    0,   66,   80,   79,    0,    0,    0,    0,
  109,  108,   18,   19,   20,   17,   13,    8,   32,    0,
    0,    0,   15,    0,    0,  105,   57,    0,    0,    0,
    0,    0,    0,    0,    0,  103,   95,   96,   97,   98,
   99,  100,  101,   88,    0,  102,    0,    0,   85,   89,
    0,    0,    0,   38,    0,    0,    0,   16,    0,    0,
   78,   63,    0,   64,   87,    0,    0,   92,   86,   84,
    0,   30,    0,   31,    0,    0,    0,   62,   77,    0,
   60,   91,    0,   29,   28,   37,    0,    0,    0,   36,
    0,   93,   35,    0,    0,   61,   34,   33,
};
short yydgoto[] = {                                       3,
    4,   10,   19,   11,   12,   91,   17,   14,   15,   25,
   96,  146,  185,   92,   26,   27,   74,   75,   35,  190,
   37,   38,   39,   40,   41,   42,   43,   44,  191,   76,
  124,  120,   45,   46,  204,  226,  205,  206,   47,   87,
   65,   66,
};
short yysindex[] = {                                   -217,
  -12,   -1,    0, -157,    0,    0, -209,    0,    0, -190,
    0,   20,  -99,    0, -129,   41,    0, -121,    0, -157,
 -158,   43,    0, -209, -135,    0,   62, -209,    0,    0,
   11,    0,  -29,    0, -115,   85,    0,    0,    0,    0,
    0,    0,    0,   19,  -39,   27,  -55,    0,   57,    0,
  118,   -5,   99,  123,    0, -121, -129,    0,    0,    0,
    0,   35,   75,  376,  -15,    0,    0,   50,   39,  382,
    0, -121,   44,    9,  130,  -85,  142, -250,   47,  152,
    0,    0,    0,    0,    0,    0, -166, -129, -129,  146,
  -79,  166,  177,  -31, -209, -126,    0,    0,  180,  305,
    0,  103,   50,   50,   75,   75,  -28,  185,  306,  199,
    0,  219,  -33,    0,    0,    0,    0,    0,    0,   50,
   18,    0,    0,   50,    0,  241,  243,  244,  -38,   22,
 -190, -190,    0,  253,  260,  261,  317,    0,    0, -209,
 -209,    0,    0,  280,   30, -156,  309,    0,    0,    0,
  -15,  -15,    0,    0,  316,    0,    0,    0,  125,  121,
  126,  -28,  121,    0,    0,    0,  106,  -72,  -82,  -72,
    0,    0,    0,    0,    0,    0,    0,    0,    0,   59,
  383,  320,    0,   -9,  128,    0,    0,  121, -121,  327,
  131,  121,  137,  -72,  138,    0,    0,    0,    0,    0,
    0,    0,    0,    0,  350,    0,  -72,  -72,    0,    0,
  370,  351,  353,    0,   50,  378,  375,    0,  173,  169,
    0,    0, -105,    0,    0,  170,  379,    0,    0,    0,
  380,    0,  381,    0,   32,   63,  384,    0,    0,  121,
    0,    0,  138,    0,    0,    0,  385,  396,  400,    0,
  182,    0,    0,  386,  387,    0,    0,    0,
};
short yyrindex[] = {                                      0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,  388,    0,    0,    0,  184,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,  388,    0,
    0,    0,    0,    0,    0,    0,  186,    0,    0,    0,
    0,    0,    0,    0,  -41,    0,    0,    0,    0,    0,
    0, -143,    0,    0,    0,  -34,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,  -45,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,  -36,    0,    0,    0,
    0,    0,    0,    0,    0,    0,  -91,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
  -19,    3,    0,    0,    0,    0,    0,    0,    0,    0,
    0,   -4,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,  187,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,
};
short yygindex[] = {                                      0,
    0,    0,  -26,  429,    0,   92,   29,    0,    0,    0,
    0,    0,    0,  341,  394,    0,  312,  298,  -43,   10,
  -42,  -35,  -27,  162,  165,  193,  -92,    0, -154,    0,
    0,    0,    0,    0,  -76,  210, -162,    0,    0,    0,
  100,  -18,
};
#define YYTABLESIZE 534
short yytable[] = {                                     120,
   78,  120,  169,  120,   81,  126,   67,  161,  193,  141,
   69,   82,   97,   54,  103,   63,  104,  120,  120,   83,
  120,  118,   81,  118,   67,  118,  105,   36,  111,  127,
  215,  106,  227,  219,   90,   63,   68,  223,    1,  118,
  118,   23,  118,  119,  101,  119,    5,  119,  216,   50,
   62,  103,   55,  104,   68,   63,   58,    6,   73,    2,
  133,  119,  119,   63,  119,   36,   79,   16,  118,  180,
  119,   63,  247,   18,   63,  203,  203,  203,   20,   63,
  227,   36,   53,   63,   28,  251,  153,  154,   63,  131,
  246,   63,  209,  210,   63,   13,   88,   18,    7,  182,
   28,  203,  203,   63,  171,  172,   24,   63,  183,    8,
    9,   13,   46,   54,  203,  203,  132,  225,   49,   46,
   57,   46,  142,  143,  184,  197,  197,  197,   56,  144,
  229,  230,  198,  198,  198,   29,  145,    8,    9,   30,
  199,  199,  199,   72,   94,  220,   31,   32,   24,   71,
  203,  197,  197,  240,  241,   33,   21,   89,  198,  198,
   34,  150,   22,   95,  197,  197,  199,  199,  177,  178,
  121,  198,  198,  207,   29,   22,   22,   16,   30,  199,
  199,  195,  125,  196,   29,   31,   32,  208,   30,  122,
  123,  195,  130,  196,   33,   31,   32,  138,   36,   34,
  197,   29,  151,  152,   33,   30,  139,  198,   84,   34,
   54,   85,   31,   32,  120,  199,  120,  140,   54,   81,
  147,   33,  120,   67,  160,  155,   67,   81,  120,  120,
  120,  168,  120,  120,  120,   67,  118,   54,  118,   86,
   77,  120,  120,   68,  118,   16,   81,   59,   60,   61,
  118,  118,  118,   68,  118,  118,  118,  158,  119,  159,
  119,    8,    9,  118,  118,   68,  119,   59,   60,   61,
   68,   68,  119,  119,  119,  163,  119,  119,  119,  114,
  115,  165,  116,  166,  167,  119,  119,   59,   60,   61,
   99,  170,  117,  173,  108,   59,   60,   61,   51,  112,
  174,  175,  128,   59,   60,   61,   59,   60,   61,    8,
    9,   59,   60,   61,  211,   59,   60,   61,  248,   52,
   59,   60,   61,   59,   60,   61,   59,   60,   61,  200,
  200,  200,  201,  201,  201,   59,   60,   61,  179,   59,
   60,   61,   64,   80,   70,  149,  157,  103,  103,  104,
  104,   59,   60,   61,   93,  200,  200,  176,  201,  201,
  202,  202,  202,  148,  156,    8,    9,  186,  200,  200,
  113,  201,  201,  100,  187,  194,  129,   29,  214,  107,
  109,   30,  188,  192,  189,  221,  202,  202,   31,   32,
  222,  233,  218,  103,   29,  104,  224,   33,   30,  202,
  202,  136,   34,  196,  200,   31,   32,  201,  228,  232,
  231,  234,    8,    9,   33,  237,  102,  236,  103,   34,
  104,  164,  110,  213,  103,  103,  104,  104,  134,  135,
  137,  162,  238,  239,  242,  202,  254,  243,  244,  245,
  255,  256,  250,  253,  257,  258,   42,    6,   48,   26,
   98,   94,  252,    0,    0,    0,  181,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,  217,    0,    0,    0,    0,    0,    0,    0,    0,
    0,  212,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,  235,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,  249,
};
short yycheck[] = {                                      41,
   40,   43,   41,   45,   47,  256,   41,   41,  163,   41,
   40,   47,   56,   59,   43,   45,   45,   59,   60,   47,
   62,   41,   59,   43,   59,   45,   42,   18,   72,  280,
   40,   47,  195,  188,   40,   45,   41,  192,  256,   59,
   60,   13,   62,   41,   63,   43,   59,   45,   58,   21,
   40,   43,   24,   45,   59,   45,   28,   59,   40,  277,
   87,   59,   60,   45,   62,   56,   40,  277,   60,   40,
   62,   45,   41,  264,   45,  168,  169,  170,   59,   45,
  243,   72,   40,   45,   44,  240,  105,  106,   45,  256,
   59,   45,  169,  170,   45,    4,   40,  264,  256,  256,
   44,  194,  195,   45,  131,  132,   15,   45,  265,  267,
  268,   20,  256,   22,  207,  208,  283,  194,  277,  263,
   59,  265,   94,   95,  281,  168,  169,  170,  264,  256,
  207,  208,  168,  169,  170,  257,  263,  267,  268,  261,
  168,  169,  170,   59,   53,  189,  268,  269,   57,  265,
  243,  194,  195,  259,  260,  277,  256,   40,  194,  195,
  282,   59,  262,   41,  207,  208,  194,  195,  140,  141,
   41,  207,  208,  256,  257,  267,  268,  277,  261,  207,
  208,  264,   41,  266,  257,  268,  269,  270,  261,  275,
  276,  264,   41,  266,  277,  268,  269,  277,  189,  282,
  243,  257,  103,  104,  277,  261,   41,  243,   47,  282,
  256,   47,  268,  269,  256,  243,  258,   41,  264,  256,
   41,  277,  264,  258,  258,   41,  256,  264,  270,  271,
  272,  270,  274,  275,  276,  270,  256,  283,  258,   47,
  280,  283,  284,  273,  264,  277,  283,  277,  278,  279,
  270,  271,  272,  258,  274,  275,  276,   59,  256,   41,
  258,  267,  268,  283,  284,  270,  264,  277,  278,  279,
  275,  276,  270,  271,  272,  258,  274,  275,  276,  271,
  272,   41,  274,   41,   41,  283,  284,  277,  278,  279,
  256,  270,  284,   41,  256,  277,  278,  279,  256,  256,
   41,   41,  256,  277,  278,  279,  277,  278,  279,  267,
  268,  277,  278,  279,  256,  277,  278,  279,  256,  277,
  277,  278,  279,  277,  278,  279,  277,  278,  279,  168,
  169,  170,  168,  169,  170,  277,  278,  279,   59,  277,
  278,  279,   31,   46,   33,   41,   41,   43,   43,   45,
   45,  277,  278,  279,  256,  194,  195,   41,  194,  195,
  168,  169,  170,   59,   59,  267,  268,   59,  207,  208,
   73,  207,  208,   62,   59,  270,   79,  257,   59,   68,
   69,  261,  258,  258,  264,   59,  194,  195,  268,  269,
  260,   41,  265,   43,  257,   45,  260,  277,  261,  207,
  208,  256,  282,  266,  243,  268,  269,  243,   59,   59,
   41,   59,  267,  268,  277,   41,   41,   40,   43,  282,
   45,  124,   41,   41,   43,   43,   45,   45,   88,   89,
   90,  120,  260,  265,  265,  243,   41,   59,   59,   59,
   41,  260,   59,   59,   59,   59,   59,  264,   20,  264,
   57,  265,  243,   -1,   -1,   -1,  145,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,  184,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,  180,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,  215,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,  236,
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
"sentencia_asignacion : ID error",
"sentencia_llamado_funcion : ID '(' expresion_aritmetica ')'",
"sentencia_llamado_funcion : ID '(' error ')' ';'",
"sentencia_llamado_funcion : ID '(' expresion_aritmetica ';'",
"sentencia_llamado_funcion : ID expresion_aritmetica ')' ';'",
"sentencia_condicional : if '(' condicion ')' THEN bloque_ejecutable_condicional ENDIF",
"sentencia_condicional : if '(' condicion ')' THEN bloque_ejecutable_condicional ELSE bloque_ejecutable_condicional ENDIF",
"sentencia_condicional : if '(' error ')' THEN bloque_ejecutable_condicional ENDIF",
"sentencia_condicional : if '(' condicion THEN bloque_ejecutable_condicional ENDIF",
"sentencia_condicional : if condicion ')' THEN bloque_ejecutable_condicional ENDIF",
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
"bloque_ejecutable_condicional : sentencia_ejecutable ';'",
"sentencia_imprimir : print '(' CADENA ')'",
"sentencia_imprimir : print '(' error ')'",
"sentencia_imprimir : print '(' CADENA",
"sentencia_imprimir : print CADENA ')'",
"print : PRINT",
"sentencia_iterativa : while '(' condicion ')' DO bloque_ejecutable_iterativo",
"sentencia_iterativa : while '(' condicion ')' bloque_ejecutable_iterativo",
"sentencia_iterativa : while '(' condicion ')' error bloque_ejecutable_iterativo",
"sentencia_iterativa : while '(' error ')' DO bloque_ejecutable_iterativo",
"sentencia_iterativa : while '(' condicion DO bloque_ejecutable_iterativo",
"sentencia_iterativa : while condicion ')' DO bloque_ejecutable_iterativo",
"while : WHILE",
"bloque_ejecutable_iterativo : BEGIN sentencias_ejecutables_iterativas END",
"bloque_ejecutable_iterativo : sentencia_ejecutable_iterativa ';'",
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
#line 503 "y.tab.c"
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
#line 863 "y.tab.c"
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
