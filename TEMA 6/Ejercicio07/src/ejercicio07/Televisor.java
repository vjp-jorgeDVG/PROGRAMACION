/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author jorge
 */
public class Televisor implements ControlRemoto {
    // Atributos privados
    private boolean encendido;
    private int canal;
    private int volumen;

    // Constructor para inicializar valores por defecto
    public Televisor() {
        this.encendido = false; 
        this.canal = 1;      // Por defecto, se inicializa en 1
        this.volumen = 10;   // Por defecto, se inicializa en 10
    }

    // Métodos de la interfaz
    
    /**
     * Enciende la TV si está apagada y muestra el canal actual.
     */
    @Override
    public void encender() {
        if (!this.encendido) {
            this.encendido = true;
            System.out.println("TV Encendida. Canal actual: " + this.canal);
        } else {
            System.out.println("La TV ya está encendida.");
        }
    }

    /**
     * Apaga la TV si está encendida y muestra un mensaje de apagado programado.
     */
    @Override
    public void apagar() {
        if (this.encendido) {
            System.out.println("La TV se apagará en 10s.");
            this.encendido = false; 
        } else {
            System.out.println("La TV ya está apagada.");
        }
    }

    /**
     * Baja el volumen en 1 si la TV está encendida.
     */
    @Override
    public void bajarVolumen() {
        if (this.encendido) {
            this.volumen--;
            System.out.println("Volumen actual: " + this.volumen);
        } else {
            System.out.println("La TV está apagada, no se puede ajustar el volumen.");
        }
    }

    /**
     * Sube el volumen en 1 si la TV está encendida.
     */
    @Override
    public void subirVolumen() {
        if (this.encendido) {
            this.volumen++;
            System.out.println("Volumen actual: " + this.volumen);
        } else {
            System.out.println("La TV está apagada, no se puede ajustar el volumen.");
        }
    }

    /**
     * Cambia el canal si la TV está encendida (convirtiendo el float a int).
     * @param canal El nuevo canal (float, se convierte a int).
     */
    @Override
    public void cambiarCanal(float canal) {
        if (this.encendido) {
            // Se realiza la conversión de float a int, como el atributo canal es de tipo int.
            this.canal = (int) canal;
            System.out.println("Cambiando a Canal: " + this.canal);
        } else {
            System.out.println("La TV está apagada, no se puede cambiar el canal.");
        }
    }

    // Métodos propios de la clase (Getters y Setters, salvo para encendido)

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
}