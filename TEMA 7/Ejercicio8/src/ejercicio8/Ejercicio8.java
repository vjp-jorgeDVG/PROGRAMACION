/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solicitamos el número al usuario
        int numero = pedirNumero();
        
        // Creamos un array de 5 posiciones para las cifras
        int[] cifras = new int[2];
        
        // Descomponemos el número y llenamos el array
        dividirEnArray(numero, cifras);
        
        // Mostramos el resultado
        visualizarArray(cifras);
    }

    /**
     * Método que pide al usuario un número entero de 5 cifras.
     */
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un número entero de 5 cifras: ");
        return entrada.nextInt();
    }

    /**
     * Método que divide el número en cifras y las mete en el array.
     * Al usar el resto (%) entre 10, las cifras se guardan ya invertidas.
     */
    public static void dividirEnArray(int n, int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = n % 10; // Extrae la última cifra
            n = n / 10;    // Elimina la última cifra del número original
        }
    }

    /**
     * Método que visualiza el contenido del array.
     */
    public static void visualizarArray(int[] v) {
        System.out.print("El numero introducido escrito al revés es el: ");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]);
        }
        System.out.println();
    }
}
