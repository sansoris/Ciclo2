import java.lang.Math;
//import java.text.DecimalFormat;

public class ProyectoTextiles {
    private int tiempo;
    private double capital;
    private double interes;
    private double interesSimple;
    private double interesCompuesto;
    //private Double compararInteres;
    //DecimalFormat df;

    public ProyectoTextiles(int tiempo, double capital, double interes) {
        this.tiempo = tiempo;
        this.capital = capital;
        this.interes = interes;
    //    df = new DecimalFormat("#.0");
    }
    
    /*
     * Método que retorna el cálculo dei interés simple
     * @return
     */
    public double calcInteresS() {
         return interesSimple = Math.round(capital*(interes/100)*tiempo); 
        } 
         
    /*
     * Método que retorna el cálculo dei interés compuesto
     * @return
     */
    public double calcInteresC() { 
     //   double formula = (1+(interes/100)); 
     //  return interesCompuesto = Math.round((capital) * (Math.pow(formula, tiempo)-1)*10d)/10;
        return interesCompuesto = Math.round ((capital * (Math.pow ((1 + interes/100), tiempo)-1)));
    }

    /*
     * Método que retorna Diferencia de comparar los intereses totales según los tipos de interés
     * @return
     */
    public double compararIntereses() { 
        double compararInteres = interesCompuesto - interesSimple;
        return  compararInteres;
    }
    
}
