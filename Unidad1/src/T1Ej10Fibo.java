


import java.util.Scanner;

// 10. Muestra la serie de fibonacci hasta un número pedido por teclado. Por
// ejemplo, si el número ingresado es el 100, debe imprimir los números
//  0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89.


public class T1Ej10Fibo {
        public static void main(String[] args){
        int a = 0;
        int b = 1;    
        int temp = 0;

        Scanner sc = new Scanner (System.in);
        System.out.println("Introduzca un numero: ");
        Integer numero = sc.nextInt();
        
        while (a < numero){
            System.out.print(a + ", ");  // para que sea en un linea le retiramos el ln
            temp = a;
            a = b;
            b = temp + b;
            
        }sc.close();

            
    }

}
