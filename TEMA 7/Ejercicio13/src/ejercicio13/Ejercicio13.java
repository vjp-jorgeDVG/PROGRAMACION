/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author alumno
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 11;
        System.out.println("Números pares entre 11 y 133 (usando while):");
        while (i <= 133) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
