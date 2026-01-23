/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author alumno
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaramos un array para los 80 números primos según la fuente
        int[][] primos = new int [8][10];

        // 1. Método para rellenar el array con los primeros 80 primos
        rellenarPrimos(primos);

        // 2. Método para visualizar el contenido del array
        visualizarArray(primos);
    }

    /**
     * Busca números primos y los guarda en el array hasta completarlo.
     */
    public static void rellenarPrimos(int[] v) {
        int contador = 0;
        int numeroCandidato = 1; // Iniciamos en 1 según el ejemplo de la fuente

        while (contador < v.length) {
            if (esPrimo(numeroCandidato)) {
                v[contador] = numeroCandidato;
                contador++;
            }
            numeroCandidato++;
        }
    }

    /**
     * Determina si un número es primo.
     * Un número es primo si solo es divisible por 1 y por sí mismo.
     */
    public static boolean esPrimo(int n) {
        if (n < 1) return false;
        if (n == 1) return true; // Se incluye el 1 siguiendo el ejemplo  -> 1 de la fuente
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Muestra el array con el formato: [índice] → valor; 
     */
    public static void visualizarArray(int[] v) {
        System.out.println("Contenido de un array unidimensional de 80 posiciones con números primos:");
        for (int i = 0; i < v.length; i++) {
            System.out.print("[" + i + "] → " + v[i] + "; ");
            
            // Salto de línea cada 10 elementos para mejorar la visualización
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}
