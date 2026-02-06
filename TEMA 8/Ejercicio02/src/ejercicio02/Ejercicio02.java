/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;
/**
 *
 * @author alumno
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int longitud = pedirLongitudArray();
        int[] vector = new int[longitud];

        rellenarArray(vector);
        mostrarArray(vector);
    }

    // Método que pide la longitud del array entre 1 y 10
    public static int pedirLongitudArray() {
        Scanner sc = new Scanner(System.in);
        int longitud = 0;
        boolean correcto = false;

        while (!correcto) {
            try {
                System.out.print("Introduce la longitud del array (1 a 10): ");
                longitud = sc.nextInt();

                if (longitud < 1 || longitud > 10) {
                    System.out.println("❌ Error: el número debe estar entre 1 y 10.");
                } else {
                    correcto = true;
                }

            } catch (InputMismatchException e) {
                System.out.println("❌ Error: debes introducir un número entero.");
                sc.next(); // limpiar el buffer
            }
        }
        return longitud;
    }

    // Método que rellena el array con números aleatorios entre 1 y 6
    public static void rellenarArray(int[] vector) {
        Random random = new Random();

        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(6) + 1; // 1 a 6
        }
    }

    // Método que muestra el array usando for-each
    public static void mostrarArray(int[] vector) {
        System.out.println("\nContenido del array:");
        for (int num : vector) {
            System.out.print(num + " ");
        }
    }
}
