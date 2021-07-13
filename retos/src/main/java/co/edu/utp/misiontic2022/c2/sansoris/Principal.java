package co.edu.utp.misiontic2022.c2.sansoris;


public class Principal {
    public static void main(String[] args) {
        Nuevainversion inversion = new Nuevainversion();
        inversion.salida();
        inversion.compararInversion(inversion.pTiempo, inversion.pCapital, inversion.pInteres);
        System.out.println(inversion.calcular());
        // System.out.println(inversion.compararInversion(36,200000,5.0));
        // System.out.println(inversion.compararInversion(12,150000,2.0));
        // System.out.println(inversion.compararInversion(0,0,0));

        }
}
