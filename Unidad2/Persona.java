public class Persona {

//atributos  clase, superclase, herencia
//orden atributos, constructor, metodo, get and set

   private int identificacion;
   private String nombre;
   private String apellido;
   private int edad;

// constructor es un metodo con el mismo nombre de la clase
// es el primero que se ejecuta al crear el objeto
// crear objeto, instanciar, inicializa los atributos 
// para construirlo solo clic derecho origen y constructores

    public Persona(int identificacion, String nombre, String apellido, int edad) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }


// metodos

public void mostrardatos() {
    System.out.println(this.identificacion);
    System.out.println(this.nombre);
    System.out.println(this.apellido);
    System.out.println(this.edad);
}

// generar getter y setters con clic derecho
// también son metodos construidos especialemnte para atributos privados
// gett permite desde afuera ajustar el valor


public int getIdentificacion() {
    return identificacion;
}


public void setIdentificacion(int identificacion) {
    this.identificacion = identificacion;
}


public String getNombre() {
    return nombre;
}


public void setNombre(String nombre) {
    this.nombre = nombre;
}


public String getApellido() {
    return apellido;
}


public void setApellido(String apellido) {
    this.apellido = apellido;
}


public int getEdad() {
    return edad;
}


public void setEdad(int edad) {
    this.edad = edad;
}







    
}
