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
// Otra forma de ajustar el tablero por matriz sería:
// String color;
// casillas = new Casilla [8][8];
// for (int fila = 0; fila <8; fila++);{
//     for (int col = 0; col<8; col++){
//         //Asignando color}
//         color= (fila%2!=0 && col%2!=0) || (fila%2==0 && col%2==0) ? "negro" : "blanco";
//         casillas [fila][col] = new Casilla (color, fila, col);
//     }
// }



// al ser enteros devuelven enteros (1/8)==> 0.125 = 0 hasta 7/8 
        // equivalencia con while
        // int i =0;
        // while (i<64){
        //     casillas[i] = new Casilla(i/8, i%8);
        //     i++;
        // }
    public Casilla[] getCasillas() {
            return casillas;
        }
    
    // No es necesario porque no se van a editar los colores del tablero
    public void setCasillas(Casilla[] casillas) {
            this.casillas = casillas;
        }
    
    


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
