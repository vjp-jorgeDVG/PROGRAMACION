/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author jorge
 */
public class Dia {
    // Atributos privados según la fuente [1]
    public String nombreDia;
    public int temperatura;
    
    //constructores
    public Dia(String nombreDia, int temperatura) {
        this.nombreDia = "";
        this.temperatura = 0;
    }
    // Métodos getter y setter obligatorios [1]
    public String getNombreDia() {
        return nombreDia;
    }

    public void setNombreDia(String nombreDia) {
        this.nombreDia = nombreDia;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
}