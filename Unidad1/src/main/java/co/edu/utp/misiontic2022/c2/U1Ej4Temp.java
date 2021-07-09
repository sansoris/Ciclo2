package co.edu.utp.misiontic2022.c2;


import java.util.Scanner;

// Escribe un programa que lea una cantidad de grados centígrados y la pase a
// grados Fahrenheit. La fórmula es: F = 32 + ( 9 * C / 5)

public class U1Ej4Temp {
    public static void main(String[] args) {
        var sc = new Scanner (System.in);
        System.out.println("Introduce la temperatura en °C: ");
        float temperatura = sc.nextFloat();
        var resultado = 32 + ((9* temperatura)/5);  
        System.out.println( temperatura + " °C: "+ "corresponde a " + resultado + " °F");
        System.out.println("Opción 2 ejecutando en una línea");
        System.out.println( temperatura + " °C: "+ "corresponde a " + (32 + ((9* temperatura)/5)) + " °F");
        sc.close();
        
        
    }
}
