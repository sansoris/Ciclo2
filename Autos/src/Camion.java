public class Camion extends Vehiculo implements CalculaCosto{
    private Integer numeroEjes;


// Constructor
    public Camion(String placa, String marca, Integer precio, Integer numeroEjes) {
        super(placa, marca, precio);
        this.numeroEjes = numeroEjes;
    }

// Métodos calculacosto sobreescrito desde la clase respectiva

@Override
    public Integer calcularCosto(Integer factor) {
        Integer costo = this.precio +(factor*this.numeroEjes);
        return costo;
    }

// Los demás atributos se encuentran en la super clase Vehículo
    
public Integer getNumeroEjes() {
    return numeroEjes;
}

public void setNumeroEjes(Integer numeroEjes) {
    this.numeroEjes = numeroEjes;
}


    


}
