/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author jorge
 */
public class Murcielago extends Mamifero implements Volador {
    private double altura_vuelo_metros;

    public Murcielago(String nombre, String sexo, String color, int edad, double alturaInicial) {
        super(nombre, sexo, color, edad);
        this.altura_vuelo_metros = alturaInicial;
    }

    // Implementación de Volador
    @Override
    public String obtenerMensajeVolador() {
        return "El murciélago es un animal volador";
    }

    @Override
    public void aumentarAlturaVuelo(int metros) {
        this.altura_vuelo_metros += 5; // Aumenta la altura en 5 metros
        System.out.println(getNombre() + " ha aumentado su altura.");
    }

    @Override
    public void bajarAlturaVuelo(int metros) {
        this.altura_vuelo_metros -= 5; // Disminuye la altura en 5 metros
        if (this.altura_vuelo_metros < 0) {
            this.altura_vuelo_metros = 0;
        }
        System.out.println(getNombre() + " ha bajado su altura.");
    }

    @Override
    public void mostrarAlturaVuelo() {
        System.out.println(getNombre() + " está volando a " + this.altura_vuelo_metros + " metros de altura.");
    }
}
