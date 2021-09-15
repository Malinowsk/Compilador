import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class AnalizadorLexico {

    private Automata automata;
    //Tabla de Símbolos
    private HashMap<Integer,String> tablaDeSimbolo = new HashMap<>();

    public AnalizadorLexico() throws FileNotFoundException {
        //Inicializar
        Scanner codigo = new Scanner(new File("./cosas/codigo.txt"));
        /*ArrayList<String> lineas = new ArrayList<>();
        while(scannan.hasNext()){
            lineas.add(scannan.nextLine());
        }

        for(String a : lineas){
            for(int i = 0; i<a.length();i++)
                System.out.print(a.charAt(i));
            System.out.println();
        }*/
    }

    //Metodo para levantar el archivo

}
