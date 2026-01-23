/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08;

/**
 *
 * @author jorge
 */
public class Coche extends Vehiculo {
    // Atributo específico
    private boolean aireEncendido;

    // Constructor
    public Coche(int velocidadInicial) {
        super(velocidadInicial);
        this.aireEncendido = false;
    }

    // Implementación del método abstracto heredado
    @Override
    public void mostrarMovimiento() {
        System.out.println("El coche está circulando a " + this.velocidad + " km/h.");
    }

    // Método específico
    public void encenderAire() {
        if (!this.aireEncendido) {
            this.aireEncendido = true;
            System.out.println("El coche ha encendido el aire. La velocidad se reduce.");
            this.velocidad -= 10;
        } else {
            System.out.println("El aire ya está encendido.");
        }
    }
}
