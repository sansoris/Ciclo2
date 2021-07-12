 // ejemplo perro que implementa las acciones de las interfaces
    // figura cuadrado rectangulo: interface... con área perimetro. 
    // no dice como hacerlo,


public class Interface3 implements Interface, Interface2 {

    @Override
    public void caza() {
        System.out.println("El perro está cazando");
        
    }

    @Override
    public void pasea() {
        System.out.println("El perro está paseando");
        
    }  
   


   
}
