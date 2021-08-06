public class Pantalon extends Prenda{
    // Atributos

    private static final String MARCA = "adidas";
    private String marca;
   

    // métodos de acceso
   


    // Constructores 
    public Pantalon(){
        super(PRECIO_P,TAMANO_P, COLOR_P);
        this.marca = MARCA;
    }

    public Pantalon (double precioP){
        super(precioP, TAMANO_P, COLOR_P);
        this.marca = MARCA;
    }
      
    public Pantalon (double precioP, double tamanoP){
        super(precioP, tamanoP, COLOR_P);
        this.marca = MARCA;
    }

    public Pantalon (double precioP, double tamanoP, String colorP){
        super(precioP, tamanoP, colorP);
        this.marca = MARCA;

    }

    public Pantalon (double precioP, double tamanoP, String colorP, String marca){
        super(precioP, tamanoP, colorP);
        this.marca = marca;
    }
     
        
     // Métodos

     public double precioFinal(){
        double adicionm = 0.0;
        if (marca.equals("adidas")){  
            adicionm +=50.0;
        }else if (marca.equals("puma")){
            adicionm +=30.0;
        }else if(marca.equals("levis")){
            adicionm +=70.0;
        }else {
            adicionm +=50.0;
        }


        // switch (marca){
        //     case "adidas":
        //     adicionm +=50.0;
        //     break;
        //     case "Puma":
        //     adicionm +=30.0;
        //     break;
        //     case "Levis":
        //     adicionm +=70.0;
        //     break;
        // }
        return super.precioFinal() + adicionm;
    }
}
