import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//clase que hace de analizador lexico, primero genera todos los tokens de determinado codigo,
//luego se le puede solicitar token por token
public class AnalizadorLexico {

    private Automata automata;
    //Tabla de Símbolos
    private HashMap<Integer,String> tablaDeSimbolo;
    private AccionSemantica accionSemantica;

    private ArrayList<String> tokens; //Lista donde se guardaran los tokens obtenidos del codigo

    //Constructor
    public AnalizadorLexico() throws FileNotFoundException {
        tablaDeSimbolo = new HashMap<>();
        tokens = new ArrayList<>();
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
            char caracter = linea.charAt(i);
            int proximoEstado = automata.getProximoEstado(estadoActual, caracter);
            if (proximoEstado == -1) {
                //Genero error
                return;
            } else {
                this.ejecutarAS(automata.getAccionSemantica(estadoActual, caracter));
                estadoActual = proximoEstado;
            }

        }
        ///VER SI ES NECESARIO LO SIGUIENTE
        char nl= 10;
        int proximoEstado = automata.getProximoEstado(estadoActual, nl);
        if (proximoEstado == -1) {
            //Genero error
            return;
        } else {
            this.ejecutarAS(automata.getAccionSemantica(estadoActual, nl));
            estadoActual = proximoEstado;
        }
    }

    }

    //Metodo que ejecuta la accion semantica indicada por el parametro
    private void ejecutarAS(int AS){
        switch(AS){
            case 1: accionSemantica.accion1();
            case 2: accionSemantica.accion2();
            case 3: accionSemantica.accion3();
            case 4: accionSemantica.accion4();
            case 5: accionSemantica.accion5();
            case 6: accionSemantica.accion6();
            case 7: accionSemantica.accion7();
            case 8: accionSemantica.accion8();
            case 9: accionSemantica.accion9();
            case 10: accionSemantica.accion10();
            case 11: accionSemantica.accion11();
            case 12: accionSemantica.accion12();
            case 13: accionSemantica.accion13();
            case 14: accionSemantica.accion14();
            case 15: accionSemantica.accion15();
        }
    }

    //Metodo para obtener el token siguiente de la lista
    public String getToken(){
        return "token";
    }
}
