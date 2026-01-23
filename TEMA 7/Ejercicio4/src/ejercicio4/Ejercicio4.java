/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Random;

/**
 *
 * @author alumno
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public final static int FILAS = 4;
    public final static int COLUMNAS = 3;

    //creamos el metodo que crea los numeros aleatorios dentro de la matriz
    public static void main(String[] args) {
        // Declaramos un array bidimensional de 4x3 (4 filas y 3 columnas)
        int[][] matriz = new int[4][3];

        // 1. Llamada al método para guardar los 12 números aleatorios
        rellenarMatrizAleatoria(matriz);

        // 2. Llamada al método para mostrar solo los números pares
        mostrarNumerosPares(matriz);
    }

    /**
     * Método que guarda en un array bidimensional de 4x3 12 números aleatorios
     * comprendidos entre el 100 y el 200.
     */
    public static void rellenarMatrizAleatoria(int[][] m) {
        System.out.println("Generando matriz de 4x3 con números entre 100 y 200...");
        for (int i = 0; i < m.length; i++) { // Recorre filas
            for (int j = 0; j < m[i].length; j++) { // Recorre columnas
                // Math.random() * (máximo - mínimo + 1) + mínimo
                m[i][j] = (int) (Math.random() * 101 + 100);
            }
        }
    }

    /**
     * Método que muestra solo los números pares que contiene el array.
     */
    public static void mostrarNumerosPares(int[][] m) {
        System.out.println("\nLos números pares encontrados en la matriz son:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                // Verificamos si el número es par usando el operador módulo (%)
                if (m[i][j] % 2 == 0) {
                    System.out.print(m[i][j] + " ");
                }
            }
        }
        System.out.println(); // Salto de línea final
    }
}

