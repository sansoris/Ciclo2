public class ExtraQueso extends Lasanas{
    // Atributos
    
    private String tipoQueso;
     
    // Constructores
    // public ExtraQueso(){
    //     super(SABOR, TAMANO, PRECIOBASE);
    // }

    public ExtraQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
    }

    public ExtraQueso(String sabor, String tipoQueso) {
        super(sabor);
        this.tipoQueso = tipoQueso;
    }

    public ExtraQueso(String sabor, String tamano, String tipoQueso) {
        super(sabor, tamano);
        this.tipoQueso = tipoQueso;
    }

    public ExtraQueso(String sabor, String tamano, Double precioBase, String tipoQueso) {
        super(sabor, tamano, precioBase);
        this.tipoQueso = tipoQueso;
    } 
    
    
    // Metodos
    @Override
    public double calcularPrecio() {
        double parcialq =0.0;
        if (tipoQueso.equals("provolone")){
                parcialq +=5000;
            }else if(tipoQueso.equals("suizo" )){
                parcialq += 6000;
            }else {
                parcialq +=0.0;
            }
        return super.calcularPrecio()+parcialq;
    }
}
