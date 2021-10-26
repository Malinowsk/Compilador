%{
import java.util.ArrayList;
import java.util.Stack;
%}

%token
    IF THEN ELSE ENDIF PRINT FUNC RETURN BEGIN END BREAK ULONG DOUBLE WHILE DO
    COMP_MAYOR_IGUAL COMP_MENOR_IGUAL ASIG COMP_IGUAL AND OR ID CTE_ULONG CTE_DOUBLE
    CADENA POST TRY CATCH COMP_DISTINTO CALL
 

%start programa

%%
 programa : cabecera_programa bloque_declarativo bloque_ejecutable
 ;

 cabecera_programa : ID ';' { addEstructura( "Declaracion de programa, en la linea: " + analizadorLexico.getNroLineaToken() );}
 		   | error ';' { addError("Linea " + analizadorLexico.getNroLineaToken() + ", identificador de programa invalido"); }
 ;
 
 bloque_declarativo : sentencias_declarativas 
 ;
 
 sentencias_declarativas : sentencia_declarativa ';' sentencias_declarativas
                         | sentencia_declarativa ';'
 ;
 
 sentencia_declarativa : tipo lista_variables { addEstructura( "Declaracion de variables, en la linea: " + analizadorLexico.getNroLineaToken() ); }
                       | tipo FUNC '(' tipo ')' lista_variables { addEstructura( "Declaracion de funciones como variables, en la linea: " + analizadorLexico.getNroLineaToken() ); }
                       | sentencia_declarativa_funcion
                       | error lista_variables { addError("Linea " + analizadorLexico.getNroLineaToken() + ", tipo de variable invalida"); }
                       | tipo error lista_variables { addError("Linea " + analizadorLexico.getNroLineaToken() + ", declaracion invalida"); }
                       | tipo FUNC tipo ')' lista_variables { addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
                       | tipo FUNC '(' error ')' lista_variables { addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
                       | tipo FUNC '(' tipo  lista_variables { addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }


 ; 

 sentencia_declarativa_funcion : cabecera_funcion bloque_declarativo_funcion BEGIN bloque_ejecutable_funcion retorno_funcion END
                               | cabecera_funcion bloque_declarativo_funcion BEGIN bloque_ejecutable_funcion retorno_funcion postcondicion END
 ;

 cabecera_funcion : tipo FUNC ID '(' parametro ')' { addEstructura( "Declaracion de funcion, en la linea: " + analizadorLexico.getNroLineaToken() ); }
 		  | tipo error ID '(' parametro ')' { addError("Linea " + analizadorLexico.getNroLineaToken() + ", declaracion invalida"); }
 		  | tipo FUNC error '(' parametro ')' { addError("Linea " + analizadorLexico.getNroLineaToken() + ", identificador invalido"); }
 		  | tipo FUNC ID '(' error ')' { addError("Linea " + analizadorLexico.getNroLineaToken() + ", parametro invalido"); }
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

 postcondicion : POST ':' '(' condicion ')' ';' { addEstructura( "Sentencia POST, en la linea: " + analizadorLexico.getNroLineaToken() ); /*¡POSTCONDICION_VAR= $3.ival?*/}
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
 
 sentencias_ejecutables : sentencia_ejecutable sentencias_ejecutables
                        | sentencia_ejecutable
 ;

 sentencia_ejecutable : sentencia_asignacion
                      | sentencia_condicional
                      | sentencia_imprimir
                      | sentencia_iterativa
                      | sentencia_try_catch
 ; 

 sentencia_asignacion : ID ASIG expresion_aritmetica ';' {
 		       addEstructura( "Sentencia de asignacion, en la linea: " + analizadorLexico.getNroLineaToken() );
		       crearTerceto(ASIG, $1.ival, $3.ival);
		      }
 		      | ID error ';' { addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia asignacion invalida"); }
 ;

 sentencia_llamado_funcion : CALL ID '('expresion_aritmetica ')'{
 			    addEstructura( "Sentencia de llamado a funcion, en la linea: " + analizadorLexico.getNroLineaToken() );
 			    $$ =  new ParserVal(crearTerceto(CALL, $2.ival, $4.ival));
 			   }
			   | CALL ID '(' error ')' ';'{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
 ;

 sentencia_condicional : condicional bloque_ejecutable_condicional ENDIF ';' {
 			 tercetos.get(pila.pop()).setT3(tercetos.size());
 			}//Se modifica el BF, agregandole la referencia correspondiente al proximo terceto despues del ENDIF
                       | condicional bloque_ejecutable_condicional else bloque_ejecutable_condicional ENDIF ';'{
			 tercetos.get(pila.pop()).setT2(tercetos.size());
			}//Se modifica el BI, agregandole la referencia correspondiente al proximo terceto despues del ENDIF
 ;

 else: ELSE{
	tercetos.get(pila.pop()).setT3(tercetos.size()+1);
	int refTerceto =crearTerceto(-2, -1, -1);//-2 es BI
	pila.push(refTerceto);
	$$ = new ParserVal(refTerceto);
	}//Se modifica el BF, agregandole la referencia correspondiente al proximo terceto despues del ELSE, se crea el terceto BI y se agrega a la pila la referencia al mismo

 ;

 condicional : if '(' condicion ')' THEN {
 					 int refTerceto = crearTerceto(-1, $3.ival, -1);//el primer-1 es BF
					 pila.push(refTerceto);
 					 $$ = new ParserVal(refTerceto);
 					 }// se agrega el terceto BF y su referencia a la pila
 	     | if '(' error ')' THEN { addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
 	     | if '(' condicion THEN { addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
 	     | if condicion ')' THEN { addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
 	     | if '(' condicion ')' error ';'{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia condicional invalida"); }
 ;

 if : IF {addEstructura( "Sentencia IF, en la linea: " + analizadorLexico.getNroLineaToken() );
 	  $$ = $1;}
 ;

 condicion : expresion_booleana operacion_booleana condicion{
	  	$$ = new ParserVal(crearTerceto($2.ival, $1.ival, $3.ival));
	  	}
           | expresion_booleana {$$ = $1;}
 ;

 expresion_booleana : expresion_aritmetica comparador expresion_aritmetica{
			$$ = new ParserVal(crearTerceto($2.ival, $1.ival, $3.ival));
			}
 ;

 comparador : COMP_MAYOR_IGUAL {$$.ival = COMP_MAYOR_IGUAL;}
            | COMP_MENOR_IGUAL {$$.ival = COMP_MENOR_IGUAL;}
            | COMP_IGUAL {$$.ival = COMP_IGUAL;}
            | COMP_DISTINTO {$$.ival = COMP_DISTINTO;}
            | '<' {$$.ival = '<';}
            | '>' {$$.ival = '>';}
 ;

 operacion_booleana : AND {$$ = $1;}
                    | OR {$$ = $1;}
 ;

 bloque_ejecutable_condicional : BEGIN sentencias_ejecutables END
                               | sentencia_ejecutable
 ;

 sentencia_imprimir : print '(' CADENA ')' ';'
 		    | print '(' error ')' ';'{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", cadena invalida"); }
 		    | print '(' CADENA ';'{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
 		    | print CADENA ')' ';'{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
 		    | print error ';'{ addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia PRINT invalida"); }
 		    //| error '(' CADENA ')' { addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
 ; 

 print : PRINT { addEstructura( "Sentencia PRINT, en la linea: " + analizadorLexico.getNroLineaToken() ); }
 ;

 sentencia_iterativa : iterativo bloque_ejecutable_iterativo{
							     tercetos.get(pila.pop()).setT3(tercetos.size()+1);//Se modifica el BF, agregandole la referencia correspondiente al proximo terceto despues de la ultima sentencia del bloque
							     int refTerceto = crearTerceto(-2, pila.pop(), -1);//-2 es BI, se crea un BI al terceto que calcula la condicion del while
							    }
 ;

 iterativo : while '(' condicion ')' DO {
					 int refTerceto = crearTerceto(-1, $3.ival, -1);//el primer-1 es BF
					 pila.push(refTerceto);
					 $$ = new ParserVal(refTerceto);
					}// se agrega el terceto BF y su referencia a la pila
	   | while '(' condicion ')' error { addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia iterativa invalida"); }
	   | while '(' error ')' DO { addError("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
	   | while '(' condicion DO { addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
	   | while condicion ')' DO { addError("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }

 while : WHILE { addEstructura( "Sentencia WHILE, en la linea: " + analizadorLexico.getNroLineaToken() );
 		 pila.push(tercetos.size());
 	         $$=$1; }
 ;

 bloque_ejecutable_iterativo : BEGIN sentencias_ejecutables_iterativas END
 			     | sentencia_ejecutable_iterativa
 ;
 
 sentencias_ejecutables_iterativas : sentencia_ejecutable_iterativa sentencias_ejecutables_iterativas
                        | sentencia_ejecutable_iterativa
 ;

 sentencia_ejecutable_iterativa : sentencia_asignacion
                                | sentencia_condicional
                                | sentencia_imprimir
                                | sentencia_iterativa
                                | sentencia_try_catch
                                | sentencia_break
 ; 

 sentencia_break : BREAK ';'{ addEstructura( "Sentencia BREAK, en la linea: " + analizadorLexico.getNroLineaToken() ); }
 ;

 sentencia_conversion : DOUBLE '(' expresion_aritmetica ')'{
 			 addEstructura( "Sentencia de conversion a DOUBLE, en la linea: " + analizadorLexico.getNroLineaToken() );
 			 $$ =  new ParserVal(crearTerceto(DOUBLE, $3.ival, -1));
 			}
 		      | DOUBLE '(' error ')' { addError("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
 ;

 sentencia_try_catch : bifurcacion_try bloque_ejecutable{
		      //tercetos.get(pila.pop()).setT3(tercetos.size());
		     }
 ;

 bifurcacion_try : try sentencia_ejecutable_con_anidamiento CATCH {
		  //pila.push(crearTerceto(-1, ¿POSTCONDICION_VAR?, -1));//el primer -1 es BF
		 }
 		 | try sentencia_ejecutable_con_anidamiento error { addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia TRY-CATCH invalida"); }
  		 | try sentencia_ejecutable_con_anidamiento { addError("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia TRY-CATCH invalida"); }
 ;

 try : TRY { addEstructura( "Sentencia TRY-CATCH, en la linea: " + analizadorLexico.getNroLineaToken() ); }
 ;

 sentencia_ejecutable_con_anidamiento  : sentencia_asignacion
                                       | sentencia_condicional
                                       | sentencia_imprimir
                                       | sentencia_iterativa
 ; 

 expresion_aritmetica : expresion_aritmetica '+' termino {
							  $$ = new ParserVal(crearTerceto('+', $1.ival, $3.ival));
 							 }
		      | expresion_aritmetica '-' termino{
		  				         $$ = new ParserVal(crearTerceto('-', $1.ival, $3.ival));
						        }
		      | termino { $$ = $1 ; }
 ;

 termino : termino '*' factor{
			     $$ = new ParserVal(crearTerceto('*', $1.ival, $3.ival));
			     }
         | termino '/' factor{
			     $$ = new ParserVal(crearTerceto('/', $1.ival, $3.ival));
			     }
         | factor {$$ = $1;}
         | '-' factor {
		      $$ = new ParserVal(crearTerceto('*', -1, $2.ival));
		      }
 ;

 factor : ID {$$ = $1;}
        | sentencia_conversion {$$ = $1;}
        | sentencia_llamado_funcion {$$ = $1;}
        | CTE_ULONG {$$ = $1;}
        | CTE_DOUBLE {$$ = $1;}
 ;

%%

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