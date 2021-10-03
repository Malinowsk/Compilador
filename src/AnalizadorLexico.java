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
    private ArrayList< Integer > nroLineas; //Lista donde se guardaran los nro de lineas correspondiente a cada token generado
    private int indiceToken;
    private ArrayList< String > errores;

    //Constructor
    public AnalizadorLexico() {
        automata = new Automata();
        tablaDeSimbolo = new TablaSimbolo();
        tokens = new ArrayList< Dupla<Integer, Integer> >();
        nroLineas = new ArrayList<Integer>();
        indiceToken = 0;
        errores = new ArrayList< String >();
    }

    //Metodo que lee un codigo para generar la lista de tokens respectiva
    public void leerNuevoArchivo(String path) throws FileNotFoundException {

        Scanner scannan = new Scanner(new File(path));
        ArrayList<String> lineas = new ArrayList<>();
        while(scannan.hasNext()){
            lineas.add(scannan.nextLine());
        }

        int estadoActual = 0; //Comienza en el estado inicial
        int nroLinea = 0;
        for ( String linea : lineas ) { //Leo hasta el final del archivo
            for (int i = 0; i < linea.length(); i++) {
                char caracter = linea.charAt(i);
                boolean reutilizarCaracter = true; //booleano que indica si el caracter se debe seguir utilizando
                while (reutilizarCaracter) {
                    int proximoEstado = automata.getProximoEstado(estadoActual, caracter);
                    if (proximoEstado == -1) {
                        this.errores.add("Linea " + nroLinea + ", caracter invalido:"+ caracter);
                        return;
                    } else {
                        reutilizarCaracter = this.ejecutarAS(automata.getAccionSemantica(estadoActual, caracter), caracter, nroLinea);
                        estadoActual = proximoEstado;
                    }
                }
            }
            //Al terminar cada linea se tiene el caracter nl (nueva linea), el cual lo detectamos "manualmente"
            char nl= 10;
            int proximoEstado = automata.getProximoEstado(estadoActual, nl);
            if (proximoEstado == -1) {
                this.errores.add("Linea " + nroLinea + ", caracter invalido:"+ nl);
                return;
            } else {
                this.ejecutarAS(automata.getAccionSemantica(estadoActual, nl), nl, nroLinea);
                estadoActual = proximoEstado;
            }

            nroLinea++;
        }

    }

    //Metodo que ejecuta la accion semantica indicada por el parametro y el cual indicará si el token debe ser reutilizado
    private boolean ejecutarAS(int AS, char caracter, int nroLinea){
        return switch (AS) {
            case 1 -> AccionSemantica.accion1(this.tokens, tablaDeSimbolo, this.nroLineas, nroLinea, this.errores);
            case 2 -> AccionSemantica.accion2(caracter);
            case 3 -> AccionSemantica.accion3(caracter);
            case 4 -> AccionSemantica.accion4(this.tokens, caracter, this.nroLineas, nroLinea);
            case 5 -> AccionSemantica.accion5(this.tokens, tablaDeSimbolo, this.nroLineas, nroLinea, this.errores);
            case 6 -> AccionSemantica.accion6(this.tokens, this.nroLineas, nroLinea);
            case 7 -> AccionSemantica.accion7(this.tokens, this.nroLineas, nroLinea);
            case 8 -> AccionSemantica.accion8(this.tokens, this.nroLineas, nroLinea);
            case 9 -> AccionSemantica.accion9(this.tokens, this.nroLineas, nroLinea);
            case 10 -> AccionSemantica.accion10(this.tokens, this.nroLineas, nroLinea);
            case 11 -> AccionSemantica.accion11(this.tokens, caracter, this.nroLineas, nroLinea);
            case 12 -> AccionSemantica.accion12(this.tokens, this.nroLineas, nroLinea);
            case 13 -> AccionSemantica.accion13(this.tokens, this.nroLineas, nroLinea);
            case 14 -> AccionSemantica.accion14(this.tokens, this.nroLineas, nroLinea);
            case 15 -> AccionSemantica.accion15(this.tokens, tablaDeSimbolo, this.nroLineas, nroLinea, this.errores);
            case 16 -> AccionSemantica.accion16(caracter);
            case 17 -> AccionSemantica.accion17(this.tokens, tablaDeSimbolo, this.nroLineas, nroLinea);
            case 18 -> AccionSemantica.accion18(this.tokens, tablaDeSimbolo, this.nroLineas, nroLinea);
            case 19 -> AccionSemantica.accion19(this.tokens, this.nroLineas, nroLinea);
            default -> false;
        };
    }

    //Metodo para obtener el token siguiente de la lista
    public Dupla<Integer, Integer> getSiguienteToken(){
        if (indiceToken== tokens.size())
            return new Dupla<Integer, Integer>(0, null); // se devuelve 0 porque se termino el codigo
        return tokens.get(indiceToken++);
    }

    //Metodo para obtener el nro de linea del token actual
    public int getNroLineaToken() {return nroLineas.get(indiceToken-1);} // se usa indice menos 1 ya que previamente se utiliza getSiguienteToken(), el cual suma uno al indice

    //Metodo para ver la lista (PRUEBA)
    public void imprimirTokens(){
        for(int i=0; i < tokens.size(); i++){
            if (tokens.get(i).getSegundo()!=null)
                System.out.println("En la linea " + nroLineas.get(i) + ", token nro= " +tokens.get(i).getPrimero() + ", ref= " + tokens.get(i).getSegundo() + ", lexema= " + tablaDeSimbolo.obtenerValor(tokens.get(i).getSegundo()));
            else
                System.out.println("En la linea " + nroLineas.get(i) + ", token nro= " +tokens.get(i).getPrimero() + ", ref= " + tokens.get(i).getSegundo() + ", lexema= " + tablaDeSimbolo.obtenerValor(tokens.get(i).getPrimero()));
        }
    }

    public void imprimirErroresLexicos(){
        System.out.println("Se encontraron " + this.errores.size() + " errores lexicos en el codigo:");
        for(String e: this.errores){
            System.out.println(" - " + e);
        }
    }

}
