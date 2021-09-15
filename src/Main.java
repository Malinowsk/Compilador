import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static javax.print.attribute.standard.MediaSizeName.A;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        /*


        */

        char caracter = 'E';
        System.out.println( "La columna es : " + getColumna( (int) caracter ));

   //     char aux = 'D';

     //   if (aux(int) == [A-Z] ){
       //     System.out.println("sdfsdf");
     //   }

    }



     static int getColumna( int caracter){

            if( caracter == 32)//Considerar ver el tema de TAB
               return 0;
            if( caracter == 0)//Considerar ver el tema de NL
               return 1;
            if( ( (caracter >= 65) && (caracter <= 68) )  || ( (caracter >=70) && (caracter <= 90) ) || ( (caracter >= 97) && (caracter <= 122) ) )
               return 2;
            if( caracter == 69)
                return 3;
            if( caracter == 95)
                return 4;
            if( (caracter >= 48) && (caracter <= 57))
                return 5;
            if( (caracter == 40) || (caracter == 41) || (caracter == 44) || (caracter == 47) || (caracter == 59))
                return 6;
            if(caracter == 45)
                return 7;
            if( caracter == 43)
                return 8;
            if( caracter == 38)
                return 9;
            if( caracter == 124)
                return 10;
            if( caracter == 58)
                return 11;
            if( caracter == 60)
                return 12;
            if( caracter == 62)
                return 13;
            if( caracter == 61)
                return 14;
            if( caracter == 42)
                return 15;
            if( caracter == 46)
                return 16;
            if( caracter == 37)
                return 17;
            else
                return 18;


     }


}
