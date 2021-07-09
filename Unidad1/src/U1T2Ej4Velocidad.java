
import java.util.Scanner;

// Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado

public class U1T2Ej4Velocidad {
    public static void main(String[] args) {
        velocidadkm();
    }

    public static void velocidadkm(){
        Integer v;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la velocidad en metros/segundo ");
        v = sc.nextInt();
        System.out.println( v + " m/s, corresponde a: " + Math.floor(v * 3.6) + " Km/h");
        sc.close();
}
}
