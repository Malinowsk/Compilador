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
   13,   13,   13,   13,   13,   14,   14,   14,   14,   14,
   14,    3,   12,   18,   18,   19,   19,   19,   19,   19,
   20,   20,   20,   25,   25,   21,   21,   28,   26,   26,
   26,   26,   26,   29,   17,   17,   30,   32,   32,   32,
   32,   32,   32,   31,   31,   27,   27,   22,   22,   22,
   22,   22,   33,   23,   34,   34,   34,   34,   34,   36,
   35,   35,   37,   37,   38,   38,   38,   38,   38,   38,
   39,   40,   40,   24,   41,   41,   41,   42,   16,   16,
   16,   43,   43,   43,   43,   44,   44,   44,   44,   44,
};
short yylen[] = {                                         2,
    3,    2,    2,    1,    3,    2,    2,    2,    1,    2,
    3,    1,    1,    3,    1,    5,    5,    6,    5,    3,
    1,    6,    7,    6,    6,    6,    6,    5,    5,    2,
    5,    5,    4,    4,    2,    6,    6,    5,    4,    4,
    2,    3,    1,    2,    1,    1,    1,    1,    1,    1,
    4,    3,    4,    5,    6,    4,    6,    1,    5,    5,
    4,    4,    6,    1,    3,    1,    3,    1,    1,    1,
    1,    1,    1,    1,    1,    3,    1,    5,    5,    4,
    4,    3,    1,    2,    5,    5,    5,    4,    4,    1,
    3,    1,    2,    1,    1,    1,    1,    1,    1,    1,
    2,    4,    4,    2,    3,    3,    2,    1,    3,    3,
    1,    3,    3,    1,    2,    1,    1,    1,    1,    1,
};
short yydefred[] = {                                      0,
    0,    0,    0,    0,    3,    2,    0,   12,   13,    0,
    4,    0,    0,    0,    9,    0,    0,   10,    0,    1,
    0,    0,    0,    7,    0,    8,    0,    0,   64,   83,
   90,    0,  108,    0,    0,   46,   47,   48,   49,   50,
    0,    0,    0,    0,    0,    0,    0,    5,    0,   11,
    0,    0,    0,    0,    0,    0,   14,    0,    0,   42,
   44,    0,   77,    0,    0,  116,  119,  120,    0,    0,
    0,    0,    0,  118,    0,  117,    0,  114,    0,    0,
    0,    0,    0,   95,   96,   97,   98,   99,   84,   92,
  100,    0,    0,  104,    0,    0,    0,    0,    0,    0,
    0,    0,    0,   20,    0,   43,   52,    0,    0,    0,
   58,    0,    0,    0,    0,    0,    0,  115,   68,   69,
   70,   71,   72,   73,    0,    0,    0,    0,   74,   75,
    0,    0,    0,   82,    0,    0,    0,    0,    0,  101,
    0,    0,    0,  106,  105,    0,    0,    0,    0,   30,
   28,    0,   16,   19,   17,    0,    0,    0,   53,   51,
   76,   56,    0,    0,    0,    0,    0,   61,    0,    0,
    0,    0,   62,   65,  112,  113,   81,    0,   80,    0,
   91,   93,    0,   88,    0,   89,   25,   26,   27,   24,
   18,   35,    0,    0,    0,   22,    0,    0,    0,  103,
  102,    0,    0,   60,    0,   59,   79,   78,   87,   86,
   85,    0,    0,    0,   41,    0,    0,    0,   23,   57,
    0,   54,   63,    0,   33,    0,   34,    0,    0,    0,
   55,   32,   31,   40,    0,    0,    0,   39,   38,    0,
    0,   37,   36,
};
short yydgoto[] = {                                       3,
    4,   10,   20,   11,   12,   99,   18,   14,   26,   15,
   16,  105,  158,  198,  100,   72,   73,   34,   35,   36,
   37,   38,   39,   40,   74,   41,   64,  113,   42,   75,
  131,  127,   43,   44,   89,   45,  138,  139,   91,   76,
   46,   47,   77,   78,
};
short yysindex[] = {                                   -228,
  -33,   22,    0, -142,    0,    0, -184,    0,    0, -168,
    0,   48, -187, -157,    0, -142,   79,    0,  -86,    0,
 -142, -146,    3,    0,   98,    0, -115, -184,    0,    0,
    0, -215,    0, -110,  -86,    0,    0,    0,    0,    0,
 -104,  -37,  -36, -118,  -25, -168, -107,    0,   62,    0,
  132,  -38, -100,  136, -157,  -86,    0,  122,   40,    0,
    0,  -86,    0, -122,  172,    0,    0,    0,  -61,   43,
  -92,   29,  174,    0,  -65,    0,  -26,    0,  158,  177,
 -233, -103,  162,    0,    0,    0,    0,    0,    0,    0,
    0,   56,  181,    0, -243,  -78,  -78,  -64,  -54,  184,
  186,  -31, -184,    0, -135,    0,    0,  173,   49,  -14,
    0,  175, -104,   59,  193,  209,  -32,    0,    0,    0,
    0,    0,    0,    0,   71,   71,   71,   10,    0,    0,
   71,  -92,  -92,    0,  196,  231,   41,    8, -103,    0,
  233,  -35,    7,    0,    0,  237,  238,  243,  250,    0,
    0, -184,    0,    0,    0,  239,  -21, -221,    0,    0,
    0,    0,   37,  263,  139,   74,   47,    0, -201,  -26,
  -26,  107,    0,    0,    0,    0,    0,  247,    0,  248,
    0,    0,   39,    0, -208,    0,    0,    0,    0,    0,
    0,    0,   87,  154,  251,    0,  -40,   51,  255,    0,
    0,  282,  157,    0,  267,    0,    0,    0,    0,    0,
    0,  288,   54,  272,    0,   71,  292,  299,    0,    0,
  286,    0,    0,  295,    0,  298,    0,   46,   90,  301,
    0,    0,    0,    0,  303,  306,  322,    0,    0,  311,
  312,    0,    0,
};
short yyrindex[] = {                                      0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,  -58,    0,    0,    0,
  110,    0,    0,    0,   48,    0,    0,    0,    0,    0,
    0,    0,    0,    0, -129,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,  317,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,  -34,    0,   -9,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,  113,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,  115,    0,
    0,    0,    0,    0,    0,    0,    0,    0,  -62,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,   11,
   18,  103,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,
};
short yygindex[] = {                                      0,
    0,  365,  336,  362,    0,   94,    9,    0,  329,    0,
    0,    0,    0,    0,  111,  -48,  -28,  -23,  -27,  -17,
  -15,   -6,    1,    2,    0,    0,  273,    0,    0,    0,
    0,    0,    0,    0,    0,    0,  246,  343,    0,    0,
    0,    0,   88,   -3,
};
#define YYTABLESIZE 387
short yytable[] = {                                     216,
   15,   98,   70,   81,   71,  185,   66,   71,  169,  153,
  109,   61,  144,   63,   92,  132,   93,  217,  193,   71,
  133,   24,  136,   71,   66,    5,   84,    1,   85,   95,
   50,  111,  106,  111,  195,  111,   57,   86,  110,  145,
   58,  117,   53,  196,   87,   88,  137,  210,    2,  111,
  111,  109,  111,  109,  205,  109,  206,   59,  110,  197,
  110,  211,  110,  142,   84,  165,   85,  118,   22,  109,
  109,  125,  109,  126,   23,   86,  110,  110,  172,  110,
    6,  180,   87,   88,   71,   63,  235,   71,  123,   17,
  124,  125,   17,  126,  226,   19,  125,   13,  126,  179,
   71,   96,  174,   71,  234,   28,   21,  160,  194,   13,
  154,  155,  225,    7,   13,   71,   54,  203,   71,   25,
  156,   84,   28,   85,    8,    9,   45,  157,  175,  176,
   49,   71,   86,   45,   71,   45,  111,  112,   29,   87,
   88,   55,   30,   67,  213,   82,  102,   83,   56,  125,
   31,  126,   29,   29,   60,  101,   30,   30,   32,   62,
  191,   67,   83,   33,   31,   31,    8,    9,  218,   32,
   29,   97,   32,   32,   30,   65,  103,   33,   33,  201,
  107,  125,   31,  126,   66,   67,   68,  228,    8,    9,
   32,  148,   69,   29,  214,   33,  125,  222,  126,  125,
  237,  126,    8,    9,   29,   29,  146,  147,  149,  129,
  130,  114,  170,  171,  128,  115,  134,  135,   15,   79,
  140,  143,  150,   66,  151,  168,  152,   65,    8,    9,
   65,  159,  166,  162,  184,   66,   66,   67,   68,   66,
   67,   68,   65,   80,   69,   17,   65,   69,  111,  167,
  161,   66,   67,   68,  177,   66,   67,   68,   51,   69,
  111,  111,  111,   69,  111,  111,  111,  173,  109,    8,
    9,  178,  181,  183,  111,  110,  186,  187,  188,   52,
  109,  109,  109,  189,  109,  109,  109,  110,  110,  110,
  190,  110,  110,  110,  109,  108,  199,  192,  116,  119,
  120,  110,  121,  200,  204,  207,  208,   65,  209,  215,
   65,  141,  122,  220,  164,  219,   66,   67,   68,   66,
   67,   68,  221,   65,   69,  223,   65,   69,  224,  202,
  227,  229,   66,   67,   68,   66,   67,   68,   65,  230,
   69,   65,  212,   69,  231,  236,  240,   66,   67,   68,
   66,   67,   68,  232,   65,   69,  233,   65,   69,  238,
   67,  239,  241,   66,   67,   68,   66,   67,   68,  242,
  243,   69,   67,    6,   69,   15,  107,   67,   67,   94,
   27,   94,   48,  104,  182,  163,   90,
};
short yycheck[] = {                                      40,
   59,   40,   40,   40,   45,   41,   41,   45,   41,   41,
   59,   35,  256,   41,   40,   42,   45,   58,   40,   45,
   47,   13,  256,   45,   59,   59,   44,  256,   44,   47,
   22,   41,   56,   43,  256,   45,   28,   44,   62,  283,
  256,   70,   40,  265,   44,   44,  280,  256,  277,   59,
   60,   41,   62,   43,  256,   45,  258,  273,   41,  281,
   43,  270,   45,   92,   82,  114,   82,   71,  256,   59,
   60,   43,   62,   45,  262,   82,   59,   60,  127,   62,
   59,   41,   82,   82,   45,  113,   41,   45,   60,  277,
   62,   43,  277,   45,   41,  264,   43,    4,   45,   59,
   45,   40,  131,   45,   59,   44,   59,   59,  157,   16,
  102,  103,   59,  256,   21,   45,   23,  166,   45,  277,
  256,  139,   44,  139,  267,  268,  256,  263,  132,  133,
  277,   45,  139,  263,   45,  265,  259,  260,  257,  139,
  139,   44,  261,   41,  193,  264,   53,  266,  264,   43,
  269,   45,  257,  257,  265,  256,  261,  261,  277,  264,
  152,   59,  266,  282,  269,  269,  267,  268,  197,  277,
  257,   40,  277,  277,  261,  268,   41,  282,  282,   41,
   59,   43,  269,   45,  277,  278,  279,  216,  267,  268,
  277,  256,  285,  256,   41,  282,   43,   41,   45,   43,
  229,   45,  267,  268,  267,  268,   96,   97,   98,  275,
  276,   40,  125,  126,   41,  277,   59,   41,  277,  256,
   59,   41,  277,  258,   41,  258,   41,  268,  267,  268,
  268,   59,   40,   59,  270,  270,  277,  278,  279,  277,
  278,  279,  268,  280,  285,  277,  268,  285,  258,   41,
  265,  277,  278,  279,   59,  277,  278,  279,  256,  285,
  270,  271,  272,  285,  274,  275,  276,  258,  258,  267,
  268,   41,  265,   41,  284,  258,  270,   41,   41,  277,
  270,  271,  272,   41,  274,  275,  276,  270,  271,  272,
   41,  274,  275,  276,  284,  256,  260,   59,  256,  271,
  272,  284,  274,   41,  258,   59,   59,  268,  270,   59,
  268,  256,  284,   59,  256,  265,  277,  278,  279,  277,
  278,  279,   41,  268,  285,   59,  268,  285,   41,  256,
   59,   40,  277,  278,  279,  277,  278,  279,  268,   41,
  285,  268,  256,  285,   59,  256,   41,  277,  278,  279,
  277,  278,  279,   59,  268,  285,   59,  268,  285,   59,
  258,   59,   41,  277,  278,  279,  277,  278,  279,   59,
   59,  285,  270,  264,  285,   59,  264,  275,  276,  265,
   16,   46,   21,   55,  139,  113,   44,
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
"retorno_funcion : error ';'",
"postcondicion : POST ':' '(' condicion ')' ';'",
"postcondicion : POST ':' '(' error ')' ';'",
"postcondicion : POST '(' condicion ')' ';'",
"postcondicion : POST condicion ')' ';'",
"postcondicion : POST '(' condicion ';'",
"postcondicion : error ';'",
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
#line 489 "gramatica.y"

///CODIGO JAVA

private AnalizadorLexico analizadorLexico;
private TablaSimbolo tablaSimbolo;
private ArrayList<String> estructuras = new ArrayList<String>(); //Lista de las estructuras detectadas por el parser
private ArrayList<String> erroresSintacticos = new ArrayList<String>(); //Lista de errores sintacticos detectados por el parser
private ArrayList<String> erroresSemanticos = new ArrayList<String>(); //Lista de errores semanticos detectados por el parser
private int indiceErrorABorrar;//entero utilizado para indicar un error a borrar que corresponde al mal uso de un identificador, en caso de que su uso sea correcto se borrara el error (esto solo sucede cuando se hace una asignacion de una un funcion a una variable de forma correcta)

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

public boolean hayError(){
	return ((this.erroresSintacticos.size()>0) || (this.erroresSemanticos.size()>0));
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
#line 510 "y.tab.c"
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
			    addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", variable redeclarada");
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
			    addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", variable redeclarada");
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
 			    addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", variable redeclarada");
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
 			    addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", variable redeclarada");
 			}
 	         }
