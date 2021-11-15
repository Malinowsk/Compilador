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
    5,    6,    6,    7,    7,    8,    8,    8,    8,    9,
    9,   10,   10,   11,   11,   11,   11,   11,   11,   15,
   13,   13,   13,   13,   14,   14,   14,   14,   14,    3,
   12,   18,   18,   19,   19,   19,   19,   19,   20,   20,
   20,   20,   25,   25,   21,   21,   28,   26,   26,   26,
   26,   26,   29,   17,   17,   30,   32,   32,   32,   32,
   32,   32,   31,   31,   27,   27,   22,   22,   22,   22,
   22,   33,   23,   34,   34,   34,   34,   34,   36,   35,
   35,   37,   37,   38,   38,   38,   38,   38,   38,   39,
   40,   40,   24,   41,   41,   41,   42,   16,   16,   16,
   43,   43,   43,   43,   44,   44,   44,   44,   44,
};
short yylen[] = {                                         2,
    3,    2,    2,    1,    3,    2,    2,    2,    1,    2,
    3,    1,    1,    3,    1,    5,    5,    6,    5,    3,
    1,    6,    7,    6,    6,    6,    6,    5,    5,    2,
    5,    5,    4,    4,    6,    6,    5,    4,    4,    3,
    1,    2,    1,    1,    1,    1,    1,    1,    4,    3,
    4,    2,    5,    6,    4,    6,    1,    5,    5,    4,
    4,    6,    1,    3,    1,    3,    1,    1,    1,    1,
    1,    1,    1,    1,    3,    1,    5,    5,    4,    4,
    3,    1,    2,    5,    5,    5,    4,    4,    1,    3,
    1,    2,    1,    1,    1,    1,    1,    1,    1,    2,
    4,    4,    2,    3,    3,    2,    1,    3,    3,    1,
    3,    3,    1,    2,    1,    1,    1,    1,    1,
};
short yydefred[] = {                                      0,
    0,    0,    0,    0,    3,    2,    0,   12,   13,    0,
    4,    0,    0,    0,    9,    0,    0,   10,    0,    1,
    0,    0,    0,    7,    0,    8,    0,    0,    0,   63,
   82,   89,    0,  107,    0,    0,   44,   45,   46,   47,
   48,    0,    0,    0,    0,    0,    0,    0,    5,    0,
   11,    0,    0,    0,    0,    0,    0,   14,   52,    0,
    0,   40,   42,    0,   76,    0,    0,  115,  118,  119,
    0,    0,    0,    0,    0,  117,    0,  116,    0,  113,
    0,    0,    0,    0,    0,   94,   95,   96,   97,   98,
   83,   91,   99,    0,    0,  103,    0,    0,    0,    0,
    0,    0,    0,    0,    0,   20,    0,   41,   50,    0,
    0,    0,   57,    0,    0,    0,    0,    0,    0,  114,
   67,   68,   69,   70,   71,   72,    0,    0,    0,    0,
   73,   74,    0,    0,    0,   81,    0,    0,    0,    0,
    0,  100,    0,    0,    0,  105,  104,    0,    0,    0,
    0,   30,   28,    0,   16,   19,   17,    0,    0,   51,
   49,   75,   55,    0,    0,    0,    0,    0,   60,    0,
    0,    0,    0,   61,   64,  111,  112,   80,    0,   79,
    0,   90,   92,    0,   87,    0,   88,   25,   26,   27,
   24,   18,    0,    0,   22,    0,    0,    0,  102,  101,
    0,    0,   59,    0,   58,   78,   77,   86,   85,   84,
    0,    0,    0,    0,    0,    0,   23,   56,    0,   53,
   62,    0,   33,    0,   34,    0,    0,    0,   54,   32,
   31,   39,    0,    0,    0,   38,   37,    0,    0,   36,
   35,
};
short yydgoto[] = {                                       3,
    4,   10,   20,   11,   12,  101,   18,   14,   26,   15,
   16,  107,  159,  197,  102,   74,   75,   35,   36,   37,
   38,   39,   40,   41,   76,   42,   66,  115,   43,   77,
  133,  129,   44,   45,   91,   46,  140,  141,   93,   78,
   47,   48,   79,   80,
};
short yysindex[] = {                                   -209,
  -14,   23,    0,  -97,    0,    0, -255,    0,    0, -180,
    0,   28, -229, -164,    0,  -97,   79,    0,  -88,    0,
  -97, -141,    3,    0,   97,    0, -118, -255,   95,    0,
    0,    0, -235,    0, -108,  -88,    0,    0,    0,    0,
    0, -162,  -37,  -36, -119,  -25, -180, -181,    0,  109,
    0,  120,  -38,  -81,  124, -164,  -88,    0,    0,  108,
   40,    0,    0,  -88,    0, -130,  145,    0,    0,    0,
  -89,   43,  -78,   29,  154,    0,  -96,    0,   -7,    0,
  137,  157, -239, -105,  156,    0,    0,    0,    0,    0,
    0,    0,    0,   56,  176,    0, -244,  -85,  -85,  -65,
  -59,  184,  186,  -31, -255,    0,  -13,    0,    0,  175,
   69,  -10,    0,  192, -162,   59,  228,  231,  -32,    0,
    0,    0,    0,    0,    0,    0,   71,   71,   71,   16,
    0,    0,   71,  -78,  -78,    0,  214,  236,   68,   13,
 -105,    0,  238,  -35,   14,    0,    0,  250,  256,  257,
  263,    0,    0, -255,    0,    0,    0,  -21, -219,    0,
    0,    0,    0,   45,  265,  165,   74,   49,    0, -201,
   -7,   -7,   15,    0,    0,    0,    0,    0,  251,    0,
  255,    0,    0,   39,    0, -122,    0,    0,    0,    0,
    0,    0,   87,  168,    0,  -40,   51,  264,    0,    0,
  285,  171,    0,  270,    0,    0,    0,    0,    0,    0,
  290,  133,  273,   71,  300,  304,    0,    0,  288,    0,
    0,  295,    0,  298,    0,   80,   90,  301,    0,    0,
    0,    0,  303,  322,  329,    0,    0,  312,  315,    0,
    0,
};
short yyrindex[] = {                                      0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,  -58,    0,    0,    0,
  112,    0,    0,    0,   28,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0, -173,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,  318,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,  -34,    0,   -9,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,  116,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
  117,    0,    0,    0,    0,    0,    0,    0,    0,    0,
  -63,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
   11,   18,  103,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,
};
short yygindex[] = {                                      0,
    0,  365,  336,  363,    0,   77,    1,    0,  330,    0,
    0,    0,    0,    0,  123,  -50,  -30,   61,  -29,  -17,
  -19,  -15,   -8,   -1,    0,    0,  272,    0,    0,    0,
    0,    0,    0,    0,    0,    0,  244,  343,    0,    0,
    0,    0,  105,  -24,
};
#define YYTABLESIZE 388
short yytable[] = {                                     214,
   15,  100,   72,   83,   73,  186,   65,   73,  170,  155,
  111,  146,   65,   24,   94,   95,  138,  215,  193,   73,
   60,   17,   51,   73,   65,   87,   22,   86,   58,   88,
   97,  110,   23,  110,  134,  110,   89,   61,  147,  135,
  139,  119,   54,   90,    5,  195,    1,   17,  120,  110,
  110,  108,  110,  108,  204,  108,  205,  127,  109,  128,
  109,  196,  109,  144,   87,  166,   86,    2,   88,  108,
  108,  127,  108,  128,   29,   89,  109,  109,  173,  109,
   13,    6,   90,   19,   73,   65,   21,   73,  125,   43,
  126,   43,   13,   29,   30,   33,   63,   13,   31,   55,
   73,   64,  175,   73,  156,  157,   32,  194,  181,  176,
  177,  127,   25,  128,   33,   73,  202,  108,   73,   34,
  233,   87,   28,   86,  112,   88,  180,  161,  113,  114,
  104,   73,   89,  209,   73,   50,   29,   30,  232,   90,
   56,   31,  212,   66,   84,   57,   85,  210,   98,   32,
   29,   30,   28,   59,  192,   31,   62,   33,    7,   99,
   85,   66,   34,   32,  105,  216,  109,   29,   30,    8,
    9,   33,   31,  224,  103,  127,   34,  128,  131,  132,
   32,    8,    9,  226,  116,    8,    9,  117,   33,   67,
  150,  223,   29,   34,  130,  136,  235,  137,   68,   69,
   70,    8,    9,   29,   29,  200,   71,  127,  213,  128,
  127,  220,  128,  127,  142,  128,  145,  152,   15,   81,
  148,  149,  151,   65,  153,  169,  154,   67,    8,    9,
   67,  171,  172,  160,  185,   65,   68,   69,   70,   68,
   69,   70,   67,   82,   71,   17,   67,   71,  110,  158,
  163,   68,   69,   70,  162,   68,   69,   70,   52,   71,
  110,  110,  110,   71,  110,  110,  110,  167,  108,    8,
    9,  168,  178,  174,  110,  109,  179,  182,  184,   53,
  108,  108,  108,  187,  108,  108,  108,  109,  109,  109,
  188,  109,  109,  109,  108,  110,  189,  190,  118,  121,
  122,  109,  123,  191,  198,  199,  203,   67,  208,  206,
   67,  143,  124,  207,  165,  217,   68,   69,   70,   68,
   69,   70,  218,   67,   71,  219,   67,   71,  221,  201,
  222,  225,   68,   69,   70,   68,   69,   70,   67,  227,
   71,   67,  211,   71,  228,  234,  229,   68,   69,   70,
   68,   69,   70,  230,   67,   71,  231,   67,   71,  236,
   66,  237,  238,   68,   69,   70,   68,   69,   70,  239,
  240,   71,   66,  241,   71,    6,   15,   66,   66,  106,
   27,   93,   96,   49,  183,  106,  164,   92,
};
short yycheck[] = {                                      40,
   59,   40,   40,   40,   45,   41,   41,   45,   41,   41,
   61,  256,   42,   13,   40,   46,  256,   58,   40,   45,
  256,  277,   22,   45,   59,   45,  256,   45,   28,   45,
   48,   41,  262,   43,   42,   45,   45,  273,  283,   47,
  280,   72,   40,   45,   59,  265,  256,  277,   73,   59,
   60,   41,   62,   43,  256,   45,  258,   43,   41,   45,
   43,  281,   45,   94,   84,  116,   84,  277,   84,   59,
   60,   43,   62,   45,  256,   84,   59,   60,  129,   62,
    4,   59,   84,  264,   45,  115,   59,   45,   60,  263,
   62,  265,   16,  256,  257,  277,   36,   21,  261,   23,
   45,  264,  133,   45,  104,  105,  269,  158,   41,  134,
  135,   43,  277,   45,  277,   45,  167,   57,   45,  282,
   41,  141,   44,  141,   64,  141,   59,   59,  259,  260,
   54,   45,  141,  256,   45,  277,  256,  257,   59,  141,
   44,  261,  193,   41,  264,  264,  266,  270,   40,  269,
  256,  257,   44,   59,  154,  261,  265,  277,  256,   40,
  266,   59,  282,  269,   41,  196,   59,  256,  257,  267,
  268,  277,  261,   41,  256,   43,  282,   45,  275,  276,
  269,  267,  268,  214,   40,  267,  268,  277,  277,  268,
  256,   59,  256,  282,   41,   59,  227,   41,  277,  278,
  279,  267,  268,  267,  268,   41,  285,   43,   41,   45,
   43,   41,   45,   43,   59,   45,   41,  277,  277,  256,
   98,   99,  100,  258,   41,  258,   41,  268,  267,  268,
  268,  127,  128,   59,  270,  270,  277,  278,  279,  277,
  278,  279,  268,  280,  285,  277,  268,  285,  258,  263,
   59,  277,  278,  279,  265,  277,  278,  279,  256,  285,
  270,  271,  272,  285,  274,  275,  276,   40,  258,  267,
  268,   41,   59,  258,  284,  258,   41,  265,   41,  277,
  270,  271,  272,  270,  274,  275,  276,  270,  271,  272,
   41,  274,  275,  276,  284,  256,   41,   41,  256,  271,
  272,  284,  274,   41,  260,   41,  258,  268,  270,   59,
  268,  256,  284,   59,  256,  265,  277,  278,  279,  277,
  278,  279,   59,  268,  285,   41,  268,  285,   59,  256,
   41,   59,  277,  278,  279,  277,  278,  279,  268,   40,
  285,  268,  256,  285,   41,  256,   59,  277,  278,  279,
  277,  278,  279,   59,  268,  285,   59,  268,  285,   59,
  258,   59,   41,  277,  278,  279,  277,  278,  279,   41,
   59,  285,  270,   59,  285,  264,   59,  275,  276,  264,
   16,  265,   47,   21,  141,   56,  115,   45,
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
"sentencia_declarativa : tipo_funcion lista_funcion_como_variables",
"sentencia_declarativa : sentencia_declarativa_funcion",
"sentencia_declarativa : error lista_variables",
"sentencia_declarativa : tipo error lista_variables",
"tipo : ULONG",
"tipo : DOUBLE",
"lista_variables : ID ',' lista_variables",
"lista_variables : ID",
"tipo_funcion : tipo FUNC '(' tipo ')'",
"tipo_funcion : tipo FUNC tipo ')' lista_variables",
"tipo_funcion : tipo FUNC '(' error ')' lista_variables",
"tipo_funcion : tipo FUNC '(' tipo lista_variables",
"lista_funcion_como_variables : ID ',' lista_funcion_como_variables",
"lista_funcion_como_variables : ID",
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
#line 503 "gramatica.y"

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
private String tipoActual;
private String tipoActualdeFuncion;

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
	//System.out.println("Token devuelto por yylex: " + tokenActual.getPrimero() );
	return tokenActual.getPrimero();
}

