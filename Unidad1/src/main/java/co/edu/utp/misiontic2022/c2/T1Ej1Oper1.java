package co.edu.utp.misiontic2022.c2;
// Operadores basicos de numeros


import java.util.Scanner;

public class T1Ej1Oper1 {
    public static void main (String[] args) {
        Scanner a = new Scanner (System.in);
        System.out.println("Introduce un número: ");
        float numero1 = a.nextFloat();

        Scanner b = new Scanner (System.in);
        System.out.println("Introduce segundo número: ");
        float numero2 = b.nextFloat(); 

        float resultado = numero1 + numero2; 
        float resultado1 = numero1 - numero2; 
        float resultado2 = numero1 * numero2;
        float resultado3 = numero1 / numero2; 
         
        System.out.println("El proceso de suma es: "+ resultado);
        System.out.println("El proceso de resta es: "+ resultado1);
        System.out.println("El proceso de multiplicación es: "+ resultado2);
        System.out.println("El proceso de división es: "+ resultado3);
        // var operacion = (a + b);
        // var resultado = (a + b);
        // System.out.println("La" + operacion +"de" + numero1 + "y" + numero2 + "es igual a " + resultado);
        a.close();
        b.close();
        

}
}