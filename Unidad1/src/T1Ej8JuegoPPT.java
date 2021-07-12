

// 8. Realizar un programa que permita controlar el juego de piedra, papel, tijera
// introduciendo P para piedra, L para papel y T para tijera por cada jugador.
// El sistema debe indicar qué jugador gana la ronda o si hay empate. Al final
// de cada ronda preguntar si desea volver a jugar.

import java.util.Scanner;

public class T1Ej8JuegoPPT {
    public static void main(String[] args){
            Scanner a = new Scanner (System.in);
            String usuario;
            String jugada1, jugada2, jugada3;
    
            do {
            System.out.println("Ingrese jugada 1: ");
            jugada1 = a.nextLine();
            System.out.println("Ingrese jugada 2: ");
            jugada2 = a.nextLine();     
            System.out.println("Ingrese jugada 3: ");
            jugada3 = a.nextLine();  
            if (jugada1.equals("P") && jugada2.equals("P") && jugada3.equals("P")) {System.out.println("Nadie gana");}
            else if (jugada1.equals("P") && jugada2.equals("P") && jugada3.equals("L")) {System.out.println("Gana el papel");}
            else if (jugada1.equals("P") && jugada2.equals("P") && jugada3.equals("T")) {System.out.println("Gana la piedra");}
            else if (jugada1.equals("P") && jugada2.equals("L") && jugada3.equals("P")) {System.out.println("Gana el papel");}
            else if (jugada1.equals("P") && jugada2.equals("L") && jugada3.equals("L")) {System.out.println("Gana el papel");}
            else if (jugada1.equals("P") && jugada2.equals("L") && jugada3.equals("T")) {System.out.println("Empate, el papel tapa la piedra y la tijera corta el papel");}
            else if (jugada1.equals("P") && jugada2.equals("T") && jugada3.equals("P")) {System.out.println("Gana la piedra");}
            else if (jugada1.equals("P") && jugada2.equals("T") && jugada3.equals("L")) {System.out.println("Empate, el papel tapa la piedra y la tijera corta el papel");}
            else if (jugada1.equals("P") && jugada2.equals("T") && jugada3.equals("T")) {System.out.println("Gana la piedra");}
            else if (jugada1.equals("L") && jugada2.equals("P") && jugada3.equals("P")) {System.out.println("Gana el papel");}
            else if (jugada1.equals("L") && jugada2.equals("P") && jugada3.equals("L")) {System.out.println("Gana el papel");}
            else if (jugada1.equals("L") && jugada2.equals("P") && jugada3.equals("T")) {System.out.println("Empate, el papel tapa la piedra y la tijera corta el papel");}
            else if (jugada1.equals("L") && jugada2.equals("L") && jugada3.equals("P")) {System.out.println("Gana el papel");}
            else if (jugada1.equals("L") && jugada2.equals("L") && jugada3.equals("L")) {System.out.println("Nadie gana");}
            else if (jugada1.equals("L") && jugada2.equals("L") && jugada3.equals("T")) {System.out.println("Gana la Tijera");}
            else if (jugada1.equals("L") && jugada2.equals("T") && jugada3.equals("P")) {System.out.println("Empate, el papel tapa la piedra y la tijera corta el papel");}
            else if (jugada1.equals("L") && jugada2.equals("T") && jugada3.equals("L")) {System.out.println("Gana la Tijera");}
            else if (jugada1.equals("L") && jugada2.equals("T") && jugada3.equals("T")) {System.out.println("Gana la Tijera");}
            else if (jugada1.equals("T") && jugada2.equals("P") && jugada3.equals("P")) {System.out.println("Gana la piedra");}
            else if (jugada1.equals("T") && jugada2.equals("P") && jugada3.equals("L")) {System.out.println("Empate, el papel tapa la piedra y la tijera corta el papel");}
            else if (jugada1.equals("T") && jugada2.equals("P") && jugada3.equals("T")) {System.out.println("Gana la Tijera");}
            else if (jugada1.equals("T") && jugada2.equals("L") && jugada3.equals("P")) {System.out.println("Empate, el papel tapa la piedra y la tijera corta el papel");}
            else if (jugada1.equals("T") && jugada2.equals("L") && jugada3.equals("L")) {System.out.println("Gana la Tijera");}
            else if (jugada1.equals("T") && jugada2.equals("L") && jugada3.equals("T")) {System.out.println("Gana la Tijera");}
            else if (jugada1.equals("T") && jugada2.equals("T") && jugada3.equals("P")) {System.out.println("Gana la piedra");}
            else if (jugada1.equals("T") && jugada2.equals("T") && jugada3.equals("L")) {System.out.println("Gana la Tijera");}
            else if (jugada1.equals("T") && jugada2.equals("T") && jugada3.equals("T")) {System.out.println("Nadie gana");}

            System.out.println ("Quieres seguie jugando s/n");
            usuario = a.nextLine();
        
        }while(usuario.equals("s") || usuario.equals("S")); 
        a.close();
        }
        }