private void yyerror(String s){

}
#line 527 "y.tab.c"
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
case 10:
#line 37 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", tipo de variable invalido"); }
break;
case 11:
#line 38 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", declaracion invalida"); }
break;
case 12:
#line 41 "gramatica.y"
{tipoActual= "ULONG"; yyval.sval= "ULONG";}
break;
case 13:
#line 42 "gramatica.y"
{tipoActual= "DOUBLE"; yyval.sval= "DOUBLE";}
break;
case 14:
#line 45 "gramatica.y"
{
                        if(!tablaSimbolo.existeToken(tablaSimbolo.obtenerToken(yyvsp[-2].ival).getLexema()+'.'+ambitoActual)){
			    tablaSimbolo.obtenerToken(yyvsp[-2].ival).setLexema(tablaSimbolo.obtenerToken(yyvsp[-2].ival).getLexema()+'.'+ambitoActual);
			    tablaSimbolo.obtenerToken(yyvsp[-2].ival).setTipo(tipoActual);
			    tablaSimbolo.obtenerToken(yyvsp[-2].ival).setUso("variable");
			}else{
			    tablaSimbolo.borrarToken(yyvsp[-2].ival);
			    addWarning("Linea " + analizadorLexico.getNroLineaToken() + ", variable redeclarada, se eliminaron las redeclaraciones pertinentes");
			}
 		 }
