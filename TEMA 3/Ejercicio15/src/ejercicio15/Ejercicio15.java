/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;
import java.util.Scanner;
/**
 *
 * @author alumno
 */

public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ventas = new int[2]; // Array de 12 posiciones [1]
        int opcion;

        do {
            System.out.println("\n--- GESTIÓN DE VENTAS MENSUALES ---");
            System.out.println("1. Rellenar ventas aleatorias (10-100).");
            System.out.println("2. Mostrar ventas.");
            System.out.println("3. Mostrar ventas al revés.");
            System.out.println("4. Salir.");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> rellenarVentas(ventas);
                case 2 -> mostrarVentas(ventas);
                case 3 -> mostrarAlReves(ventas);
                case 4 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }

    public static void rellenarVentas(int[] v) {
        for (int i = 0; i < v.length; i++) {
            // Genera números aleatorios entre 10 y 100 [1]
            v[i] = (int) (Math.random() * 91) + 10;
        }
        System.out.println("Ventas generadas correctamente.");
    }

    public static void mostrarVentas(int[] v) {
        System.out.print("Ventas del año: ");
        for (int valor : v) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }

    public static void mostrarAlReves(int[] v) {
        System.out.print("Ventas (orden inverso): ");
        for (int i = v.length - 1; i >= 0; i--) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
}
