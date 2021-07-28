package co.edu.utp.misiontic2022.c2.sansoris;

import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

// import jdk.internal.module.SystemModuleFinders;
// import co.edu.utp.misiontic2022.c2.sansoris.Ejercicios.Ejercicio1;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws IOException
    {
        // Entrada01.ejecutar();
        // Entrada02.ejecutar();
        // Entrada03.ejecutar();

        // Se necesita crear una variable, ya que el método no es estático
        // var archivo = new EscribirArchivo();
        // archivo.escribir ("Numeros.txt"); // Al no dar una ruta especifica la crea dentro del proyecto

        // var lector  = new LeerArchivo();
        // lector.leer("Numeros.txt");

    // var gp = new GestorAOPersona();
    // gp.guardarPersonas("Personas.obj", // con L convierte a long
    //     Arrays.asList(
    //         new ArchivoObjeto(12346L, "Nombre1", "Apellido1", 18),
    //         new ArchivoObjeto(78901L, "Nombre2", "Apellido2", 28),
    //         new ArchivoObjeto(23465L, "Nombre3", "Apellido3", 38),
    //         new ArchivoObjeto(23466L, "Nombre4", "Apellido4", 48)
    //     ));

    //     List<ArchivoObjeto> personas = gp.cargarPersonas("Personas.obj");
    //     personas.forEach(System.out::println);

    // Ejercicio 1

    // Ejercicio1.ejecutar();

   
    //Clase Grupo 65 
        // se deben usar las excepciones teniendo
        // que se maneja información externa
        // para disminuir errores en tiempos de ejecución

        try {
            // Lectura de datos (entrada)
            File archivo1 = new File("Numeros.txt");
            Scanner sc = new Scanner(archivo1);
            while(sc.hasNextLine()){ // lee linea a linea y termina al finalizar las lineas
            String linea = sc.nextLine();
            System.out.println(linea);
            }
            sc.close();


            // salida de datos 
            // crear un array tipo string

            String datos[] = {"Medellín", "Cali", "Barranquilla", "Bogotá", "Bucaramanga", "Leticia"};// separados por coma entre llaves
            FileWriter archivo2 = new FileWriter("Ciudades.txt");
            for (String i : datos) {
                archivo2.write(i+"\n");// con salto de linea en cada elemento de datos
            }
            archivo2.close();  // cerrar el archivo para culminar el recurso

        } catch (Exception e) {
            System.out.println("No se pudo leer el archivo");
            System.out.println(e.getMessage()); // al cambiar el nombre al archivo
        }
        

    }
}


