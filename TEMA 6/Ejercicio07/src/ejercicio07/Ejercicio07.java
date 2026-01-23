/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author jorge
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creamos objetos de las clases concretas
        Televisor miTV = new Televisor();
        Radio miRadio = new Radio();

        // 1. Demostración de funcionalidad básica
        System.out.println("--- PRUEBA INDIVIDUAL DEL TELEVISOR ---");
        miTV.encender();         // Enciende, Canal 1
        miTV.subirVolumen();     // Sube volumen a 11
        miTV.cambiarCanal(5.5f); // Cambia canal a 5
        miTV.bajarVolumen();     // Baja volumen a 10
        miTV.apagar();           // Se apaga
        miTV.subirVolumen();     // Muestra mensaje de que está apagada

        System.out.println("\n--- PRUEBA INDIVIDUAL DE LA RADIO ---");
        miRadio.encender();          // Enciende, Emisora 80.0
        miRadio.subirVolumen();      // Sube volumen a 16
        miRadio.cambiarCanal(98.7f); // Cambia emisora a 98.7
        miRadio.bajarVolumen();      // Baja volumen a 15
        miRadio.apagar();            // Se apaga
        
        // 2. Demostración de Polimorfismo
        System.out.println("\n--- DEMOSTRACIÓN DE POLIMORFISMO (Usando la interfaz) ---");
        
        // Declaramos una variable de tipo Interfaz
        ControlRemoto control; 
        
        // Asignamos un objeto Televisor a la variable de interfaz
        // Es posible asignar un objeto de una clase a una variable de su superclase (o interfaz) [8], [9]
        control = miTV; 
        
        System.out.println("\n>>> Operando sobre el Televisor (via Interfaz)");
        control.encender(); 
        control.cambiarCanal(75.0f); 
        control.subirVolumen();
        
        // Reasignamos la variable de interfaz a un objeto Radio
        control = miRadio;
        
        System.out.println("\n>>> Operando sobre la Radio (via Interfaz)");
        control.encender();
        control.cambiarCanal(103.5f);
        control.bajarVolumen();
        control.apagar();
    }
}
