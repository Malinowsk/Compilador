import java.math.BigDecimal;
import java.util.ArrayList;

//Clase que contiene todas las A.S. como metodos
public class AccionSemantica {

private static String auxiliar; //variable para acumular caracteres de un mismo lexema

private static final Integer CLAVE_TOKEN_IDENTIFICADOR = 277;
private static final Integer CLAVE_TOKEN_CONSTANTE = 278;
private static final Integer CLAVE_TOKEN_DOUBLE = 279;
private static final Integer CLAVE_TOKEN_CADENA = 280;

private static final Integer PRIMER_PALABRA_RESERVADA = 257;
private static final Integer ULTIMA_PALABRA_RESERVADA = 270;
private static final Integer PRIMER_PALABRA_RESERVADA2 = 281;//debido a que se agrego POST, TRY y CATCH hicimos una segunda tanda de las ctes primer y ultima palabra reservada
private static final Integer ULTIMA_PALABRA_RESERVADA2 = 283;
private static final Integer PRIMER_PALABRA_RESERVADA3 = 285;//debido a la nueva palabra reservada CALL

private static final Integer AND = 275;
private static final Integer OR = 276;
private static final Integer ASIGNACION = 273;
private static final Integer IGUAL = 274;
private static final Integer MENOR = 60;
private static final Integer MENORIGUAL = 272;
private static final Integer MAYOR = 62;
private static final Integer MAYORIGUAL = 271;
private static final Integer MULTIPLICACION = 42;
private static final Integer DOS_PUNTOS = 58;
private static final Integer DISTINTO = 284;

//Aclaracion, siempre que se agrega un token también se agrega el nro de linea correspondiente

/*
- Devuelvo el último carácter leido a la entrada.
- Verifico que el lexema no supere los 22 caracteres.
- Busco en la Tabla de Símbolo (se guarda las palabras reservadas en la tabla de simbolos) si el léxema ya existe,
devuelvo el token correspondiente. Sino doy de alta y devuelvo el token.
(recordar que si es una palabra reservada envio Token, miéntras que si es un identificador envio Token mas Clave del Hashmap)
 */
public static boolean accion1(ArrayList< Dupla<Integer, Integer> > tokens, TablaSimbolo tablaDeSimbolo, ArrayList<Integer> lineas, int nroLinea, ArrayList< String > warnings){
    if (auxiliar.length() <= 22){//no existe el lexema en la tabla de simbolos
        if(!tablaDeSimbolo.existeToken(auxiliar)){
            tablaDeSimbolo.agregarToken(auxiliar, CLAVE_TOKEN_IDENTIFICADOR);//se agrega identificador a la tabla
            tokens.add(new Dupla<Integer, Integer>(CLAVE_TOKEN_IDENTIFICADOR, tablaDeSimbolo.obtenerReferenciaTabla(auxiliar)));
        }
        else{
            int numeroClaveTabla= tablaDeSimbolo.obtenerReferenciaTabla(auxiliar);
            if( ((PRIMER_PALABRA_RESERVADA <= numeroClaveTabla)  && (numeroClaveTabla <= ULTIMA_PALABRA_RESERVADA))
                || ((PRIMER_PALABRA_RESERVADA2 <= numeroClaveTabla)  && (numeroClaveTabla <= ULTIMA_PALABRA_RESERVADA2))
                || PRIMER_PALABRA_RESERVADA3 == numeroClaveTabla ){ //es una palabra reservada
                tokens.add(new Dupla<Integer, Integer>(numeroClaveTabla, null));
            }
            else{//es un identificador que ya estaba en la tabla
                tablaDeSimbolo.agregarToken(auxiliar, CLAVE_TOKEN_IDENTIFICADOR);//se agrega identificador a la tabla
                tokens.add(new Dupla<Integer, Integer>(CLAVE_TOKEN_IDENTIFICADOR, tablaDeSimbolo.refUltimoToken()));
            }
        }
        lineas.add(nroLinea);
    }else{
        warnings.add("Linea " + nroLinea + ", Identificador fuera de rango:"+ auxiliar);
    }
    return true;//se reutiliza el caracter
}

/*
 - Inicializo una variable (String) donde voy actualizando el lexema que tengo hasta el momento.
 - Agrego caracter a la variable.
 */
public static boolean accion2(char caracter){
    auxiliar = "";
    auxiliar+= caracter;//inicia el lexema
    return false; //no se reutiliza el caracter
}

/*
Agrego caracter a la variable.
 */
public static boolean accion3(char caracter){
    auxiliar+= caracter;//agrega al lexema
    return false; //no se reutiliza el caracter
}

/*
Reconocer literal y devolver Token
 */
public static boolean accion4(ArrayList< Dupla<Integer, Integer> > tokens, int caracter, ArrayList<Integer> lineas, int nroLinea){
    tokens.add(new Dupla<Integer, Integer>(caracter, null));
    lineas.add(nroLinea);
    return false; //no se reutiliza el caracter
}

/*
- Devuelvo el último carácter leido a la entrada.
- Verifico que el numero obtenido no supere el rango de enteros esperado.
- Busco en la Tabla de Símbolo si el léxema ya existe,
devuelvo el token correspondiente. Sino, doy de alta y devuelvo el token.
 */
public static boolean accion5(ArrayList< Dupla<Integer, Integer> > tokens, TablaSimbolo tablaDeSimbolo, ArrayList<Integer> lineas, int nroLinea, ArrayList< String > errores){
    if (Double.valueOf(auxiliar) <= (Math.pow(2.0, 32.0 )-1)  && (Double.valueOf(auxiliar)>=0) ){
        if(!tablaDeSimbolo.existeToken(auxiliar)){
            tablaDeSimbolo.agregarToken(auxiliar, CLAVE_TOKEN_CONSTANTE);//se agrega identificador a la tabla
            tablaDeSimbolo.obtenerToken(tablaDeSimbolo.refUltimoToken()).setTipo("ULONG");
        }
    tokens.add(new Dupla<Integer, Integer>(CLAVE_TOKEN_CONSTANTE, tablaDeSimbolo.obtenerReferenciaTabla(auxiliar)));
    lineas.add(nroLinea);
    }else{
        errores.add("Linea " + nroLinea + ", ULong fuera de rango:"+ auxiliar);
    }
    return true;//se reutiliza el caracter
}

/*
Devuelvo el token &&
 */
public static boolean accion6(ArrayList< Dupla<Integer, Integer> > tokens, ArrayList<Integer> lineas, int nroLinea){
    tokens.add(new Dupla<Integer, Integer>(AND, null));
    lineas.add(nroLinea);
    return false; //no se reutiliza el caracter
}

/*
Devuelvo el token ||
 */
public static boolean accion7(ArrayList< Dupla<Integer, Integer> > tokens, ArrayList<Integer> lineas, int nroLinea){
    tokens.add(new Dupla<Integer, Integer>(OR, null));
    lineas.add(nroLinea);
    return false; //no se reutiliza el caracter
}

/*
Devuelvo el token :=
 */
public static boolean accion8(ArrayList< Dupla<Integer, Integer> > tokens, ArrayList<Integer> lineas, int nroLinea){
    tokens.add(new Dupla<Integer, Integer>(ASIGNACION, null));
    lineas.add(nroLinea);
    return false; //no se reutiliza el caracter
}

/*
Devuelvo el token ==
 */
public static boolean accion9(ArrayList< Dupla<Integer, Integer> > tokens, ArrayList<Integer> lineas, int nroLinea){
    tokens.add(new Dupla<Integer, Integer>(IGUAL, null));
    lineas.add(nroLinea);
    return false; //no se reutiliza el caracter
}

/*
- Devuelvo el último carácter leído a la entrada.
- Devuelvo el token <
 */
public static boolean accion10(ArrayList< Dupla<Integer, Integer> > tokens, ArrayList<Integer> lineas, int nroLinea){
    tokens.add(new Dupla<Integer, Integer>(MENOR, null));
    lineas.add(nroLinea);
    return true;//se reutiliza el caracter
}

/*
- Consulta si el caracter es > y devuelve el token <>
- Sino devuelve el token <=
 */
public static boolean accion11(ArrayList< Dupla<Integer, Integer> > tokens, int caracter, ArrayList<Integer> lineas, int nroLinea){
    if(caracter == MAYOR) //token <>
        tokens.add(new Dupla<Integer, Integer>(DISTINTO, null));
    else //token <=
        tokens.add(new Dupla<Integer, Integer>(MENORIGUAL, null));
    lineas.add(nroLinea);
    return false; //no se reutiliza el caracter
}

/*
- Devuelvo el último carácter leído a la entrada.
- Devuelvo el token >
 */
public static boolean accion12(ArrayList< Dupla<Integer, Integer> > tokens, ArrayList<Integer> lineas, int nroLinea){
    tokens.add(new Dupla<Integer, Integer>(MAYOR, null));
    lineas.add(nroLinea);
    return true;//se reutiliza el caracter
}

/*
Devuelvo el token >=
 */
public static boolean accion13(ArrayList< Dupla<Integer, Integer> > tokens, ArrayList<Integer> lineas, int nroLinea){
    tokens.add(new Dupla<Integer, Integer>(MAYORIGUAL, null));
    lineas.add(nroLinea);
    return false; //no se reutiliza el caracter
}

/*
- Devuelvo el último carácter leído a la entrada.
- Devuelvo el token *
 */
public static boolean accion14(ArrayList< Dupla<Integer, Integer> > tokens, ArrayList<Integer> lineas, int nroLinea){
    tokens.add(new Dupla<Integer, Integer>(MULTIPLICACION, null));
    lineas.add(nroLinea);
    return true;//se reutiliza el caracter
}

/*
- Devuelvo el último carácter leido a la entrada.
- Verifico que el numero obtenido no supere el rango de decimales esperado.
- Busco en la Tabla de Símbolo si el léxema ya existe,
devuelvo el token correspondiente. Sino, doy de alta y devuelvo el token.
 */
public static boolean accion15(ArrayList< Dupla<Integer, Integer> > tokens, TablaSimbolo tablaDeSimbolo, ArrayList<Integer> lineas, int nroLinea, ArrayList< String > errores){
    BigDecimal auxiliarBD= new BigDecimal(auxiliar); //transformamos el double a bigdecimal para poder comparar de manera más precisa
    if ( ( (auxiliarBD.compareTo(BigDecimal.valueOf(2.2250738585072014E-308))>0)  && (auxiliarBD.compareTo(BigDecimal.valueOf(1.7976931348623157E+308))<0) )
            || ( auxiliarBD.compareTo(BigDecimal.valueOf(0.0))==0 ) ){
        if(!tablaDeSimbolo.existeToken(auxiliar)){
            tablaDeSimbolo.agregarToken(auxiliar, CLAVE_TOKEN_DOUBLE);//se agrega identificador a la tabla
            tablaDeSimbolo.obtenerToken(tablaDeSimbolo.refUltimoToken()).setTipo("DOUBLE");
        }
        tokens.add(new Dupla<Integer, Integer>(CLAVE_TOKEN_DOUBLE, tablaDeSimbolo.obtenerReferenciaTabla(auxiliar)));
        lineas.add(nroLinea);
    }else{
        errores.add("Linea " + nroLinea + ", Double fuera de rango:"+ auxiliar);
    }
    return true;//se reutiliza el caracter
}

/*
- Agrega +
- Agrega caracter
 */
public static boolean accion16(char caracter){
    auxiliar += '+';
    auxiliar += caracter;
    return false;//no se reutiliza el caracter
}

/*
- Agrega %
- Agrega a la tabla de simbolos si no existe
- Agrega la variable a lista de token
 */
public static boolean accion17(ArrayList< Dupla<Integer, Integer> > tokens, TablaSimbolo tablaDeSimbolo, ArrayList<Integer> lineas, int nroLinea){
    auxiliar += '%';
    if(!tablaDeSimbolo.existeToken(auxiliar)){
        tablaDeSimbolo.agregarToken(auxiliar, CLAVE_TOKEN_CADENA);//se agrega identificador a la tabla
    }
    tokens.add(new Dupla<Integer, Integer>(CLAVE_TOKEN_CADENA, tablaDeSimbolo.obtenerReferenciaTabla(auxiliar)));
    lineas.add(nroLinea);
    return false;//no se reutiliza el caracter
}

/*
- Agrega +
- Agrega %
- Agrega a la tabla de simbolos si no existe
- Agrega la variable a lista de token
 */
///accion 18, agrega la variable a la lista de token. agrega auxiliar a tabla de simbolos si no existe
public static boolean accion18(ArrayList< Dupla<Integer, Integer> > tokens, TablaSimbolo tablaDeSimbolo, ArrayList<Integer> lineas, int nroLinea){
    auxiliar += '+';
    auxiliar += '%';
    if(!tablaDeSimbolo.existeToken(auxiliar)){
        tablaDeSimbolo.agregarToken(auxiliar, CLAVE_TOKEN_CADENA);//se agrega identificador a la tabla
    }
    tokens.add(new Dupla<Integer, Integer>(CLAVE_TOKEN_CADENA, tablaDeSimbolo.obtenerReferenciaTabla(auxiliar)));
    lineas.add(nroLinea);
    return false;//no se reutiliza el caracter
}

/*
- Devuelvo el último carácter leído a la entrada.
- Devuelvo el token :
 */
public static boolean accion19(ArrayList< Dupla<Integer, Integer> > tokens, ArrayList<Integer> lineas, int nroLinea){
    tokens.add(new Dupla<Integer, Integer>(DOS_PUNTOS, null));
    lineas.add(nroLinea);
    return true;//se reutiliza el caracter
}

}
