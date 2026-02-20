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

        while (impares < 3) {

            impares = (int) (Math.random() * 100) + 1;
            
            random++;
            
            if (random % 2 != 0) {
                impares++;
            }
        }
        System.out.println(impares);
    }
}
