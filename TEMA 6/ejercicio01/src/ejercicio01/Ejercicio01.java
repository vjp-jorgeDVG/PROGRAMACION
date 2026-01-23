/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author jorge
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        
        // =========================================================
        // 1. Instanciación directa de cada subclase
        System.out.println("--- PRUEBAS DE INSTANCIACIÓN DIRECTA ---");
        
        Suma operacionSuma = new Suma(15, 7);
        Multiplicacion operacionMultiplicacion = new Multiplicacion(4, 6);
        Potencia operacionPotencia = new Potencia(5, 3);
        
        operacionSuma.realizarOperacion();
        operacionMultiplicacion.realizarOperacion();
        operacionPotencia.realizarOperacion();
        
        // =========================================================
        // 2. Uso de Polimorfismo
        System.out.println("\n--- PRUEBAS CON POLIMORFISMO (Usando la superclase Calculadora) ---");

        // Declaración de variables de referencia de la superclase [11], [3], [12]
        Calculadora opPolimorfica1;
        Calculadora opPolimorfica2;
        Calculadora opPolimorfica3;
        
        // Se asignan objetos de las subclases a las referencias de la superclase 
        opPolimorfica1 = new Suma(50, 10);
        opPolimorfica2 = new Multiplicacion(9, 2);
        opPolimorfica3 = new Potencia(10, 2);
        
        // Llamada polimórfica al método (el comportamiento real es del objeto de la subclase)
        opPolimorfica1.realizarOperacion(); 
        opPolimorfica2.realizarOperacion();
        opPolimorfica3.realizarOperacion();
    }
}
