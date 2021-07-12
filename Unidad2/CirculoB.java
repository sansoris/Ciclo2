public class CirculoB extends Figura {
    // atributos
    private float radio;
    private final float PI = 3.141519f;

    //constructor
    public CirculoB(float radio) {
        this.radio = radio;
    }


    @Override // ya existe el metodo abstracto en figura
    public float area() { // regresa un float
        return PI*radio*radio;
    }


    
}
