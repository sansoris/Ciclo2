
//Profesor Cesar

import javax.swing.JOptionPane; // biblioteca gráfica de java pero no para dejarlo como herramienta gráfica

public class Grupo18U1 {
    public static void main(String[] args) {
        //Creando ventana 
        var entrada = JOptionPane.showInputDialog(null, "Por favor ingrese un número");
        var numero = Integer.parseInt(entrada);

        JOptionPane.showMessageDialog (null, String.format("El número tiene %d cifras \n ", numerodigitos(numero)));
    }

    public static int numerodigitos(int numero) {
        var cifras = 0;
 
        while (numero !=0){
            numero/=10;
            cifras++;
        }
         return cifras;
    } 
}
