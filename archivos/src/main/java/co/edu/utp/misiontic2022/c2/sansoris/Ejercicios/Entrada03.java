package co.edu.utp.misiontic2022.c2.sansoris.Ejercicios;

import java.io.*; 

// Adaptadores o clases para hacer mas interesantes el manejo de los caracteres

public class Entrada03 {
   
public static void ejecutar() {
String línea=null;
var entrada = new BufferedReader(new InputStreamReader(System.in)); // java provee el tamaño del reader
var salida = new PrintWriter(System.out, true); // redireccopmar eñ flo estandar a la variable
// desde este momento se escribe salida para input en pantalla
// se puede incluso llevar a otro canal para ingresar información
// se leerá una línea completa con el tamaño completo siempre y cuanto no se cambie de linea (enter)
// ya no esta limitado a 255 como Entrada02
salida.println("\nEscribe el texto: ");
try {
línea = entrada.readLine();//guarda los datos en array dentro de lista
} catch (Exception e) {
System.err.println(e);
}
salida.println("\nLa línea escrita es: ");
salida.println(línea);
}
}
