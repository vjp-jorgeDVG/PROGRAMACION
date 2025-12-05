/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author jorge
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // ----------------------------------------------------------------------
        // FASE 1: Instanciación directa y prueba de métodos
        // ----------------------------------------------------------------------
        System.out.println("=================================================");
        System.out.println("FASE 1: Pruebas usando tipos de clase concretos");
        System.out.println("=================================================");

        Ornitorrinco perry = new Ornitorrinco("Perry", "Macho", "Marrón", 5, 2);
        Murcielago dracula = new Murcielago("Dracula", "Macho", "Negro", 8, 10.0);

        System.out.println("\n--- Pruebas de Ornitorrinco (Perry) ---");
        perry.mostrarEstadoBase();
        System.out.println(perry.obtenerMensajeOviparo());
        perry.mostrarNumHuevos();
        perry.ponerHuevo();
        perry.ponerHuevo();
        perry.mostrarNumHuevos();
        perry.incubarHuevo();
        perry.mostrarNumHuevos();

        System.out.println("\n--- Pruebas de Murciélago (Dracula) ---");
        dracula.mostrarEstadoBase();
        System.out.println(dracula.obtenerMensajeVolador());
        dracula.mostrarAlturaVuelo();
        dracula.aumentarAlturaVuelo(5);
        dracula.mostrarAlturaVuelo();
        dracula.bajarAlturaVuelo(5);
        dracula.mostrarAlturaVuelo();
        dracula.bajarAlturaVuelo(5);
        dracula.mostrarAlturaVuelo();

        // ----------------------------------------------------------------------
        // FASE 2: Pruebas utilizando polimorfismo de interfaces
        // ----------------------------------------------------------------------
        System.out.println("\n=================================================");
        System.out.println("FASE 2: Pruebas usando polimorfismo de interfaz");
        System.out.println("=================================================");

        // Declaramos variables del tipo de la interfaz y asignamos objetos de la clase que la implementa.
        // Esto es polimorfismo: utilizar una misma expresión (la interfaz) para invocar diferentes versiones del método [7].
        Oviparo oviparoGenerico = new Ornitorrinco("Platypus", "Hembra", "Gris", 3, 1);
        Volador voladorGenerico = new Murcielago("Batty", "Hembra", "Gris", 2, 50.0);

        System.out.println("\n--- Pruebas de Oviparo (Platypus) vía interfaz ---");
        System.out.println(oviparoGenerico.obtenerMensajeOviparo());
        oviparoGenerico.mostrarNumHuevos();
        oviparoGenerico.ponerHuevo();
        oviparoGenerico.mostrarNumHuevos();

        // Si intentáramos llamar a un método de Mamifero como getNombre(), sería necesario un casting explícito
        // o si el método no estuviera en Mamifero daría ERROR [11], [13].
        System.out.println("\n--- Pruebas de Volador (Batty) vía interfaz ---");
        System.out.println(voladorGenerico.obtenerMensajeVolador());
        voladorGenerico.mostrarAlturaVuelo();
        voladorGenerico.aumentarAlturaVuelo(5);
        voladorGenerico.mostrarAlturaVuelo();
    }
}
