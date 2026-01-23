/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08;

/**
 *
 * @author jorge
 */
public class Moto extends Vehiculo {
    // Atributo específico
    private boolean haciendoCaballito;

    // Constructor
    public Moto(int velocidadInicial) {
        super(velocidadInicial);
        this.haciendoCaballito = false;
    }

    // Implementación del método abstracto heredado
    @Override
    public void mostrarMovimiento() {
        System.out.println("La moto está circulando a " + this.velocidad + " km/h.");
    }

    // Método específico
    public void hacerCaballito() {
        if (!this.haciendoCaballito) {
            this.haciendoCaballito = true;
            System.out.println("La moto está haciendo un caballito. La velocidad aumenta.");
            this.velocidad += 15;
        } else {
            System.out.println("La moto ya está haciendo un caballito.");
        }
    }
}
