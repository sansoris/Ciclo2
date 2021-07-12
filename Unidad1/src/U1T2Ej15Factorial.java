
import java.util.Scanner;

// 15 Leer un número N y calcular la suma de los factoriales de los números desde 0 hasta N.

public class U1T2Ej15Factorial {
    public static void main(String[] args) throws Exception {
       
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingrese el número N: ");
        int numero = sc.nextInt();
        int resultado = 1;

        for (int i = numero; i > 1; --i) {
             resultado *= i;
            }
        System.out.println(resultado);
        sc.close();
    }
}
