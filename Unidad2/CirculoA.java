public class CirculoA {
    // Atributos private

    private Integer radio;

    // Constructor método para ser utilizado en la clase que tiene caracteristicas
    // Tiene el mismo nombre de la clase
    // El constructor se ejecuta cuando se realiza la instancia
    public CirculoA(Integer radio){
        this.radio = radio;
}
    
// metodo

public float area ()  {
        return (float) (Math.PI*Math.pow(this.radio, 2)); // casting se llama al convertir los datos en unidades float double integer
    }

// getter
public Integer getRadio(){
    return radio;
}

//seter
public void setRadio(Integer radio){
   this.radio = radio;
}

// Estático no va a ser
// comentario de prueba


public static float perimetro (int radio){
return (float) (2 * Math.PI * radio);
}

}
