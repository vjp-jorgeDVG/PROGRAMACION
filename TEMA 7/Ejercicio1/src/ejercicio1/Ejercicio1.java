/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaramos un array para 10 números enteros
        int[] numeros = new int[3];

        // Llamada al método para rellenar el array
        rellenarArray(numeros);

        // Llamada al método para mostrar los pares
        mostrarPares(numeros);
    }

    /**
     * Método que pide al usuario 10 números y los guarda en el array.
     * Según el requisito del ejercicio 01 [1].
     */
    public static void rellenarArray(int[] vector) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca 10 números enteros:");
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vector[i] = entrada.nextInt();
        }
    }

    /**
     * Método que recorre el array y muestra solo los elementos pares.
     * Según el requisito del ejercicio 01 [1].
     */
    public static void mostrarPares(int[] vector) {
        System.out.println("\nLos números pares guardados en el array son:");
        boolean hayPares = false;
        
        for (int i = 0; i < vector.length; i++) {
            // Un número es par si el resto de su división entre 2 es 0
            if (vector[i] % 2 == 0) {
                System.out.print(vector[i] + " ");
                hayPares = true;
            }
        }
        
        if (!hayPares) {
            System.out.print("No se introdujeron números pares.");
        }
        System.out.println(); // Salto de línea final
    }
}
