

// 7. Pedir un número, comprobar si es primo y preguntar si quiere introducir más
// (S/N) y volver a pensar.

import java.util.Scanner;

public class T1Ej7Primo {

    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        Integer numero; 
        String usuario;

        do {
        System.out.println("Ingrese un numero: ");
        numero = a.nextInt();        
        int contador = 0;
            //No combinar los ciclos do con for : aumentando complejidad
        for (int i = numero; i >= 1; i--) {
            if (numero % i == 0) {
                contador++;  // se puede agregar break para cerrar cuando tenga mas de 2 
            }
        }  
        System.out.println((contador == 2)? "El numero es primo ": "El numero NO es primo ");
        System.out.println ("Quieres introducir otro numero? s/n");
        usuario = a.next();      
        
        }  while(usuario.equals("s") || usuario.equals("S"));
        a.close();
} 
}

