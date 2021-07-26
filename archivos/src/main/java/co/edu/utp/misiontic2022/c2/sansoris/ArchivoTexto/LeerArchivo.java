package co.edu.utp.misiontic2022.c2.sansoris.ArchivoTexto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;



public class LeerArchivo {
    public void leer(String nombreArchivo ) throws FileNotFoundException{
    var archivo = new File(nombreArchivo); // no es el archivo sino su descripción
    System.out.println(archivo.getName()); // Me informa el nombre del archivo
    System.out.println(archivo.getAbsolutePath()); // me informa la ruta del archivo
        if (archivo.exists()) {
            var lector = new Scanner(archivo); 
            System.out.println("Números del archivo");
                while (lector.hasNext()) {  // Lee linea por linea
                var numeros = new StringTokenizer(lector.next(),","); // separado por(;)
                while (numeros.hasMoreTokens()) {
                System.out.print(numeros.nextToken() + "\t");
                }
                System.out.println("");
            }
            lector.close();
        } else {
        System.out.println("¡El fichero no existe!");
        }
    }
}
        
