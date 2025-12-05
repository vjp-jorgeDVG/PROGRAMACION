/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author jorge
 */
public class Multiplicacion extends Calculadora {
    private double multiplicador;

    // Constructor que llama al constructor de la superclase (Calculadora)
    public Multiplicacion(double numero, double multiplicador) {
        super(numero);
        this.multiplicador = multiplicador;
    }

    Multiplicacion(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Implementación obligatoria del método abstracto
    @Override
    public void realizarOperacion() {
        double resultado = this.numero * this.multiplicador;
        System.out.println("Multiplicación: " + this.numero + " * " + this.multiplicador + " = " + resultado);
    }
}