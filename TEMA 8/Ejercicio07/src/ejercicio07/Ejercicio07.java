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
        // Creamos un array unidimensional de 30 posiciones de la clase Dia [1]
        Dia[] mes = new Dia[3];
        String[] nombresSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int opcion;

        do {
            // Menú de opciones definido en la fuente [1, 2]
            System.out.println("\n--- GESTIÓN DE TEMPERATURAS ---");
            System.out.println("1. Rellenar de forma aleatoria.");
            System.out.println("2. Mostrar las temperaturas.");
            System.out.println("3. Visualizar la temperatura media del mes.");
            System.out.println("4. Día o días más calurosos del mes.");
            System.out.println("5. Salir.");
            System.out.print("Elija una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1 -> rellenarAleatorio(mes, nombresSemana);
                case 2 -> mostrarTemperaturas(mes);
                case 3 -> visualizarMedia(mes);
                case 4 -> mostrarMasCalurosos(mes);
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Error: Opción no válida.");
            }
        } while (opcion != 5); // El menú se muestra mientras no se elija salir [1]
    }

    /**
     * Rellena el mes con temperaturas aleatorias.
     * El día 1 se asigna aleatoriamente a un día de la semana [2].
     */
    public static void rellenarAleatorio(Dia[] m, String[] nombres) {
        // Obtenemos un índice aleatorio para el primer día de la semana [2, 4]
        int diaInicio = (int) (Math.random() * 7); 
        
        for (int i = 0; i < m.length; i++) {
            m[i] = new Dia(); // Instanciamos el objeto en la posición i [5]
            // Asignamos el nombre del día de forma cíclica [2]
            m[i].setNombreDia(nombres[(diaInicio + i) % 7]);
            // Generamos una temperatura aleatoria [2, 4]
            m[i].setTemperatura((int) (Math.random() * 31 + 10)); 
        }
        System.out.println("Temperaturas generadas con éxito.");
    }

    /**
     * Muestra las temperaturas siguiendo el formato: "Día X: Y grados" [2].
     */
    public static void mostrarTemperaturas(Dia[] m) {
        if (m == null) {
            System.out.println("El array está vacío. Use la opción 1.");
            return;
        }
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i].getNombreDia() + " día " + (i + 1) + ": " + m[i].getTemperatura() + " grados.");
        }
    }

    /**
     * Calcula y muestra la media aritmética de las temperaturas del mes [2].
     */
    public static void visualizarMedia(Dia[] m) {
        if (m == null) return;
        double suma = 0;
        for (Dia d : m) {
            suma += d.getTemperatura();
        }
        System.out.println("La temperatura media del mes es: " + (suma / m.length) + " grados.");
    }

    /**
     * Identifica el valor máximo y muestra todos los días que lo alcanzaron [2].
     */
    public static void mostrarMasCalurosos(Dia[] m) {
        if (m == null) return;
        int max = -100;
        // Buscamos la temperatura más alta
        for (Dia d : m) {
            if (d.getTemperatura() > max) max = d.getTemperatura();
        }
        
        System.out.println("El día o días más calurosos fueron con " + max + " grados:");
        for (int i = 0; i < m.length; i++) {
            if (m[i].getTemperatura() == max) {
                // Formato de salida requerido: "El Jueves día X con Y grados" [2]
                System.out.println("- El " + m[i].getNombreDia() + " día " + (i + 1) + " con " + max + " grados.");
            }
        }
    }
}