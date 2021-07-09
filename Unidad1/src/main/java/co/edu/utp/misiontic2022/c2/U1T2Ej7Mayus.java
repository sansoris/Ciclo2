package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

// 7. Programa que lea un carácter por teclado y compruebe si es una letra mayúscula.



public class U1T2Ej7Mayus {


    public static void main(String[ ] args) {
        Scanner usuario = new Scanner(System.in);     
        System.out.print ("Ingrese un caracter: ");   
        char letra = usuario.nextLine().charAt(0);
            
        if(Character.isUpperCase(letra)){         
                System.out.println("Su letra esta en Mayúscula");             
        } else{                  
                System.out.println("Su letra esta en Minúscula"); 
        }
        usuario.close();
    }
}


