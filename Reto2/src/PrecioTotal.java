public class PrecioTotal {
    // Atributos

    private Double totalPrenda =0.0;
    private Double totalPantalon =0.0;
    private Double totalSandalia=0.0 ;
    
    private Prenda listaPrendas[];
    
    
    
    // métodos de acceso
    public PrecioTotal(){
        this.totalPrenda = 0.0;
        this.totalPantalon = 0.0;
        this.totalSandalia = 0.0;
    }

    public PrecioTotal(Prenda listaPrendas[]){
        // this.totalPrenda = 0.0;
        // this.totalPantalon = 0.0;
        // this.totalSandalia = 0.0;
        
        this.listaPrendas = listaPrendas;
    }
    // Constructores
    
   // métodos

    public void mostrarTotales() {

        for (Prenda pr: listaPrendas) {
            if (pr instanceof Prenda) {
                totalPrenda =  totalPrenda + pr.precioFinal();
            }
            if (pr instanceof Pantalon) {
                totalPantalon = totalPantalon + pr.precioFinal();
            }
            if (pr instanceof Sandalia) {
                totalSandalia = totalSandalia+ pr.precioFinal();
            }
        }

        System.out.println("La suma del precio de las Prendas es de "+totalPrenda);
        System.out.println("La suma del precio de los Pantalones es de "+ totalPantalon);
        System.out.println("La suma del precio de las SAndalias es de "+totalSandalia);
    
        }
        // En caso de ser necesarios metodos adicionales
}
