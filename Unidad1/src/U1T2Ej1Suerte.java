

import java.util.Scanner;

// 1. Programa que pida por teclado la fecha de nacimiento de una persona
// (día, mes, año) y calcule su número de la suerte.
// El número de la suerte se calcula sumando el día, mes y año de la fecha
// de nacimiento y a continuación sumando las cifras obtenidas en la suma
// Por ejemplo: Si la fecha de nacimiento es 12/07/1980 
// Calculamos el número de la suerte así: 12+7+1980 = 1999  1+9+9+9 = 
// 28     Número de la suerte: 28


public class U1T2Ej1Suerte {
    public static void main(String[] args) {
        numerosuerte();
       
        
    }

    public static void numerosuerte(){
        Integer dia, mes, año;
        Integer  suma, dig1, dig2, dig3, dig4;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el día de nacimiento: ");
        dia = sc.nextInt();
        System.out.print("Ingrese el mes de nacimiento: ");
        mes = sc.nextInt();
        System.out.print("Ingrese el año de IVA: ");
        año = sc.nextInt();
        suma= dia+mes+año;
        dig1 = (suma/1000);
        dig2 = ((suma%1000)/100);
        dig3 = (((suma%1000)%100)/10);
        dig4 = (((suma%1000)%100)%10);
        System.out.println("Su numero de la suerte es "+ (dig1+dig2+dig3+dig4));
                
        sc.close();
}




}