

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