package co.edu.utp.misiontic2022.c2;
// 9. Pide por teclado el nombre, edad y salario y muestra el salario
// ○ Si es menor de 16 no tiene edad para trabajar
// ○ Entre 19 y 50 años el salario es un 5 por ciento más
// ○ Entre 51 y 60 años el salario es un 10 por ciento más
// ○ Si es mayor de 60 el salario es un 15 por ciento más

import java.util.Scanner;

public class T1Ej9NES {
    public static void main (String[] arg) {
        Scanner a = new Scanner (System.in);
        System.out.println("Introduce el nombre del trabajador: ");
        String nombre = a.nextLine();

        Scanner b = new Scanner (System.in);
        System.out.println("Ingrese la edad del trabajador: ");
        Integer edad = b.nextInt();

        Scanner z = new Scanner (System.in);
        System.out.println("Ingrese el salario del trabajador: ");
        Integer salario = z.nextInt();


        a.close();
        b.close();
        z.close();

        if (edad <=16){ 
            System.out.print("No tiene edad para trabajar");
        }else if (edad >=19 && edad <= 50){
            System.out.println(nombre + " Su salario es de : $" + salario*1.05);
        }
        else if (edad >=51 && edad <= 60){
            System.out.println(nombre + " Su salario es de : $" + salario*1.10);
        }
        else if (edad >60){
            System.out.println(nombre + " Su salario es de : $" + salario*1.15);
        }
        else {
            System.out.println("Ingrese el dato correcto");
        }
    }   
}