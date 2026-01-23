/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author jorge
 */
public abstract class Persona {
    // Atributo común a todas las personas
    protected String nombre; 

    // Constructor 
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto: debe ser implementado por todas las subclases
    // (no lleva cuerpo ni llaves, solo terminación con ;) [2, 3]
    public abstract String saludar();
}