break;
case 15:
#line 55 "gramatica.y"
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
#line 68 "gramatica.y"
{
		tipoActualdeFuncion= yyvsp[-4].sval;
		addEstructura( "Declaracion de funciones como variables, en la linea: " + analizadorLexico.getNroLineaToken() );
 }
break;
case 17:
#line 72 "gramatica.y"
{ tipoActualdeFuncion=tablaSimbolo.obtenerValor(yyvsp[-4].ival); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 18:
#line 73 "gramatica.y"
{ tipoActualdeFuncion=tablaSimbolo.obtenerValor(yyvsp[-5].ival); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", tipo de variable invalido"); }
break;
case 19:
#line 74 "gramatica.y"
{ tipoActualdeFuncion=tablaSimbolo.obtenerValor(yyvsp[-4].ival); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 20:
#line 77 "gramatica.y"
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
case 21:
#line 88 "gramatica.y"
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
case 22:
#line 102 "gramatica.y"
{
 					ambitoActual= ambitoActual.substring(0, ambitoActual.lastIndexOf('.'));
 					/*TODO: CREARTERCETO CON RETORNOACTUAL (RETORNOACTUAL.T1, RETORNOACTUAL.T2, -1)*/
 				}
break;
case 23:
#line 106 "gramatica.y"
{
                               		ambitoActual= ambitoActual.substring(0, ambitoActual.lastIndexOf('.'));
					/*TODO: CREARTERCETO CON RETORNOACTUAL (RETORNOACTUAL.T1, RETORNOACTUAL.T2, -1)*/
                               }
break;
case 24:
#line 112 "gramatica.y"
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
			 crearTerceto(new ParserVal(FUNC), yyvsp[-3], new ParserVal(-1));
 		  }
