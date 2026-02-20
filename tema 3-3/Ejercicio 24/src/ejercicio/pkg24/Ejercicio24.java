/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg24;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        int num2 = 1;
        int contador = 0;
        Scanner sc = new Scanner(System.in);

         do {
            System.out.print("Introduce un número mayor que 0");
            num = sc.nextInt();

            if (num <= 0) {
                System.out.println("numero mayor que 0");
            }

        } while (num <= 0);

        while (num2 <= num) {

            if (num2 % 3 == 0) {
                System.out.print(num2 + " - ");  
                contador++;
            }
            num2++; 
        }
        System.out.println("el numero de multiplos ha sido " + contador);
    }
}
