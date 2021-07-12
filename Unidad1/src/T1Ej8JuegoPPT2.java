

// 8. Realizar un programa que permita controlar el juego de piedra, papel, tijera
// introduciendo P para piedra, L para papel y T para tijera por cada jugador.
// El sistema debe indicar qué jugador gana la ronda o si hay empate. Al final
// de cada ronda preguntar si desea volver a jugar.

import java.util.Scanner;
public class T1Ej8JuegoPPT2 {
    public static void main(String[] args){
        Scanner a = new Scanner (System.in);
        String usuario;
        String jugada1, jugada2;
        String ganador;
        // por cada jugada tiene opciones


        do {
        System.out.println("Ingrese jugada 1: ");
        jugada1 = a.nextLine();
        System.out.println("Ingrese jugada 2: ");
        jugada2 = a.nextLine();     
        
        if((jugada1.equals("P")|| jugada2.equals("P"))&& (jugada1.equals("L")|| jugada2.equals("L")) ){
            ganador= jugada1.equals("P")? "jugada2": "jugada1";
        } 
        else if ((jugada1.equals("P")|| jugada2.equals("P"))&& (jugada1.equals("T")|| jugada2.equals("T")) ){
            ganador= jugada1.equals("P")? "jugada1": "jugada2";
        } 
        else{ganador="empate";}

    System.out.println ("El ganador es "+ ganador);
    System.out.println ("Quieres seguir jugando s/n");
    usuario = a.nextLine();

}while(usuario.equals("s") || usuario.equals("S")); 
a.close();
}
}

