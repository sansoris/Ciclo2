package Unidad2.src;

public class Sobremetodo {
    private String usuario;
    private String clave;

    // Se cuenta con dos constructores con el mismo nomnbre
// A esto se llama sobrecarga de constructores

    public Sobremetodo(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }
    public Sobremetodo(String usuario) {
        this.usuario = usuario;
        this.clave = String.valueOf((int)(Math.random()*1000));
    }

    public void mostrardatos (){
    System.out.println("Los datos requeridos son: usuario "+ this.usuario +  ", y su clave es: " + this.clave );
}

}    