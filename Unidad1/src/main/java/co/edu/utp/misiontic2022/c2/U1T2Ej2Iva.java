package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

// Programa que calcule el precio de venta de un producto conociendo el precio
// por unidad (sin IVA) del producto, el número de productos vendidos y el
// porcentaje de IVA aplicado. Los datos anteriores se leerán por teclado.

public class U1T2Ej2Iva {
    public static void main (String [] args)  {
        calculoprecio();
    }
    
    public static void calculoprecio(){
        double punitario,qty;
        int iva;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio unitario del artículo: ");
        punitario = sc.nextDouble();
        System.out.print("Ingrese la cantidad de artículos: ");
        qty = sc.nextDouble();
        System.out.print("Ingrese el porcentaje de IVA: ");
        iva = sc.nextInt();
        double PSinIva = punitario * qty;
        double PIva = (PSinIva * iva )/100;
        //double PTotal = PSinIva + PIva;
        System.out.println("El total de la compra fue de: $"+ (PSinIva + PIva));
        sc.close();
    }
}

