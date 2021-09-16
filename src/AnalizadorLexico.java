import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class AnalizadorLexico {

    private Automata automata;
    //Tabla de Símbolos
    private HashMap<Integer,String> tablaDeSimbolo = new HashMap<>();

    public AnalizadorLexico() throws FileNotFoundException {
    }

    //Metodo para levantar el archivo

    private void generarListaToken(String path) throws FileNotFoundException {

    Scanner scannan = new Scanner(new File(path));
    ArrayList<String> lineas = new ArrayList<>();
        while(scannan.hasNext()){
        lineas.add(scannan.nextLine());
    }
    int estadoActual = 0; //Arranca en el estado inicial
    int nroLinea = 1;
    for ( String linea : lineas ){ //Leo hasta el final del archivo
       // String linea = read(archivo) ;   // Obtengo la línea       ->linea = "ULONG PEPE := 3"
        for(int i = 0 ; i < linea.length() ; i++){
            char caracter = linea.charAt(i);
            int proximoEstado = automata.getProximoEstado(estadoActual,caracter);
            if (proximoEstado == -1) {
                //Genero error
                return;
            }
            else
            {
                this.ejecutarAS(automata.getAccionSemantica(estadoActual,caracter) );
                estadoActual = proximoEstado;
            }

        }

        int proximoEstado = automata.getProximoEstado(estadoActual,"NL"); // ver si pasamos numeros
        if (proximoEstado == -1) {
            //Genero error
            return;
        }
        else
        {
            this.ejecutarAS(automata.getAccionSemantica(estadoActual,"NL") );
            estadoActual = proximoEstado;
        }


    }

}