break;
case 25:
#line 132 "gramatica.y"
{ ambitoActual= ambitoActual + '.' + tablaSimbolo.obtenerToken(yyvsp[-3].ival).getLexema(); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", declaracion invalida");
 		  }
break;
case 26:
#line 134 "gramatica.y"
{ ambitoActual= ambitoActual + '.' + "error"; addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", identificador invalido");
 		  }
break;
case 27:
#line 136 "gramatica.y"
{ ambitoActual= ambitoActual + '.' + tablaSimbolo.obtenerToken(yyvsp[-3].ival).getLexema(); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", parametro invalido");
 		  }
break;
case 28:
#line 138 "gramatica.y"
{ ambitoActual= ambitoActual + '.' + tablaSimbolo.obtenerToken(yyvsp[-2].ival).getLexema(); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura");
 		  }
break;
case 29:
#line 140 "gramatica.y"
{ ambitoActual= ambitoActual + '.' + tablaSimbolo.obtenerToken(yyvsp[-2].ival).getLexema(); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre");
 		  }
break;
case 30:
#line 144 "gramatica.y"
{
		tablaSimbolo.obtenerToken(yyvsp[0].ival).setTipo(tipoActual);
		tablaSimbolo.obtenerToken(yyvsp[0].ival).setUso("parametro");
		yyval.ival=yyvsp[0].ival;
	}
