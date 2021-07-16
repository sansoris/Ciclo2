import java.util.*;

// Clases utilizadas
// HashMap  No ordenación, eficiente
// LinkedHashMap  Ordenado por inserción, por uso, lectura eficiente poca escritura
// TreeMap Ordenado por clave, poco eficiente en operaciones
// EnumMap permite enum como claves, muy eficiente
// WeakHashMap  Utilizado para crear elementos que vaya borrando el sistema  poco eficiente
// HashTable considerado como obsoleto  operaciones de concurrencia
// ConcurrentHashMap en concurrencia no permite nulos
// FUNCIONES DEL CONJUNTO
// Nombremap.size(); // Devuelve el numero de elementos del Map
// Nombremap.isEmpty(); // Devuelve true si no hay elementos en el Map y false si si los hay
// Nombremap.put(K clave, V valor); // Añade un elemento al Map
// Nombremap.get(K clave); // Devuelve el valor de la clave que se le pasa como parámetro o 'null' si la clave no existe
// Nombremap.clear(); // Borra todos los componentes del Map
// Nombremap.remove(K clave); // Borra el par clave/valor de la clave que se le pasa como parámetro
// Nombremap.containsKey(K clave); // Devuelve true si en el map hay una clave que coincide con K
// Nombremap.containsValue(V valor); // Devuelve true si en el map hay un Valor que coincide con V
// Nombremap.values(); // Devuelve una "Collection" con los valores del Map
// Declaración de un Map (un HashMap) con clave "Integer" y Valor "String". Las claves pueden ser de cualquier tipo de objetos, aunque los más utilizados como clave son los objetos predefinidos de Java como String, Integer, Double ... !!!!CUIDADO los Map no permiten datos atómicos
// Map <k,v> == clave valor  pueden ser numericos o string
// Map <Integer, String> nombreMap = new HashMap<Integer, String>();


public class Nombremap {

public static void main(String[] args) {
    HashMap<String, Empleado> personal = new HashMap <String, Empleado>();
    personal.put("145", new Empleado("Jennifer")); // instanciando empleado y creandolo al mismo tiempo
    personal.put("567", new Empleado("Samuel")); 
    personal.put("890", new Empleado("Darcio")); 
    System.out.println(personal);
    System.out.println("Remover un objeto, con la clave, por ejemplo 567");
    personal.remove("567"); // retirar
    System.out.println(personal);
    System.out.println("Sustituir, introducir un elementos con la misma clave, por ejemplo 567");
    personal.put("145", new Empleado("Harold"));  // reemplaza el existente
    System.out.println("Personal");
    System.out.println(personal);
    System.out.println("Values");
    System.out.println(personal.values());
    System.out.println("EntrySet");
    System.out.println(personal.entrySet()); // un conjunto completo
    System.out.println("Bucle");
    for(Map.Entry<String, Empleado> entrada: personal.entrySet()){
        String clave = entrada.getKey();
        Empleado valor= entrada.getValue();
        System.out.println("Clave="+ clave +", Valor="+ valor);
    }
    System.out.println(personal.size());
}
}


class Empleado{
    public Empleado(String n){
    nombre = n; 
    sueldo = 2000;
    }

    public String toString(){
        return "[Nombre del empleado: " + nombre + ", Sueldo es: "+ sueldo + "]";
    }

    private String nombre; 
    private double sueldo;
}



