public class Cadenas {
    public static void main(String[] args) {
        String mensaje = "         Esta es una prueba          ";
        System.out.println(mensaje.toUpperCase()); // mayuscula
        System.out.println(mensaje.toUpperCase().trim()); //mayuscula justificada
        System.out.println(mensaje.length()); // longitud de string

        int numero = 20;
        String cadena = String.valueOf(numero);
        System.out.println(cadena);
    }
    //Integer.parseInt(variable en int)
    //read.Line  cadena
    // var numero = float parseInt()
    //BufferedReader() Escaner de los datos. debe importarse con
    // import java.io.InputStreamReader
    // import java.io.BufferedReader
    // import java.io.IoException
    // para trabajar con flujos
    // Entero en objeto o viceversa de integer a int sin hacer cambios en codigo

}
