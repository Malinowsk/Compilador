public class Automata {

    private Dupla<Integer,Integer> [][] transiciones; // Matriz de transiciones
    private final int CANT_ESTADOS = 18;
    private final int CANT_SIMBOLOS = 19;

    public Automata (){
        transiciones= new Dupla[CANT_ESTADOS][CANT_SIMBOLOS];
        // ACA SE VAN A CARGAR LAS TRANSICIONES
    }

    public int getProximoEstado(int estadoActual,char caracter){
        int columna = getColumna(caracter);
        return this.transiciones[estadoActual][columna].getPrimero();
    }

    private int getColumna(char caracter) {

        if( caracter == 32)
            return 0;
        if( caracter == 0)//Considerar ver el tema de NL
            return 1;
        if( ( (caracter >= 65) && (caracter <= 68) )  || ( (caracter >=70) && (caracter <= 90) ) || ( (caracter >= 97) && (caracter <= 122) ) )
            return 2;
        if( caracter == 69)
            return 3;
        if( caracter == 95)
            return 4;
        if( (caracter >= 48) && (caracter <= 57))
            return 5;
        if( (caracter == 40) || (caracter == 41) || (caracter == 44) || (caracter == 47) || (caracter == 59))
            return 6;
        if(caracter == 45)
            return 7;
        if( caracter == 43)
            return 8;
        if( caracter == 38)
            return 9;
        if( caracter == 124)
            return 10;
        if( caracter == 58)
            return 11;
        if( caracter == 60)
            return 12;
        if( caracter == 62)
            return 13;
        if( caracter == 61)
            return 14;
        if( caracter == 42)
            return 15;
        if( caracter == 46)
            return 16;
        if( caracter == 37)
            return 17;
        else
            return 18;

    }


}
