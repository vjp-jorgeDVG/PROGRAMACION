/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce tu nota del 1 al 10");
        int num = sc.nextInt();

        if (num <= 4) {
            System.out.println("suspenso");
        } else if ((num >= 5) && (num <= 6)) {
            System.out.println("bien");
        } else if ((num >= 7) && (num <= 8)) {
            System.out.println("notable");
        } else if ((num >= 9) && (num <= 10)) {
            System.out.println("sobresaliente");
        } else System.out.println("introduce numero del 1 al 10");
    }
}
