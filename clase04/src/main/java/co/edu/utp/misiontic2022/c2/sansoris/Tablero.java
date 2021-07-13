package co.edu.utp.misiontic2022.c2.sansoris;


public class Tablero {
    
    // array o vector = colección de variables que 
    // se guardarán en un solo nombre
    
    private Casilla [] casillas = new Casilla[64];  // son objetos los arrays

    //constructor

    public Tablero() { // reservo los espacios
        casillas = new Casilla[64]; 

    // null  //No se ha inicializado
    for (int i = 0; i < 64; i++) {
        casillas[i]= new Casilla(i/8, i%8);
    }
}
// al ser enteros devuelven enteros (1/8)==> 0.125 = 0 hasta 7/8 
        // equivalencia con while
        // int i =0;
        // while (i<64){
        //     casillas[i] = new Casilla(i/8, i%8);
        //     i++;
        // }
       

    public Boolean puedeHacerEnroque(){
        return true;
    }


    public Boolean estaEnJaque(){
        return true;
    }
    public Boolean estaJaqueMate(){
        return true;
    }
}
