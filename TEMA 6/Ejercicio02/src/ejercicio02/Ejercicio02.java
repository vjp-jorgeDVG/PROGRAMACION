/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author jorge
 */
public class Ejercicio02 {

    public static void main(String[] args) {

        // 1. Instanciación directa de las subclases y prueba de métodos
        System.out.println("--- Instanciación Directa ---");

        // Objeto de la clase Alumno
        Alumno alumno1 = new Alumno("Laura Gómez", "1DAM-B");
        // Objeto de la clase Profesor
        Profesor profesor1 = new Profesor("Dr. Pérez", "Programación Avanzada");

        System.out.println("Alumno 1 saluda: " + alumno1.saludar());
        System.out.println("Profesor 1 saluda: " + profesor1.saludar());

        System.out.println("\n--- Prueba de Polimorfismo ---");

        /* 
         * 2. Uso de Polimorfismo: 
         * Declarar variables del tipo de la superclase (Persona) 
         * y asignarles objetos de las subclases (Alumno y Profesor) [4, 7].
         * La llamada al método saludar() se resolverá en tiempo de ejecución 
         * según el tipo real del objeto (polimorfismo) [6, 8].
         */
        Persona personaAlumno = new Alumno("Miguel Soto", "2DAW-A");
        Persona personaProfesor = new Profesor("Dra. Ruiz", "Bases de Datos");

        System.out.println("Persona (Alumno) saluda: " + personaAlumno.saludar());
        System.out.println("Persona (Profesor) saluda: " + personaProfesor.saludar());
    }
}
