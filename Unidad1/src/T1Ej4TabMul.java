

import java.util.Scanner;

// Solicitar un número al usuario y mostrar la tabla de multiplicar de ese
// número, desde el 0 hasta el 10. Truco: Usa un bucle for para recorrer la
// tabla y mostrar los datos.

public class T1Ej4TabMul {
    public static void main (String[] args) {
        var a = new Scanner (System.in);
        System.out.println("Introduce un número: ");
        float numero = a.nextFloat();
        a.close();
        // For contiene (inicio; condicion e iteración)
        for(int i = 0; i <=10; i++){
            System.out.println(numero +" x "+  i  + " = " + (numero*i)  );
        }
    }
}
