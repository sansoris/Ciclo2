package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class U1Ej2Cifras {
   public static void main (String[] args) {
        var sc = new Scanner (System.in);
        System.out.println("Introduce un número entero: ");
        var numero = sc.nextInt();
        var digitos = numerodigitos(numero);
        System.out.println("El número tiene " + digitos + " cifras");
        sc.close();
        
   } 

   public static int numerodigitos(int numero) {
       var cifras = 0;

       while (numero !=0){
           numero/=10;
           cifras++;
       }
        return cifras;
   } 
   
}
