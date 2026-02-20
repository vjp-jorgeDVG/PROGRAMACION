/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16.pkg1;

/**
 *
 * @author alumno
 */
public class Ejercicio161 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        int num2;
        for (num = 20, num2 = 0; num < 160; num++) {
            if (num % 2 != 0) {
                num2++;
                System.out.print(num + " - ");
            }
        }
        System.out.print("\nla cantidad de numeros impares es de: " + num2);
    }

}
