
import java.util.Scanner;

public class T1Ej2Notas2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca las notas: nota1,nota2,nota3:");
            float nota1 = sc.nextFloat();
            float nota2 = sc.nextFloat();
            float nota3 = sc.nextFloat();
            float promedio = (nota1 + nota2 + nota3) / 3;
            System.out.println("El promedio es: " + promedio);
            if (promedio >= 3.0) {
                System.out.println("APROBO");
            } else {
                System.out.println("REPROBO");

            }sc.close();
        }
    }
