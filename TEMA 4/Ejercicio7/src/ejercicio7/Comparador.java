/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

public class Comparador {

    public static void vasos(int num1, int num2, int num3, int num4, int aux) {

        for (int i = 0; i < 3; i++) {

            if (num1 > num2) {
                aux = num1;
                num1 = num2;
                num2 = aux;
            }

            if (num2 > num3) {
                aux = num2;
                num2 = num3;
                num3 = aux;
            }

            if (num3 > num4) {
                aux = num3;
                num3 = num4;
                num4 = aux;
            }
        }
        
        System.out.println("Orden de menor a mayor " + num1 + " < " + num2 + " < " + num3 + " < " + num4);
    }
}
