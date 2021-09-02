import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

<<<<<<< HEAD
        Scanner scannan = new Scanner(new File("./cosas/AccionesSemanticas.txt"));
=======
        Scanner scannan = new Scanner(new File("./AccionesSemanticas.txt"));
>>>>>>> 7a481be7edc4c14558fdc10d00b376d6e702b7cc
        ArrayList<String> lineas = new ArrayList<>();
        while(scannan.hasNext()){
            lineas.add(scannan.nextLine());
        }

        for(String a : lineas){
            for(int i = 0; i<a.length();i++)
                System.out.print(a.charAt(i));
            System.out.println();
        }

    }

}
