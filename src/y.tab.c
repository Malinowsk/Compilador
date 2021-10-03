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
   20,   20,   20,   21,   21,   22,   22,   22,   22,   22,
   23,   23,   23,   23,   23,   23,   28,   18,   18,   30,
   30,   32,   32,   32,   32,   32,   32,   31,   31,   29,
   29,   24,   24,   24,   24,   24,   33,   25,   25,   25,
   25,   25,   25,   25,   34,   35,   35,   36,   36,   37,
   37,   37,   37,   37,   37,   37,   37,   38,   26,   26,
   26,   26,   26,   27,   27,   27,   27,   39,   40,   40,
   40,   40,   40,   40,   17,   17,   17,   41,   41,   41,
   41,   42,   42,   42,
};
short yylen[] = {                                         2,
    3,    2,    2,    1,    3,    2,    2,    6,    1,    2,
    3,    5,    6,    5,    6,    7,    6,    6,    6,    6,
    5,    5,    2,    1,    3,    2,    2,    5,    5,    4,
    4,    2,    6,    6,    5,    4,    4,    2,    1,    1,
    3,    1,    3,    1,    3,    2,    1,    1,    1,    1,
    1,    1,    1,    3,    3,    4,    5,    4,    4,    2,
    7,    9,    7,    6,    6,    7,    1,    3,    1,    3,
    1,    1,    1,    1,    1,    1,    1,    1,    1,    3,
    2,    4,    4,    3,    3,    4,    1,    6,    5,    6,
    6,    6,    5,    5,    1,    3,    2,    3,    2,    1,
    1,    1,    1,    1,    1,    1,    1,    1,    4,    5,
    5,    4,    4,    4,    4,    3,    3,    1,    1,    1,
    1,    1,    1,    1,    3,    3,    1,    3,    3,    2,
    1,    1,    1,    1,
};
short yydefred[] = {                                      0,
    0,    0,    0,    0,    3,    2,    0,   39,   40,    0,
    4,    0,    0,    9,    0,    0,   10,    0,    1,    0,
    0,    0,    7,    0,    0,   24,    0,    0,    0,   67,
   87,    0,   95,    0,  118,    0,    0,   47,   48,   49,
   50,   51,   52,   53,    0,    0,    0,    0,    5,    0,
   11,    0,    0,    0,    0,   27,    0,    0,   41,    0,
    0,   60,    0,  132,  133,  134,    0,    0,    0,    0,
  131,    0,    0,    0,   43,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,  119,  120,  121,  122,  123,
  124,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,   44,   25,    0,  117,    0,    0,    0,    0,    0,
  130,    0,    0,    0,    0,    0,    0,    0,    0,    0,
   45,    0,    0,   72,   73,   74,   75,   76,   77,    0,
    0,   78,   79,    0,   85,    0,    0,    0,    0,    0,
    0,    0,  116,    0,    0,    0,    0,   23,   21,    0,
    0,   14,   12,    0,    0,    0,   86,    0,    0,    0,
  112,  109,  113,    0,    0,  128,  129,    0,   58,   56,
   59,    0,    0,    0,    0,    0,   68,   83,   82,    0,
    0,    0,    0,  115,  114,   18,   19,   20,   17,   13,
    8,   32,    0,    0,    0,   15,    0,    0,  111,    0,
    0,  110,   57,    0,    0,    0,    0,    0,    0,    0,
    0,  108,  100,  101,  102,  103,  104,  105,  106,   93,
    0,  107,    0,    0,   89,   94,    0,    0,    0,   38,
    0,    0,    0,   16,    0,   92,    0,    0,   81,   64,
    0,   65,   91,    0,    0,   97,   90,   88,    0,   30,
    0,   31,    0,    0,    0,   66,   63,   80,    0,   61,
   96,    0,   29,   28,   37,    0,    0,    0,   36,    0,
   98,   35,    0,    0,   62,   34,   33,
};
short yydgoto[] = {                                       3,
    4,   10,   19,   11,   12,   96,   17,   14,   15,   25,
  101,  156,  198,   97,   26,   27,   78,   79,   36,  206,
   38,   39,   40,   41,   42,   43,   44,   45,  207,   80,
  134,  130,   46,   47,  220,  244,  221,  222,   48,   92,
   70,   71,
};
short yysindex[] = {                                   -228,
   -2,   42,    0, -124,    0,    0, -265,    0,    0, -192,
    0,   45, -167,    0, -236,  -21,    0,  266,    0, -124,
 -164,   63,    0, -265, -147,    0,   64, -265,  -29,    0,
    0,    5,    0,   -7,    0, -132,   91,    0,    0,    0,
    0,    0,    0,    0,   36,  -39,   39,  -50,    0,  102,
    0,  127,   -5, -111,  111,    0,  266, -236,    0,   76,
 -192,    0,   55,    0,    0,    0,   73, -113,  160,   82,
    0,   76,   80,  334,    0,  266,   83,   37,  133,   20,
  148, -241,   86,  156,  -23,    0,    0,    0,    0,    0,
    0, -205, -236, -236, -105,  -77,  161,  168,  -28, -265,
 -141,    0,    0,   11,    0,  173,   28,  175,  184,   71,
    0,  169,   76,   76, -113, -113,   11,  197,  167,  201,
    0,  227,  -36,    0,    0,    0,    0,    0,    0,   76,
   18,    0,    0,   76,    0,  248,  250,  279,  -38,   67,
 -192, -192,    0,  308,  315,  335,  342,    0,    0, -265,
 -265,    0,    0,  239,   46, -204,    0,  339, -183,  347,
    0,    0,    0,   82,   82,    0,    0,  351,    0,    0,
    0,  132,  -84,  143,   11,  -84,    0,    0,    0,  146,
  232,  -78,  232,    0,    0,    0,    0,    0,    0,    0,
    0,    0,   89,  405,  354,    0,  -31,  152,    0,  -84,
  232,    0,    0,  -84,  266,  359,  166,  -84,  170,  232,
  264,    0,    0,    0,    0,    0,    0,    0,    0,    0,
  376,    0,   24,  232,    0,    0,  395,  364,  378,    0,
   76,  401,  402,    0,  182,    0,  189,  186,    0,    0,
  -89,    0,    0,  187,  394,    0,    0,    0,  396,    0,
  400,    0,   -4,   92,  403,    0,    0,    0,  -84,    0,
    0,  264,    0,    0,    0,  404,  413,  423,    0,  206,
    0,    0,  412,  414,    0,    0,    0,
};
short yyrindex[] = {                                      0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,  418,    0,    0,    0,  214,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,  418,
    0,    0,    0,    0,    0,    0,    0,  215,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,  -41,
    0,    0,    0,    0,    0,  -69,    0,   52,    0,  -34,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,  -43,    0,    0,  112,    0,    0,    0,
    0,    0,    0,    0,    0,    0,  116,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,  117,    0,    0,    0,
    0,    0,    0,    0,    0,    0,   79,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,  -19,    3,    0,    0,    0,    0,    0,
    0,    0,    0,    0,   68,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,  219,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,
};
short yygindex[] = {                                      0,
    0,    0,   13,  465,    0,   38,  361,    0,    0,    0,
    0,    0,    0,  302,  428,    0,  352,  331,  -47,  -10,
  -42,  210,  221,  246,  257,  293,  -75,    0, -106,    0,
    0,    0,    0,    0,  -63,  225, -177,    0,    0,    0,
  190,  -48,
};
#define YYTABLESIZE 585
short yytable[] = {                                     127,
   82,  127,  182,  127,  174,   86,   69,   37,  231,  102,
   63,   16,  151,   68,  136,   55,   63,  127,  127,  111,
  127,  125,   28,  125,   69,  125,  232,    1,  121,   62,
    8,    9,   73,  245,   95,   62,  266,   68,  137,  125,
  125,   13,  125,  126,   67,  126,   37,  126,    2,   68,
  141,  195,   24,  113,  265,  114,    5,   13,   18,   55,
  196,  126,  126,   63,  126,   37,  166,  167,  158,  209,
  113,   18,  114,  105,  200,   77,  197,  142,   83,  113,
   68,  114,   62,   68,  245,  193,  201,  128,   21,  129,
   68,   99,   71,  235,   22,   24,  128,  237,  129,   68,
    6,  241,   54,   20,  143,  219,  219,  219,   70,   16,
   71,  162,   50,  113,  154,  114,   57,   68,  225,  226,
   68,  155,   58,  115,   68,  219,   70,   68,  116,  161,
   68,    7,   75,   68,  219,  219,   68,  236,  213,  213,
  213,   93,    8,    9,   98,   28,  243,  219,  219,   76,
  146,  100,  270,  184,  185,    8,    9,  238,  213,  247,
  248,    8,    9,   64,   65,   66,   94,  213,  213,  259,
  260,   29,   30,  131,   54,   84,   31,  223,   30,  205,
  213,  213,   31,   32,   33,  211,  219,  212,  135,   32,
   33,  224,   34,   46,   37,   46,  140,   35,   34,  148,
  112,  149,  113,   35,  114,   85,   30,  170,  150,  113,
   31,  114,   55,  157,  127,  159,  127,   32,   33,  213,
   55,  173,  127,   69,  160,  169,   34,  163,  127,  127,
  127,  181,  127,  127,  127,   69,  125,  168,  125,   55,
   81,  127,  127,   60,  125,   64,   65,   66,   16,   60,
  125,  125,  125,   61,  125,  125,  125,   87,  126,  171,
  126,    8,    9,  125,  125,   72,  126,  172,   88,   64,
   65,   66,  126,  126,  126,  176,  126,  126,  126,   29,
   30,   64,   65,   66,   31,  126,  126,  211,  178,  212,
  179,   32,   33,   89,  132,  133,   60,  192,  124,  125,
   34,  126,  164,  165,   90,   35,   61,  124,  125,   71,
  126,  127,   64,   65,   66,   64,   65,   66,   52,  180,
  127,   71,   64,   65,   66,   70,   71,   71,  109,    8,
    9,   64,   65,   66,  106,  118,  183,   70,  122,   53,
   91,  138,   70,   70,  227,   22,   22,  267,  186,   64,
   65,   66,   64,   65,   66,  187,   64,   65,   66,   64,
   65,   66,   64,   65,   66,   64,   65,   66,   64,   65,
   66,   54,   84,   23,  120,  188,  113,   84,  114,   54,
   84,   51,  189,   69,   56,   74,   71,   71,   59,  204,
  214,  214,  214,  108,  144,  145,  147,  199,   54,   84,
  208,  215,  215,  215,  251,  202,  113,  123,  114,  203,
  214,  104,  230,  139,  107,  210,  234,  239,  110,  214,
  214,  215,  250,  117,  119,  240,  216,  216,  216,  242,
  215,  215,  214,  214,  246,  249,  252,  217,  217,  217,
  254,  256,  255,  215,  215,  229,  216,  113,  257,  114,
  258,  261,  262,  273,  263,  216,  216,  217,  264,  152,
  153,  269,  272,  274,  177,  275,  217,  217,  216,  216,
  276,  214,  277,  218,  218,  218,   42,    6,   26,  217,
  217,  175,  215,   99,   49,  103,  271,   29,   30,    0,
    0,    0,   31,  218,    0,  211,    0,  212,    0,   32,
   33,    0,  218,  218,    0,    0,  194,  216,   34,    0,
  190,  191,    0,   35,    0,  218,  218,    0,  217,   29,
   30,   29,   30,    0,   31,    0,   31,  233,    0,  212,
    0,   32,   33,   32,   33,    0,    0,    0,    0,    0,
   34,    0,   34,    0,  228,   35,    0,   35,    0,    0,
    0,    0,    0,    0,  218,    0,    0,    0,    0,    0,
    0,  253,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,  268,
};
short yycheck[] = {                                      41,
   40,   43,   41,   45,   41,   48,   41,   18,   40,   57,
   40,  277,   41,   45,  256,   59,   40,   59,   60,   68,
   62,   41,   44,   43,   59,   45,   58,  256,   76,   59,
  267,  268,   40,  211,   40,   59,   41,   45,  280,   59,
   60,    4,   62,   41,   40,   43,   57,   45,  277,   45,
  256,  256,   15,   43,   59,   45,   59,   20,  264,   22,
  265,   59,   60,   40,   62,   76,  115,  116,   41,  176,
   43,  264,   45,   61,  258,   40,  281,  283,   40,   43,
   45,   45,   59,   45,  262,   40,  270,   60,  256,   62,
   45,   54,   41,  200,  262,   58,   60,  204,   62,   45,
   59,  208,   40,   59,   92,  181,  182,  183,   41,  277,
   59,   41,  277,   43,  256,   45,  264,   45,  182,  183,
   45,  263,   59,   42,   45,  201,   59,   45,   47,   59,
   45,  256,  265,   45,  210,  211,   45,  201,  181,  182,
  183,   40,  267,  268,  256,   44,  210,  223,  224,   59,
  256,   41,  259,  141,  142,  267,  268,  205,  201,  223,
  224,  267,  268,  277,  278,  279,   40,  210,  211,  259,
  260,  256,  257,   41,   59,   59,  261,  256,  257,  264,
  223,  224,  261,  268,  269,  264,  262,  266,   41,  268,
  269,  270,  277,  263,  205,  265,   41,  282,  277,  277,
   41,   41,   43,  282,   45,  256,  257,   41,   41,   43,
  261,   45,  256,   41,  256,   41,  258,  268,  269,  262,
  264,  258,  264,  258,   41,   59,  277,   59,  270,  271,
  272,  270,  274,  275,  276,  270,  256,   41,  258,  283,
  280,  283,  284,  273,  264,  277,  278,  279,  277,  273,
  270,  271,  272,  283,  274,  275,  276,   48,  256,   59,
  258,  267,  268,  283,  284,  273,  264,   41,   48,  277,
  278,  279,  270,  271,  272,  258,  274,  275,  276,  256,
  257,  277,  278,  279,  261,  283,  284,  264,   41,  266,
   41,  268,  269,   48,  275,  276,  273,   59,  271,  272,
  277,  274,  113,  114,   48,  282,  283,  271,  272,  258,
  274,  284,  277,  278,  279,  277,  278,  279,  256,   41,
  284,  270,  277,  278,  279,  258,  275,  276,  256,  267,
  268,  277,  278,  279,  280,  256,  270,  270,  256,  277,
   48,  256,  275,  276,  256,  267,  268,  256,   41,  277,
  278,  279,  277,  278,  279,   41,  277,  278,  279,  277,
  278,  279,  277,  278,  279,  277,  278,  279,  277,  278,
  279,  256,  256,   13,   41,   41,   43,   47,   45,  264,
  264,   21,   41,   32,   24,   34,  275,  276,   28,  258,
  181,  182,  183,   63,   93,   94,   95,   59,  283,  283,
  258,  181,  182,  183,   41,   59,   43,   77,   45,   59,
  201,   60,   59,   83,   63,  270,  265,   59,   67,  210,
  211,  201,   59,   72,   73,  260,  181,  182,  183,  260,
  210,  211,  223,  224,   59,   41,   59,  181,  182,  183,
   40,  260,   41,  223,  224,   41,  201,   43,  260,   45,
  265,  265,   59,   41,   59,  210,  211,  201,   59,   99,
  100,   59,   59,   41,  134,  260,  210,  211,  223,  224,
   59,  262,   59,  181,  182,  183,   59,  264,  264,  223,
  224,  130,  262,  265,   20,   58,  262,  256,  257,   -1,
   -1,   -1,  261,  201,   -1,  264,   -1,  266,   -1,  268,
  269,   -1,  210,  211,   -1,   -1,  155,  262,  277,   -1,
  150,  151,   -1,  282,   -1,  223,  224,   -1,  262,  256,
  257,  256,  257,   -1,  261,   -1,  261,  197,   -1,  266,
   -1,  268,  269,  268,  269,   -1,   -1,   -1,   -1,   -1,
  277,   -1,  277,   -1,  193,  282,   -1,  282,   -1,   -1,
   -1,   -1,   -1,   -1,  262,   -1,   -1,   -1,   -1,   -1,
   -1,  231,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,  254,
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
"sentencia_asignacion : error ASIG expresion_aritmetica",
"sentencia_llamado_funcion : ID '(' expresion_aritmetica ')'",
"sentencia_llamado_funcion : ID '(' error ')' ';'",
"sentencia_llamado_funcion : ID '(' expresion_aritmetica ';'",
"sentencia_llamado_funcion : ID expresion_aritmetica ')' ';'",
"sentencia_llamado_funcion : error ';'",
"sentencia_condicional : if '(' condicion ')' THEN bloque_ejecutable_condicional ENDIF",
"sentencia_condicional : if '(' condicion ')' THEN bloque_ejecutable_condicional ELSE bloque_ejecutable_condicional ENDIF",
"sentencia_condicional : if '(' error ')' THEN bloque_ejecutable_condicional ENDIF",
"sentencia_condicional : if '(' condicion THEN bloque_ejecutable_condicional ENDIF",
"sentencia_condicional : if condicion ')' THEN bloque_ejecutable_condicional ENDIF",
"sentencia_condicional : error '(' condicion ')' THEN bloque_ejecutable_condicional ENDIF",
"if : IF",
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
"bloque_ejecutable_condicional : sentencia_ejecutable ';'",
"sentencia_imprimir : print '(' CADENA ')'",
"sentencia_imprimir : print '(' error ')'",
"sentencia_imprimir : print '(' CADENA",
"sentencia_imprimir : print CADENA ')'",
"sentencia_imprimir : error '(' CADENA ')'",
"print : PRINT",
"sentencia_iterativa : while '(' condicion ')' DO bloque_ejecutable_iterativo",
"sentencia_iterativa : while '(' condicion ')' bloque_ejecutable_iterativo",
"sentencia_iterativa : while '(' condicion ')' error bloque_ejecutable_iterativo",
"sentencia_iterativa : while '(' error ')' DO bloque_ejecutable_iterativo",
"sentencia_iterativa : error '(' condicion ')' DO bloque_ejecutable_iterativo",
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
"sentencia_conversion : error '(' expresion_aritmetica ')' ';'",
"sentencia_conversion : DOUBLE '(' expresion_aritmetica ';'",
"sentencia_conversion : DOUBLE expresion_aritmetica ')' ';'",
"sentencia_try_catch : try sentencia_ejecutable_con_anidamiento CATCH bloque_ejecutable",
"sentencia_try_catch : try sentencia_ejecutable_con_anidamiento error bloque_ejecutable",
"sentencia_try_catch : try sentencia_ejecutable_con_anidamiento bloque_ejecutable",
"sentencia_try_catch : error CATCH bloque_ejecutable",
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
private ArrayList<String> estructuras = new ArrayList<String>();
private ArrayList<String> errores = new ArrayList<String>();

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

private void addError(String e){
	errores.add(e);
}

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
#line 526 "y.tab.c"
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
#line 109 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", identificador no valido"); }
break;
case 56:
#line 112 "gramatica.y"
{ addEstructura( "Sentencia de llamado a funcion, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 57:
#line 113 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 58:
#line 114 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 59:
#line 115 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 60:
#line 116 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 63:
#line 121 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion no valida"); }
break;
case 64:
#line 122 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 65:
#line 123 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 66:
#line 124 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 67:
#line 127 "gramatica.y"
{addEstructura( "Sentencia IF, en la linea: " + analizadorLexico.getNroLineaToken() );}
break;
case 83:
#line 155 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", cadena no valida"); }
break;
case 84:
#line 156 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 85:
#line 157 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 86:
#line 158 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 87:
#line 161 "gramatica.y"
{ addEstructura( "Sentencia PRINT, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 89:
#line 165 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 90:
#line 166 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 91:
#line 167 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion no valida"); }
break;
case 92:
#line 168 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 93:
#line 169 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 94:
#line 170 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 95:
#line 173 "gramatica.y"
{ addEstructura( "Sentencia WHILE, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 108:
#line 194 "gramatica.y"
{ addEstructura( "Sentencia BREAK, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 109:
#line 197 "gramatica.y"
{ addEstructura( "Sentencia de conversion a DOUBLE, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 110:
#line 198 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica no valida"); }
break;
case 111:
#line 199 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 112:
#line 200 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 113:
#line 201 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 115:
#line 205 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 116:
#line 206 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 117:
#line 207 "gramatica.y"
{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 118:
#line 210 "gramatica.y"
{ addEstructura( "Sentencia TRY-CATCH, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
#line 910 "y.tab.c"
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
