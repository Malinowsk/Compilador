%{
import java.util.ArrayList;
%}

%token
    IF THEN ELSE ENDIF PRINT FUNC RETURN BEGIN END BREAK ULONG DOUBLE WHILE DO
    COMP_MAYOR_IGUAL COMP_MENOR_IGUAL ASIG COMP_IGUAL AND OR ID CTE_ULONG CTE_DOUBLE
    CADENA POST TRY CATCH COMP_DISTINTO


%start programa

%%
 programa : cabecera_programa bloque_declarativo bloque_ejecutable
 ;

 cabecera_programa : ID ';' { addEstructura( "Declaracion de programa, en la linea: " + analizadorLexico.getNroLineaToken() );}
 		   | error ';' { addError("Linea " + analizadorLexico.getNroLineaToken() + ", identificador de programa no valido"); }
 ;
 
 bloque_declarativo : sentencias_declarativas 
 ;
 
 sentencias_declarativas : sentencia_declarativa ';' sentencias_declarativas
                         | sentencia_declarativa ';'
 ;
 
 sentencia_declarativa : tipo lista_variables { addEstructura( "Declaracion de variables, en la linea: " + analizadorLexico.getNroLineaToken() ); }
                       | tipo FUNC '(' tipo ')' lista_variables { addEstructura( "Declaracion de funciones como variables, en la linea: " + analizadorLexico.getNroLineaToken() ); }
                       | sentencia_declarativa_funcion
                       | error lista_variables { addError("Linea " + analizadorLexico.getNroLineaToken() + ", tipo de variable no valido"); }
                       | tipo error lista_variables { addError("Linea " + analizadorLexico.getNroLineaToken() + ", declaracion invalida"); }
                       | tipo FUNC tipo ')' lista_variables { addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
                       | tipo FUNC '(' error ')' lista_variables { addError("Linea " + analizadorLexico.getNroLineaToken() + ", error en la condicion"); }
                       | tipo FUNC '(' tipo  lista_variables { addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }


 ; 

 sentencia_declarativa_funcion : cabecera_funcion bloque_declarativo_funcion BEGIN bloque_ejecutable_funcion retorno_funcion END
                               | cabecera_funcion bloque_declarativo_funcion BEGIN bloque_ejecutable_funcion retorno_funcion postcondicion END
 ;

 cabecera_funcion : tipo FUNC ID '(' parametro ')' { addEstructura( "Declaracion de funcion, en la linea: " + analizadorLexico.getNroLineaToken() ); }
 		  | tipo error ID '(' parametro ')' { addError("Linea " + analizadorLexico.getNroLineaToken() + ", declaracion invalida"); }
 		  | tipo FUNC error '(' parametro ')' { addError("Linea " + analizadorLexico.getNroLineaToken() + ", identificador no valido"); }
 		  | tipo FUNC ID '(' error ')' { addError("Linea " + analizadorLexico.getNroLineaToken() + ", parametro no valido"); }
 		  | tipo FUNC ID parametro ')' { addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
 		  | tipo FUNC ID '(' parametro { addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
 ;

 parametro : tipo ID ///VER SI NO ES NECESARIO MARCAR EL ERROR ACA (EN ESE CASO VER QUE PASA CON CABECERA_FUNCION)
 ;

 bloque_declarativo_funcion : sentencias_declarativas_en_funcion 
 ;
 
 sentencias_declarativas_en_funcion : sentencia_declarativa_en_funcion ';' sentencias_declarativas_en_funcion
                                    | sentencia_declarativa_en_funcion ';'
 ;
 
 sentencia_declarativa_en_funcion : tipo lista_variables { addEstructura( "Declaracion de variables, en la linea: " + analizadorLexico.getNroLineaToken() ); }
 ;    
 
 retorno_funcion : RETURN '(' expresion_aritmetica ')' ';' { addEstructura( "Sentencia RETURN, en la linea: " + analizadorLexico.getNroLineaToken() ); }
 		 | RETURN '(' error ')' ';' { addError("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
 		 | RETURN '(' expresion_aritmetica ';' { addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
 		 | RETURN expresion_aritmetica ')' ';' { addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
 		 | error ';' { addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
 ;

 postcondicion : POST ':' '(' condicion ')' ';' { addEstructura( "Sentencia POST, en la linea: " + analizadorLexico.getNroLineaToken() ); }
	       | POST ':' '(' error ')' ';'  { addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
	       | POST '(' condicion ')' ';'  { addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta :"); }
	       | POST condicion ')' ';'  { addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
	       | POST '(' condicion ';'  { addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
	       | error ';' { addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
 ;

 tipo : ULONG
      | DOUBLE
 ;
 
 lista_variables : ID ',' lista_variables
                 | ID
 ;

 bloque_ejecutable : BEGIN sentencias_ejecutables END
 ;

 bloque_ejecutable_funcion : sentencias_ejecutables
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

 sentencia_asignacion : ID ASIG expresion_aritmetica { addEstructura( "Sentencia de asignacion, en la linea: " + analizadorLexico.getNroLineaToken() ); }
 		      | ID error { addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia asignacion invalida"); }
 ;

 sentencia_llamado_funcion : ID '('expresion_aritmetica ')'{ addEstructura( "Sentencia de llamado a funcion, en la linea: " + analizadorLexico.getNroLineaToken() ); }
			   | ID '(' error ')' ';' { addError("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
			   | ID '(' expresion_aritmetica ';' { addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
			   | ID expresion_aritmetica ')' ';' { addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
			   //| error ';' { addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
 ;

 sentencia_condicional : if '(' condicion ')' THEN bloque_ejecutable_condicional ENDIF
                       | if '(' condicion ')' THEN bloque_ejecutable_condicional ELSE bloque_ejecutable_condicional ENDIF
                       | if '(' error ')' THEN bloque_ejecutable_condicional ENDIF { addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion no valida"); }
                       | if '(' condicion THEN bloque_ejecutable_condicional ENDIF  { addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
                       | if condicion ')' THEN bloque_ejecutable_condicional ENDIF  { addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
                       //| error '(' condicion ')' THEN bloque_ejecutable_condicional ENDIF { addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
 ;

 if : IF {addEstructura( "Sentencia IF, en la linea: " + analizadorLexico.getNroLineaToken() );}
 ;

 condicion : expresion_booleana operacion_booleana condicion
           | expresion_booleana
 ;

 expresion_booleana : expresion_aritmetica comparador expresion_aritmetica
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
                               | sentencia_ejecutable ';'
 ;

 sentencia_imprimir : print '(' CADENA ')'
 		    | print '(' error ')' { addError("Linea " + analizadorLexico.getNroLineaToken() + ", cadena no valida"); }
 		    | print '(' CADENA { addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
 		    | print CADENA ')' { addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
 		    //| error '(' CADENA ')' { addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
 ; 

 print : PRINT { addEstructura( "Sentencia PRINT, en la linea: " + analizadorLexico.getNroLineaToken() ); }
 ;

 sentencia_iterativa : while '(' condicion ')' DO bloque_ejecutable_iterativo
 		     | while '(' condicion ')' bloque_ejecutable_iterativo { addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
 		     | while '(' condicion ')' error bloque_ejecutable_iterativo { addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
 		     | while '(' error ')' DO bloque_ejecutable_iterativo { addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion no valida"); }
 		     //| error '(' condicion ')' DO bloque_ejecutable_iterativo { addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
 		     | while '(' condicion DO bloque_ejecutable_iterativo { addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
 		     | while condicion ')' DO bloque_ejecutable_iterativo { addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
 ;

 while : WHILE { addEstructura( "Sentencia WHILE, en la linea: " + analizadorLexico.getNroLineaToken() ); }
 ;

 bloque_ejecutable_iterativo : BEGIN sentencias_ejecutables_iterativas END
 			     | sentencia_ejecutable_iterativa ';'
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

 sentencia_break : BREAK { addEstructura( "Sentencia BREAK, en la linea: " + analizadorLexico.getNroLineaToken() ); }
 ;

 sentencia_conversion : DOUBLE '(' expresion_aritmetica ')' { addEstructura( "Sentencia de conversion a DOUBLE, en la linea: " + analizadorLexico.getNroLineaToken() ); }
 		      | DOUBLE '(' error ')' ';' { addError("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica no valida"); }
 		      //| error '(' expresion_aritmetica ')' ';' { addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
 		      | DOUBLE '(' expresion_aritmetica ';' { addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
 		      | DOUBLE expresion_aritmetica ')' ';' { addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
 ;

 sentencia_try_catch : try sentencia_ejecutable_con_anidamiento CATCH bloque_ejecutable
 		     | try sentencia_ejecutable_con_anidamiento error bloque_ejecutable { addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
 		     | try sentencia_ejecutable_con_anidamiento bloque_ejecutable { addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
 		     //| error CATCH bloque_ejecutable{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
 ;

 try : TRY { addEstructura( "Sentencia TRY-CATCH, en la linea: " + analizadorLexico.getNroLineaToken() ); }
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
         | '-' factor
         | factor
 ;

 factor : ID
        | CTE_ULONG
        | CTE_DOUBLE
 ;

%%

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