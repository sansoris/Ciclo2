public class Grupo18poo {

    private static final Integer NUMERO_CICLOS = 3;  // Hace referencia a un dato estatico
    // solo se le puede asignar un valor, no compartido con otras clases
    //para compartir con static/Integer

    private Integer año;
    private Integer mes;
    private Integer dia;

public Grupo18poo(){ // constructor
    año = 2021;
    mes = 1;
    dia = 1;
}

public void cambioaño (){
        año++;
    }

// protegido, cuando un hijo debe modeificar el valor
// con los metodos se puede manipular el dato

public Integer getAño() {
    return año;
}
public void setAño(Integer año) {
    this.año = año;
}
public Integer getMes() {
    return mes;
}
public void setMes(Integer mes) {
    this.mes = mes;
}
public Integer getDia() {
    return dia;
}
public void setDia(Integer dia) {
    this.dia = dia;
}

public static void main(String[] args) {
Grupo18poo objeto1 = new Grupo18poo();
objeto1.setDia(13);
objeto1.setMes(7);
System.out.printf("%d/%d/%d \n", objeto1.getDia(), objeto1.getMes(), objeto1.getAño());
    

for (int i = 0; i < NUMERO_CICLOS; i++) {
        
    }

    //debe coincidir entre static y public
}


}