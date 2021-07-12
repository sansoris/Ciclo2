
public class Instancias {
        // Instancia a la clase circuloA
        // 1 nombre de la clase
        // 2 Nombre de objeto que se desea crear
public static void main(String[] args) throws Exception{
        
        CirculoA circulo1 = new CirculoA(5);
        CirculoA circulo2 = new CirculoA(10);
        CirculoA circulo3 = new CirculoA(2);
        System.out.println(circulo1.area());
        System.out.println(circulo2.area());
        System.out.println(circulo3.area());
        System.out.println(circulo2.getRadio());
        System.out.println(CirculoA.perimetro(10));
        System.out.println("-------------------------SOBREMETODO----------------------------");

// Instancia clase de Sobremetodo

        Sobremetodo usuario1 = new Sobremetodo("Jennifer");
        Sobremetodo usuario2 = new Sobremetodo("Usuario2", "759");
        usuario1.mostrardatos();
        usuario2.mostrardatos();
        System.out.println("-------------------------PERSONA----------------------------");
// instancia a la clase persona
Persona persona1 = new Persona (123456, "Jennifer", "Cuesta",43);
persona1.mostrardatos();
System.out.println("-------------------------ESTUDIANTE----------------------------");

// Instancia a la clase estudiante (tiene metodos de padre y hijo)
  Estudiante estudiante1 = new Estudiante(987654, "Harold", "Moreno", 18, "Diseño", 4.5f);
  estudiante1.mostrardatos();
  System.out.println("----------------------ESTUDIANTE----DETALLES----------------------");
  estudiante1.mostrardetalles();



// INSTANCIA A LA CLASE CIRCULO
System.out.println("-------------------------CLASE FIGURA----------------------------"); 
CirculoB circulo4 = new CirculoB (10f);
System.out.println(circulo4.area());
Cuadrado cuadrado1 = new Cuadrado(5f);
System.out.println(cuadrado1.area());

// INSTANCIA DE LA INTERFACE

System.out.println("----------------------INTERFACE---------------------------"); 
Interface3 perro = new Interface3();
perro.caza();
perro.pasea();


}




}
