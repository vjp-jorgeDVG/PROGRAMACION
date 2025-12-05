/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08;

/**
 *
 * @author jorge
 */
public abstract class Vehiculo {
    // Atributo
    protected int velocidad;

    // Constructor para inicializar la velocidad
    public Vehiculo(int velocidadInicial) {
        this.velocidad = velocidadInicial;
    }

    // Método abstracto. Debe ser implementado OBLIGATORIAMENTE por las subclases [2]
    public abstract void mostrarMovimiento();

    // Getter para la velocidad (útil para los métodos de mostrarMovimiento de las subclases)
    public int getVelocidad() {
        return velocidad;
    }
}
