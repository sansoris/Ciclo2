
import java.util.Scanner;
public class Condicionales {
    public static void main(String[] args) {
        // condicionales if y switch desactivar comentarios según el caso

        // capturar un valor por consola se utiliza una clase llamada scanner
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el color de su tarjeta: ");
        String color= sc.nextLine(); // Introduce texto (Int = numero) (Float = decimal)
        sc.close();
        // String color = "Rojo";  o se puede dar por consola con las lineas previas
        // Se debe ajustar los condicionales con los métodos del objeto
        // System.out.println(validacion(color));
    
        // if (color.equals("Rojo" )){  // se puede con el metodo equalsignoreexception para omitir mayúscula
        //     System.out.println("Por favor PARE");
        // }else if (color.equals("Amarillo")){
        //     System.out.println("Por favor ATENCIÓN");
        // }else if(color.equals( "Verde" )){
        //     System.out.println("Por favor CONTINUE");
        // }else {
        //     System.out.println("Tarjeta inválida");
        // };
        


        // Cuando se refiere a una sola variable alternativa 2
        // switch(color.toLowerCase()){creo que esa instrucción podría servir para minúsculas
            
        switch (color) {
            case "Rojo":
                System.out.println("Por favor PARE");
                break;
            case "Amarillo":
                System.out.println("Por favor ATENCIÓN");
                break;
            case "Verde":
                System.out.println("Por favor CONTINUE");
                break;
            default:
                System.out.println("Tarjeta inválida");
                break;
        }
    } 
} 
