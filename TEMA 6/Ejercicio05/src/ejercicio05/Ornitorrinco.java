/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author jorge
 */
public class Ornitorrinco extends Mamifero implements Oviparo {
    private int numero_huevos;

    public Ornitorrinco(String nombre, String sexo, String color, int edad, int numHuevosInicial) {
        super(nombre, sexo, color, edad);
        this.numero_huevos = numHuevosInicial;
    }

    // Implementación de Oviparo
    @Override
    public String obtenerMensajeOviparo() {
        return "El ornitorrinco es un mamífero ovíparo";
    }

    @Override
    public void ponerHuevo() {
        this.numero_huevos++; // Aumenta el número de huevos en una unidad
        System.out.println(getNombre() + " ha puesto un huevo. Total actual: " + this.numero_huevos);
    }

    @Override
    public void incubarHuevo() {
        if (this.numero_huevos > 0) {
            this.numero_huevos--; // Disminuye el número de huevos en una unidad
            System.out.println(getNombre() + " ha incubado un huevo. Total actual: " + this.numero_huevos);
        } else {
            System.out.println(getNombre() + " no tiene huevos para incubar.");
        }
    }

    @Override
    public void mostrarNumHuevos() {
        System.out.println("El número de huevos del ornitorrinco " + getNombre() + " es: " + this.numero_huevos);
    }
}
