

import java.util.Scanner;

// 3. Realizar un programa que calcule el sueldo de un trabajador, el programa
// solicita el número de horas que has trabajado en un mes, las horas se
// pagan a $30.000

public class T1Ej3Sueldo {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        System.out.println("Introduce el nombre del trabajador: ");
        String trabajador = a.nextLine();

        Scanner b = new Scanner (System.in);
        System.out.println("Ingrese horas trabajadas al mes: ");
        float horas = b.nextFloat();
        a.close();
        b.close();

        System.out.println(trabajador + " trabajo " +horas+  " horas en el mes" +" y su salario es de $"+ (horas*30000));
    }
}
