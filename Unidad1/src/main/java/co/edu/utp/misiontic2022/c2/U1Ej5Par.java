package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

// Escribe un programa java que lea una variable de tipo entero y asígnale un valor.
// A continuación muestra un mensaje indicando si la variable es par o impar.
// Utiliza el operador condicional ( ? : ) para resolverlo.
// Ej: “14 es par” o “15 es impar”

public class U1Ej5Par {
    
   
    public static void main(String[] args) throws Exception {
            Scanner sc =new Scanner(System.in);
            System.out.println("Ingrese el número: ");
            int numero = sc.nextInt();
            System.out.println(par_impar(numero));
            sc.close();

        }
    
    public static String par_impar(int numero) {
        return numero + (numero%2==0 ? " es par " : " es impar "); //  Operadores ternarios, if (?)(:) Else
        }
    }


    