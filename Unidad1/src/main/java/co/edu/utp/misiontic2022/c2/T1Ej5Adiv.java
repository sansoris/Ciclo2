package co.edu.utp.misiontic2022.c2;



import java.util.Scanner;

// Generar un número aleatorio entre el 1 y el 100, el usuario lo tiene que
// adivinar introduciendo el número por teclado. En el caso que el número a
// adivinar sea mayor al ingresado, decirle al usuario “El número que busca es
// mayor”, de lo contrario, “El número que busca es menor”. El programa
// finalizará cuando se introduzca el número correcto. Nota: usar la clase
// Random para generar el número aleatorio.

public class T1Ej5Adiv {
    public static void main(String[] args) throws Exception{
        int numero = (int)(Math.random()* 100+1);  // Genero el numero aleatorio
        System.out.println(numero);

        int contador = 0;
        do{
        Scanner sc = new Scanner (System.in);
        System.out.println("Cual es el número escondido? ");
        Integer usuario = sc.nextInt();
        // System.out.println(usuario>numero ? "El número que busca es menor": "El número que busca es mayor");
        if(numero > usuario){
            System.out.println("El número que busca es mayor");
        }
        else if(numero< usuario){
            System.out.println("El número que busca es menor");
        }
        else if(numero==usuario){
            System.out.println("El numero es correcto");
            break;
        }
        else {
           System.out.println("Número inválido");
        
        sc.close();
        } 
        contador ++;
        if (contador ==5){System.out.println("Tus oportunidades han terminado, el numero escondido era:  " + numero);}
    } while (contador <5);
        

    
}
}
        

        
        // switch (numero) {
        //     case (usuario > numero):
        //         System.out.println("El número que busca es menor");
        //         break;
        //     case (usuario <numero):
        //         System.out.println("El número que busca es mayor");
        //         break;
        //     case (usuario == numero):
        //         System.out.println("El numero es correcto");
        //         break;
        //     default:
        //         System.out.println("Número inválido");
        //         break;
        // }
        

