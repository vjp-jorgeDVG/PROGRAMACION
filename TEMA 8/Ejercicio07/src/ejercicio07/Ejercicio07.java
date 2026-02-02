/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;
import java.util.Scanner;
/**
 *
 * @author jorge
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Array de 30 posiciones con objetos de la clase Dia [1]
        Dia[] mes = new Dia[3];
        String[] nombresSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int opcion;

        do {
            // Menú de opciones según la fuente [1, 2]
            System.out.println("--- GESTIÓN DE TEMPERATURAS ---");
            System.out.println("1. Rellenar de forma aleatoria.");
            System.out.println("2. Mostrar las temperaturas.");
            System.out.println("3. Visualizar la temperatura media del mes.");
            System.out.println("4. Día o días más calurosos del mes.");
            System.out.println("5. Salir.");
            System.out.print("Elija una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                   
                    break;
                case 4:
                    
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5); // Repetir hasta pulsar 5 [1, 2]
    }
}

