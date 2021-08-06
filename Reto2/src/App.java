public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");


        Prenda intem[]= new Prenda[5];
        intem[0]=new Prenda(150.0, 5,"cafe");
        intem[1]=new Pantalon(150.0, 5);
        intem[2]=new Sandalia(500.0, 10,"verde","exteriores");
        intem[3]=new Prenda();
        intem[4]=new Pantalon(600.0, 4, "morado", "levis");
        PrecioTotal analisis1 = new PrecioTotal(intem);
        analisis1.mostrarTotales(); 
    
        System.out.println("\n===========RETO GRUPO 64 PRUEBA 2================");
    
        Prenda intem2[]=new Prenda[5];
        intem2[0]=new Prenda();
        intem2[1]=new Pantalon();
        intem2[2]=new Sandalia();
        intem2[3]=new Prenda();
        intem2[4]=new Pantalon();
        PrecioTotal analisis2 = new PrecioTotal(intem2);
        analisis2.mostrarTotales();

        // System.out.println("\n===========RETO GRUPO 65 ================");

        // Lasanas[] Lasanas1 = new Lasanas[5];
        // Lasanas1[0] = new Lasanas("carne","4_porciones",22000.0);
        // Lasanas1[1] = new ExtraQueso("pollo","12_porciones",25000.0, "provolone");
        // Lasanas1[2] = new ExtraVegetales("camarones","12_porciones",18000.0, "champiñones");
        // Lasanas1[3] = new ExtraVegetales("espinaca","4_porciones",25000.0, "calabacitas");
        // Lasanas1[4] = new Lasanas();
        // ValorTotal respuesta1 = new ValorTotal(Lasanas1);
        // respuesta1.mostrarTotales();
        // System.out.println(); 

        // System.out.println("===========RETO GRUPO 65 PRUEBA 2================");

        // Lasanas[] Lasanas2 = new Lasanas[4];
        // Lasanas2[0] = new Lasanas();
        // Lasanas2[1] = new Lasanas("pollo","12_porciones",23000.0);
        // Lasanas2[2] = new ExtraQueso("espinaca","4_porciones",25000.0, "suizo");
        // Lasanas2[3] = new ExtraVegetales("carne","12_porciones",23000.0, "calabacitas");
        // ValorTotal respuesta2 = new ValorTotal(Lasanas2);
        // respuesta2.mostrarTotales();
        // System.out.println();








    }
}
