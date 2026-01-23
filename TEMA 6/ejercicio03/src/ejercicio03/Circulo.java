/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author jorge
 */
public class Circulo extends FiguraGeometrica {
    // Atributo radio en centímetros
    private double radio;

    public Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
    }

    // Implementación del método abstracto para calcular el área (π * r²)
    @Override
    public double calcularArea() {
        // Utilizamos la constante PI de la clase Math [3]
        return Math.PI * radio * radio; 
    }

    // Implementación del método abstracto para calcular el perímetro (2 * π * r)
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
    
    // Método auxiliar para mostrar datos
    public void mostrarDatos() {
        System.out.println("--- Círculo ---");
        System.out.println("Radio: " + radio + " cm");
        System.out.println("Color: " + color);
        System.out.println("Área: " + calcularArea() + " cm²");
        System.out.println("Perímetro: " + calcularPerimetro() + " cm");
    }
}