break;
case 31:
#line 151 "gramatica.y"
{
 				int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
 				if(tablaSimbolo.obtenerToken(refFuncion).getTipo() != yyvsp[-2].sval)
 					addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles entre el retorno de la funcion y lo retornado");/*TODO: AGREGAR AL INFORME*/
 				crearTerceto(new ParserVal(RETURN), yyvsp[-2], new ParserVal(-1));/*TODO: NO CREAR SINO GUARDAR EN AUXILIAR RETORNOACTUAL*/
 				addEstructura( "Sentencia RETURN, en la linea: " + analizadorLexico.getNroLineaToken() );
 		 }
break;
case 32:
#line 158 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 33:
#line 159 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 34:
#line 160 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 35:
#line 164 "gramatica.y"
{
 			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
 			postCondiciones.put(refFuncion, tercetos.size()-1);/*Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion*/
 			addEstructura( "Sentencia POST, en la linea: " + analizadorLexico.getNroLineaToken() );
 			/*TODO: VER SI CREAR TERCETO PARA EL POST*/
 		}
break;
case 36:
#line 170 "gramatica.y"
{
			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
			postCondiciones.put(refFuncion, 0);/*Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion*/
			addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida");
		}
break;
case 37:
#line 175 "gramatica.y"
{
			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
			postCondiciones.put(refFuncion, tercetos.size()-1);/*Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion*/
			addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta :");
		}
