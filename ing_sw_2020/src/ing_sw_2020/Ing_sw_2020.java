/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ing_sw_2020;

import java.util.Scanner;

/**
 *
 * @author JOAN
 */
public class Ing_sw_2020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola mundo 04/05/2020 10:41 am");
        System.out.println("Hola mundo 04/05/2020 11:06 am");
        int serie ,num1 = 0, num2 = 1, suma = 1;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese cuantos numeros fibo quiere imprimir");
        serie = leer.nextInt();
        for (int i = 1; i < serie; i++) {             
            // muestro la suma
            System.out.println(suma);
             
            //primero sumamos
            suma = num1 + num2;
            //Despues, cambiamos la segunda variable por la primera
            num1 = num2;
            //Por ultimo, cambiamos la suma por la segunda variable
            num2 = suma;
    }
    
}
}