break;
case 22:
#line 102 "gramatica.y"
{
 					ambitoActual= ambitoActual.substring(0, ambitoActual.lastIndexOf('.'));
 				}
break;
case 23:
#line 105 "gramatica.y"
{
                               		ambitoActual= ambitoActual.substring(0, ambitoActual.lastIndexOf('.'));
                               }
break;
case 24:
#line 110 "gramatica.y"
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
 		  }
break;
case 25:
#line 129 "gramatica.y"
{ ambitoActual= ambitoActual + '.' + tablaSimbolo.obtenerToken(yyvsp[-3].ival).getLexema(); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", declaracion invalida");
 		  }
break;
case 26:
#line 131 "gramatica.y"
{ ambitoActual= ambitoActual + '.' + "error"; addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", identificador invalido");
 		  }
break;
case 27:
#line 133 "gramatica.y"
{ ambitoActual= ambitoActual + '.' + tablaSimbolo.obtenerToken(yyvsp[-3].ival).getLexema(); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", parametro invalido");
 		  }
break;
case 28:
#line 135 "gramatica.y"
{ ambitoActual= ambitoActual + '.' + tablaSimbolo.obtenerToken(yyvsp[-2].ival).getLexema(); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura");
 		  }
break;
case 29:
#line 137 "gramatica.y"
{ ambitoActual= ambitoActual + '.' + tablaSimbolo.obtenerToken(yyvsp[-2].ival).getLexema(); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre");
 		  }
