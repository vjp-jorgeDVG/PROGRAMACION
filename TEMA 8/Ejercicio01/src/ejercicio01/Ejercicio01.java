/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;
import java.util.Scanner;
/**
 *
 * @author jorge
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Creamos el array de 6 posiciones para objetos de la clase Asignatura
        Asignatura[] misAsignaturas = new Asignatura[2];
        
        // Nombres de las asignaturas que asignamos nosotros
        String[] nombres = {
            "Programación", 
            "Lenguajes de Marcas", 
            "Bases de Datos", 
            "Entornos de Desarrollo", 
            "Sistemas Informáticos", 
            "FOL/IPE"
        };

        System.out.println("--- INTRODUCCIÓN DE NOTAS DAM ---");
        
        // El usuario introduce la nota mediante un bucle
        for (int i = 0; i < misAsignaturas.length; i++) {
            System.out.print("Introduzca la nota de " + nombres[i] + ": ");
            double notaUsuario = entrada.nextDouble();
            
            // Instanciamos el objeto en la posición del array
            misAsignaturas[i] = new Asignatura(nombres[i], notaUsuario);
        }

        // Llamada al método que calcula la media y muestra el resultado
        double mediaFinal = calcularMedia(misAsignaturas);
        System.out.println("La nota media del curso es de: " + mediaFinal);
    }

    /**
     * Método que recibe el array de objetos y devuelve la nota media.
     * Requisito: debe usar 'return' [1].
     */
    public static double calcularMedia(Asignatura[] lista) {
        double suma = 0;
        for (int i = 0; i < lista.length; i++) {
            suma += lista[i].getNota();
        }
        return suma / lista.length;
    }
}