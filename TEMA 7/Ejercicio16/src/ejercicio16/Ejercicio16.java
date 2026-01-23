/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio16 {
public final static int ALUMNOS = 6;
public final static int ASIGNATURAS = 4;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Arrays con los nombres según la fuente
        String[] alumnos = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "Maria"};
        String[] asignaturas = {"Lengua", "Mates", "Historia", "Fisica"};
        
        // Matriz para las notas (6 alumnos x 4 asignaturas)
        double[][] notas = new double[6][4];
        int opcion;

        // Bucle del menú: no saldrá hasta que el usuario pulse 6
        do {
            System.out.println("1. Rellenar las notas de los alumnos.");
            System.out.println("2. Mostrar las notas introducidas.");
            System.out.println("3. Alumno con mejor nota media.");
            System.out.println("4. Alumno con mas suspensos.");
            System.out.println("5. Asignatura mas dificil.");
            System.out.println("6. Salir.");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    rellenarNotas(notas, alumnos, asignaturas);
                    break;
                case 2:
                    mostrarNotas(notas, alumnos, asignaturas);
                    break;
                case 3:
                    mejorAlumno(notas, alumnos);
                    break;
                case 4:
                    masSuspensos(notas, alumnos);
                    break;
                case 5:
                    asignaturaDificil(notas, asignaturas);
                    break;
                case 6:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 6);
    }

    // 1. Metodo para rellenar las notas
    public static void rellenarNotas(double[][] notas, String[] alum, String[] asig) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ALUMNOS; i++) {
            System.out.println("Notas de " + alum[i] + ":");
            for (int j = 0; j < ASIGNATURAS; j++) {
                System.out.print("  " + asig[j] + ": ");
                notas[i][j] = sc.nextDouble();
            }
        }
    }

    // 2. Metodo que muestra las notas
    public static void mostrarNotas(double[][] notas, String[] alum, String[] asig) {
        for (int i = 0; i < ALUMNOS; i++) {
            System.out.print(alum[i] + ": ");
            for (int j = 0; j < ASIGNATURAS; j++) {
                System.out.print("[" + asig[j] + ": " + notas[i][j] + "] ");
            }
            System.out.println();
        }
    }

    // 3. Metodo que da alumno con mejor nota media
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

    // 4. Metodo para el alumno con más suspensos
    public static void masSuspensos(double[][] notas, String[] alum) {
        int maxSuspensos = 0;
        int indiceAlumno = 0;
        for (int i = 0; i < notas.length; i++) {
            int contadorSuspensos = 0;
            for (int j = 0; j < notas.length; j++) {
                if (notas[i][j] < 5) contadorSuspensos++;
            }
            if (contadorSuspensos > maxSuspensos) {
                maxSuspensos = contadorSuspensos;
                indiceAlumno = i;
            }
        }
        System.out.println("El alumno con más suspensos es " + alum[indiceAlumno] + " (" + maxSuspensos + " suspensos)");
    }

    // 5. Asignatura más difícil (media más baja)
    public static void asignaturaDificil(double[][] notas, String[] asig) {
        double minMedia = 11;
        int indiceAsig = 0;
        for (int i = 0; i < 4; i++) { // Por cada asignatura (columna)
            double suma = 0;
            for (int j = 0; j < 6; j++) { // Por cada alumno (fila)
                suma += notas[i][j];
            }
            double media = suma / 6;
            if (media < minMedia) {
                minMedia = media;
                indiceAsig = i;
            }
        }
        System.out.println("La asignatura más difícil es " + asig[indiceAsig] + " con una media de " + minMedia);
    }
}
