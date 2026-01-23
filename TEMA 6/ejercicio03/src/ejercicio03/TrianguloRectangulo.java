/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author jorge
 */
public class TrianguloRectangulo extends Triangulo {

    public TrianguloRectangulo(double base, double altura, String color) {
        // En un triángulo rectángulo, la base y la altura son los catetos.
        super(base, altura, color);
    }

    // Método específico para calcular la hipotenusa (usando Pitágoras: c = sqrt(a² + b²))
    public double calcularHipotenusa() {
        // Utilizamos Math.sqrt y Math.pow [4]
        return Math.sqrt(base * base + altura * altura);
    }
    
    // Implementación del perímetro (suma de los dos catetos y la hipotenusa)
    @Override
    public double calcularPerimetro() {
        return base + altura + calcularHipotenusa();
    }
    
    // Método para determinar el tipo de triángulo basado en la longitud de sus lados
    public String determinarTipoTriangulo() {
        double hipotenusa = calcularHipotenusa();
        
        // Redondeamos para evitar errores de punto flotante en comparaciones
        double lado1 = Math.round(base * 100.0) / 100.0;
        double lado2 = Math.round(altura * 100.0) / 100.0;
        double lado3 = Math.round(hipotenusa * 100.0) / 100.0;

        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
    
    // Método auxiliar para mostrar datos completos del triángulo rectángulo
    public void mostrarDatos() {
        System.out.println("--- Triángulo Rectángulo ---");
        System.out.println("Base (Cateto 1): " + base + " cm, Altura (Cateto 2): " + altura + " cm");
        System.out.println("Color: " + color);
        System.out.println("Área: " + calcularArea() + " cm²");
        System.out.println("Hipotenusa: " + calcularHipotenusa() + " cm");
        System.out.println("Perímetro: " + calcularPerimetro() + " cm");
        System.out.println("Tipo de triángulo: " + determinarTipoTriangulo());
    }
}
