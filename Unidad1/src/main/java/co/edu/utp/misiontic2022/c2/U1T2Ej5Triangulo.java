package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;
import java.text.DecimalFormat;  // para redondear

// Programa que lea la longitud de los catetos de un triángulo rec
// calcule la longitud de la hipotenusa según el teorema de Pitágoras.

public class U1T2Ej5Triangulo {
    public static void main(String[] args) {
        hipotenusa();
    }


    public static void hipotenusa(){
        double c1, c2, c3, hipo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de los catetos:  "); 
        c1 = sc.nextInt();
        c2 = sc.nextInt();
        c3 = sc.nextInt();
        hipo= Math.sqrt(((double) Math.pow (c1,2))+ ((double) Math.pow (c2,2)) +((double) Math.pow (c3,2)));
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.print("La Hipotenusa de su triángulo es: " + df.format(hipo));  // Importar 
        sc.close();
}
}