break;
case 30:
#line 141 "gramatica.y"
{
		tablaSimbolo.obtenerToken(yyvsp[0].ival).setTipo(tipoActual);
		tablaSimbolo.obtenerToken(yyvsp[0].ival).setUso("parametro");
		yyval.ival=yyvsp[0].ival;
	}
break;
case 31:
#line 148 "gramatica.y"
{ addEstructura( "Sentencia RETURN, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 32:
#line 149 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 33:
#line 150 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 34:
#line 151 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 35:
#line 152 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
break;
case 36:
#line 155 "gramatica.y"
{
 			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
 			postCondiciones.put(refFuncion, tercetos.size()-1);/*Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion*/
 			addEstructura( "Sentencia POST, en la linea: " + analizadorLexico.getNroLineaToken() );
 		}
break;
case 37:
#line 160 "gramatica.y"
{
			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
			postCondiciones.put(refFuncion, 0);/*Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion*/
			addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida");
		}
break;
case 38:
#line 165 "gramatica.y"
{
			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
			postCondiciones.put(refFuncion, tercetos.size()-1);/*Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion*/
			addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta :");
		}
break;
case 39:
#line 170 "gramatica.y"
{
			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
			postCondiciones.put(refFuncion, tercetos.size()-1);/*Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion*/
			addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura");
		}
break;
case 40:
#line 175 "gramatica.y"
{
			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
			postCondiciones.put(refFuncion, tercetos.size()-1);/*Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion*/
			addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre");
		}
break;
case 41:
#line 180 "gramatica.y"
{
			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
			postCondiciones.put(refFuncion, 0);/*Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion*/
			addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida");
		}
break;
case 51:
#line 204 "gramatica.y"
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
case 52:
#line 244 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia asignacion invalida"); }
break;
case 53:
#line 245 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 54:
#line 248 "gramatica.y"
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
case 55:
#line 277 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 56:
#line 280 "gramatica.y"
{
 			 tercetos.get(pila.pop()).setT3(new ParserVal((double)tercetos.size()));
 			}
break;
case 57:
#line 283 "gramatica.y"
{
			 tercetos.get(pila.pop()).setT2(new ParserVal((double)tercetos.size()));
			}
break;
case 58:
#line 288 "gramatica.y"
{
	tercetos.get(pila.pop()).setT3(new ParserVal((double)tercetos.size()+1));
	int refTerceto =crearTerceto(new ParserVal(-2), new ParserVal(-1), new ParserVal(-1));/*-2 es BI*/
	pila.push(refTerceto);
	yyval = new ParserVal((double)refTerceto);
	}
break;
case 59:
#line 296 "gramatica.y"
{
 					 int refTerceto = crearTerceto(new ParserVal(-1), yyvsp[-2], new ParserVal(-1));/*el primer-1 es BF*/
					 pila.push(refTerceto);
 					 yyval = new ParserVal((double)refTerceto);
 					 }
break;
case 60:
#line 301 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
break;
case 61:
#line 302 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 62:
#line 303 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 63:
#line 304 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia condicional invalida"); }
break;
case 64:
#line 307 "gramatica.y"
{addEstructura( "Sentencia IF, en la linea: " + analizadorLexico.getNroLineaToken() );
 	  yyval = yyvsp[0];}
break;
case 65:
#line 311 "gramatica.y"
{
	  	yyval = new ParserVal((double)crearTerceto(yyvsp[-1], yyvsp[-2], yyvsp[0]));
	  	}
break;
case 66:
#line 314 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 67:
#line 317 "gramatica.y"
{
			yyval = new ParserVal((double)crearTerceto(yyvsp[-1], yyvsp[-2], yyvsp[0]));
			}
break;
case 68:
#line 322 "gramatica.y"
{yyval.ival = COMP_MAYOR_IGUAL;}
break;
case 69:
#line 323 "gramatica.y"
{yyval.ival = COMP_MENOR_IGUAL;}
break;
case 70:
#line 324 "gramatica.y"
{yyval.ival = COMP_IGUAL;}
break;
case 71:
#line 325 "gramatica.y"
{yyval.ival = COMP_DISTINTO;}
break;
case 72:
#line 326 "gramatica.y"
{yyval.ival = '<';}
break;
case 73:
#line 327 "gramatica.y"
{yyval.ival = '>';}
break;
case 74:
#line 330 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 75:
#line 331 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 78:
#line 338 "gramatica.y"
{crearTerceto(yyvsp[-4], yyvsp[-2], new ParserVal(-1));}
break;
case 79:
#line 339 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", cadena invalida"); }
break;
case 80:
#line 340 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 81:
#line 341 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 82:
#line 342 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia PRINT invalida"); }
break;
case 83:
#line 345 "gramatica.y"
{
 		addEstructura( "Sentencia PRINT, en la linea: " + analizadorLexico.getNroLineaToken() );
 		yyval = new ParserVal((int)PRINT);
 		}
break;
case 84:
#line 351 "gramatica.y"
{
							     tercetos.get(pila.pop()).setT3(new ParserVal((double)tercetos.size()+1));/*Se modifica el BF, agregandole la referencia correspondiente al proximo terceto despues de la ultima sentencia del bloque*/
							     crearTerceto(new ParserVal(-2), new ParserVal((double)pila.pop()), new ParserVal(-1));/*-2 es BI, se crea un BI al terceto que calcula la condicion del while*/
							    }
break;
case 85:
#line 357 "gramatica.y"
{
					 int refTerceto = crearTerceto(new ParserVal(-1), yyvsp[-2], new ParserVal(-1));/*el primer-1 es BF*/
					 pila.push(refTerceto);
					 yyval = new ParserVal((double)refTerceto);
					}
break;
case 86:
#line 362 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia iterativa invalida"); }
break;
case 87:
#line 363 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
break;
case 88:
#line 364 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
break;
case 89:
#line 365 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
break;
case 90:
#line 367 "gramatica.y"
{ addEstructura( "Sentencia WHILE, en la linea: " + analizadorLexico.getNroLineaToken() );
 		 pila.push(tercetos.size());
 	         yyval=yyvsp[0]; }
break;
case 101:
#line 388 "gramatica.y"
{ addEstructura( "Sentencia BREAK, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 102:
#line 391 "gramatica.y"
{
 			 addEstructura( "Sentencia de conversion a DOUBLE, en la linea: " + analizadorLexico.getNroLineaToken() );
 			 yyval =  new ParserVal((double)crearTerceto(new ParserVal(DOUBLE), yyvsp[-1], new ParserVal(-1)));
 			 yyval.sval = "DOUBLE";
 			}
break;
case 103:
#line 396 "gramatica.y"
{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
break;
case 104:
#line 399 "gramatica.y"
{
 		      int t = pila.pop();
 		      tercetos.get(t).setT3(new ParserVal((double)tercetos.size()));/*Completa el BT del try*/
		     }
break;
case 105:
#line 405 "gramatica.y"
{
 		  /*Primero buscamos el id de la funcion invocada en el try recorriendo la lista de tercetos*/
		  int i = tercetos.size()-1;
		  while( (tercetos.get(i).getT1().ival != CALL) && (i >= 0) )
			i--;
		  /*TODO: AGREGAR IF PARA VERIFICAR SI HAY POSTCONDICION O NO*/
		  pila.push(crearTerceto(new ParserVal(-3), new ParserVal((double)postCondiciones.get(tercetos.get(i).getT2().ival)), new ParserVal(-1)));/*el primer -3 es BT, el 2do parametro hace referencia a la postcondicion de la funcion invocada*/
		 }
break;
case 106:
#line 413 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia TRY-CATCH invalida"); }
break;
case 107:
#line 414 "gramatica.y"
{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia TRY-CATCH invalida"); }
break;
case 108:
#line 417 "gramatica.y"
{ addEstructura( "Sentencia TRY-CATCH, en la linea: " + analizadorLexico.getNroLineaToken() ); }
break;
case 109:
#line 420 "gramatica.y"
{
                              if(yyvsp[-2].sval!=yyvsp[0].sval)
				addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + yyvsp[-2].sval + " + " + yyvsp[0].sval );
			      yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'+'), yyvsp[-2], yyvsp[0]));
			      yyval.sval=yyvsp[-2].sval;
 		      }
break;
case 110:
#line 426 "gramatica.y"
{
				 if(yyvsp[-2].sval!=yyvsp[0].sval)
					addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + yyvsp[-2].sval + " - " + yyvsp[0].sval );
				 yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'-'), yyvsp[-2], yyvsp[0]));
				 yyval.sval=yyvsp[-2].sval;
		      }
