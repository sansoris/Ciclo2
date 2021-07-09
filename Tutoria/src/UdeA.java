package Tutoria.src;

// Calcular un valor porcentual que se entregara a empleados por antiguedad
// en la empresa por porcentaje adicional al salario. 
// menos de 3 años 5%
// mayor a 3 menor a 5   10%
// mayor a 5 pero menor a 10   20%
// mayor a 10 años 30%

public class UdeA {
    public static void main(String[] args) {
        int anios = 23;
        int bono = 50000;
        float resultado = calcularporcentaje(anios, bono);
        System.out.println(resultado);
    }


    public static float calcularporcentaje (int anios, float bono) {
        float porcentaje = 0; // era float pero para no castear se cambia a double
    if (anios>= 10){
        porcentaje = (float) 0.3;
    } else {
        if (anios>=5) {
        porcentaje = (float)0.2;
        }else {
            if (anios>= 3){
            porcentaje = (float) 0.1;
            }else {
                porcentaje = (float) 0.05;
            }
        }       
    }
    return porcentaje * bono;
   
}

}
        
    

