


import java.util.Scanner;

public class U1Ej3DobleTriple {
    public static void main(String[]args) {
        int numero1 = 0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduzca un numero: ");
        numero1 = sc.nextInt();
        System.out.println("El Doble de "+ numero1 + " es: "+ (numero1*2));
        System.out.println("El Triple de "+ numero1 + " es: "+ (numero1*3));
        sc.close();
        
    }

}
