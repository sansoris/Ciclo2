

import java.util.Scanner;

// 6. Realiza un programa que solicite el sexo (H/M) y la altura (cm) al usuario y
// que calcule el peso ideal.
// ○ peso ideal mujeres = altura - 120
// ○ peso ideal hombres = altura - 110


public class T1Ej6Peso {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        System.out.println("Introduce el sexo: ");
        String sexo = a.nextLine();

        Scanner b = new Scanner (System.in);
        System.out.println("Introduce la altura en cm: ");
        float altura = b.nextFloat(); 
        
        a.close();
        b.close();
        
                        
        if (sexo.equals("H")){ 
            System.out.print("Su peso ideal es  "+ ( altura - 110) );
        }else if (sexo.equals("M")){
            System.out.println("Su peso ideal es  "+ ( altura - 120) );
        }
        else {
            System.out.println("Ingrese el dato correcto");
        }   
}
}

