public class Prenda {
   // Atributos
    public static final double PRECIO_P = 100.0;
    public static final double TAMANO_P = 200.0;
    public static final String COLOR_P = "negro"; // representan constantes

    private Double precioP;
    private double tamanoP;
    private String colorP;// representan parametros
    
    // Constructores TRES METODOS cada uno con diferentes parametros de entrada
    public Prenda(){
        this.precioP = PRECIO_P;
        this.tamanoP = TAMANO_P;
        this.colorP = COLOR_P;       
    }

    public Prenda(double precioP){
        this.precioP= precioP;
        this.tamanoP =TAMANO_P;
        this.colorP= COLOR_P;
    }

    public Prenda(double precioP, double tamanoP) {
        this.precioP = precioP;
        this.tamanoP = tamanoP;
        this.colorP = COLOR_P;
    }

    public Prenda(double precioP, double tamanoP, String colorP) {
        this.precioP = precioP;
        this.tamanoP = tamanoP;
        this.colorP = colorP;

        // comprobarColores(colorP);
    }
    
    //gets
    public double getPrecioP() {
        return precioP;
    }

    public double getTamanoP() {
        return tamanoP;
    }
    
    public String getColorP() {
        return colorP;
    }

    public void setPrecioP(double precioP) {
        this.precioP = precioP;
    }

    public void setTamanoP(double tamanoP) {
        this.tamanoP = tamanoP;
    }

    public void setColorP(String colorP) {
        this.colorP = colorP;
    }

  
public double precioFinal(){
  
    Double adicion = 0.0;

        if (colorP.equals("negro" )){  
            adicion +=100.0;
        }else if (colorP.equals("cafe")){
            adicion +=80.0;
        }else if(colorP.equals( "blanco" )){
            adicion +=70.0;
        }else if(colorP.equals( "rojo" )){
            adicion +=50.0;
        }else {
            adicion +=100.0;
        }
    // switch (colorP) {
    //     case "negro":
    //     adicion += 100.0;
    //     break;
    //     case "cafe":
    //     adicion +=80.0;
    //     break;
    //     case "blanco":
    //     adicion +=70.0;
    //     break;
    //     case "rojo":
    //     adicion +=50.0;
    //     break;
    // }
    
    // switch (tamanoP.intValue()){
    //     //atributo que puede castear el Double
    //     case 1:
    //     adicion +=200.0;
    //     break;
    //     case 2:
    //     adicion +=300.0;
    //     break;
    //     case 3:
    //     adicion +=400.0;
    //     break;
    //     case 4:
    //     adicion +=500.0;
    //     break;
    //     case 5:
    //     adicion +=600.0;
    //     break;
    //     case 6:
    //     adicion +=700.0;
    //     break;
    // }

    if (tamanoP==1){  
        adicion +=200.0;
    }else if (tamanoP==2){
        adicion +=300.0;
    }else if (tamanoP==3){
        adicion +=400.0;
    }else if (tamanoP==4){
        adicion +=500.0;
    }else if (tamanoP==5){
        adicion +=600.0;
    }else if (tamanoP==6){
        adicion +=700.0;
    }else{
        adicion +=200.0;
    }


    return precioP+adicion;
}

}


