package co.edu.utp.misiontic2022.c2.sansoris.ArchivoTexto;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EscribirArchivo {
    public void escribir(String nombreArchivo) throws FileNotFoundException{
        // Crear el método para recibir el nombre del archivo que se quiere crear
        int[][] numeros = { 
            { 1, 2, 3, 4, 5}, 
            { 6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15}, 
            {16, 17, 18, 19, 20}, 
            {21, 22, 23, 24, 25}};

            try {
        var salida = new PrintWriter(nombreArchivo); // escritor de texto
        for (int i=0; i< numeros.length; i++) { // recorre cada elemento de la matriz
            for (int j=0; j< numeros[i].length; j++) {
                salida.print(numeros[i][j] + ","); // se coloca separado por comas hasta el cambiador de línea
        }
            salida.println(""); // cambio de línea al final de cada fila
        }
        salida.close();
        
    } catch (FileNotFoundException e){
        e.printStackTrace();
    }
}
}