break;
case 38:
#line 180 "gramatica.y"
{
			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
			postCondiciones.put(refFuncion, tercetos.size()-1);/*Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion*/
			addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura");
		}
break;
case 39:
#line 185 "gramatica.y"
{
			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
			postCondiciones.put(refFuncion, tercetos.size()-1);/*Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion*/
			addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre");
		}
break;
case 49:
#line 209 "gramatica.y"
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

			       if(tablaSimbolo.obtenerToken(yyvsp[-3].ival).getUso()=="funcion")
					addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", el identificador a la izquierda de la asignacion no es una variable");

			       if(tablaSimbolo.obtenerToken(yyvsp[-3].ival).getUso()=="funcion designada a variable")/*Solo se puede asignar una funcion*/
					if(yyvsp[-1].ival<=0){/*$3 no hace referencia a un identificador*/
						addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", solo se le puede asignar una funcion a esta variable");
					}else{
						if(tablaSimbolo.obtenerToken(yyvsp[-1].ival).getUso()!="funcion"){
							addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", solo se le puede asignar una funcion a esta variable");
						}else{
							if(tablaSimbolo.obtenerToken(yyvsp[-3].ival).getTipoParametro() != tablaSimbolo.obtenerToken(yyvsp[-1].ival).getTipoParametro())
								addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", el parametro de la funcion es de distinto tipo que el del parametro de la variable");
							this.erroresSemanticos.remove(indiceErrorABorrar);/*se borra el error ya que se hace buen uso del identificador*/
						}
					}

			       if(tablaSimbolo.obtenerToken(yyvsp[-3].ival).getTipo()!=yyvsp[-1].sval)
					addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + tablaSimbolo.obtenerToken(yyvsp[-3].ival).getTipo() + " := " + yyvsp[-1].sval );

		       }

		       yyval = new ParserVal((double)crearTerceto(new ParserVal(ASIG), yyvsp[-3], yyvsp[-1]));
		       addEstructura( "Sentencia de asignacion, en la linea: " + analizadorLexico.getNroLineaToken() );
		      }
break;
case 50:
#line 249 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 51:
#line 250 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 52:
#line 251 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida");}
break;
case 53:
#line 254 "gramatica.y"
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
case 54:
#line 283 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 55:
#line 286 "gramatica.y"
{
 			 tercetos.get(pila.pop()).setT3(new ParserVal((double)tercetos.size()));
 			 tercetos.get(tercetos.size()-1).setEtiqueta();
 			}
break;
case 56:
#line 290 "gramatica.y"
{
			 tercetos.get(pila.pop()).setT2(new ParserVal((double)tercetos.size()));
			 tercetos.get(tercetos.size()-1).setEtiqueta();
			}
break;
case 57:
#line 296 "gramatica.y"
{
	tercetos.get(pila.pop()).setT3(new ParserVal((double)tercetos.size()+1));
	int refTerceto =crearTerceto(new ParserVal(-2), new ParserVal(-1), new ParserVal(-1));/*-2 es BI*/
	tercetos.get(tercetos.size()-1).setEtiqueta();
	pila.push(refTerceto);
	yyval = new ParserVal((double)refTerceto);
	}
break;
case 58:
#line 305 "gramatica.y"
{
 					 int refTerceto = crearTerceto(new ParserVal(-1), yyvsp[-2], new ParserVal(-1));/*el primer-1 es BF*/
					 pila.push(refTerceto);
 					 yyval = new ParserVal((double)refTerceto);
 					 }
break;
case 59:
#line 310 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
break;
case 60:
#line 311 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 61:
#line 312 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 62:
#line 313 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia condicional invalida"); }
break;
case 63:
#line 316 "gramatica.y"
{addEstructura( "Sentencia IF, en la linea: " + analizadorLexico.getNroLineaToken() );
 	  yyval = yyvsp[0];}
