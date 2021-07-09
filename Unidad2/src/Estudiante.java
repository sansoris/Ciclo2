package Unidad2.src;

//HEREDA DEL PADRE ALGUNOS ATRIBUTOS

public class Estudiante extends Persona {
    //atributos
    private String facultad;
    private float promedio;
    

    //constructor
    
    public Estudiante(int identificacion, String nombre, String apellido, int edad, String facultad, float promedio) {
        super(identificacion, nombre, apellido, edad);
        this.facultad = facultad;
        this.promedio = promedio;
    }

    // metodos

    public void mostrardetalles() {
        
        System.out.println(this.facultad);
        System.out.println(this.promedio);
    }

// sobre escritura de metodo con arroba override

@Override
public void mostrardatos() {
    System.out.println(super.getIdentificacion());
    System.out.println(super.getNombre());
    System.out.println(super.getApellido());
    System.out.println(super.getEdad());
    System.out.println(this.facultad);
    System.out.println(this.promedio);
    
}




    // getters and setters

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }





    
}
