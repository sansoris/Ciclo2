package co.edu.utp.misiontic2022.c2;


public class Operadores {
    public static void main(String[] args) {
        //operadores aritmeticos - * / + 

        int a =0;
        a= a+1; //1
        a++; //2
        a+=5; //7
        a--;  //6
        System.out.println(a);

        // operadores relacionales  > < >= <= !=  ==
        // resultados son booleanos   True or False

        System.out.println(a == 20);  //Compara el resultado


        // operadores logicos  
        // and (&&)
        // or (//)
        // not (/)
        // resultados son booleanos   True or False
        System.out.println(a);  // no se podría imprimir (a==a)

        // operadores ternarios
        // Cuando se requiere asignar una variable, una condición
        String mensaje;
        mensaje = a>10? " A mayor que 10": "A menor o igual a 10";
        System.out.println(mensaje); 


    }
}
