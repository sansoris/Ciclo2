public class Sandalia extends Prenda {
    // Atributos

    private static final String USO = "doble"; 
    private String uso;
   
    // métodos de acceso
   

    // Constructores 

    public Sandalia(){
       super(PRECIO_P,TAMANO_P, COLOR_P);
       this.uso = USO;
    } 

    public Sandalia (double precioP){
        super(precioP,TAMANO_P, COLOR_P);
        this.uso = USO;
    }
     
    public Sandalia (double precioP, double tamanoP){
        super(precioP,tamanoP, COLOR_P);
        this.uso = USO;
    }

    public Sandalia (double precioP, double tamanoP, String colorP){
        super(precioP,tamanoP, colorP);
        this.uso = USO;
    }

    public Sandalia (double precioP, double tamanoP, String colorP, String uso){
        super(precioP,tamanoP, colorP);
        this.uso = uso;
    }

    // Métodos
    public double precioFinal(){
        double adicionu = 0.0;
        if (uso.equals("exteriores" )){  
            adicionu +=50.0;
        }else if (uso.equals("interiores")){
            adicionu +=30.0;
        }else if(uso.equals( "doble" )){
            adicionu +=70.0;
        }else {
            adicionu +=70.0;
        }


        
        // switch (uso){
        // case "exteriores":
        // adicionu +=50.0;
        // break;
        // case "interiores":
        // adicionu +=30.0;
        // break;
        // case "doble":
        // adicionu +=70.0;
        // break;
    
    return super.precioFinal() + adicionu;

   }
}
