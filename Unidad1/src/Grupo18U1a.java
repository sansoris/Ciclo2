

public class Grupo18U1a {
    public static void main(String[] args) {
        System.out.println(numerosuerte2("12/07/1980"));
        System.out.println(numerosuerte2("25/9/1995")); 
        System.out.println(numerosuerte2("10/3/1972"));
        System.out.println(numerosuerte2("24/8/2002"));   
        System.out.println(numerosuerte2("17/11/2013"));        
        }
        public static int numerosuerte2 (String fechanacimiento) {  //fecha dd/mm/yyyy
            var indiceSeparador = fechanacimiento.indexOf('/');
            var dia1 = Integer.parseInt(fechanacimiento.substring(0, indiceSeparador));
            var indiceSeparadormes = fechanacimiento.indexOf('/', ++indiceSeparador);
            var mes1 = Integer.parseInt(fechanacimiento.substring(indiceSeparador, indiceSeparadormes++)); 
            var año1 = Integer.parseInt(fechanacimiento.substring(indiceSeparadormes));
            
            var suma = dia1 + mes1 + año1;
            var resultado = 0;
            //recorriendo digitos          
            while(suma !=0 ){
            resultado += suma % 10;
            suma/= 10;} 
        
            return resultado;
            } 
        // var  datos  = fechanacimiento.split("/");
        // dia = (int) datos[0];
        // mes = (int) datos[1];
        // año = (int) datos[2];
    }
