/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, num4;

        System.out.println("introduce el primer numero");
        num1 = sc.nextInt();
        System.out.println("introduce el seungdo numero");
        num2 = sc.nextInt();
        System.out.println("introduce el tercer numero");
        num3 = sc.nextInt();
        System.out.println("introduce el cuarto numero");
        num4 = sc.nextInt();

        if ((num1 > num2) && (num1 > num3) && (num1 > num4)) {
            System.out.println(num1);
        } else if ((num2 > num3) && (num2 > num4)) {
            System.out.println(num2);
            if (num3 > num4) {
                System.out.println(num3 + num4);
                if (num4 > num3) {
                    System.out.println(num4 + num3);
                }
            }
        }

        if (num3 > num2 && num3 > num4) {
            System.out.println(num3);
        }
        if (num4 > num3 && num4 > num2) {
            System.out.println(num4);
            if (num3 > num4) {
                System.out.println(num3);
            } else if (num4 > num3) {
                System.out.println(num4);
            }

        }
        if (num2 > num1 && num2 > num3 && num2 > num4) {
            System.out.println(num2);
        }
        if (num2 > num1 && num2 > num3 && num2 > num4) {

        }
        if (num3 > num1 && num3 > num2 && num3 > num4) {
            System.out.println(num3);

        }
        if (num4 > num1 && num4 > num2 && num4 > num3) {
            System.out.println(num4);
        }
    }

}
