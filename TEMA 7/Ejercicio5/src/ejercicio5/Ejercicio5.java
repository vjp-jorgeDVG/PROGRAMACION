/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaramos un array bidimensional de 4x2 (4 filas y 2 columnas)
        int[][] matriz = new int[2][3];

        // 1. Método para introducir valores
        introducirValores(matriz);

        // 2. Método para visualizar el array
        visualizarMatriz(matriz);

        // 3. Métodos de cálculo y resultados
        System.out.println("\n--- RESULTADOS DE LOS CÁLCULOS ---");
        System.out.println("El número mayor es: " + calcularMayor(matriz));
        System.out.println("El número menor es: " + calcularMenor(matriz));
        System.out.println("La suma de todos los elementos es: " + calcularSuma(matriz));
    }

    /**
     * Pide al usuario los 8 números para completar la matriz.
     */
    public static void introducirValores(int[][] m) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca 8 números enteros para la matriz 4x2:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("Fila " + i + ", Columna " + j + ": ");
                m[i][j] = entrada.nextInt();
            }
        }
    }

    /**
     * Muestra el array de forma atractiva visualmente.
     */
    public static void visualizarMatriz(int[][] m) {
        System.out.println("\nContenido de la matriz:");
        for (int i = 0; i < m.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    /**
     * Busca y devuelve el valor máximo de la matriz.
     */
    public static int calcularMayor(int[][] m) {
        int mayor = m;
        for (int[] fila : m) {
            for (int valor : fila) {
                if (valor > mayor) mayor = valor;
            }
        }
        return mayor;
    }

    /**
     * Busca y devuelve el valor mínimo de la matriz.
     */
    public static int calcularMenor(int[][] m) {
        int menor = m;
        for (int[] fila : m) {
            for (int valor : fila) {
                if (valor < menor) menor = valor;
            }
        }
        return menor;
    }

    /**
     * Suma todos los elementos y devuelve el total.
     */
    public static int calcularSuma(int[][] m) {
        int suma = 0;
        for (int[] fila : m) {
            for (int valor : fila) {
                suma += valor;
            }
        }
        return suma;
    }
}
