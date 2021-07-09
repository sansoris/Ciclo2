package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

// Programa que lea dos variables enteras N y m y le quite a N sus m últimas
// cifras. Por ejemplo, si N = 123456 y m = 2 el nuevo valor de N será 1234.

public class U1T2Ej3ValNM {
    public static void main(String[] args) {
        varentera();
    }

    public static void varentera(){
        Integer N,M, digitos;
        String conteo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese variable entera N°1: ");
        N = sc.nextInt();
        System.out.println("Ingrese variable entera N°2 de 1 a 9: ");
        M = sc.nextInt();
        
        //pasar el numero a cadena para contar caracteres
        conteo = String.valueOf(N);
        digitos = conteo.length();

        if (digitos > M ){
            if(M == 1){System.out.println(N/10);}
            else if(M == 2){System.out.println(N/100);}
            else if(M == 3){System.out.println(N/1000);}
            else if(M == 4){System.out.println(N/10000);}
            else if(M == 5){System.out.println(N/100000);}
            else if(M == 6){System.out.println(N/1000000);}
            else if(M == 7){System.out.println(N/10000000);}
            else if(M == 8){System.out.println(N/10000000);}
            else if(M == 9){System.out.println(N/100000000);}
            
        }else{
            System.out.println(N + " Tiene MENOS digitos que "+ M);

    } sc.close();
}
}

