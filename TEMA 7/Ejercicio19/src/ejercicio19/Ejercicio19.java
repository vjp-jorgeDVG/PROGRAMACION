/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

/**
 *
 * @author alumno
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = new int[100];

        rellenar(numeros);

        System.out.println("Se han generado los siguientes numeros:");
        mostrar(numeros);
    }

    // Rellena el array con numeros aleatorios del 1 al 8
    static void rellenar(int[] numeros) {
        int i = 0;
        while (i < numeros.length) {
            numeros[i] = (int) (Math.random() * (80-10)) + 1;
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
        public static void mejorAlumno(double[][] notas, String[] alum) {
        double maxMedia = 0;
        int indiceMejor = 0;
        for (int i = 0; i < notas.length; i++) {
            double suma = 0;
            for (int j = 0; j < notas.length; j++) {
                suma += notas[i][j];
            }
            double media = suma / notas.length;
            if (media > maxMedia) {
                maxMedia = media;
                indiceMejor = i;
            }
        }
        System.out.println("El mejor alumno es " + alum[indiceMejor] + " con una media de " + maxMedia);
    }
}