break;
case 64:
#line 320 "gramatica.y"
{
	  	yyval = new ParserVal((double)crearTerceto(yyvsp[-1], yyvsp[-2], yyvsp[0]));
	  	}
break;
case 65:
#line 323 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 66:
#line 326 "gramatica.y"
{
			yyval = new ParserVal((double)crearTerceto(yyvsp[-1], yyvsp[-2], yyvsp[0]));
			}
break;
case 67:
#line 331 "gramatica.y"
{yyval.ival = COMP_MAYOR_IGUAL;}
break;
case 68:
#line 332 "gramatica.y"
{yyval.ival = COMP_MENOR_IGUAL;}
break;
case 69:
#line 333 "gramatica.y"
{yyval.ival = COMP_IGUAL;}
break;
case 70:
#line 334 "gramatica.y"
{yyval.ival = COMP_DISTINTO;}
break;
case 71:
#line 335 "gramatica.y"
{yyval.ival = '<';}
break;
case 72:
#line 336 "gramatica.y"
{yyval.ival = '>';}
break;
case 73:
#line 339 "gramatica.y"
{yyval.ival = AND;}
break;
case 74:
#line 340 "gramatica.y"
{yyval.ival = OR;}
break;
case 77:
#line 347 "gramatica.y"
{crearTerceto(yyvsp[-4], yyvsp[-2], new ParserVal(-1));}
break;
case 78:
#line 348 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", cadena invalida"); }
break;
case 79:
#line 349 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 80:
#line 350 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 81:
#line 351 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia PRINT invalida"); }
break;
case 82:
#line 354 "gramatica.y"
{
 		addEstructura( "Sentencia PRINT, en la linea: " + analizadorLexico.getNroLineaToken() );
 		yyval = new ParserVal((int)PRINT);
 		}
break;
case 83:
#line 360 "gramatica.y"
{
							     tercetos.get(pila.pop()).setT3(new ParserVal((double)tercetos.size()+1));/*Se modifica el BF, agregandole la referencia correspondiente al proximo terceto despues de la ultima sentencia del bloque*/
							     crearTerceto(new ParserVal(-2), new ParserVal((double)pila.pop()), new ParserVal(-1));/*-2 es BI, se crea un BI al terceto que calcula la condicion del while*/
							     tercetos.get(tercetos.size()-1).setEtiqueta();
							    }
break;
case 84:
#line 367 "gramatica.y"
{
					 int refTerceto = crearTerceto(new ParserVal(-1), yyvsp[-2], new ParserVal(-1));/*el primer-1 es BF*/
					 pila.push(refTerceto);
					 yyval = new ParserVal((double)refTerceto);
					}
break;
case 85:
#line 372 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia iterativa invalida"); }
break;
case 86:
#line 373 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
break;
case 87:
#line 374 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 88:
#line 375 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 89:
#line 377 "gramatica.y"
{ addEstructura( "Sentencia WHILE, en la linea: " + analizadorLexico.getNroLineaToken() );
 		 pila.push(tercetos.size());
 		 tercetos.get(tercetos.size()-1).setEtiqueta();
 	         yyval=yyvsp[0]; }
break;
case 100:
#line 399 "gramatica.y"
{ addEstructura( "Sentencia BREAK, en la linea: " + analizadorLexico.getNroLineaToken() );
 				/*TODO: AGREGAR TERCETO PARA EL BREAK, UN BI*/
 }
break;
case 101:
#line 404 "gramatica.y"
{
 			 addEstructura( "Sentencia de conversion a DOUBLE, en la linea: " + analizadorLexico.getNroLineaToken() );
 			 yyval =  new ParserVal((double)crearTerceto(new ParserVal(DOUBLE), yyvsp[-1], new ParserVal(-1)));
 			 yyval.sval = "DOUBLE";
 			}
break;
case 102:
#line 409 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 103:
#line 412 "gramatica.y"
{
 		      int t = pila.pop();
 		      tercetos.get(tercetos.size()-1).setEtiqueta();
 		      tercetos.get(t).setT3(new ParserVal((double)tercetos.size()));/*Completa el BT del try*/
		     }
