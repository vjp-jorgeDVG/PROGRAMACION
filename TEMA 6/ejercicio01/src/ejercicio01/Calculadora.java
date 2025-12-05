/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author jorge
 */
public abstract class Calculadora {
    // Atributo común a todas las operaciones
    // Se utiliza 'protected' para que sea accesible por las subclases [5]
    protected double numero;

    // Constructor para inicializar el atributo 'numero'
    public Calculadora(double numero) {
        this.numero = numero;
    }

    // Método abstracto: debe ser implementado obligatoriamente por las subclases [2]
    public abstract void realizarOperacion();
}
