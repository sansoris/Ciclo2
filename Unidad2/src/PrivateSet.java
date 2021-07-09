package Unidad2.src;
import java.lang.Math;

public class PrivateSet {
    public static void main(String[] args) throws Exception {
        
        Carro carro1 = new Carro(); // instancia
        // carro1.establecerAtributos("Rojo", "Chevrolet", 2020); // estableciendo atributo desde el método
        carro1.establecerAtributos2("Rojo", "Chevrolet", 2020);
        // carro1.color = "Rojo"; // estableciendo atrbibuto por variable
        // carro1.marca = "Chevrolet";
        // carro1.modelo = 2020;
        System.out.println("El carro es marca " + carro1.marca);
        System.out.println("El carro es de color " + carro1.color);
        System.out.println("El carro es modelo " + carro1.modelo);
        carro1.acelerar();
        carro1.frenar();

        System.out.println("Opción dos\n");

        Circulo circulo1 = new Circulo(); // instancia
        circulo1.radio = 5;
        float resultado = circulo1.area();
        System.out.println("El área del circulo es:  "+ resultado);

        Login jennifer = new Login();
        jennifer.nombreusuario= "JCM";
        jennifer.saludar();
        jennifer.setClave("123");
        System.out.println("La clave es  "+ jennifer.getClave());

    }
}

    class Carro {
        // Los nombres de laas calases deben comenzar con mayuscula
        // atributos
        // inician con minuscula
        String color;
        String marca;
        Integer modelo;
    
    void establecerAtributos (String colorCarro, String marcaCarro, Integer modeloCarro){
        color = colorCarro;
        marca = marcaCarro;
        modelo = modeloCarro;
    }
    void establecerAtributos2 (String color, String marca, Integer modelo){
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    void acelerar(){  // los métodos son acciones 8verbos), inician con minúcula
    System.out.println("El carro se encuentra acelerando"); 
    }

    void frenar (){
    System.out.println("El carro se encuentra frenado");   
    }
}
    class Circulo{
        float radio;
        private final float PI =3.1416f;  //Las constantes deben ser nombradas con mayúsculassostenidas.

        float area(){
            float area1 = PI * (float) Math.pow (this.radio,2);
            return area1;
        }
    }

    class Login{
        
        public String nombreusuario;
        private String clave;

        public void saludar(){
            System.out.println("El nombre de usuario es: "+ nombreusuario);
        }
        public String getClave(){ 
                return clave;
        }
        public void setClave(String clave){
            this.clave = clave;
        }
  }
    

    



