

%token
    IF THEN ELSE ENDIF PRINT FUNC RETURN BEGIN END BREAK ULONG DOUBLE WHILE DO
    COMP_MAYOR_IGUAL COMP_MENOR_IGUAL ASIG COMP_IGUAL AND OR ID CTE_ULONG CTE_DOUBLE
    CADENA POST TRY CATCH COMP_DISTINTO


%start programa

%% /*Por qué no se pone azul*/
 programa : cabecera_programa bloque_declarativo bloque_ejecutable
 ;

 cabecera_programa : ID ';'
 ;
 
 bloque_declarativo : sentencias_declarativas 
 ;
 
 sentencias_declarativas : sentencia_declarativa ';' sentencias_declarativas
                         | sentencia_declarativa ';'
 ;
 
 sentencia_declarativa : tipo lista_variables
                       | tipo FUNC '(' tipo ')' lista_variables 
                       | sentencia_declarativa_funcion
 ; 

 sentencia_declarativa_funcion : cabecera_funcion bloque_declarativo_funcion BEGIN bloque_ejecutable retorno_funcion END
                               | cabecera_funcion bloque_declarativo_funcion BEGIN bloque_ejecutable retorno_funcion postcondicion END
 ;

 cabecera_funcion : tipo FUNC ID  '('parametro ')'
 ;

 parametro : tipo ID
 ;

 bloque_declarativo_funcion : sentencias_declarativas_en_funcion 
 ;
 
 sentencias_declarativas_en_funcion : sentencia_declarativa_en_funcion ';' sentencias_declarativas_en_funcion
                                 | sentencia_declarativa_en_funcion ';'
 ;
 
 sentencia_declarativa_en_funcion : tipo lista_variables                      
 ;    
 
 retorno_funcion : RETURN '(' expresion_aritmetica ')'
 ;

 postcondicion : POST ':' '('condicion ')' ';'
 ;

 tipo : ULONG
      | DOUBLE
 ;
 
 lista_variables : ID ',' lista_variables
                 | ID
 ;

 bloque_ejecutable : BEGIN sentencias_ejecutables END
 ;
 
 sentencias_ejecutables : sentencia_ejecutable ';' sentencias_ejecutables
                        | sentencia_ejecutable ';'
 ;

 sentencia_ejecutable : sentencia_asignacion
                      | sentencia_llamado_funcion
                      | sentencia_condicional
                      | sentencia_imprimir
                      | sentencia_iterativa
                      | sentencia_conversion
                      | sentencia_try_catch
 ; 

 sentencia_asignacion : ID ASIG expresion_aritmetica
 ;

 sentencia_llamado_funcion : ID '('expresion_aritmetica ')'
 ;

 sentencia_condicional : IF '(' condicion ')' THEN bloque_ejecutable_condicional ENDIF
                       | IF '(' condicion ')' THEN bloque_ejecutable_condicional ELSE bloque_ejecutable_condicional ENDIF
 ;
 
 condicion : expresion_booleana operacion_booleana condicion
           | expresion_booleana
 ;

 expresion_booleana : expresion_aritmetica comparador expresion_aritmetica 
                    | expresion_aritmetica
 ;

 comparador : COMP_MAYOR_IGUAL 
            | COMP_MENOR_IGUAL 
            | COMP_IGUAL
            | COMP_DISTINTO
            | '<'
            | '>'
 ;

 operacion_booleana : AND 
                    | OR
 ;

 bloque_ejecutable_condicional : BEGIN sentencias_ejecutables END
                               | sentencia_ejecutable
 ;

 sentencia_imprimir : PRINT '(' CADENA ')'
 ; 

 sentencia_iterativa : WHILE '(' condicion ')' DO bloque_ejecutable_iterativo
 ;


 bloque_ejecutable_iterativo : BEGIN sentencias_ejecutables_iterativas END
 ;
 
 sentencias_ejecutables_iterativas : sentencia_ejecutable_iterativa ';' sentencias_ejecutables_iterativas
                        | sentencia_ejecutable_iterativa ';'
 ;

 sentencia_ejecutable_iterativa : sentencia_asignacion
                                | sentencia_llamado_funcion
                                | sentencia_condicional
                                | sentencia_imprimir
                                | sentencia_iterativa
                                | sentencia_conversion
                                | sentencia_try_catch
                                | sentencia_break
 ; 

 sentencia_break : BREAK 
 ;

 sentencia_conversion : DOUBLE '(' expresion_aritmetica ')'
 		      | error ';' {}
 ;

 sentencia_try_catch : TRY sentencia_ejecutable_con_anidamiento CATCH bloque_ejecutable
 ;

 sentencia_ejecutable_con_anidamiento  : sentencia_asignacion
                                       | sentencia_llamado_funcion
                                       | sentencia_condicional
                                       | sentencia_imprimir
                                       | sentencia_iterativa
                                       | sentencia_conversion
 ; 

 expresion_aritmetica : expresion_aritmetica '+' termino
           | expresion_aritmetica '-' termino
           | termino
 ;

 termino : termino '*' factor
         | termino '/' factor
         | '-' termino {$$ = -1 * $2}
         | factor
 ;

 factor : ID
        | CTE_ULONG
        | CTE_DOUBLE
 ;

%%

///CODIGO JAVA

private AnalizadorLexico analizadorLexico;

public void setAnalizadorLexico(AnalizadorLexico l){
	this.analizadorLexico = l;
}

private int yylex(){
	Dupla<Integer, Integer> tokenActual = analizadorLexico.getSiguienteToken();
	if(tokenActual.getSegundo() != null)
		yylval = new ParserVal(tokenActual.getSegundo());
	return tokenActual.getPrimero();
}

private void yyerror(String s){

}