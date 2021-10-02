import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Thread.sleep;
import static javax.print.attribute.standard.MediaSizeName.A;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        Parser parser = new Parser();
        AnalizadorLexico al = new AnalizadorLexico();
        //al.leerNuevoArchivo(args[0]);
        al.leerNuevoArchivo("E:/Git/TPE-DisenioDeCompiladores/cosas/Codigo2.txt");
        parser.setAnalizadorLexico(al);
        parser.yyparse();
        menu(al, parser);
    }

    public static void menu(AnalizadorLexico al, Parser p) throws InterruptedException {
        int opcion ;
        Scanner s = new Scanner (System.in);
        do {
            System.out.println("1. Mostrar Tokens");
            System.out.println("2. Listar estructuras");
            System.out.println("3. Mostrar errores");
            System.out.println("4. Salir");
            System.out.println("Ingrese una opción");
            opcion = s.nextInt();
            System.out.print("\033[H\033[2J");
            System.out.flush();
            switch (opcion) {
                case 1 -> al.imprimirTokens();
                case 2 -> p.imprimirEstructuras();
                case 3 -> System.out.println("Fin de la ejecución.");//p.imprimirErrores();
                case 4 -> {System.out.println("Fin de la ejecución.");
                            break;}
            }
            sleep(5000);
            System.out.print("\033[H\033[2J");
            System.out.flush();
        } while ( opcion != 4);


    }


}