break;
case 104:
#line 419 "gramatica.y"
{
 		  /*Primero buscamos el id de la funcion invocada en el try recorriendo la lista de tercetos*/
		  int i = tercetos.size()-1;
		  while( (tercetos.get(i).getT1().ival != CALL) && (i >= 0) )
			i--;
		  /*TODO: AGREGAR IF PARA VERIFICAR SI HAY POSTCONDICION O NO*/
		  pila.push(crearTerceto(new ParserVal(-3), new ParserVal((double)postCondiciones.get(tercetos.get(i).getT2().ival)), new ParserVal(-1)));/*el primer -3 es BT, el 2do parametro hace referencia a la postcondicion de la funcion invocada*/
		 }
break;
case 105:
#line 427 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia TRY-CATCH invalida"); }
break;
case 106:
#line 428 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia TRY-CATCH invalida"); }
break;
case 107:
#line 431 "gramatica.y"
{ addEstructura( "Sentencia TRY-CATCH, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 108:
#line 434 "gramatica.y"
{
                              if(yyvsp[-2].sval!=yyvsp[0].sval)
				addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + yyvsp[-2].sval + " + " + yyvsp[0].sval );
			      yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'+'), yyvsp[-2], yyvsp[0]));
			      yyval.sval=yyvsp[-2].sval;
 		      }
break;
case 109:
#line 440 "gramatica.y"
{
				 if(yyvsp[-2].sval!=yyvsp[0].sval)
					addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + yyvsp[-2].sval + " - " + yyvsp[0].sval );
				 yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'-'), yyvsp[-2], yyvsp[0]));
				 yyval.sval=yyvsp[-2].sval;
		      }
break;
case 110:
#line 446 "gramatica.y"
{ yyval = yyvsp[0] ; }
break;
case 111:
#line 449 "gramatica.y"
{
             if(yyvsp[-2].sval!=yyvsp[0].sval)
                   addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + yyvsp[-2].sval + " * " + yyvsp[0].sval );
	     yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'*'), yyvsp[-2], yyvsp[0]));
	     yyval.sval=yyvsp[-2].sval;
	 }
break;
case 112:
#line 455 "gramatica.y"
{
                if(yyvsp[-2].sval!=yyvsp[0].sval)
                     	addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + yyvsp[-2].sval + " / " + yyvsp[0].sval );
		yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'/'), yyvsp[-2], yyvsp[0]));
		yyval.sval=yyvsp[-2].sval;
	 }
break;
case 113:
#line 461 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 114:
#line 462 "gramatica.y"
{
		      yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'*'), new ParserVal(-1), yyvsp[0]));
		      yyval.sval=yyvsp[-1].sval;
	 }
break;
case 115:
#line 468 "gramatica.y"
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

		Token tVariable = tablaSimbolo.obtenerToken(yyvsp[0].ival);
		if(tVariable.getUso()!="variable" && tVariable.getUso()!="parametro"){
			addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", mal uso del identificador " + tVariable.getLexema());/*este error puede llegar a borrarse si ocurre el unico caso en el que el identificador tiene un buen uso*/
			indiceErrorABorrar= this.erroresSemanticos.size()-1;/*se usa para borrar el error en caso de que el uso sea correcto, es decir que se asigne correctamente a una variable de funcion designada*/
		}
       }
       yyval = yyvsp[0];
       yyval.sval=tablaSimbolo.obtenerToken(yyvsp[0].ival).getTipo();
     }
break;
case 116:
#line 494 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 117:
#line 495 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 118:
#line 496 "gramatica.y"
{  yyval = yyvsp[0];
                       yyval.sval="ULONG";}
break;
case 119:
#line 498 "gramatica.y"
{yyval = yyvsp[0];
                      yyval.sval="DOUBLE";}
break;
#line 1312 "y.tab.c"
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
