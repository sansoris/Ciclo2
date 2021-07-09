package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;

public class U1T2Ej13Dolares {

// 13. Programa que pase de pesos a dólares y viceversa.

public static void main(String[] args){
    divisa();
}

    public static void divisa() {
        
        Scanner c = new Scanner (System.in);
        System.out.println("Cuál moneda deseas cambiar? PESOS o DOLARES");
        String cambio = c.nextLine();

        Scanner sc = new Scanner (System.in);
        System.out.println("Por favor escribe el monto ");
        Float moneda = sc.nextFloat();


        switch (cambio) {
            case "PESOS":
            System.out.println( moneda + " Pesos" + ", corresponde a " + (Math.floor(moneda/3500)) + " Dólares");
            break;
            case "DOLARES":
            System.out.println( moneda + " Dolares" + ", corresponde a " + ( Math.floor(moneda*3500)) + " Pesos");
            break;
   }
       c.close();
       sc.close();          
}
}
