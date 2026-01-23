/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

/**
 *
 * @author alumno
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    int[] numeros = new int[10];

    rellenar(numeros);

    System.out.println("Array original:");
    mostrar(numeros);

    ordenar(numeros);

    System.out.println("Array ordenado de mayor a menor:");
    mostrar(numeros);
}

// Rellena el array con numeros aleatorios del 0 al 9
static void rellenar(int[] numeros) {
    int i = 0;
    while (i < numeros.length) {
        numeros[i] = (int) (Math.random() * 10);
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

// Ordena el array de mayor a menor
static void ordenar(int[] numeros) {
    int pos = 0;

    while (pos < numeros.length - 1) {
        int j = pos + 1;

        while (j < numeros.length) {
            if (numeros[pos] < numeros[j]) {
                int temporal = numeros[pos];
                numeros[pos] = numeros[j];
                numeros[j] = temporal;
            }
            j++;
        }
        pos++;
    }
}
}

