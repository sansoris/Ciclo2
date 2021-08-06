public class ExtraVegetales extends Lasanas {
     // Atributos
     private String tipoVegetales;

     // Constructores
    // public ExtraVegetales() {
    //     super(SABOR, TAMANO, PRECIOBASE);
    // }
    
    public ExtraVegetales(String tipoVegetales) {
        this.tipoVegetales = tipoVegetales;
    }


    public ExtraVegetales(String sabor, String tipoVegetales) {
        super(sabor);
        this.tipoVegetales = tipoVegetales;
    }


    public ExtraVegetales(String sabor, String tamano, String tipoVegetales) {
        super(sabor, tamano);
        this.tipoVegetales = tipoVegetales;
    }


    public ExtraVegetales(String sabor, String tamano, Double precioBase, String tipoVegetales) {
        super(sabor, tamano, precioBase);
        this.tipoVegetales = tipoVegetales;
    }

     
     // Metodos
    @Override
     public double calcularPrecio() {
        Double parcialv =0.0;
        if (tipoVegetales.equals("champiñones")){
            parcialv +=4000;
        }else if(tipoVegetales.equals("calabacitas")){
            parcialv += 3000;
        }else {
            parcialv +=0.0;
        }
         return super.calcularPrecio()+parcialv;
    }
}
