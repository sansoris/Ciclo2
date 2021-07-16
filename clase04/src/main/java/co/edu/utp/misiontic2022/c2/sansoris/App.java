package co.edu.utp.misiontic2022.c2.sansoris;

public class App 
{
    public static void main( String[] args ){
        System.out.println( "Hello World!" );
        Tablero tablero1 = new Tablero();
        Casilla[] casilla = tablero1.getCasillas();
        System.out.println(casilla[0].getColor());
        System.out.println(casilla[1].getColor());
        System.out.println(casilla[2].getColor());
        System.out.println(casilla[3].getColor());
        System.out.println(casilla[4].getColor());
        System.out.println(casilla[5].getColor());
        System.out.println(casilla[6].getColor());
        System.out.println(casilla[7].getColor());
        System.out.println(casilla[8].getColor());
    }
}
