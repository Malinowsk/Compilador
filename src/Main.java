import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.Thread.sleep;
import static javax.print.attribute.standard.MediaSizeName.A;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        Parser parser = new Parser();
        AnalizadorLexico al = new AnalizadorLexico();
        System.out.println("A continuacion escriba el nombre del codigo a compilar mas la extension .txt, ejemplo : Codigo.txt");
        System.out.println("(Recordar que el codigo debe estar en la misma carpeta que este ejecutable)");
        Scanner s = new Scanner (System.in);
        String codigo = s.nextLine();
        al.leerNuevoArchivo(codigo);
        parser.setAnalizadorLexico(al);
        parser.yyparse();
        menu(al, parser);
    }

    public static void menu(AnalizadorLexico al, Parser p) throws InterruptedException {
        int opcion ;
        Scanner s = new Scanner (System.in);
        do {
            System.out.println(" ");
            System.out.println("Elija una opcion del menu:");
            System.out.println("1. Mostrar Tokens");
            System.out.println("2. Listar estructuras");
            System.out.println("3. Mostrar errores");
            System.out.println("4. Salir");
            System.out.println("Ingrese una opción");
            opcion = s.nextInt();
            switch (opcion) {
                case 1 -> al.imprimirTokens();
                case 2 -> p.imprimirEstructuras();
                case 3 -> {al.imprimirErroresLexicos();
                            p.imprimirErroresSintacticos();}
                case 4 -> {System.out.println("Fin de la ejecución.");
                            break;}
            }
            sleep(5000);
        } while ( opcion != 4);
    }

}
