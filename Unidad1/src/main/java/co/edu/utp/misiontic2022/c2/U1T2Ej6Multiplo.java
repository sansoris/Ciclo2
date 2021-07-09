package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

// 6. Programa que lea un número entero y muestre si el número es múltiplo de 10.



public class U1T2Ej6Multiplo {
        public static void main(String[] args) throws Exception {
                Scanner sc =new Scanner(System.in);
                System.out.println("Ingrese el número: ");
                int numero = sc.nextInt();
                System.out.println(multiplo(numero));
                sc.close();
    
        }
        
        public static String multiplo(int numero) {
            return numero + (numero%10==0 ? " Es multiplo de 10 " : " No es multiplo de 10 "); //  Operadores ternarios, if (?)(:) Else
            }
        }
