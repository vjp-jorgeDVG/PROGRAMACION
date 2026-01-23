/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author jorge
 */
public abstract class Triangulo extends FiguraGeometrica {
    protected double base;
    protected double altura;

    public Triangulo(double base, double altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }
    
    // Definimos el área, ya que es común para cualquier triángulo si conocemos base y altura.
    @Override
    public double calcularArea() {
        return (base * altura) / 2.0;
    }
    
    // Dejamos el perímetro abstracto para que la subclase lo calcule (necesita la hipotenusa)
    @Override
    public abstract double calcularPerimetro();
}
