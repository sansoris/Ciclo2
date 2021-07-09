package co.edu.utp.misiontic2022.c2;
public class U1T2Ej12Multiplo3 {

    // 12. Realizar programa que muestre los números del 1 al 100 que no sean múltiplos de 3, 
    // utilizando cada una las instrucciones repetitivas (while, do while, for)
    public static void main(String[] args) throws Exception {
    //    public static Integer tres( int i) {
    for (int i = 0; i<=100; i++){
        if (i % 3 == 0){} else {System.out.print( i + ", ");}  // retirar el In para que no sea en renglones
        }
    
    System.out.println("\n-------CON DO WHILE--------------");

        int conta= 0;
        do{if (conta % 3 == 0){} 
        else {System.out.print( conta + ", ");}  
            conta++;
        }while (conta <=100);

System.out.println("\n-------CON WHILE--------------"); 
int num= 0;
        while (num <=100){
        if (num % 3 == 0){} 
        else {System.out.print( num + ", ");}   
        num++;
        }
    }
}
