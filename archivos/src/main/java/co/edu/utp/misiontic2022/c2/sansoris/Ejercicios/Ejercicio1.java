package co.edu.utp.misiontic2022.c2.sansoris.Ejercicios;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class Ejercicio1 {
    public static void ejecutar(){
        var archivo = "Numeros.txt";
        
        // flujo de entrada para leer el archivo byte x byte
        // no se puede utilizar escaner
        // se debe utilizar un try

        try {
            var file = new File(archivo);
            if (!file.exists()){
                System.err.println("El archivo no existe");
                return; 
            }
            var dis = new DataInputStream(new FileInputStream(archivo) );
            char character;
            while((character = (char) dis.readByte()) != '\0') {
                if (character == ' '){ // estan saliendo caracteres chinos hasta que
                    continue;
                }
                System.out.print(character);
            }
            // System.out.println();
            dis.close();
        } catch (Exception e) {
            //TODO: handle exception
        }

    }
}
