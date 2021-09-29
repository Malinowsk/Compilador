import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//clase que hace de analizador lexico, primero genera todos los tokens de determinado codigo,
//luego se le puede solicitar token por token
public class AnalizadorLexico {

    private Automata automata;
    private TablaSimbolo tablaDeSimbolo;

    private ArrayList< Dupla<Integer, Integer> > tokens; //Lista donde se guardaran los tokens obtenidos del codigo, (Numero de token, Clave en tabla)
    private int indiceToken;
    //Constructor
    public AnalizadorLexico() throws FileNotFoundException {
        automata = new Automata();
        tablaDeSimbolo = new TablaSimbolo();
        tokens = new ArrayList< Dupla<Integer, Integer> >();
        indiceToken = 0;
    }

    //Metodo que lee un codigo para generar la lista de tokens respectiva
    public void leerNuevoArchivo(String path) throws FileNotFoundException {
    Scanner scannan = new Scanner(new File(path));
    ArrayList<String> lineas = new ArrayList<>();
    while(scannan.hasNext()){
        lineas.add(scannan.nextLine());
    }

    int estadoActual = 0; //Arranca en el estado inicial
    int nroLinea = 1;
    for ( String linea : lineas ) { //Leo hasta el final del archivo
        // String linea = read(archivo) ;   // Obtengo la línea       ->linea = "ULONG PEPE := 3"
        for (int i = 0; i < linea.length(); i++) {
            boolean reutilizarCaracter = true;
            char caracter = linea.charAt(i);
            while (reutilizarCaracter) {
                int proximoEstado = automata.getProximoEstado(estadoActual, caracter);
                if (proximoEstado == -2) {
                    System.out.println("Error lexico en la linea " + nroLinea + ", caracter invalido:"+ caracter);
                    return;
                } else {
                    reutilizarCaracter = this.ejecutarAS(automata.getAccionSemantica(estadoActual, caracter), caracter, nroLinea);
                    estadoActual = proximoEstado;
                }
            }
        }
        ///VER SI ES NECESARIO LO SIGUIENTE
        char nl= 10;
        int proximoEstado = automata.getProximoEstado(estadoActual, nl);
        if (proximoEstado == -2) {
            System.out.println("Error lexico en la linea " + nroLinea + ", caracter invalido:"+ nl);
            return;
        } else {
            this.ejecutarAS(automata.getAccionSemantica(estadoActual, nl), nl, nroLinea);
            estadoActual = proximoEstado;
        }

        nroLinea++;
    }

    }

    //Metodo que ejecuta la accion semantica indicada por el parametro
    private boolean ejecutarAS(int AS, char caracter, int nroLinea){
        switch(AS){
            case 1: return AccionSemantica.accion1(this.tokens, tablaDeSimbolo, nroLinea);
            case 2: return AccionSemantica.accion2(caracter);
            case 3: return AccionSemantica.accion3(caracter);
            case 4: return AccionSemantica.accion4(this.tokens, caracter);
            case 5: return AccionSemantica.accion5(this.tokens, tablaDeSimbolo, nroLinea);
            case 6: return AccionSemantica.accion6(this.tokens);
            case 7: return AccionSemantica.accion7(this.tokens);
            case 8: return AccionSemantica.accion8(this.tokens);
            case 9: return AccionSemantica.accion9(this.tokens);
            case 10: return AccionSemantica.accion10(this.tokens);
            case 11: return AccionSemantica.accion11(this.tokens);
            case 12: return AccionSemantica.accion12(this.tokens);
            case 13: return AccionSemantica.accion13(this.tokens);
            case 14: return AccionSemantica.accion14(this.tokens);
            case 15: return AccionSemantica.accion15(this.tokens, tablaDeSimbolo, nroLinea);
            case 16: return AccionSemantica.accion16(this.tokens, caracter);
            case 17: return AccionSemantica.accion17(this.tokens, tablaDeSimbolo);
            case 18: return AccionSemantica.accion18(this.tokens, tablaDeSimbolo);
            case 19: return AccionSemantica.accion19(this.tokens);
            default: return false;
        }
    }

    //Metodo para obtener el token siguiente de la lista
    public Dupla<Integer, Integer> getSiguienteToken(){
        return tokens.get(indiceToken++);
    }

    //Metodo para ver la lista (PRUEBA)
    public void imprimirLista(){
        for(Dupla<Integer, Integer> d: this.tokens){
            System.out.println(d.getPrimero() + ", " + d.getSegundo());
        }

    }

    //Metodo para el parser yacc
    public int yylex(){
        Dupla<Integer, Integer> tokenActual = this.getSiguienteToken();
        // ParserVal(tokenActual.getSegundo()); //yylval
        return tokenActual.getPrimero();
    }

}
