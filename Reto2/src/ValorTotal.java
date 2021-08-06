public class ValorTotal {
    // Atributos
    private Double valorTotalLasanas = 0.00;
    private Double valorTotalLasanasExtraQueso = 0.00;
    private Double valorTotalLasanasExtraVegetales = 0.00;

    private Lasanas[] lasanas;
   
  
    // Constructores
    public ValorTotal() {
        this.valorTotalLasanas = 0.0;
        this.valorTotalLasanasExtraQueso = 0.0;
        this.valorTotalLasanasExtraVegetales = 0.0;
    }

    
    
    public ValorTotal(Lasanas [] lasanas) {
        // this.valorTotalLasanas = 0.0;
        // this.valorTotalLasanasExtraQueso = 0.0;
        // this.valorTotalLasanasExtraVegetales = 0.0;

        this.lasanas = lasanas;
}
    // Métodos
    
    public void mostrarTotales() {
        Double totalLasanas = 0.0;

        // for (Lasanas ls: lasanas){
        //     if (ls instanceof Lasanas){
        //         valorTotalLasanas += ls.calcularPrecio() ;
        //     }
        //     else if (ls instanceof ExtraQueso){
        //         valorTotalLasanasExtraQueso +=ls.calcularPrecio();
        //     }
        //     else if (ls instanceof ExtraVegetales){
        //         valorTotalLasanasExtraVegetales += ls.calcularPrecio();
        //     }
        // }
        int ls=0;
        for (ls = 0; ls < lasanas.length; ls++)
            if (lasanas[ls].getClass().getName() == "Lasanas"){
                // valorTotalLasanas += lasanas[ls].calcularPrecio();
                valorTotalLasanas = valorTotalLasanas+ lasanas[ls].calcularPrecio();
            }            
            else if (lasanas[ls].getClass().getName() == "ExtraQueso"){
                valorTotalLasanasExtraQueso += lasanas[ls].calcularPrecio();
            }
            else if (lasanas[ls].getClass().getName() == "ExtraVegetales"){
                valorTotalLasanasExtraVegetales += lasanas[ls].calcularPrecio();
            }
            

        
        totalLasanas = valorTotalLasanas + valorTotalLasanasExtraQueso+ valorTotalLasanasExtraVegetales;

       // Cálculo totales
        System.out.println(Math.round(valorTotalLasanas));
        System.out.println(Math.round(valorTotalLasanasExtraQueso));
        System.out.println(Math.round(valorTotalLasanasExtraVegetales));
        System.out.println(Math.round(totalLasanas));
    }
}
