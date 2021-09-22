import java.util.ArrayList;

//Clase que contiene todas las A.S. como metodos
public class AccionSemantica {

/*
- Devuelvo el último carácter leido a la entrada.
- Verifico que el lexema no supere los 22 caracteres.
- Busco en la Tabla de Símbolo (se guarda las palabras reservadas en la tabla de simbolos) si el léxema ya existe,
devuelvo el token correspondiente. Sino doy de alta y devuelvo el token.
(recordar que si es una palabra reservada envio Token, miéntras que si es un identificador envio Token mas Clave del Hashmap)
 */
public static boolean accion1(){



    return true;//se reutiliza el caracter
}

/*
 - Inicializo una variable (String) donde voy actualizando el lexema que tengo hasta el momento.
 - Agrego caracter a la variable.
 */
public static boolean accion2(){



    return false; //no se reutiliza el caracter
}

/*
Agrego caracter a la variable.
 */
public static boolean accion3(){



    return false; //no se reutiliza el caracter
}

/*
Reconocer literal y devolver Token
 */
public static boolean accion4(){



    return false; //no se reutiliza el caracter
}

/*
- Devuelvo el último carácter leido a la entrada.
- Verifico que el numero obtenido no supere el rango de enteros esperado.
- Busco en la Tabla de Símbolo si el léxema ya existe,
devuelvo el token correspondiente. Sino, doy de alta y devuelvo el token.
 */
public static boolean accion5(){



    return true;//se reutiliza el caracter
}

/*
Devuelvo el token &&
 */
public static boolean accion6(ArrayList<Integer> tokens){
    tokens.add(274);//token &&
    return false; //no se reutiliza el caracter
}

/*
Devuelvo el token ||
 */
public static boolean accion7(ArrayList<Integer> tokens){
    tokens.add(275);//token ||
    return false; //no se reutiliza el caracter
}

/*
Devuelvo el token :=
 */
public static boolean accion8(ArrayList<Integer> tokens){
    tokens.add(272);//token :=
    return false; //no se reutiliza el caracter
}

/*
Devuelvo el token ==
 */
public static boolean accion9(ArrayList<Integer> tokens){
    tokens.add(273);//token ==
    return false; //no se reutiliza el caracter
}

/*
- Devuelvo el último carácter leído a la entrada.
- Devuelvo el token <
 */
public static boolean accion10(ArrayList<Integer> tokens){
    tokens.add(60);//token <
    return true;//se reutiliza el caracter
}

/*
Devuelvo el token <=
 */
public static boolean accion11(ArrayList<Integer> tokens){
    tokens.add(271);//token <=
    return false; //no se reutiliza el caracter
}

/*
- Devuelvo el último carácter leído a la entrada.
- Devuelvo el token >
 */
public static boolean accion12(ArrayList<Integer> tokens){
    tokens.add(62);//token >
    return true;//se reutiliza el caracter
}

/*
Devuelvo el token >=
 */
public static boolean accion13(ArrayList<Integer> tokens){
    tokens.add(270);//token >=
    return false; //no se reutiliza el caracter
}

/*
- Devuelvo el último carácter leído a la entrada.
- Devuelvo el token *
 */
public static boolean accion14(ArrayList<Integer> tokens){
    tokens.add(42);//token *
    return true;//se reutiliza el caracter
}

/*
- Devuelvo el último carácter leido a la entrada.
- Verifico que el numero obtenido no supere el rango de decimales esperado.
- Busco en la Tabla de Símbolo si el léxema ya existe,
devuelvo el token correspondiente. Sino, doy de alta y devuelvo el token.
 */
public static boolean accion15(){



    return true;//se reutiliza el caracter
}

}
