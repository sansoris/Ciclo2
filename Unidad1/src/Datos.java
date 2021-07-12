


public class Datos {
    public static void main(String[] args) {
        byte num; // hasta que no se utilice no se deja de subrayar
        num= 10;  // se utilizaron dos líneas para declarar la variable
            System.out.println(num);
        int num2 = 21;  // se utiliza una línea para declarar la variable
            System.out.println(num2);
        double num3= 3.5; // variable float
            System.out.println(num3);
        String mensaje = "Hola"; // variable string
            System.out.println(mensaje);
        char letra1 = 'a';
        char letra2 = 98;  // si se define en char, trae el codigo ascii 
            System.out.println(letra1);
            System.out.println(letra2);
        String palabra = "Palabra";
            System.out.println(palabra);
        // se puede imprimir varias cosas al tiempo con el signo + y separación con comillas
        System.out.println(num +" "+ num2 + " "+ num3 +" "+ mensaje +" "+ letra1+" "+ letra2 +" "+ palabra);
// definir variable en una sola línea
        int n1 =10, n2 = 20, n3 = 30;
        System.out.println( n1+ n2 + n3); // se puede sumar en la salida desde que este dentro del main
        }
}
