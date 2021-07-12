

import java.util.Scanner;

public class U1Ej2Cifras {
   public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce un número entero: ");
        int numero = sc.nextInt();
        int digitos = numerodigitos(numero);
        System.out.println("El número tiene " + digitos + " cifras");
        sc.close();
        
   } 

   public static int numerodigitos(int numero) {
       int cifras = 0;

       while (numero !=0){
           numero/=10;
           cifras++;
       }
        return cifras;
   } 
   
}
