package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

// 9. El programa lee por teclado tres números enteros y calcula y muestra el mayor de los tres.

public class U1T2Ej9Mayor {
    public static void main(String[] args) {
        mayor();
    }
    public static void mayor(){
        Integer num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los números a comparar:  "); 
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        
        if ((num1>num2) && (num1>num3)) {System.out.println("El "+ num1 + " es el mayor");}
        else if ((num2>num1) && (num2>num3)) {System.out.println("El "+ num2 + " es el mayor");}
        else {System.out.println("El "+ num3 + " es el mayor");}
        sc.close();
        System.out.println(Math.max (num1, num2)); // solo compara dos argumentos
}
}
