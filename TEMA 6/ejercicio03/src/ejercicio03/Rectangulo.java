/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author jorge
 */
public class Rectangulo extends FiguraGeometrica {
    // Atributos base y altura en centímetros
    protected double base;
    protected double altura;

    public Rectangulo(double base, double altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    // Implementación del método abstracto para calcular el área (base * altura)
    @Override
    public double calcularArea() {
        return base * altura;
    }

    // Implementación del método abstracto para calcular el perímetro (2 * (base + altura))
    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
    
    // Método auxiliar para mostrar datos
    public void mostrarDatos() {
        System.out.println("--- Rectángulo ---");
        System.out.println("Base: " + base + " cm, Altura: " + altura + " cm");
        System.out.println("Color: " + color);
        System.out.println("Área: " + calcularArea() + " cm²");
        System.out.println("Perímetro: " + calcularPerimetro() + " cm");
    }
}
