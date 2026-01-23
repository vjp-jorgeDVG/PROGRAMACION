/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author jorge
 */
public class Suma extends Calculadora {
    private double sumando;

    // Constructor que llama al constructor de la superclase (Calculadora) [6], [7]
    public Suma(double numero, double sumando) {
        super(numero);
        this.sumando = sumando;
    }

    Suma(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Implementación obligatoria del método abstracto [2]
    @Override
    public void realizarOperacion() {
        double resultado = this.numero + this.sumando;
        System.out.println("Suma: " + this.numero + " + " + this.sumando + " = " + resultado);
    }
}
