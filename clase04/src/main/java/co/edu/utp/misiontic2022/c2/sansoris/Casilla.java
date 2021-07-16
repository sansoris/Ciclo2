package co.edu.utp.misiontic2022.c2.sansoris;

public class Casilla {

    private String color;
    private Integer fila;
    private Integer columna;
    
    private Ficha ficha;

    public Casilla(Integer fila, Integer columna) {
        this.fila = fila;
        this.columna = columna;
        this.color = calcularColor();
        // se hubiera podido lograr con 

// this.color = fila%%2 ==0
// ? (columna%2==0?"blanco": "negro") 
// : (columna%2!= 0 ? "blanco": "negro");
    }

    private String calcularColor(){
        if ((fila % 2 == 0 && columna %2 ==0)
        || (fila % 2 != 0 && columna %2 !=0)) {
            return "blanco"; 
            } return "negro";
            } 

    //  Metodos

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getFila() {
        return fila;
    }

    public void setFila(Integer fila) {
        this.fila = fila;
    }

    public Integer getColumna() {
        return columna;
    }

    public void setColumna(Integer columna) {
        this.columna = columna;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }


// Funciones

    public Boolean estaOcupada(){
        return this.ficha != null;
    }

    public Boolean esContrincante (String color){
        return ficha != null && ficha.getColor().equals(color);
    }

    public void posicionarFicha(Ficha ficha){
    this.ficha = ficha;
    }

    public void retirarFicha (){
        this.ficha = null;
    }

    @Override
    public String toString() {
        return "Casilla [color=" + color + ", columna=" + columna + ", fila=" + fila + "]";
    }

    

}
