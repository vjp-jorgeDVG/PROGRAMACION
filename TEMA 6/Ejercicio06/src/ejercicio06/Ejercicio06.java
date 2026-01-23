/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author jorge
 */
public class Ejercicio06 {

    public static void probarTransformable(Transformable objeto) {
        System.out.println("=========================================");
        System.out.println("Probando objeto: " + objeto.getClass().getSimpleName());
        System.out.println("Descripción: " + objeto.toString());

        // 1. concatenarTodo
        System.out.println("Concatenar todo: " + objeto.concatenarTodo());

        // 2. obtenerIniciales
        System.out.println("Iniciales: " + objeto.obtenerIniciales());

        // 3. contarVocales
        objeto.contarVocales();

        // 4. obtenerCadenaMasLarga
        System.out.println("Cadena más larga: " + objeto.obtenerCadenaMasLarga());

        // 5. buscarCadena
        String cadenaBuscar = "ciencia";
        System.out.println("¿Contiene '" + cadenaBuscar + "'? " + objeto.buscarCadena(cadenaBuscar));
        System.out.println("=========================================");
    }

    public static void main(String[] args) {

        // ===============================================
        // PRUEBA 1: INSTANCIACIÓN DIRECTA
        // ===============================================
        System.out.println("--- PRUEBA 1: INSTANCIACIÓN DIRECTA ---");

        Libro miLibro = new Libro("Ciencia Ficcion", "Julio Verne", "Aventura");
        Persona miPersona = new Persona("Ana", "Gomez Lopez", "Anaglo");

        // Prueba de métodos de miLibro
        System.out.println("\n--- Pruebas en Objeto Libro (Instancia directa) ---");
        probarTransformable(miLibro);

        // Prueba de métodos de miPersona
        System.out.println("\n--- Pruebas en Objeto Persona (Instancia directa) ---");
        probarTransformable(miPersona);

        // ===============================================
        // PRUEBA 2: POLIMORFISMO
        // ===============================================
        // El polimorfismo en Java permite asignar un objeto de una clase 
        // (Libro o Persona) a una variable de su tipo de interfaz (Transformable) [4], [5].
        System.out.println("\n--- PRUEBA 2: POLIMORFISMO (Variables tipo Transformable) ---");

        // Creación polimórfica de Libro
        Transformable objetoTransformable1 = new Libro("La Maquina del Tiempo", "H. G. Wells", "Ciencia");
        System.out.println("\n--- Pruebas en Objeto Transformable (Libro) ---");
        probarTransformable(objetoTransformable1);

        // Creación polimórfica de Persona
        Transformable objetoTransformable2 = new Persona("Carlos", "Rodriguez Soto", "Carlitos");
        System.out.println("\n--- Pruebas en Objeto Transformable (Persona) ---");
        probarTransformable(objetoTransformable2);
    }
}
