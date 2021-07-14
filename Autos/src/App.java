public class App {

    // Instanciar 
    public static void main(String[] args) throws Exception {
        Auto auto1 = new Auto("FUJ174", "Subaru", 3500000, 0);
        System.out.println("--Mostando características del auto--");
        System.out.println("Placa del auto es: " + auto1.placa);
        System.out.println("Marca del auto es:" + auto1.marca);
        System.out.println("Precio del auto es: "+ auto1.precio);
        System.out.println("Número de Airbag del auto es: "+ auto1.getNumeroAirbags());
        System.out.println("El costo sin Iva del auto es: "+ auto1.calcularCosto(2000));
        Integer costoIva = auto1.calcularCosto(2000) + auto1.calcularCosto(2000)* CalculaCosto.IVA/100;
        System.out.println("El costo con Iva del auto es: "+ costoIva);
    }
}
