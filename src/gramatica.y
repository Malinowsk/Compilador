%{
import java.util.ArrayList;
import java.util.Stack;
import java.util.HashMap;
%}

%token
    IF THEN ELSE ENDIF PRINT FUNC RETURN BEGIN END BREAK ULONG DOUBLE WHILE DO
    COMP_MAYOR_IGUAL COMP_MENOR_IGUAL ASIG COMP_IGUAL AND OR ID CTE_ULONG CTE_DOUBLE
    CADENA POST TRY CATCH COMP_DISTINTO CALL
 

%start programa

%%
 programa : cabecera_programa bloque_declarativo bloque_ejecutable
 ;

 cabecera_programa : ID ';' { addEstructura( "Declaracion de programa, en la linea: " + analizadorLexico.getNroLineaToken() );
 			      ambitoActual= tablaSimbolo.obtenerValor($1.ival);
 			    }
 		   | error ';' { addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", identificador de programa invalido");
 		    		ambitoActual= "error";}
 ;
 
 bloque_declarativo : sentencias_declarativas 
 ;
 
 sentencias_declarativas : sentencia_declarativa ';' sentencias_declarativas
                         | sentencia_declarativa ';'
 ;
 
 sentencia_declarativa : tipo lista_variables { addEstructura( "Declaracion de variables, en la linea: " + analizadorLexico.getNroLineaToken() ); }
                       | tipo FUNC '(' tipo ')' lista_variables {addEstructura( "Declaracion de funciones como variables, en la linea: " + analizadorLexico.getNroLineaToken() ); }
                       | sentencia_declarativa_funcion
                       | error lista_variables { addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", tipo de variable invalido"); }
                       | tipo error lista_variables { addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", declaracion invalida"); }
                       | tipo FUNC tipo ')' lista_variables { addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
                       | tipo FUNC '(' error ')' lista_variables { addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", tipo de variable invalido"); }
                       | tipo FUNC '(' tipo  lista_variables { addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
 ;

 sentencia_declarativa_funcion : cabecera_funcion bloque_declarativo BEGIN bloque_ejecutable_funcion retorno_funcion END {
 					ambitoActual= ambitoActual.substring(0, ambitoActual.lastIndexOf('.'));
 				}
                               | cabecera_funcion bloque_declarativo BEGIN bloque_ejecutable_funcion retorno_funcion postcondicion END {
                               		ambitoActual= ambitoActual.substring(0, ambitoActual.lastIndexOf('.'));
                               }
 ;

 cabecera_funcion : tipo FUNC ID '(' parametro ')' {
			 String auxiliar = tablaSimbolo.obtenerToken($3.ival).getLexema();
			 if(!tablaSimbolo.existeToken(auxiliar + '.' + ambitoActual)){
			    tablaSimbolo.obtenerToken($3.ival).setLexema(auxiliar+'.'+ambitoActual);
			    tablaSimbolo.obtenerToken($3.ival).setTipo(tipoActual);
			    tablaSimbolo.obtenerToken($3.ival).setUso("funcion");
			    tablaSimbolo.obtenerToken($3.ival).setTipoParametro(tablaSimbolo.obtenerToken($5.ival).getTipo());
			    ambitoActual= ambitoActual + '.' + auxiliar;
			    tablaSimbolo.obtenerToken($5.ival).setLexema(tablaSimbolo.obtenerToken($5.ival).getLexema()+'.'+ambitoActual);
 			 }
 			 else
 			 {
 			     tablaSimbolo.borrarToken($3.ival);
                 	     addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", funcion redeclarada");
 			     $3.ival=tablaSimbolo.obtenerReferenciaTabla(auxiliar+'.'+ ambitoActual);
 			     ambitoActual= ambitoActual + '.' + auxiliar;
 			 }
 			 addEstructura( "Declaracion de funcion, en la linea: " + analizadorLexico.getNroLineaToken() );
 		  }
 		  | tipo error ID '(' parametro ')' { ambitoActual= ambitoActual + '.' + tablaSimbolo.obtenerToken($3.ival).getLexema(); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", declaracion invalida");
 		  }
 		  | tipo FUNC error '(' parametro ')' { ambitoActual= ambitoActual + '.' + "error"; addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", identificador invalido");
 		  }
 		  | tipo FUNC ID '(' error ')' { ambitoActual= ambitoActual + '.' + tablaSimbolo.obtenerToken($3.ival).getLexema(); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", parametro invalido");
 		  }
 		  | tipo FUNC ID parametro ')' { ambitoActual= ambitoActual + '.' + tablaSimbolo.obtenerToken($3.ival).getLexema(); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura");
 		  }
 		  | tipo FUNC ID '(' parametro { ambitoActual= ambitoActual + '.' + tablaSimbolo.obtenerToken($3.ival).getLexema(); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre");
 		  }
 ;

 parametro : tipo ID {
		tablaSimbolo.obtenerToken($2.ival).setTipo(tipoActual);
		tablaSimbolo.obtenerToken($2.ival).setUso("parametro");
		$$.ival=$2.ival;
	}
 ;
 
 retorno_funcion : RETURN '(' expresion_aritmetica ')' ';' { addEstructura( "Sentencia RETURN, en la linea: " + analizadorLexico.getNroLineaToken() ); }
 		 | RETURN '(' error ')' ';' { addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
 		 | RETURN '(' expresion_aritmetica ';' { addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
 		 | RETURN expresion_aritmetica ')' ';' { addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
 		 | error ';' { addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida"); }
 ;

 postcondicion : POST ':' '(' condicion ')' ';' {
 			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
 			postCondiciones.put(refFuncion, tercetos.size()-1);//Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion
 			addEstructura( "Sentencia POST, en la linea: " + analizadorLexico.getNroLineaToken() );
 		}
	       | POST ':' '(' error ')' ';'  {
			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
			postCondiciones.put(refFuncion, 0);//Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion
			addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida");
		}
	       | POST '(' condicion ')' ';'  {
			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
			postCondiciones.put(refFuncion, tercetos.size()-1);//Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion
			addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta :");
		}
	       | POST condicion ')' ';' {
			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
			postCondiciones.put(refFuncion, tercetos.size()-1);//Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion
			addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura");
		}
	       | POST '(' condicion ';' {
			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
			postCondiciones.put(refFuncion, tercetos.size()-1);//Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion
			addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre");
		}
	       | error ';' {
			int refFuncion= tablaSimbolo.obtenerReferenciaTabla(ambitoActual.substring(ambitoActual.lastIndexOf('.')+1, ambitoActual.length())+'.'+ambitoActual.substring(0, ambitoActual.lastIndexOf('.')));
			postCondiciones.put(refFuncion, 0);//Se guarda en el hashmap la posicion del terceto de condicion (ult terceto agregado en este punto) con la clave= ID de la funcion
			addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia invalida");
		}
 ;

 tipo : ULONG {tipoActual= "ULONG";}
      | DOUBLE {tipoActual= "DOUBLE";}
 ;
 
 lista_variables : ID ',' lista_variables {
                        if(!tablaSimbolo.existeToken(tablaSimbolo.obtenerToken($1.ival).getLexema()+'.'+ambitoActual)){
			    tablaSimbolo.obtenerToken($1.ival).setLexema(tablaSimbolo.obtenerToken($1.ival).getLexema()+'.'+ambitoActual);
			    tablaSimbolo.obtenerToken($1.ival).setTipo(tipoActual);
			    tablaSimbolo.obtenerToken($1.ival).setUso("variable");}
			else{
			    tablaSimbolo.borrarToken($1.ival);
			    addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", variable redeclarada");
			}
 		 }
                 | ID{
                        if(!tablaSimbolo.existeToken(tablaSimbolo.obtenerToken($1.ival).getLexema()+'.'+ambitoActual)){
            	            tablaSimbolo.obtenerToken($1.ival).setLexema(tablaSimbolo.obtenerToken($1.ival).getLexema()+'.'+ambitoActual);
			    tablaSimbolo.obtenerToken($1.ival).setTipo(tipoActual);
			    tablaSimbolo.obtenerToken($1.ival).setUso("variable");
			}
			else{
			    tablaSimbolo.borrarToken($1.ival);
			    addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", variable redeclarada");
			}
	         }
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
 		       String auxiliar= ambitoActual;
 		       int ultimoPunto = 0;
 		       while( (!tablaSimbolo.existeToken(tablaSimbolo.obtenerToken($1.ival).getLexema()+'.'+auxiliar)) && (ultimoPunto>=0)){
 		       		ultimoPunto = auxiliar.lastIndexOf('.');
 		       		if(ultimoPunto>0)
 		       			auxiliar = auxiliar.substring(0, ultimoPunto);
 		       }
 		       int nuevaRef = tablaSimbolo.obtenerReferenciaTabla(tablaSimbolo.obtenerToken($1.ival).getLexema()+'.'+auxiliar);
		       if(nuevaRef == -1){
		       		addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", variable no declarada");
		       }
		       else{
		       		tablaSimbolo.borrarToken($1.ival);//se borra de la tabla de simbolos la variable duplicada de la sentencia
		       		$1.ival=nuevaRef;//se le asigna la referencia a la variable original en la tabla
		       }

                	// PREGUNTAR SI AL DETECTAR ERROR DE VARIABLE NO DECLARADA SE AGREGA ESTRUCTURA Y TERCERTO
		        //VER SI HAY QUE AGREGAR EL VALOR AL TOKEN
 		       addEstructura( "Sentencia de asignacion, en la linea: " + analizadorLexico.getNroLineaToken() );
		       if(tablaSimbolo.obtenerToken($1.ival).getTipo()!=$3.sval)
                	        addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + tablaSimbolo.obtenerToken($1.ival).getTipo() + " := " + $3.sval );
		       $$ = new ParserVal((double)crearTerceto(new ParserVal(ASIG), $1, $3));
		      }
 		      | ID error ';' { addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia asignacion invalida"); }
 		      | ID ASIG error ';' { addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
 ;

 sentencia_llamado_funcion : CALL ID '('expresion_aritmetica ')'{
                String auxiliar= ambitoActual;
                int ultimoPunto = 0;
                while( (!tablaSimbolo.existeToken(tablaSimbolo.obtenerToken($2.ival).getLexema()+'.'+auxiliar)) && (ultimoPunto>=0)){
                    ultimoPunto = auxiliar.lastIndexOf('.');
                    if(ultimoPunto>0)
                        auxiliar = auxiliar.substring(0, ultimoPunto);
                }
		int nuevaRef = tablaSimbolo.obtenerReferenciaTabla(tablaSimbolo.obtenerToken($2.ival).getLexema()+'.'+auxiliar);
		if(nuevaRef == -1){
			addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", funcion no declarada");
		}
		else{
			tablaSimbolo.borrarToken($2.ival);//se borra de la tabla de simbolos la variable duplicada de la sentencia
			$2.ival=nuevaRef;//se le asigna la referencia a la variable original en la tabla
			if($4.sval!=tablaSimbolo.obtenerToken($2.ival).getTipoParametro())
				addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", Error en la invocacion a funcion : El tipo de parametro real no coincide con el formal");
		}
		addEstructura( "Sentencia de llamado a funcion, en la linea: " + analizadorLexico.getNroLineaToken() );
		$$ = new ParserVal((double)crearTerceto(new ParserVal(CALL), $2, $4));
		$$.sval = tablaSimbolo.obtenerToken($2.ival).getTipo();
	   }
	   | CALL ID '(' error ')' ';'{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
 ;

 sentencia_condicional : condicional bloque_ejecutable_condicional ENDIF ';' {
 			 tercetos.get(pila.pop()).setT3(new ParserVal((double)tercetos.size()));
 			}//Se modifica el BF, agregandole la referencia correspondiente al proximo terceto despues del ENDIF
                       | condicional bloque_ejecutable_condicional else bloque_ejecutable_condicional ENDIF ';'{
			 tercetos.get(pila.pop()).setT2(new ParserVal((double)tercetos.size()));
			}//Se modifica el BI, agregandole la referencia correspondiente al proximo terceto despues del ENDIF
 ;

 else: ELSE{
	tercetos.get(pila.pop()).setT3(new ParserVal((double)tercetos.size()+1));
	int refTerceto =crearTerceto(new ParserVal(-2), new ParserVal(-1), new ParserVal(-1));//-2 es BI
	pila.push(refTerceto);
	$$ = new ParserVal((double)refTerceto);
	}//Se modifica el BF, agregandole la referencia correspondiente al proximo terceto despues del ELSE, se crea el terceto BI y se agrega a la pila la referencia al mismo
 ;

 condicional : if '(' condicion ')' THEN {
 					 int refTerceto = crearTerceto(new ParserVal(-1), $3, new ParserVal(-1));//el primer-1 es BF
					 pila.push(refTerceto);
 					 $$ = new ParserVal((double)refTerceto);
 					 }// se agrega el terceto BF y su referencia a la pila
 	     | if '(' error ')' THEN { pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
 	     | if '(' condicion THEN { pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
 	     | if condicion ')' THEN { pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
 	     | if '(' condicion ')' error ';'{ pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia condicional invalida"); }
 ;

 if : IF {addEstructura( "Sentencia IF, en la linea: " + analizadorLexico.getNroLineaToken() );
 	  $$ = $1;}
 ;

 condicion : expresion_booleana operacion_booleana condicion{
	  	$$ = new ParserVal((double)crearTerceto($2, $1, $3));
	  	}
           | expresion_booleana {$$ = $1;}
 ;

 expresion_booleana : expresion_aritmetica comparador expresion_aritmetica{
			$$ = new ParserVal((double)crearTerceto($2, $1, $3));
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

 sentencia_imprimir : print '(' CADENA ')' ';' {crearTerceto($1, $3, new ParserVal(-1));}
 		    | print '(' error ')' ';'{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", cadena invalida"); }
 		    | print '(' CADENA ';'{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
 		    | print CADENA ')' ';'{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }
 		    | print error ';'{ addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia PRINT invalida"); }
 ; 

 print : PRINT {
 		addEstructura( "Sentencia PRINT, en la linea: " + analizadorLexico.getNroLineaToken() );
 		$$ = new ParserVal((int)PRINT);
 		}
 ;

 sentencia_iterativa : iterativo bloque_ejecutable_iterativo{
							     tercetos.get(pila.pop()).setT3(new ParserVal((double)tercetos.size()+1));//Se modifica el BF, agregandole la referencia correspondiente al proximo terceto despues de la ultima sentencia del bloque
							     crearTerceto(new ParserVal(-2), new ParserVal((double)pila.pop()), new ParserVal(-1));//-2 es BI, se crea un BI al terceto que calcula la condicion del while
							    }
 ;

 iterativo : while '(' condicion ')' DO {
					 int refTerceto = crearTerceto(new ParserVal(-1), $3, new ParserVal(-1));//el primer-1 es BF
					 pila.push(refTerceto);
					 $$ = new ParserVal((double)refTerceto);
					}// se agrega el terceto BF y su referencia a la pila
	   | while '(' condicion ')' error { pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia iterativa invalida"); }
	   | while '(' error ')' DO { pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", condicion invalida"); }
	   | while '(' condicion DO { pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de cierre"); }
	   | while condicion ')' DO { pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", falta parentesis de apertura"); }

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
 			 $$ =  new ParserVal((double)crearTerceto(new ParserVal(DOUBLE), $3, new ParserVal(-1)));
 			 $$.sval = "DOUBLE";
 			}
 		      | DOUBLE '(' error ')' { addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", expresion aritmetica invalida"); }
 ;

 sentencia_try_catch : bifurcacion_try bloque_ejecutable{
 		      int t = pila.pop();
 		      tercetos.get(t).setT3(new ParserVal((double)tercetos.size()));//Completa el BT del try
		     }
 ;

 bifurcacion_try : try sentencia_ejecutable_con_anidamiento CATCH {
 		  //Primero buscamos el id de la funcion invocada en el try recorriendo la lista de tercetos
		  int i = tercetos.size()-1;
		  while( (tercetos.get(i).getT1().ival != CALL) && (i >= 0) )
			i--;
		  pila.push(crearTerceto(new ParserVal(-3), new ParserVal((double)postCondiciones.get(tercetos.get(i).getT2().ival)), new ParserVal(-1)));//el primer -3 es BT, el 2do parametro hace referencia a la postcondicion de la funcion invocada
		 }
 		 | try sentencia_ejecutable_con_anidamiento error { pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia TRY-CATCH invalida"); }
  		 | try sentencia_ejecutable_con_anidamiento { pila.push(0); addErrorSintactico("Linea " + analizadorLexico.getNroLineaToken() + ", sentencia TRY-CATCH invalida"); }
 ;

 try : TRY { addEstructura( "Sentencia TRY-CATCH, en la linea: " + analizadorLexico.getNroLineaToken() ); }
 ;

 sentencia_ejecutable_con_anidamiento  : sentencia_asignacion {$$=$1;}
 ; 

 expresion_aritmetica : expresion_aritmetica '+' termino {
                              if($1.sval!=$3.sval)
				addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + $1.sval + " + " + $3.sval );
			      $$ = new ParserVal((double)crearTerceto(new ParserVal((int)'+'), $1, $3));
			      $$.sval=$1.sval;
 		      }
		      | expresion_aritmetica '-' termino{
				 if($1.sval!=$3.sval)
					addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + $1.sval + " - " + $3.sval );
				 $$ = new ParserVal((double)crearTerceto(new ParserVal((int)'-'), $1, $3));
				 $$.sval=$1.sval;
		      }
		      | termino { $$ = $1 ; }
 ;

 termino : termino '*' factor{
             if($1.sval!=$3.sval)
                   addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + $1.sval + " * " + $3.sval );
	     $$ = new ParserVal((double)crearTerceto(new ParserVal((int)'*'), $1, $3));
	     $$.sval=$1.sval;
	 }
         | termino '/' factor{
                if($1.sval!=$3.sval)
                     	addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", tipos incompatibles " + $1.sval + " / " + $3.sval );
		$$ = new ParserVal((double)crearTerceto(new ParserVal((int)'/'), $1, $3));
		$$.sval=$1.sval;
	 }
         | factor {$$ = $1;}
         | '-' factor {
		      $$ = new ParserVal((double)crearTerceto(new ParserVal((int)'*'), new ParserVal(-1), $2));
		      $$.sval=$1.sval;
	 }
 ;

 factor : ID {
       String auxiliar= ambitoActual;
       int ultimoPunto = 0;
       while( (!tablaSimbolo.existeToken(tablaSimbolo.obtenerToken($1.ival).getLexema()+'.'+auxiliar)) && (ultimoPunto>=0)){
		ultimoPunto = auxiliar.lastIndexOf('.');
		if(ultimoPunto>0)
			auxiliar = auxiliar.substring(0, ultimoPunto);
       }
       int nuevaRef = tablaSimbolo.obtenerReferenciaTabla(tablaSimbolo.obtenerToken($1.ival).getLexema()+'.'+auxiliar);
       if(nuevaRef == -1){
		addErrorSemantico("Linea " + analizadorLexico.getNroLineaToken() + ", variable no declarada");
       }
       else{
		tablaSimbolo.borrarToken($1.ival);//se borra de la tabla de simbolos la variable duplicada de la sentencia
		$1.ival=nuevaRef;//se le asigna la referencia a la variable original en la tabla
       }
       $$ = $1;
       $$.sval=tablaSimbolo.obtenerToken($1.ival).getTipo();
     }
        | sentencia_conversion {$$ = $1;}
        | sentencia_llamado_funcion {$$ = $1;}
        | CTE_ULONG {  $$ = $1;
                       $$.sval="ULONG";}
        | CTE_DOUBLE {$$ = $1;
                      $$.sval="DOUBLE";}
 ;

%%

///CODIGO JAVA

private AnalizadorLexico analizadorLexico;
private TablaSimbolo tablaSimbolo;
private ArrayList<String> estructuras = new ArrayList<String>(); //Lista de las estructuras detectadas por el parser
private ArrayList<String> erroresSintacticos = new ArrayList<String>(); //Lista de errores sintacticos detectados por el parser
private ArrayList<String> erroresSemanticos = new ArrayList<String>(); //Lista de errores semanticos detectados por el parser

private ArrayList<Terceto> tercetos = new ArrayList<Terceto>(); //Lista de tercetos generados
private Stack<Integer> pila = new Stack<Integer>(); //Pila utilizada para los tercetos

private HashMap<Integer, Integer> postCondiciones = new HashMap<Integer, Integer>();//Hashmap utilizado para guardar el id de las funciones junto a las referencias de sus postcondicion

private String ambitoActual;
private String tipoActual;

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

private int yylex(){
	Dupla<Integer, Integer> tokenActual = analizadorLexico.nextToken();
	if(tokenActual.getSegundo() != null)
		yylval = new ParserVal((int)tokenActual.getSegundo());
	//System.out.println("Token devuelto por yylex: " + tokenActual.getPrimero() );
	return tokenActual.getPrimero();
}

private void yyerror(String s){

}