//import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println(" Estudio 1:");
        ProyectoTextiles estudio1 = new ProyectoTextiles(0, 0, 0);
        System.out.println(estudio1.calcInteresS());
        System.out.println(estudio1.calcInteresC());
        System.out.println(estudio1.compararIntereses());

        System.out.println(" ");

        System.out.println(" Estudio 2:");
        ProyectoTextiles estudio2 = new ProyectoTextiles(2, 10000000, 6);
        System.out.println("Interés Simple: ");
        System.out.println("Esperado: 1200000.0");
        System.out.println("Obtenido: " + estudio2.calcInteresS());
        System.out.println(" ");

        System.out.println("Interés Compuesto:");
        System.out.println("Esperado: 1236000.0");
        System.out.println("Obtenido: " + estudio2.calcInteresC());
        System.out.println(" ");

        /*DecimalFormat df = new DecimalFormat("#.0");
        System.out.println("Resultado" + df.format(estudio2.calcInteresC()));
        System.out.println(" ");*/

        System.out.println("Comprar Intereses:");
        System.out.println("Esperado: 36000.0");
        System.out.println("Obtenido: " + estudio2.compararIntereses());

        
    }
}
