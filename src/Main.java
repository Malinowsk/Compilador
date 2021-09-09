import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static javax.print.attribute.standard.MediaSizeName.A;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scannan = new Scanner(new File("./cosas/AccionesSemanticas.txt"));

        ArrayList<String> lineas = new ArrayList<>();
        while(scannan.hasNext()){
            lineas.add(scannan.nextLine());
        }

        for(String a : lineas){
            for(int i = 0; i<a.length();i++)
                System.out.print(a.charAt(i));
            System.out.println();
        }

   //     char aux = 'D';

     //   if (aux(int) == [A-Z] ){
       //     System.out.println("sdfsdf");
     //   }

    }

}
