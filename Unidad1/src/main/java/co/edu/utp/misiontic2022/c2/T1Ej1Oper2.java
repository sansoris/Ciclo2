package co.edu.utp.misiontic2022.c2;


import java.util.Scanner;

public class T1Ej1Oper2 {
    public static void main (String[] args) {
        Scanner a = new Scanner (System.in);
        System.out.println("Introduce un número: ");
        float numero1 = a.nextFloat();

        Scanner b = new Scanner (System.in);
        System.out.println("Introduce segundo número: ");
        float numero2 = b.nextFloat(); 

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca la operacion a realizar\n 1 para (+)\n, 2 para (-)\n, 3 para (*)\n, 4 para (/): " );
        int operacionSeleccionada = teclado.nextInt();

        a.close();
        b.close();
        teclado.close();
                        
        if (operacionSeleccionada == 1) {
        System.out.print("La suma de los dos numeros es  "+ ( numero1 + numero2) );
        }

        if (operacionSeleccionada == 2) {
        System.out.print( "La diferencia  de los dos numeros es  "+ (numero1-numero2) );
        }
        if (operacionSeleccionada == 3) {
        System.out.print( "La multiplicación de los dos numeros es " +( numero1 * numero2 ));
        }
        if (operacionSeleccionada == 4) {
        System.out.print( "La división de los dos numeros es  "+( numero1 / numero2 ) );
        }
    }

}
