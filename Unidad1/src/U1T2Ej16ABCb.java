

public class U1T2Ej16ABCb {

    public static void main(String[] args) {
        abecedarioReverse();

    }
public static void abecedarioReverse(){
    String cadena = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
    for(int i = 0; i<=cadena.length();i++){
        String cortada = cadena.substring(i, cadena.length());
        System.out.println(cortada);
    }
}
}