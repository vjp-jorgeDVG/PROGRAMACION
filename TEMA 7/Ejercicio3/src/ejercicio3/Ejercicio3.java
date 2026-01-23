/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author alumno
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // Método para que el usuario elija la longitud [1]
        int tamano = elegirLongitud();
        int[] vector = new int[tamano];

        // Método para rellenar con aleatorios entre 1 y 6 [1]
        rellenarAleatorios(vector);

        // Método para mostrar por pantalla [1]
        visualizarArray(vector);
    }

    public static int elegirLongitud() {
        Scanner sc = new Scanner(System.in);
        int lon = 0;
        boolean valido = false;
        do {
            try {
                System.out.print("Elija la longitud del array (1-10): ");
                lon = sc.nextInt();
                if (lon >= 1 && lon <= 10) {
                    valido = true;
                } else {
                    System.out.println("Error: La longitud debe estar entre 1 y 10.");
                }
            } catch (InputMismatchException e) {
                // Control de excepciones según requisito de la fuente [1]
                System.out.println("Error: Debe introducir un número entero, no letras.");
                sc.next(); // Limpiar el búfer
            }
        } while (!valido);
        return lon;
    }

    public static void rellenarAleatorios(int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 6 + 1);
        }
    }

    public static void visualizarArray(int[] v) {
        System.out.print("El array generado es: ");
        for (int num : v) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
