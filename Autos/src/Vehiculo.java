public class Vehiculo {
    protected String placa;
    protected String marca;
    protected Integer precio;


// Contructor
    
    public Vehiculo(String placa, String marca, Integer precio) {
        this.placa = placa;
        this.marca = marca;
        this.precio = precio;
    }


//  Metodos

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
    
}
