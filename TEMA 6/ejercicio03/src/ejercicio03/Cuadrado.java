/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author jorge
 */
public class Cuadrado extends FiguraGeometrica {
    // Atributo lado en centímetros
    private double lado;

    public Cuadrado(double lado, String color) {
        super(color);
        this.lado = lado;
    }

    // Implementación del método abstracto para calcular el área (lado * lado)
    @Override
    public double calcularArea() {
        return lado * lado;
    }

    // Implementación del método abstracto para calcular el perímetro (4 * lado)
    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
    
    // Método auxiliar para mostrar datos
    public void mostrarDatos() {
        System.out.println("--- Cuadrado ---");
        System.out.println("Lado: " + lado + " cm");
        System.out.println("Color: " + color);
        System.out.println("Área: " + calcularArea() + " cm²");
        System.out.println("Perímetro: " + calcularPerimetro() + " cm");
    }
}
