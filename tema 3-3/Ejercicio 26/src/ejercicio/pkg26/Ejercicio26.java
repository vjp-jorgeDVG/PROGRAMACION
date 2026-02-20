/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg26;

/**
 *
 * @author jorge
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 0;
        int num2;
        for (num2 = 111; num2 <= 222; num2++) {

            if (num2 % 2 != 0) {
                num = num + num2;
            }
        }
        System.out.println("La suma total de los numeros impares es: " + num);
    }
}
