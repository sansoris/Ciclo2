
import java.util.Scanner;
// import java.util.ArrayList;

// import javax.annotation.processing.RoundEnvironment;

// Realizar un programa que realice el promedio de las notas de un alumno,
// para ello el programa va a tener que solicitar el nombre del alumno y las
// notas de las 3 evaluaciones. Si el alumno tiene un promedio mayor o igual a
// 3.0 también debe imprimir “Aprobado”, si no alcanzó esa nota debe imprimir
// “Reprobado” . Requisitos: Las notas que se ingresan pueden tener
// decimales.


public class T1Ej2Notas {
    public static void main(String[] args) throws Exception{
        Scanner a = new Scanner (System.in);
        System.out.println("Introduce el nombre del estudiante: ");
        String estudiante = a.nextLine();

        Scanner b = new Scanner (System.in);
        System.out.println("Ingrese nota 1: ");
        float nota1 = b.nextFloat();

        Scanner c = new Scanner (System.in);
        System.out.println("Ingrese nota 2: ");
        float nota2 = c.nextFloat();

        Scanner d = new Scanner (System.in);
        System.out.println("Ingrese nota 3: ");
        float nota3 = d.nextFloat();

        var promedio = Math.floor((nota1+nota2+nota3)/3);
       
        System.out.println(estudiante + " obtuvo un promedio de " + promedio + " y su estado es" + (promedio >=3.0? " Aprobado " : " Reprobado "));
        
        a.close();
        b.close();
        c.close();
        d.close();
    }
    
    // Cambios notas = new Cambios();
    // notas.setCambios(new ArrayList<>()); // inicializamos lista

    // public static  String notas(String nombre){
    //     return "Hola " + nombre + "!"; 
    }
    

