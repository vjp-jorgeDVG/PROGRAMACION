/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int num2 = 0;
        int resultado;
        System.out.println("introduce numero para calcular su tabala de multiplicar");
        num = sc.nextInt();
        while (num2 < 10) {
            num2++;
            resultado = num * num2;

            System.out.println(resultado);

        }

    }

}
