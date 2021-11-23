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
        ConversorTercetoAssembler conversor = new ConversorTercetoAssembler(parser.getTercetos(), al.getTablaSimbolo());
        menu(al, parser, conversor);
    }

    public static void menu(AnalizadorLexico al, Parser p, ConversorTercetoAssembler c) throws InterruptedException {
        int opcion ;
        Scanner s = new Scanner (System.in);
        do {
            System.out.println("\n");
            System.out.println("Elija una opcion del menu:");
            System.out.println("0- Imprimir codigo");
            System.out.println("1- Listar tabla de simbolos");
            System.out.println("2- Listar errores");
            System.out.println("3- Listar tercetos");
            System.out.println("4- Generar y mostrar el archivo assembler");
            System.out.println("5- Salir");
            System.out.println("Ingrese una opción");
            opcion = s.nextInt();
            switch (opcion) {
                case 0: {
                    al.imprimirCodigo();
                    break;
                }

                case 1: {
                    al.getTablaSimbolo().imprimirTabla();
                    break;
                }

                case 2: {
                    al.imprimirWarningsLexicos();
                    p.imprimirWarningsSemanticos();
                    al.imprimirErroresLexicos();
                    p.imprimirErroresSintacticos();
                    p.imprimirErroresSemanticos();
                    break;
                }

                case 3: {
                    if(!al.hayError() && !p.hayError())
                        p.imprimirTercetos();
                    else
                        System.out.println("No se listan los tercetos debido a que hay al menos un error, revisar el listado de errores con la opcion 2");
                    break;
                }

                case 4: {
                    if(!al.hayError() && !p.hayError())
                        System.out.println(c.getConversionAssembler());
                    else
                        System.out.println("No se listan las instrucciones assembler debido a que hay al menos un error, revisar el listado de errores con la opcion 2");
                    break;
                }

                case 5: {
                    System.out.println("Fin de la ejecución.");
                    break;
                }

                case 6: {al.imprimirTokens(); break;}//no se muestran en el menu porque son de la primera parte
                case 7: {p.imprimirEstructuras(); break;}//no se muestran en el menu porque son de la primera parte
            }
            sleep(2000);
        } while ( opcion != 5);
    }

}
