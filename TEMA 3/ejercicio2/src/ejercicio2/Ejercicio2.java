/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
       
        System.out.println("por favor, introduzca el numero:");
        
        int num1 = entrada.nextInt();
       
        System.out.println("introduzca un segundo numero");
        
        int num2 = entrada.nextInt();
        
         if (num1 > 10) {
             int num3 = num1 * num2;
             System.out.println("el producto de los dos numero es: " + num3);
        }
        else {
            int num4 = num1 + num2;
            System.out.println("la suma de los dos numeros es " + num4);
         }
    }
    
}
