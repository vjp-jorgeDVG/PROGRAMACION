/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author alumno
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear objetos
        Coche miCoche = new Coche();
        Coche cochePadre = new Coche();

        // Establecer marca, modelo y color en miCoche
        miCoche.setMarca("Toyota");
        miCoche.setModelo("Yaris");
        miCoche.setColor("Blanco");

        // Establecer marca, modelo y color en cochePadre
        cochePadre.setMarca("Ford");
        cochePadre.setModelo("Focus");
        cochePadre.setColor("Rojo");

        // Arrancar ambos coches
        miCoche.arrancarCoche();
        cochePadre.arrancarCoche();

        // Acelerar 5 veces miCoche
        for (int i = 0; i < 5; i++) {
            miCoche.acelerarCoche();
        }

        // Frenar 2 veces miCoche
        for (int i = 0; i < 2; i++) {
            miCoche.frenarCoche();
        }

        // Acelerar 3 veces cochePadre
        for (int i = 0; i < 3; i++) {
            cochePadre.acelerarCoche();
        }

        // Apagar cochePadre
        cochePadre.apagarCoche();

        // Mostrar estados
        System.out.println("\n--- Estado de miCoche ---");
        miCoche.obtenerEstado();

        System.out.println("\n--- Estado de cochePadre ---");
        cochePadre.obtenerEstado();
    }
}
