public class Cuadrado extends Figura {
    private float lado;

//constructor
    public Cuadrado(float lado) {
        this.lado = lado;
    }

    
// implementar el metodo 

    @Override
    public float area (){
        return lado*lado;
    }

}
