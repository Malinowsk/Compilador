//Clase que hace del autómata para el analizador lexico
public class Automata {

    private final int CANT_ESTADOS = 19;
    private final int CANT_SIMBOLOS = 19;
    private final int ERROR = -2;
    private final int ESTADO_FINAL = 0;
    private Dupla<Integer,Integer> [][] transiciones; // Matriz de transiciones


    public Automata (){
        transiciones= new Dupla[CANT_ESTADOS][CANT_SIMBOLOS];
        // ACA SE VAN A CARGAR LAS TRANSICIONES
        this.inicializarMatriz();
        this.cargarTransiciones();
        this.cargarAccionesSemanticas();
    }

    public int getProximoEstado(int estadoActual,char caracter){
        int columna = getColumna(caracter);
        return this.transiciones[estadoActual][columna].getPrimero();
    }

    public int getAccionSemantica(int estadoActual,char caracter){
        int columna = getColumna(caracter);
        return this.transiciones[estadoActual][columna].getSegundo();
    }

    private int getColumna(char caracter) {

        if( caracter == 32)
            return 0;
        if( caracter == 10)
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

    public void inicializarMatriz(){
        for(int i=0; i<CANT_ESTADOS; i++){
            for(int j=0; j<CANT_SIMBOLOS; j++){
                transiciones[i][j] = new Dupla<Integer, Integer>(-10,-10);
            }
        }
    }

    public void cargarTransiciones(){
        transiciones[0][0].setPrimero(0);
        transiciones[0][1].setPrimero(0);
        transiciones[0][2].setPrimero(1);
        transiciones[0][3].setPrimero(1);
        transiciones[0][4].setPrimero(1);
        transiciones[0][5].setPrimero(2);
        transiciones[0][6].setPrimero(0);
        transiciones[0][7].setPrimero(0);
        transiciones[0][8].setPrimero(0);
        transiciones[0][9].setPrimero(3);
        transiciones[0][10].setPrimero(4);
        transiciones[0][11].setPrimero(5);
        transiciones[0][12].setPrimero(6);
        transiciones[0][13].setPrimero(7);
        transiciones[0][14].setPrimero(18);
        transiciones[0][15].setPrimero(9);
        transiciones[0][16].setPrimero(10);
        transiciones[0][17].setPrimero(15);
        transiciones[0][18].setPrimero(-2);

        transiciones[1][0].setPrimero(0);
        transiciones[1][1].setPrimero(0);
        transiciones[1][2].setPrimero(1);
        transiciones[1][3].setPrimero(1);
        transiciones[1][4].setPrimero(1);
        transiciones[1][5].setPrimero(1);
        transiciones[1][6].setPrimero(0);
        transiciones[1][7].setPrimero(0);
        transiciones[1][8].setPrimero(0);
        transiciones[1][9].setPrimero(0);
        transiciones[1][10].setPrimero(0);
        transiciones[1][11].setPrimero(0);
        transiciones[1][12].setPrimero(0);
        transiciones[1][13].setPrimero(0);
        transiciones[1][14].setPrimero(0);
        transiciones[1][15].setPrimero(0);
        transiciones[1][16].setPrimero(0);
        transiciones[1][17].setPrimero(0);
        transiciones[1][18].setPrimero(0);

        transiciones[2][0].setPrimero(0);
        transiciones[2][1].setPrimero(0);
        transiciones[2][2].setPrimero(0);
        transiciones[2][3].setPrimero(0);
        transiciones[2][4].setPrimero(0);
        transiciones[2][5].setPrimero(2);
        transiciones[2][6].setPrimero(0);
        transiciones[2][7].setPrimero(0);
        transiciones[2][8].setPrimero(0);
        transiciones[2][9].setPrimero(0);
        transiciones[2][10].setPrimero(0);
        transiciones[2][11].setPrimero(0);
        transiciones[2][12].setPrimero(0);
        transiciones[2][13].setPrimero(0);
        transiciones[2][14].setPrimero(0);
        transiciones[2][15].setPrimero(0);
        transiciones[2][16].setPrimero(11);
        transiciones[2][17].setPrimero(0);
        transiciones[2][18].setPrimero(0);

        transiciones[3][0].setPrimero(-2);
        transiciones[3][1].setPrimero(-2);
        transiciones[3][2].setPrimero(-2);
        transiciones[3][3].setPrimero(-2);
        transiciones[3][4].setPrimero(-2);
        transiciones[3][5].setPrimero(-2);
        transiciones[3][6].setPrimero(-2);
        transiciones[3][7].setPrimero(-2);
        transiciones[3][8].setPrimero(-2);
        transiciones[3][9].setPrimero(0);
        transiciones[3][10].setPrimero(-2);
        transiciones[3][11].setPrimero(-2);
        transiciones[3][12].setPrimero(-2);
        transiciones[3][13].setPrimero(-2);
        transiciones[3][14].setPrimero(-2);
        transiciones[3][15].setPrimero(-2);
        transiciones[3][16].setPrimero(-2);
        transiciones[3][17].setPrimero(-2);
        transiciones[3][18].setPrimero(-2);

        transiciones[4][0].setPrimero(-2);
        transiciones[4][1].setPrimero(-2);
        transiciones[4][2].setPrimero(-2);
        transiciones[4][3].setPrimero(-2);
        transiciones[4][4].setPrimero(-2);
        transiciones[4][5].setPrimero(-2);
        transiciones[4][6].setPrimero(-2);
        transiciones[4][7].setPrimero(-2);
        transiciones[4][8].setPrimero(-2);
        transiciones[4][9].setPrimero(-2);
        transiciones[4][10].setPrimero(0);
        transiciones[4][11].setPrimero(-2);
        transiciones[4][12].setPrimero(-2);
        transiciones[4][13].setPrimero(-2);
        transiciones[4][14].setPrimero(-2);
        transiciones[4][15].setPrimero(-2);
        transiciones[4][16].setPrimero(-2);
        transiciones[4][17].setPrimero(-2);
        transiciones[4][18].setPrimero(-2);

        transiciones[5][0].setPrimero(-2);
        transiciones[5][1].setPrimero(-2);
        transiciones[5][2].setPrimero(-2);
        transiciones[5][3].setPrimero(-2);
        transiciones[5][4].setPrimero(-2);
        transiciones[5][5].setPrimero(-2);
        transiciones[5][6].setPrimero(-2);
        transiciones[5][7].setPrimero(-2);
        transiciones[5][8].setPrimero(-2);
        transiciones[5][9].setPrimero(-2);
        transiciones[5][10].setPrimero(-2);
        transiciones[5][11].setPrimero(-2);
        transiciones[5][12].setPrimero(-2);
        transiciones[5][13].setPrimero(-2);
        transiciones[5][14].setPrimero(0);
        transiciones[5][15].setPrimero(-2);
        transiciones[5][16].setPrimero(-2);
        transiciones[5][17].setPrimero(-2);
        transiciones[5][18].setPrimero(-2);

        transiciones[6][0].setPrimero(0);
        transiciones[6][1].setPrimero(0);
        transiciones[6][2].setPrimero(0);
        transiciones[6][3].setPrimero(0);
        transiciones[6][4].setPrimero(0);
        transiciones[6][5].setPrimero(0);
        transiciones[6][6].setPrimero(0);
        transiciones[6][7].setPrimero(0);
        transiciones[6][8].setPrimero(0);
        transiciones[6][9].setPrimero(0);
        transiciones[6][10].setPrimero(0);
        transiciones[6][11].setPrimero(0);
        transiciones[6][12].setPrimero(0);
        transiciones[6][13].setPrimero(0);
        transiciones[6][14].setPrimero(0);
        transiciones[6][15].setPrimero(0);
        transiciones[6][16].setPrimero(0);
        transiciones[6][17].setPrimero(0);
        transiciones[6][18].setPrimero(0);

        transiciones[7][0].setPrimero(0);
        transiciones[7][1].setPrimero(0);
        transiciones[7][2].setPrimero(0);
        transiciones[7][3].setPrimero(0);
        transiciones[7][4].setPrimero(0);
        transiciones[7][5].setPrimero(0);
        transiciones[7][6].setPrimero(0);
        transiciones[7][7].setPrimero(0);
        transiciones[7][8].setPrimero(0);
        transiciones[7][9].setPrimero(0);
        transiciones[7][10].setPrimero(0);
        transiciones[7][11].setPrimero(0);
        transiciones[7][12].setPrimero(0);
        transiciones[7][13].setPrimero(0);
        transiciones[7][14].setPrimero(0);
        transiciones[7][15].setPrimero(0);
        transiciones[7][16].setPrimero(0);
        transiciones[7][17].setPrimero(0);
        transiciones[7][18].setPrimero(0);

        transiciones[8][0].setPrimero(0);
        transiciones[8][1].setPrimero(0);
        transiciones[8][2].setPrimero(0);
        transiciones[8][3].setPrimero(0);
        transiciones[8][4].setPrimero(0);
        transiciones[8][5].setPrimero(0);
        transiciones[8][6].setPrimero(0);
        transiciones[8][7].setPrimero(0);
        transiciones[8][8].setPrimero(0);
        transiciones[8][9].setPrimero(0);
        transiciones[8][10].setPrimero(0);
        transiciones[8][11].setPrimero(0);
        transiciones[8][12].setPrimero(0);
        transiciones[8][13].setPrimero(0);
        transiciones[8][14].setPrimero(0);
        transiciones[8][15].setPrimero(9);
        transiciones[8][16].setPrimero(0);
        transiciones[8][17].setPrimero(0);
        transiciones[8][18].setPrimero(0);

        transiciones[9][0].setPrimero(9);
        transiciones[9][1].setPrimero(0);
        transiciones[9][2].setPrimero(9);
        transiciones[9][3].setPrimero(9);
        transiciones[9][4].setPrimero(9);
        transiciones[9][5].setPrimero(9);
        transiciones[9][6].setPrimero(9);
        transiciones[9][7].setPrimero(9);
        transiciones[9][8].setPrimero(9);
        transiciones[9][9].setPrimero(9);
        transiciones[9][10].setPrimero(9);
        transiciones[9][11].setPrimero(9);
        transiciones[9][12].setPrimero(9);
        transiciones[9][13].setPrimero(9);
        transiciones[9][14].setPrimero(9);
        transiciones[9][15].setPrimero(9);
        transiciones[9][16].setPrimero(9);
        transiciones[9][17].setPrimero(9);
        transiciones[9][18].setPrimero(9);

        transiciones[10][0].setPrimero(-2);
        transiciones[10][1].setPrimero(-2);
        transiciones[10][2].setPrimero(-2);
        transiciones[10][3].setPrimero(12);
        transiciones[10][4].setPrimero(-2);
        transiciones[10][5].setPrimero(11);
        transiciones[10][6].setPrimero(-2);
        transiciones[10][7].setPrimero(-2);
        transiciones[10][8].setPrimero(-2);
        transiciones[10][9].setPrimero(-2);
        transiciones[10][10].setPrimero(-2);
        transiciones[10][11].setPrimero(-2);
        transiciones[10][12].setPrimero(-2);
        transiciones[10][13].setPrimero(-2);
        transiciones[10][14].setPrimero(-2);
        transiciones[10][15].setPrimero(-2);
        transiciones[10][16].setPrimero(-2);
        transiciones[10][17].setPrimero(-2);
        transiciones[10][18].setPrimero(-2);

        transiciones[11][0].setPrimero(0);
        transiciones[11][1].setPrimero(0);
        transiciones[11][2].setPrimero(0);
        transiciones[11][3].setPrimero(12);
        transiciones[11][4].setPrimero(0);
        transiciones[11][5].setPrimero(11);
        transiciones[11][6].setPrimero(0);
        transiciones[11][7].setPrimero(0);
        transiciones[11][8].setPrimero(0);
        transiciones[11][9].setPrimero(0);
        transiciones[11][10].setPrimero(0);
        transiciones[11][11].setPrimero(0);
        transiciones[11][12].setPrimero(0);
        transiciones[11][13].setPrimero(0);
        transiciones[11][14].setPrimero(0);
        transiciones[11][15].setPrimero(0);
        transiciones[11][16].setPrimero(0);
        transiciones[11][17].setPrimero(0);
        transiciones[11][18].setPrimero(0);

        transiciones[12][0].setPrimero(-2);
        transiciones[12][1].setPrimero(-2);
        transiciones[12][2].setPrimero(-2);
        transiciones[12][3].setPrimero(-2);
        transiciones[12][4].setPrimero(-2);
        transiciones[12][5].setPrimero(14);
        transiciones[12][6].setPrimero(-2);
        transiciones[12][7].setPrimero(13);
        transiciones[12][8].setPrimero(13);
        transiciones[12][9].setPrimero(-2);
        transiciones[12][10].setPrimero(-2);
        transiciones[12][11].setPrimero(-2);
        transiciones[12][12].setPrimero(-2);
        transiciones[12][13].setPrimero(-2);
        transiciones[12][14].setPrimero(-2);
        transiciones[12][15].setPrimero(-2);
        transiciones[12][16].setPrimero(-2);
        transiciones[12][17].setPrimero(-2);
        transiciones[12][18].setPrimero(-2);

        transiciones[13][0].setPrimero(-2);
        transiciones[13][1].setPrimero(-2);
        transiciones[13][2].setPrimero(-2);
        transiciones[13][3].setPrimero(-2);
        transiciones[13][4].setPrimero(-2);
        transiciones[13][5].setPrimero(14);
        transiciones[13][6].setPrimero(-2);
        transiciones[13][7].setPrimero(-2);
        transiciones[13][8].setPrimero(-2);
        transiciones[13][9].setPrimero(-2);
        transiciones[13][10].setPrimero(-2);
        transiciones[13][11].setPrimero(-2);
        transiciones[13][12].setPrimero(-2);
        transiciones[13][13].setPrimero(-2);
        transiciones[13][14].setPrimero(-2);
        transiciones[13][15].setPrimero(-2);
        transiciones[13][16].setPrimero(-2);
        transiciones[13][17].setPrimero(-2);
        transiciones[13][18].setPrimero(-2);

        transiciones[14][0].setPrimero(0);
        transiciones[14][1].setPrimero(0);
        transiciones[14][2].setPrimero(0);
        transiciones[14][3].setPrimero(0);
        transiciones[14][4].setPrimero(0);
        transiciones[14][5].setPrimero(14);
        transiciones[14][6].setPrimero(0);
        transiciones[14][7].setPrimero(0);
        transiciones[14][8].setPrimero(0);
        transiciones[14][9].setPrimero(0);
        transiciones[14][10].setPrimero(0);
        transiciones[14][11].setPrimero(0);
        transiciones[14][12].setPrimero(0);
        transiciones[14][13].setPrimero(0);
        transiciones[14][14].setPrimero(0);
        transiciones[14][15].setPrimero(0);
        transiciones[14][16].setPrimero(0);
        transiciones[14][17].setPrimero(0);
        transiciones[14][18].setPrimero(0);

        transiciones[15][0].setPrimero(15);
        transiciones[15][1].setPrimero(15);
        transiciones[15][2].setPrimero(15);
        transiciones[15][3].setPrimero(15);
        transiciones[15][4].setPrimero(15);
        transiciones[15][5].setPrimero(15);
        transiciones[15][6].setPrimero(15);
        transiciones[15][7].setPrimero(15);
        transiciones[15][8].setPrimero(16);
        transiciones[15][9].setPrimero(15);
        transiciones[15][10].setPrimero(15);
        transiciones[15][11].setPrimero(15);
        transiciones[15][12].setPrimero(15);
        transiciones[15][13].setPrimero(15);
        transiciones[15][14].setPrimero(15);
        transiciones[15][15].setPrimero(15);
        transiciones[15][16].setPrimero(15);
        transiciones[15][17].setPrimero(0);
        transiciones[15][18].setPrimero(15);

        transiciones[16][0].setPrimero(15);
        transiciones[16][1].setPrimero(17);
        transiciones[16][2].setPrimero(15);
        transiciones[16][3].setPrimero(15);
        transiciones[16][4].setPrimero(15);
        transiciones[16][5].setPrimero(15);
        transiciones[16][6].setPrimero(15);
        transiciones[16][7].setPrimero(15);
        transiciones[16][8].setPrimero(15);
        transiciones[16][9].setPrimero(15);
        transiciones[16][10].setPrimero(15);
        transiciones[16][11].setPrimero(15);
        transiciones[16][12].setPrimero(15);
        transiciones[16][13].setPrimero(15);
        transiciones[16][14].setPrimero(15);
        transiciones[16][15].setPrimero(15);
        transiciones[16][16].setPrimero(15);
        transiciones[16][17].setPrimero(0);
        transiciones[16][18].setPrimero(15);

        transiciones[17][0].setPrimero(-2);
        transiciones[17][1].setPrimero(-2);
        transiciones[17][2].setPrimero(-2);
        transiciones[17][3].setPrimero(-2);
        transiciones[17][4].setPrimero(-2);
        transiciones[17][5].setPrimero(-2);
        transiciones[17][6].setPrimero(-2);
        transiciones[17][7].setPrimero(-2);
        transiciones[17][8].setPrimero(15);
        transiciones[17][9].setPrimero(-2);
        transiciones[17][10].setPrimero(-2);
        transiciones[17][11].setPrimero(-2);
        transiciones[17][12].setPrimero(-2);
        transiciones[17][13].setPrimero(-2);
        transiciones[17][14].setPrimero(-2);
        transiciones[17][15].setPrimero(-2);
        transiciones[17][16].setPrimero(-2);
        transiciones[17][17].setPrimero(-2);
        transiciones[17][18].setPrimero(-2);

        transiciones[18][0].setPrimero(-2);
        transiciones[18][1].setPrimero(-2);
        transiciones[18][2].setPrimero(-2);
        transiciones[18][3].setPrimero(-2);
        transiciones[18][4].setPrimero(-2);
        transiciones[18][5].setPrimero(-2);
        transiciones[18][6].setPrimero(-2);
        transiciones[18][7].setPrimero(-2);
        transiciones[18][8].setPrimero(-2);
        transiciones[18][9].setPrimero(-2);
        transiciones[18][10].setPrimero(-2);
        transiciones[18][11].setPrimero(-2);
        transiciones[18][12].setPrimero(-2);
        transiciones[18][13].setPrimero(-2);
        transiciones[18][14].setPrimero(0);
        transiciones[18][15].setPrimero(-2);
        transiciones[18][16].setPrimero(-2);
        transiciones[18][17].setPrimero(-2);
        transiciones[18][18].setPrimero(-2);
    }

    public void cargarAccionesSemanticas(){

        transiciones[0][0].setSegundo(0);
        transiciones[0][1].setSegundo(0);
        transiciones[0][2].setSegundo(2);
        transiciones[0][3].setSegundo(2);
        transiciones[0][4].setSegundo(2);
        transiciones[0][5].setSegundo(2);
        transiciones[0][6].setSegundo(4);
        transiciones[0][7].setSegundo(4);
        transiciones[0][8].setSegundo(4);
        transiciones[0][9].setSegundo(0);
        transiciones[0][10].setSegundo(0);
        transiciones[0][11].setSegundo(0);
        transiciones[0][12].setSegundo(0);
        transiciones[0][13].setSegundo(0);
        transiciones[0][14].setSegundo(0);
        transiciones[0][15].setSegundo(0);
        transiciones[0][16].setSegundo(2);
        transiciones[0][17].setSegundo(2);
        transiciones[0][18].setSegundo(0);

        transiciones[1][0].setSegundo(1);
        transiciones[1][1].setSegundo(1);
        transiciones[1][2].setSegundo(3);
        transiciones[1][3].setSegundo(3);
        transiciones[1][4].setSegundo(3);
        transiciones[1][5].setSegundo(3);
        transiciones[1][6].setSegundo(1);
        transiciones[1][7].setSegundo(1);
        transiciones[1][8].setSegundo(1);
        transiciones[1][9].setSegundo(1);
        transiciones[1][10].setSegundo(1);
        transiciones[1][11].setSegundo(1);
        transiciones[1][12].setSegundo(1);
        transiciones[1][13].setSegundo(1);
        transiciones[1][14].setSegundo(1);
        transiciones[1][15].setSegundo(1);
        transiciones[1][16].setSegundo(1);
        transiciones[1][17].setSegundo(1);
        transiciones[1][18].setSegundo(1);

        transiciones[2][0].setSegundo(5);
        transiciones[2][1].setSegundo(5);
        transiciones[2][2].setSegundo(5);
        transiciones[2][3].setSegundo(5);
        transiciones[2][4].setSegundo(5);
        transiciones[2][5].setSegundo(3);
        transiciones[2][6].setSegundo(5);
        transiciones[2][7].setSegundo(5);
        transiciones[2][8].setSegundo(5);
        transiciones[2][9].setSegundo(5);
        transiciones[2][10].setSegundo(5);
        transiciones[2][11].setSegundo(5);
        transiciones[2][12].setSegundo(5);
        transiciones[2][13].setSegundo(5);
        transiciones[2][14].setSegundo(5);
        transiciones[2][15].setSegundo(5);
        transiciones[2][16].setSegundo(3);
        transiciones[2][17].setSegundo(5);
        transiciones[2][18].setSegundo(5);

        transiciones[3][0].setSegundo(0);
        transiciones[3][1].setSegundo(0);
        transiciones[3][2].setSegundo(0);
        transiciones[3][3].setSegundo(0);
        transiciones[3][4].setSegundo(0);
        transiciones[3][5].setSegundo(0);
        transiciones[3][6].setSegundo(0);
        transiciones[3][7].setSegundo(0);
        transiciones[3][8].setSegundo(0);
        transiciones[3][9].setSegundo(6);
        transiciones[3][10].setSegundo(0);
        transiciones[3][11].setSegundo(0);
        transiciones[3][12].setSegundo(0);
        transiciones[3][13].setSegundo(0);
        transiciones[3][14].setSegundo(0);
        transiciones[3][15].setSegundo(0);
        transiciones[3][16].setSegundo(0);
        transiciones[3][17].setSegundo(0);
        transiciones[3][18].setSegundo(0);

        transiciones[4][0].setSegundo(0);
        transiciones[4][1].setSegundo(0);
        transiciones[4][2].setSegundo(0);
        transiciones[4][3].setSegundo(0);
        transiciones[4][4].setSegundo(0);
        transiciones[4][5].setSegundo(0);
        transiciones[4][6].setSegundo(0);
        transiciones[4][7].setSegundo(0);
        transiciones[4][8].setSegundo(0);
        transiciones[4][9].setSegundo(0);
        transiciones[4][10].setSegundo(7);
        transiciones[4][11].setSegundo(0);
        transiciones[4][12].setSegundo(0);
        transiciones[4][13].setSegundo(0);
        transiciones[4][14].setSegundo(0);
        transiciones[4][15].setSegundo(0);
        transiciones[4][16].setSegundo(0);
        transiciones[4][17].setSegundo(0);
        transiciones[4][18].setSegundo(0);

        transiciones[5][0].setSegundo(0);
        transiciones[5][1].setSegundo(0);
        transiciones[5][2].setSegundo(0);
        transiciones[5][3].setSegundo(0);
        transiciones[5][4].setSegundo(0);
        transiciones[5][5].setSegundo(0);
        transiciones[5][6].setSegundo(0);
        transiciones[5][7].setSegundo(0);
        transiciones[5][8].setSegundo(0);
        transiciones[5][9].setSegundo(0);
        transiciones[5][10].setSegundo(0);
        transiciones[5][11].setSegundo(0);
        transiciones[5][12].setSegundo(0);
        transiciones[5][13].setSegundo(0);
        transiciones[5][14].setSegundo(8);
        transiciones[5][15].setSegundo(0);
        transiciones[5][16].setSegundo(0);
        transiciones[5][17].setSegundo(0);
        transiciones[5][18].setSegundo(0);

        transiciones[6][0].setSegundo(10);
        transiciones[6][1].setSegundo(10);
        transiciones[6][2].setSegundo(10);
        transiciones[6][3].setSegundo(10);
        transiciones[6][4].setSegundo(10);
        transiciones[6][5].setSegundo(10);
        transiciones[6][6].setSegundo(10);
        transiciones[6][7].setSegundo(10);
        transiciones[6][8].setSegundo(10);
        transiciones[6][9].setSegundo(10);
        transiciones[6][10].setSegundo(10);
        transiciones[6][11].setSegundo(10);
        transiciones[6][12].setSegundo(10);
        transiciones[6][13].setSegundo(11);
        transiciones[6][14].setSegundo(11);
        transiciones[6][15].setSegundo(10);
        transiciones[6][16].setSegundo(10);
        transiciones[6][17].setSegundo(10);
        transiciones[6][18].setSegundo(10);

        transiciones[7][0].setSegundo(12);
        transiciones[7][1].setSegundo(12);
        transiciones[7][2].setSegundo(12);
        transiciones[7][3].setSegundo(12);
        transiciones[7][4].setSegundo(12);
        transiciones[7][5].setSegundo(12);
        transiciones[7][6].setSegundo(12);
        transiciones[7][7].setSegundo(12);
        transiciones[7][8].setSegundo(12);
        transiciones[7][9].setSegundo(12);
        transiciones[7][10].setSegundo(12);
        transiciones[7][11].setSegundo(12);
        transiciones[7][12].setSegundo(12);
        transiciones[7][13].setSegundo(12);
        transiciones[7][14].setSegundo(13);
        transiciones[7][15].setSegundo(12);
        transiciones[7][16].setSegundo(12);
        transiciones[7][17].setSegundo(12);
        transiciones[7][18].setSegundo(12);

        transiciones[8][0].setSegundo(14);
        transiciones[8][1].setSegundo(14);
        transiciones[8][2].setSegundo(14);
        transiciones[8][3].setSegundo(14);
        transiciones[8][4].setSegundo(14);
        transiciones[8][5].setSegundo(14);
        transiciones[8][6].setSegundo(14);
        transiciones[8][7].setSegundo(14);
        transiciones[8][8].setSegundo(14);
        transiciones[8][9].setSegundo(14);
        transiciones[8][10].setSegundo(14);
        transiciones[8][11].setSegundo(14);
        transiciones[8][12].setSegundo(14);
        transiciones[8][13].setSegundo(14);
        transiciones[8][14].setSegundo(14);
        transiciones[8][15].setSegundo(0);
        transiciones[8][16].setSegundo(14);
        transiciones[8][17].setSegundo(14);
        transiciones[8][18].setSegundo(14);

        transiciones[9][0].setSegundo(0);
        transiciones[9][1].setSegundo(0);
        transiciones[9][2].setSegundo(0);
        transiciones[9][3].setSegundo(0);
        transiciones[9][4].setSegundo(0);
        transiciones[9][5].setSegundo(0);
        transiciones[9][6].setSegundo(0);
        transiciones[9][7].setSegundo(0);
        transiciones[9][8].setSegundo(0);
        transiciones[9][9].setSegundo(0);
        transiciones[9][10].setSegundo(0);
        transiciones[9][11].setSegundo(0);
        transiciones[9][12].setSegundo(0);
        transiciones[9][13].setSegundo(0);
        transiciones[9][14].setSegundo(0);
        transiciones[9][15].setSegundo(0);
        transiciones[9][16].setSegundo(0);
        transiciones[9][17].setSegundo(0);
        transiciones[9][18].setSegundo(0);

        transiciones[10][0].setSegundo(0);
        transiciones[10][1].setSegundo(0);
        transiciones[10][2].setSegundo(0);
        transiciones[10][3].setSegundo(3);
        transiciones[10][4].setSegundo(0);
        transiciones[10][5].setSegundo(3);
        transiciones[10][6].setSegundo(0);
        transiciones[10][7].setSegundo(0);
        transiciones[10][8].setSegundo(0);
        transiciones[10][9].setSegundo(0);
        transiciones[10][10].setSegundo(0);
        transiciones[10][11].setSegundo(0);
        transiciones[10][12].setSegundo(0);
        transiciones[10][13].setSegundo(0);
        transiciones[10][14].setSegundo(0);
        transiciones[10][15].setSegundo(0);
        transiciones[10][16].setSegundo(0);
        transiciones[10][17].setSegundo(0);
        transiciones[10][18].setSegundo(0);

        transiciones[11][0].setSegundo(15);
        transiciones[11][1].setSegundo(15);
        transiciones[11][2].setSegundo(15);
        transiciones[11][3].setSegundo(3);
        transiciones[11][4].setSegundo(15);
        transiciones[11][5].setSegundo(3);
        transiciones[11][6].setSegundo(15);
        transiciones[11][7].setSegundo(15);
        transiciones[11][8].setSegundo(15);
        transiciones[11][9].setSegundo(15);
        transiciones[11][10].setSegundo(15);
        transiciones[11][11].setSegundo(15);
        transiciones[11][12].setSegundo(15);
        transiciones[11][13].setSegundo(15);
        transiciones[11][14].setSegundo(15);
        transiciones[11][15].setSegundo(15);
        transiciones[11][16].setSegundo(15);
        transiciones[11][17].setSegundo(15);
        transiciones[11][18].setSegundo(15);

        transiciones[12][0].setSegundo(0);
        transiciones[12][1].setSegundo(0);
        transiciones[12][2].setSegundo(0);
        transiciones[12][3].setSegundo(0);
        transiciones[12][4].setSegundo(0);
        transiciones[12][5].setSegundo(3);
        transiciones[12][6].setSegundo(0);
        transiciones[12][7].setSegundo(3);
        transiciones[12][8].setSegundo(3);
        transiciones[12][9].setSegundo(0);
        transiciones[12][10].setSegundo(0);
        transiciones[12][11].setSegundo(0);
        transiciones[12][12].setSegundo(0);
        transiciones[12][13].setSegundo(0);
        transiciones[12][14].setSegundo(0);
        transiciones[12][15].setSegundo(0);
        transiciones[12][16].setSegundo(0);
        transiciones[12][17].setSegundo(0);
        transiciones[12][18].setSegundo(0);

        transiciones[13][0].setSegundo(0);
        transiciones[13][1].setSegundo(0);
        transiciones[13][2].setSegundo(0);
        transiciones[13][3].setSegundo(0);
        transiciones[13][4].setSegundo(0);
        transiciones[13][5].setSegundo(3);
        transiciones[13][6].setSegundo(0);
        transiciones[13][7].setSegundo(0);
        transiciones[13][8].setSegundo(0);
        transiciones[13][9].setSegundo(0);
        transiciones[13][10].setSegundo(0);
        transiciones[13][11].setSegundo(0);
        transiciones[13][12].setSegundo(0);
        transiciones[13][13].setSegundo(0);
        transiciones[13][14].setSegundo(0);
        transiciones[13][15].setSegundo(0);
        transiciones[13][16].setSegundo(0);
        transiciones[13][17].setSegundo(0);
        transiciones[13][18].setSegundo(0);

        transiciones[14][0].setSegundo(15);
        transiciones[14][1].setSegundo(15);
        transiciones[14][2].setSegundo(15);
        transiciones[14][3].setSegundo(15);
        transiciones[14][4].setSegundo(15);
        transiciones[14][5].setSegundo(3);
        transiciones[14][6].setSegundo(15);
        transiciones[14][7].setSegundo(15);
        transiciones[14][8].setSegundo(15);
        transiciones[14][9].setSegundo(15);
        transiciones[14][10].setSegundo(15);
        transiciones[14][11].setSegundo(15);
        transiciones[14][12].setSegundo(15);
        transiciones[14][13].setSegundo(15);
        transiciones[14][14].setSegundo(15);
        transiciones[14][15].setSegundo(15);
        transiciones[14][16].setSegundo(15);
        transiciones[14][17].setSegundo(15);
        transiciones[14][18].setSegundo(15);

        transiciones[15][0].setSegundo(3);
        transiciones[15][1].setSegundo(3);
        transiciones[15][2].setSegundo(3);
        transiciones[15][3].setSegundo(3);
        transiciones[15][4].setSegundo(3);
        transiciones[15][5].setSegundo(3);
        transiciones[15][6].setSegundo(3);
        transiciones[15][7].setSegundo(3);
        transiciones[15][8].setSegundo(0);
        transiciones[15][9].setSegundo(3);
        transiciones[15][10].setSegundo(3);
        transiciones[15][11].setSegundo(3);
        transiciones[15][12].setSegundo(3);
        transiciones[15][13].setSegundo(3);
        transiciones[15][14].setSegundo(3);
        transiciones[15][15].setSegundo(3);
        transiciones[15][16].setSegundo(3);
        transiciones[15][17].setSegundo(17);
        transiciones[15][18].setSegundo(3);

        transiciones[16][0].setSegundo(16);
        transiciones[16][1].setSegundo(0);
        transiciones[16][2].setSegundo(16);
        transiciones[16][3].setSegundo(16);
        transiciones[16][4].setSegundo(16);
        transiciones[16][5].setSegundo(16);
        transiciones[16][6].setSegundo(16);
        transiciones[16][7].setSegundo(16);
        transiciones[16][8].setSegundo(16);
        transiciones[16][9].setSegundo(16);
        transiciones[16][10].setSegundo(16);
        transiciones[16][11].setSegundo(16);
        transiciones[16][12].setSegundo(16);
        transiciones[16][13].setSegundo(16);
        transiciones[16][14].setSegundo(16);
        transiciones[16][15].setSegundo(16);
        transiciones[16][16].setSegundo(16);
        transiciones[16][17].setSegundo(18);
        transiciones[16][18].setSegundo(16);

        transiciones[17][0].setSegundo(0);
        transiciones[17][1].setSegundo(0);
        transiciones[17][2].setSegundo(0);
        transiciones[17][3].setSegundo(0);
        transiciones[17][4].setSegundo(0);
        transiciones[17][5].setSegundo(0);
        transiciones[17][6].setSegundo(0);
        transiciones[17][7].setSegundo(0);
        transiciones[17][8].setSegundo(0);
        transiciones[17][9].setSegundo(0);
        transiciones[17][10].setSegundo(0);
        transiciones[17][11].setSegundo(0);
        transiciones[17][12].setSegundo(0);
        transiciones[17][13].setSegundo(0);
        transiciones[17][14].setSegundo(0);
        transiciones[17][15].setSegundo(0);
        transiciones[17][16].setSegundo(0);
        transiciones[17][17].setSegundo(0);
        transiciones[17][18].setSegundo(0);

        transiciones[18][0].setSegundo(0);
        transiciones[18][1].setSegundo(0);
        transiciones[18][2].setSegundo(0);
        transiciones[18][3].setSegundo(0);
        transiciones[18][4].setSegundo(0);
        transiciones[18][5].setSegundo(0);
        transiciones[18][6].setSegundo(0);
        transiciones[18][7].setSegundo(0);
        transiciones[18][8].setSegundo(0);
        transiciones[18][9].setSegundo(0);
        transiciones[18][10].setSegundo(0);
        transiciones[18][11].setSegundo(0);
        transiciones[18][12].setSegundo(0);
        transiciones[18][13].setSegundo(0);
        transiciones[18][14].setSegundo(9);
        transiciones[18][15].setSegundo(0);
        transiciones[18][16].setSegundo(0);
        transiciones[18][17].setSegundo(0);
        transiciones[18][18].setSegundo(0);

    }

}
