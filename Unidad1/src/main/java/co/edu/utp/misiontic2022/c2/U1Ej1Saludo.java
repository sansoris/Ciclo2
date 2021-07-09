package co.edu.utp.misiontic2022.c2;

public class U1Ej1Saludo {
    public static void main (String[] arg) {
      var nombre = "Jennifer Cuesta";
      var resultado = saludo (nombre);
    //System.out.println("Por favor ingrese su nombre");
      System.out.println(resultado);
    }
    public static  String saludo(String nombre){
        return "Hola " + nombre + "!";
      
    }
}
