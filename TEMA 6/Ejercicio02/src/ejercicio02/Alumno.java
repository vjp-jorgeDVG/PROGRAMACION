/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author jorge
 */
public class Alumno extends Persona {
    private String grupo;

    // Constructor que llama al constructor de la superclase (Persona)
    public Alumno(String nombre, String grupo) {
        super(nombre);
        this.grupo = grupo;
    }

    // Implementación obligatoria del método abstracto de Persona
    @Override
    public String saludar() {
        return "Hola, soy el alumno " + this.nombre + " y estoy en el grupo de " + this.grupo + ".";
    }
}
