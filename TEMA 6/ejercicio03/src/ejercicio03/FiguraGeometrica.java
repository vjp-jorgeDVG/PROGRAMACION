/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author jorge
 */
public abstract class FiguraGeometrica {
 // Atributo color (accesible a subclases)
    protected String color;

    public FiguraGeometrica(String color) {
        this.color = color;
    }

    // Método para obtener el color
    public String getColor() {
        return color;
    }

    // Métodos abstractos que obligan a las clases hijas a implementarlos [2]
    public abstract double calcularArea();

    public abstract double calcularPerimetro();
}