break;
case 111:
#line 432 "gramatica.y"
{ yyval = yyvsp[0] ; }
break;
case 112:
#line 435 "gramatica.y"
{
             if(yyvsp[-2].sval!=yyvsp[0].sval)
                   addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + yyvsp[-2].sval + " * " + yyvsp[0].sval );
	     yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'*'), yyvsp[-2], yyvsp[0]));
	     yyval.sval=yyvsp[-2].sval;
	 }
break;
case 113:
#line 441 "gramatica.y"
{
                if(yyvsp[-2].sval!=yyvsp[0].sval)
                     	addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + yyvsp[-2].sval + " / " + yyvsp[0].sval );
		yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'/'), yyvsp[-2], yyvsp[0]));
		yyval.sval=yyvsp[-2].sval;
	 }
break;
case 114:
#line 447 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 115:
#line 448 "gramatica.y"
{
		      yyval = new ParserVal((double)crearTerceto(new ParserVal((int)'*'), new ParserVal(-1), yyvsp[0]));
		      yyval.sval=yyvsp[-1].sval;
	 }
break;
case 116:
#line 454 "gramatica.y"
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
case 117:
#line 480 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 118:
#line 481 "gramatica.y"
{yyval = yyvsp[0];}
break;
case 119:
#line 482 "gramatica.y"
{  yyval = yyvsp[0];
                       yyval.sval="ULONG";}
break;
case 120:
#line 484 "gramatica.y"
{yyval = yyvsp[0];
                      yyval.sval="DOUBLE";}
break;
#line 1285 "y.tab.c"
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
