/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author jorge
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 20;
        int num2 = 0;
        do {
            num++;
            if (num % 2 != 0) {
                System.out.print(num + " - ");
                num2++;
            }
        } while (num < 160);
        System.out.print("\nla cantidad de numeros impares es de: " + num2);
    }
}
