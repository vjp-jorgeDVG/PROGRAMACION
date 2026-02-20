/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num1 = 1;
        int num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero");
        do {
            num2 = sc.nextInt();
            if (num2 <= 1) {
                System.out.println("introduce numero mayor que 1");
            }
        } while (num2 <= 1);

        while (num1 <= num2) {
            System.out.println(num1);
            num1++;
        }

    }

}
