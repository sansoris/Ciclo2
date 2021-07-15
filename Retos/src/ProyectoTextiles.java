public class ProyectoTextiles {

//Atributos
    int tiempo;
    double capital;
    double interes;
    double interesSimple = 0;
    double interesCompuesto = 0;
    double compararInteres = 0;


// Constructor

    public ProyectoTextiles(int tiempo, double capital, double interes) {
        this.tiempo = tiempo;
        this.capital = capital;
        this.interes = interes;
    }

// Metodos

public double calcInteresS() {
    interesSimple=  Math.round ((capital*(interes/100)*tiempo));
    return interesSimple;
 }

 public double calcInteresC() {
    interesCompuesto =  Math.round ((capital * (Math.pow ((1 + interes/100), tiempo)-1)));
    return interesCompuesto;
 }

 public double compararIntereses() {
    compararInteres =  interesCompuesto - interesSimple;
    return compararInteres;
 }



//Getters and Setters

    public int getTiempo() {
        return tiempo;
    }


    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }


    public double getCapital() {
        return capital;
    }


    public void setCapital(double capital) {
        this.capital = capital;
    }


    public double getInteres() {
        return interes;
    }


    public void setInteres(double interes) {
        this.interes = interes;
    }

}
