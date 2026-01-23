/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Petición del número
        int numero = pedirNumero();
        
        // 2. Cálculo del tamaño necesario para el array
        int tamaño = calcularCifras(numero);
        
        // 3. Creación del array y llenado con las cifras
        int[] cifras = new int[tamaño];
        dividirEnCifras(numero, cifras);
        
        // 4. Visualización del array al revés para invertir el número
        visualizarAlReves(cifras);
    }

    /**
     * Método que pide al usuario un número entero [1].
     */
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un número entero: ");
        return entrada.nextInt();
    }

    /**
     * Método que calcula cuántas cifras tiene el número [1].
     */
    public static int calcularCifras(int n) {
        if (n == 0) return 1;
        int contador = 0;
        n = Math.abs(n); // Trabajamos con el valor absoluto
        while (n > 0) {
            n = n / 10;
            contador++;
        }
        return contador;
    }

    /**
     * Método que divide el número en cifras y las guarda en el array [1].
     * Se guardan en el orden original del número.
     */
    public static void dividirEnCifras(int n, int[] v) {
        n = Math.abs(n);
        for (int i = v.length - 1; i >= 0; i--) {
            v[i] = n % 10;
            n = n / 10;
        }
    }

    /**
     * Método que visualiza el array recorriéndolo desde el final al principio [1].
     */
    public static void visualizarAlReves(int[] v) {
        System.out.print("El numero introducido escrito al revés es el: ");
        for (int i = v.length - 1; i >= 0; i--) {
            System.out.print(v[i]);
        }
        System.out.println();
    }
}
