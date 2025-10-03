/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author jorge
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    final static double PI = 3.14;
    public static void main(String[] args) {
        // Definimos el radio
        double radio = 3.55;

        // Calculamos la longitud usando la constante PI
        double longitud = 2 * PI * radio;

        // Mostramos el resultado
        System.out.printf("La longitud de la circunferencia de radio " + radio + " es: " + longitud + " metros");
    }
}
