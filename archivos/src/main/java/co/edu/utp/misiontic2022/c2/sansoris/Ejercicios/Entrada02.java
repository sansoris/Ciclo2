package co.edu.utp.misiontic2022.c2.sansoris.Ejercicios;

import java.io.IOException;

public class Entrada02 {
    
        public static void ejecutar() {
        byte[] buffer = new byte[255];
        System.out.println("\nEscribe el texto: ");
        try {
        System.in.read(buffer, 0, 255);  // lectura de la variable hasta el fin de linea o 255
        } catch (IOException e) {
        System.err.println(e);
        }
        System.out.println("\nLa línea escrita es: ");
        System.out.println(new String(buffer));
        }
        }

