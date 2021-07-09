
import java.util.Scanner;


// Programa que lea dos números por teclado y muestre el resultado de la división del primer número por el segundo. 
// Se debe comprobar que el divisor no puede ser cero.


public class U1T2Ej8Division {
    public static void main(String[] args) {
        division();
    }
    public static void division(){
        double num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número a dividir:  "); 
        num1 = sc.nextInt();
        System.out.println("Ingrese el número divisor:  "); 
        num2 = sc.nextInt();

        if (num2==0) {System.out.println("El divisor NO puede ser cero");}
        else if (num2 != 0){System.out.println("El resultado de división es: " + num1/num2);}
        sc.close();
}
}
