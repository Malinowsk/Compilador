import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//clase que hace de analizador lexico, primero genera todos los tokens de determinado codigo,
//luego se le puede solicitar token por token
public class AnalizadorLexico {

    private Automata automata;
    private HashMap<Integer,String> tablaDeSimbolo;//Tabla de Símbolos
    private AccionSemantica accionSemantica;

    private ArrayList<Integer> tokens; //Lista donde se guardaran los tokens obtenidos del codigo

    //Constructor
    public AnalizadorLexico() throws FileNotFoundException {
        tablaDeSimbolo = new HashMap<>();
        tokens = new ArrayList<Integer>();
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
            while (reutilizarCaracter) {
                char caracter = linea.charAt(i);
                int proximoEstado = automata.getProximoEstado(estadoActual, caracter);
                if (proximoEstado == -2) {
                    //Genero error
                    return;
                } else {
                    reutilizarCaracter = this.ejecutarAS(automata.getAccionSemantica(estadoActual, caracter));
                    estadoActual = proximoEstado;
                }
            }
        }
        ///VER SI ES NECESARIO LO SIGUIENTE
        char nl= 10;
        int proximoEstado = automata.getProximoEstado(estadoActual, nl);
        if (proximoEstado == -2) {
            //Genero error
            return;
        } else {
            this.ejecutarAS(automata.getAccionSemantica(estadoActual, nl));
            estadoActual = proximoEstado;
        }
    }

    }

    //Metodo que ejecuta la accion semantica indicada por el parametro
    private boolean ejecutarAS(int AS){
        switch(AS){
            case 1: return accionSemantica.accion1();
            case 2: return accionSemantica.accion2();
            case 3: return accionSemantica.accion3();
            case 4: return accionSemantica.accion4();
            case 5: return accionSemantica.accion5();
            case 6: return accionSemantica.accion6(this.tokens);
            case 7: return accionSemantica.accion7(this.tokens);
            case 8: return accionSemantica.accion8(this.tokens);
            case 9: return accionSemantica.accion9(this.tokens);
            case 10: return accionSemantica.accion10(this.tokens);
            case 11: return accionSemantica.accion11(this.tokens);
            case 12: return accionSemantica.accion12(this.tokens);
            case 13: return accionSemantica.accion13(this.tokens);
            case 14: return accionSemantica.accion14(this.tokens);
            case 15: return accionSemantica.accion15();
            default: return false;
        }
    }

    //Metodo para obtener el token siguiente de la lista
    public int getToken(){
        return 0;
    }
}
