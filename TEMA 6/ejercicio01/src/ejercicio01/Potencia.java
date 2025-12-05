/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author jorge
 */
public class Potencia extends Calculadora {
    private double exponente;

    // Constructor que llama al constructor de la superclase (Calculadora)
    public Potencia(double numero, double exponente) {
        super(numero);
        this.exponente = exponente;
    }

    // Implementación obligatoria del método abstracto
    @Override
    public void realizarOperacion() {
        // Math.pow(base, exponente) calcula la potencia [10]
        double resultado = Math.pow(this.numero, this.exponente); 
        System.out.println("Potencia: " + this.numero + " ^ " + this.exponente + " = " + resultado);
    }
}
