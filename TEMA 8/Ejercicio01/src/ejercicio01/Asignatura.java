/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author jorge
 */
public class Asignatura {
        private String nombre;
        private double nota;

        // Constructor que asigna nombre y nota al crear el objeto
public Asignatura(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
}

public String getNombre() {
        return nombre;
}

public void setNombre(String nombre) {
        this.nombre = nombre;
}

    public double setNota() {
        return nota;
}
    public void setNota(double nota) {
        this.nota = nota;
}
    // Método para obtener la nota (necesario para el cálculo de la media)
    public double getNota() {
        return nota;
    }
}

