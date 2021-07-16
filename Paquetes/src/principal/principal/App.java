package principal; 

public class App {

    public static void main(String[] args) throws Exception {
        Operaciones operacion1 = new Operaciones(89,100);
        System.out.println(operacion1.suma());
        System.out.println(operacion1.resta());

    //arrays, arreglo
    // 1. tipo de dato del arreglo
    // declaración del array
    // creando la dimensión del array
    

    int numeros [];
    numeros = new int [3];
    numeros[2]= 20;

    int numPares[]= {2,4,6,8,10};
        
    // en lugar de conchetes al final, se puede al incio
    String[] nombres ={"Ana","Pedro", "Carlos"};

    // Recorriendo los array tradicionalmente
    // Comienza en la posición cero
    // recorre los indices del array
    
    System.out.println("----------------indices");
    for (int i = 0; i <= 2; i++) {
        System.out.println(numeros[i]);
    }

// Recorriendo un array opción 2
// recorre el valor del array
System.out.println("----------------valores");
    for (int i : numPares){
        System.out.println(i);
    }
System.out.println("----------------nombre");
    for (String i : nombres){
        System.out.println(i);
    }

}
    
}
