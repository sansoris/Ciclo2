public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Nuevainversion inversion = new Nuevainversion();
        // inversion.salida();
        // inversion.compararInversion(inversion.pTiempo, inversion.pCapital, inversion.pInteres);
        // System.out.println(inversion.calcular());
        // System.out.println(inversion.compararInversion(36,200000,5.0));
        // System.out.println(inversion.compararInversion(12,150000,2.0));
        // System.out.println(inversion.compararInversion(0,0,0));

       
            ProyectoTextiles ProyectoTextiles1 = new ProyectoTextiles(2, 10000000, 6);
            System.out.println(ProyectoTextiles1.calcInteresS());
            System.out.println(ProyectoTextiles1.calcInteresC());
            System.out.println(ProyectoTextiles1.compararIntereses()); 
            ProyectoTextiles ProyectoTextiles2 = new ProyectoTextiles(0, 0, 0);
            System.out.println(ProyectoTextiles2.calcInteresS());
            System.out.println(ProyectoTextiles2.calcInteresC());
            System.out.println(ProyectoTextiles2.compararIntereses()); 
            ProyectoTextiles ProyectoTextiles3 = new ProyectoTextiles(12, 15000, 5.2);
            System.out.println(ProyectoTextiles3.calcInteresS());
            System.out.println(ProyectoTextiles3.calcInteresC());
            System.out.println(ProyectoTextiles3.compararIntereses()); 



        
        }
}


