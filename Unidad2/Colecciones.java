// import java.lang.Thread.State;
// import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
// import java.util.List;




public class Colecciones {
    // List Lista
    // Set  Conjunto
    // Map  Llave, valor
    // se manejan como objetos

// public static void main(String[] args) {
//     // manejoListas();
//     // manejoConjuntos();
//     manejoMapas();
// }
// 
// private static void manejoListas(){
//     List <Object> listaBasica = new ArrayList<>();
//     listaBasica.add("Hola mundo");
//     listaBasica.add(10);
//     listaBasica.add(20);
//     listaBasica.add(30);
//     System.out.println("tamaño lista es: " + listaBasica.size());

//     for (int i = 0; i < listaBasica.size();i++) {
//         Object element = listaBasica.get(i);
//         System.out.println(listaBasica.get(i));
        
//         if (element instanceof String) {
//             System.out.println("Es una cadena");
//         }else if (element instanceof Number){
//             System.out.println("Es un número");
//         }else if (element instanceof java.util.Collection){
//             System.out.println("Es una Colección");
//     } else {
//         System.out.println("No conocido");
//     }
// }
// // foreach
//     for (Object object: listaBasica){
//         System.out.println(object + " tipo"+object.getClass());
//     }

// // for each de las listas
// // tomando estructura de lambda
// //lambda x: x**2;

// listaBasica.forEach(element -> System.out.println(element)); // imprime los objetos, recorriendo la lista
// listaBasica.forEach(System.out::println);
//  // hace lo mismo con la anterior


// listaBasica.stream();
//     .map(a -> a);  // modeificación sobre lista o conjunto de lista
//     .filter (a -> true);
//     .reduce ((a,b) -> a.equals(b));


// private static void manejoConjuntos() {
//     var conjunto =new HashSet<Integer>();
//     conjunto.add(10);
//     conjunto.add(5);
//     conjunto.add(3);  // solo tiene capacidad de enteros, se define en el compilador
//     // conjunto.add(Double.parseDouble("8"));
//     System.out.println(conjunto);
//     conjunto.forEach(System.out::println);
// }

private static void manejoMapas(){
    Object mapa = new HashMap<String>();
    mapa.put("Jennifer", 2);
    System.out.println(mapa);

    String key;
    String value;
    ((Object) mapa).forEach(key, value); 
    System.out.println(key + "-" + value);
    ((Object) mapa).remove("Jennifer"); //para retirar el elemento
}


}



