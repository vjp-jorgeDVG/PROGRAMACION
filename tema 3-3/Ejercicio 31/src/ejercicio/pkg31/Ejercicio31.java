/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg31;

/**
 *
 * @author jorge
 */
public class Ejercicio31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int impares = 0;
        int random = 0;
        int impar1, impar2, impar3;

        while (impares < 3) {

            impares = (int) (Math.random() * 100) + 1;

            random++;

            if (random % 2 != 0) {
                System.out.println(random);
                impares++;
                
            }
        }
        System.out.println(impares);
    }
}
