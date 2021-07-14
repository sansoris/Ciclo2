public class Auto extends Vehiculo  implements CalculaCosto{
   private Integer numeroAirbags;
   // Se hereda color, marca, placa desde auto  se coloca el extends Vehículo
   // también se relaciona con interface calculacosto, no se extiende se IMPLEMENTA CON implements


    // Constructor
public Auto(String placa, String marca, Integer precio, Integer numeroAirbags) {
    super(placa, marca, precio);
    this.numeroAirbags = numeroAirbags;
}

// Métodos calculacosto sobreescrito desde la clase respectiva

@Override
public Integer calcularCosto(Integer factor) {
    Integer costo = this.precio +(factor*this.numeroAirbags);
    return costo;
}

// Los demás atributos se encuentran en la super clase Vehículo

public Integer getNumeroAirbags() {
    return numeroAirbags;
}

public void setNumeroAirbags(Integer numeroAirbags) {
    this.numeroAirbags = numeroAirbags;
}

 


}
