package co.edu.utp.misiontic2022.c2.sansoris.Ejercicios;

import java.io.IOException;

public class Entrada01 {

    public static void ejecutar() throws IOException{
        int numBytes = 0;
        char caracter;
        System.out.println("\nEscribe el texto:  ");
        try{
        do{
            caracter= (char) System.in.read();
            System.out.print(caracter);
            numBytes ++;
        }while(caracter !='\n');
        System.out.printf("%n%d bytes leidos. %n", numBytes);
    } catch (IOException e){
        System.out.println(e);
    }
}
}
