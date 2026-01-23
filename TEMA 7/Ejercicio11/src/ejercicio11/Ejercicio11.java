/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author alumno
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[2];
        rellenarSinRepetir(vector);
        visualizarArray(vector);
    }

    /**
     * Rellena el array con números del 0 al 9 aleatorios y únicos.
     */
    public static void rellenarSinRepetir(int[] v) {
        int i = 0;
        while (i < v.length) {
            int aleatorio = (int) (Math.random() * 10);
            boolean repetido = false;
            
            // Comprobamos si el número ya existe en el array
            for (int j = 0; j < i; j++) {
                if (v[j] == aleatorio) {
                    repetido = true;
                    break;
                }
            }
            
            // Si no está repetido, lo guardamos e incrementamos el índice
            if (!repetido) {
                v[i] = aleatorio;
                i++;
            }
        }
    }

    public static void visualizarArray(int[] v) {
        System.out.print("Se ha generado el siguiente array: ");
        for (int num : v) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

