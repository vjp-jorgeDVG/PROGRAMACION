/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author jorge
 */
public class Radio implements ControlRemoto {
    // Atributos privados
    private boolean encendido;
    private float emisora;
    private int volumen;

    // Constructor para inicializar valores por defecto
    public Radio() {
        this.encendido = false; 
        this.emisora = 80.0f; // Por defecto, se inicializa en 80.0
        this.volumen = 15;    // Por defecto, se inicializa en 15
    }
    
    // Métodos de la interfaz
    
    /**
     * Enciende la Radio si está apagada y muestra la emisora actual.
     */
    @Override
    public void encender() {
        if (!this.encendido) {
            this.encendido = true;
            System.out.println("Radio Encendida. Emisora actual: " + this.emisora + " FM");
        } else {
            System.out.println("La Radio ya está encendida.");
        }
    }

    /**
     * Apaga la Radio si está encendida.
     */
    @Override
    public void apagar() {
        if (this.encendido) {
            System.out.println("La Radio se apagará en 10s."); // Usamos el mensaje del TV por analogía, aunque se podría especificar otro.
            this.encendido = false; 
        } else {
            System.out.println("La Radio ya está apagada.");
        }
    }

    /**
     * Baja el volumen en 1 si la Radio está encendida.
     */
    @Override
    public void bajarVolumen() {
        if (this.encendido) {
            this.volumen--;
            System.out.println("Volumen actual: " + this.volumen);
        } else {
            System.out.println("La Radio está apagada, no se puede ajustar el volumen.");
        }
    }

    /**
     * Sube el volumen en 1 si la Radio está encendida.
     */
    @Override
    public void subirVolumen() {
        if (this.encendido) {
            this.volumen++;
            System.out.println("Volumen actual: " + this.volumen);
        } else {
            System.out.println("La Radio está apagada, no se puede ajustar el volumen.");
        }
    }

    /**
     * Cambia la emisora si la Radio está encendida.
     * @param canal Recibe la emisora deseada (float)
     */
    @Override
    public void cambiarCanal(float canal) {
        if (this.encendido) {
            this.emisora = canal;
            System.out.println("Cambiando a Emisora: " + this.emisora + " FM");
        } else {
            System.out.println("La Radio está apagada, no se puede cambiar la emisora.");
        }
    }
    
    // Métodos propios de la clase (Getters y Setters, salvo para encendido)

    public float getEmisora() {
        return emisora;
    }

    public void setEmisora(float emisora) {
        this.emisora = emisora;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
}