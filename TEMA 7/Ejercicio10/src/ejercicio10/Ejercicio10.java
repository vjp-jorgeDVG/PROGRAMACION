/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author alumno
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] numeros = new int[10];

        rellenar(numeros);

        System.out.println("Se han generado los siguientes numeros:");
        mostrar(numeros);

        eliminarRepetidos(numeros);

        System.out.println("Sustituimos los elementos repetidos por un 0:");
        mostrar(numeros);
    }

    // Rellena el array con numeros aleatorios del 1 al 8
    static void rellenar(int[] numeros) {
        int i = 0;
        while (i < numeros.length) {
            numeros[i] = (int) (Math.random() * 8) + 1;
            i++;
        }
    }

    // Muestra los elementos del array en una linea
    static void mostrar(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }

    // Sustituye por 0 todos los valores que aparecen mas de una vez
    static void eliminarRepetidos(int[] numeros) {
        int num = 0;

        while (num < numeros.length) {
            int valorActual = numeros[num];

            if (valorActual != 0) {
                int j = num + 1;
                boolean hayCopia = false;

                while (j < numeros.length) {
                    if (numeros[j] == valorActual) {
                        hayCopia = true;
                        numeros[j] = 0;
                    }
                    j++;
                }

                if (hayCopia) {
                    numeros[num] = 0;
                }
            }
            num++;
        }
    }
}
