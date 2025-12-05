/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author jorge
 */
public class Profesor extends Persona {
    private String especialidad;

    // Constructor que llama al constructor de la superclase (Persona)
    public Profesor(String nombre, String especialidad) {
        super(nombre);
        this.especialidad = especialidad;
    }

    // Implementación obligatoria del método abstracto de Persona
    @Override
    public String saludar() {
        return "Hola, soy el profesor " + this.nombre + " y soy de la especialidad de " + this.especialidad + ".";
    }
}
