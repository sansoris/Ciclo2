package co.edu.utp.misiontic2022.c2.sansoris;

public class Ficha {
    private String color;

    public Ficha(String color){
        this.color = color;}
    

    public Boolean comer(Casilla casilla){
        if (casilla.estaOcupada()&& casilla.esContrincante(color)){
            casilla.posicionarFicha(this);
         return true;
        }
        return false;
    }
    
    public Boolean mover(){
        return true;
    }


    public String getColor() {
        return color;
    }

    
}
