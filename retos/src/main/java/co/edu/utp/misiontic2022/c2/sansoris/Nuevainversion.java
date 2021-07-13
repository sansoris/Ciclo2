package co.edu.utp.misiontic2022.c2.sansoris;
import java.util.Scanner;


public class Nuevainversion {
    // Atributos
    double pCapital;
    double pInteres;
    double interesSimple;
    double interesCompuesto;
    double compararInversion;
    int pTiempo;
    String mensaje;


    // Metodos
    public String calcular(){
    this.interesSimple = (double) Math.round ( (pCapital*(pInteres/100)*pTiempo));
    this.interesCompuesto = (double) Math.round ( (pCapital * (Math.pow ((1 + pInteres/100), pTiempo)-1)));
    this.compararInversion = (double) Math.round(this.interesCompuesto- this.interesSimple);

    if (compararInversion >0){
    this.mensaje = "El interés simple es: "+  interesSimple+ ", el interés compuesto es: " + interesCompuesto +", La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $" + compararInversion;
    } else{
    this.mensaje = "Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto.";};
    return mensaje;
    }

    public String compararInversion (int ptiempo,  double pCapital, double pInteres){
        //Calcular los diferentes intereses y su diferencia
    return calcular ();

    }

    public void salida(){
    var sc = new Scanner (System.in);
    System.out.println("Ingrese el capital a solicitar: ");
    this.pCapital = sc.nextDouble();
    System.out.println("Ingrese el interes pactado con el banco: ");
    this.pInteres = sc.nextDouble();
    System.out.println("Digite el plazo fijo de tiempo en meses: ");
    this.pTiempo = sc.nextInt();
    compararInversion (pTiempo, pCapital, pInteres);
    sc.close();
    }


}
