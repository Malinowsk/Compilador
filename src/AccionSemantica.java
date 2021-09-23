import java.util.ArrayList;

//Clase que contiene todas las A.S. como metodos
public class AccionSemantica {

private static String auxiliar;

private static final Integer CLAVE_TOKEN_IDENTIFICADOR = 276;
private static final Integer CLAVE_TOKEN_CONSTANTE = 277;
private static final Integer CLAVE_TOKEN_DOUBLE = 278;
private static final Integer CLAVE_TOKEN_CADENA = 279;

private static final Integer PRIMER_PALABRA_RESERVADA = 256;
private static final Integer ULTIMA_PALABRA_RESERVADA = 269;

private static final Integer AND = 274;
private static final Integer OR = 275;
private static final Integer ASIGNACION = 272;
private static final Integer IGUAL = 273;
private static final Integer MENOR = 60;
private static final Integer MENORIGUAL = 271;
private static final Integer MAYOR = 62;
private static final Integer MAYORIGUAL = 270;
private static final Integer MULTIPLICACION = 42;

/*
- Devuelvo el último carácter leido a la entrada.
- Verifico que el lexema no supere los 22 caracteres.
- Busco en la Tabla de Símbolo (se guarda las palabras reservadas en la tabla de simbolos) si el léxema ya existe,
devuelvo el token correspondiente. Sino doy de alta y devuelvo el token.
(recordar que si es una palabra reservada envio Token, miéntras que si es un identificador envio Token mas Clave del Hashmap)
 */
public static boolean accion1(ArrayList< Dupla<Integer, Integer> > tokens, TablaSimbolo tablaDeSimbolo){
    if (auxiliar.length() <= 22){
        if(!tablaDeSimbolo.existeToken(auxiliar)){
            tablaDeSimbolo.agregarToken(auxiliar, CLAVE_TOKEN_IDENTIFICADOR);//se agrega identificador a la tabla
            tokens.add(new Dupla<Integer, Integer>(CLAVE_TOKEN_IDENTIFICADOR, tablaDeSimbolo.obtenerNumeroToken(auxiliar)));
        }
        else{
            int numeroClaveTabla= tablaDeSimbolo.obtenerNumeroToken(auxiliar);
            if( (PRIMER_PALABRA_RESERVADA <= numeroClaveTabla)  && (numeroClaveTabla <= ULTIMA_PALABRA_RESERVADA) ){
                tokens.add(new Dupla<Integer, Integer>(numeroClaveTabla, null));
            }
            else{
                tokens.add(new Dupla<Integer, Integer>(CLAVE_TOKEN_IDENTIFICADOR, numeroClaveTabla));
            }
        }
    }else{
        //Genero error
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
    auxiliar+= caracter;//inicia el lexema
    return false; //no se reutiliza el caracter
}

/*
Reconocer literal y devolver Token
 */
public static boolean accion4(ArrayList< Dupla<Integer, Integer> > tokens, int caracter){
    tokens.add(new Dupla<Integer, Integer>(caracter, null));
    return false; //no se reutiliza el caracter
}

/*
- Devuelvo el último carácter leido a la entrada.
- Verifico que el numero obtenido no supere el rango de enteros esperado.
- Busco en la Tabla de Símbolo si el léxema ya existe,
devuelvo el token correspondiente. Sino, doy de alta y devuelvo el token.
 */
public static boolean accion5(ArrayList< Dupla<Integer, Integer> > tokens, TablaSimbolo tablaDeSimbolo){
    if (Integer.valueOf(auxiliar) <= (Math.pow(2.0, 32.0 )-1)  && (Integer.valueOf(auxiliar)>=0) ){
        if(!tablaDeSimbolo.existeToken(auxiliar)){
            tablaDeSimbolo.agregarToken(auxiliar, CLAVE_TOKEN_CONSTANTE);//se agrega identificador a la tabla
        }
    tokens.add(new Dupla<Integer, Integer>(CLAVE_TOKEN_CONSTANTE, tablaDeSimbolo.obtenerNumeroToken(auxiliar)));
    }else{
        //Genero error
    }
    return true;//se reutiliza el caracter
}

/*
Devuelvo el token &&
 */
public static boolean accion6(ArrayList< Dupla<Integer, Integer> > tokens){
    tokens.add(new Dupla<Integer, Integer>(AND, null));
    return false; //no se reutiliza el caracter
}

/*
Devuelvo el token ||
 */
public static boolean accion7(ArrayList< Dupla<Integer, Integer> > tokens){
    tokens.add(new Dupla<Integer, Integer>(OR, null));
    return false; //no se reutiliza el caracter
}

/*
Devuelvo el token :=
 */
public static boolean accion8(ArrayList< Dupla<Integer, Integer> > tokens){
    tokens.add(new Dupla<Integer, Integer>(ASIGNACION, null));
    return false; //no se reutiliza el caracter
}

/*
Devuelvo el token ==
 */
public static boolean accion9(ArrayList< Dupla<Integer, Integer> > tokens){
    tokens.add(new Dupla<Integer, Integer>(IGUAL, null));
    return false; //no se reutiliza el caracter
}

/*
- Devuelvo el último carácter leído a la entrada.
- Devuelvo el token <
 */
public static boolean accion10(ArrayList< Dupla<Integer, Integer> > tokens){
    tokens.add(new Dupla<Integer, Integer>(MENOR, null));
    return true;//se reutiliza el caracter
}

/*
Devuelvo el token <=
 */
public static boolean accion11(ArrayList< Dupla<Integer, Integer> > tokens){
    tokens.add(new Dupla<Integer, Integer>(MENORIGUAL, null));
    return false; //no se reutiliza el caracter
}

/*
- Devuelvo el último carácter leído a la entrada.
- Devuelvo el token >
 */
public static boolean accion12(ArrayList< Dupla<Integer, Integer> > tokens){
    tokens.add(new Dupla<Integer, Integer>(MAYOR, null));
    return true;//se reutiliza el caracter
}

/*
Devuelvo el token >=
 */
public static boolean accion13(ArrayList< Dupla<Integer, Integer> > tokens){
    tokens.add(new Dupla<Integer, Integer>(MAYORIGUAL, null));
    return false; //no se reutiliza el caracter
}

/*
- Devuelvo el último carácter leído a la entrada.
- Devuelvo el token *
 */
public static boolean accion14(ArrayList< Dupla<Integer, Integer> > tokens){
    tokens.add(new Dupla<Integer, Integer>(MULTIPLICACION, null));
    return true;//se reutiliza el caracter
}

/*
- Devuelvo el último carácter leido a la entrada.
- Verifico que el numero obtenido no supere el rango de decimales esperado.
- Busco en la Tabla de Símbolo si el léxema ya existe,
devuelvo el token correspondiente. Sino, doy de alta y devuelvo el token.
 */
public static boolean accion15(ArrayList< Dupla<Integer, Integer> > tokens, TablaSimbolo tablaDeSimbolo){
    if ((Math.pow(2.2250738585072014,-308)<Double.valueOf(auxiliar))  && (Double.valueOf(auxiliar)<Math.pow(1.7976931348623157,308))
        || (Math.pow(-1.7976931348623157,308)<Double.valueOf(auxiliar))  && (Double.valueOf(auxiliar)<Math.pow(-2.2250738585072014,-308))
        || (Double.valueOf(auxiliar)==0.0) ){
        if(!tablaDeSimbolo.existeToken(auxiliar)){
            tablaDeSimbolo.agregarToken(auxiliar, CLAVE_TOKEN_DOUBLE);//se agrega identificador a la tabla
        }
        tokens.add(new Dupla<Integer, Integer>(CLAVE_TOKEN_DOUBLE, tablaDeSimbolo.obtenerNumeroToken(auxiliar)));
    }else{
        //Genero error
    }
    return true;//se reutiliza el caracter
}

///accion 16, agrega + y luego agrega caracter
public static boolean accion16(ArrayList< Dupla<Integer, Integer> > tokens, char caracter){
    auxiliar += '+';
    auxiliar += caracter;
    return false;//se reutiliza el caracter
}


///accion 17, agrega la variable a la lista de token. agrega auxiliar a tabla de simbolos si no existe

public static boolean accion17(ArrayList< Dupla<Integer, Integer> > tokens, TablaSimbolo tablaDeSimbolo){
    if(auxiliar.charAt(auxiliar.length()-1) == '+')
        auxiliar += '+';
    auxiliar += '%';
    if(!tablaDeSimbolo.existeToken(auxiliar)){
        tablaDeSimbolo.agregarToken(auxiliar, CLAVE_TOKEN_CADENA);//se agrega identificador a la tabla
    }
    tokens.add(new Dupla<Integer, Integer>(CLAVE_TOKEN_CADENA, tablaDeSimbolo.obtenerNumeroToken(auxiliar)));
    return false;//se reutiliza el caracter
}

}
