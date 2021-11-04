import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.Thread.sleep;

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
            System.out.println("0- Imprimir codigo");
            System.out.println("1- Listar Tokens");
            System.out.println("2- Listar tabla de simbolos");
            System.out.println("3- Listar estructuras");
            System.out.println("4- Listar errores");
            System.out.println("5- Listar tercetos");
            System.out.println("6- Salir");
            System.out.println("Ingrese una opción");
            opcion = s.nextInt();
            switch (opcion) {
                case 0: {al.imprimirCodigo(); break;}
                case 1: {al.imprimirTokens(); break;}
                case 2: {al.getTablaSimbolo().imprimirTabla();break;}
                case 3: {p.imprimirEstructuras(); break;}
                case 4: {al.imprimirErroresLexicos();
                            p.imprimirErroresSintacticos();
                            p.imprimirErroresSemanticos();
                            break;}
                case 5: {if(!al.hayError() && !p.hayError())
                            p.imprimirTercetos();
                         else
                            System.out.println("No se listan los tercetos debido a que hay al menos un error, revisar el listado de errores con la opcion 4.");
                         break;}
                case 6: {System.out.println("Fin de la ejecución."); break;}
            }
            sleep(2000);
        } while ( opcion != 6);
    }

}
