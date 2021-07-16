package principal;

public class Operaciones {
    private double num1;
    private double num2;
    
    // constructor

    public Operaciones(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double suma(){
        return this.num1 + this.num2;
    }

    public double resta(){
        return this.num1 - this.num2;
    }

    
}

