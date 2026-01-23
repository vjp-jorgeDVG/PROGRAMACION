/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author jorge
 */
public class Mamifero {
    private String nombre;
    private String sexo;
    private String color;
    private int edad;

    public Mamifero(String nombre, String sexo, String color, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.color = color;
        this.edad = edad;
    }

    public String getNombre() { return nombre; }
    public String getSexo() { return sexo; }
    public String getColor() { return color; }
    public int getEdad() { return edad; }

    public void mostrarEstadoBase() {
        System.out.println("--- Datos del Mamífero ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Sexo: " + sexo);
        System.out.println("Color: " + color);
        System.out.println("Edad: " + edad + " años");
    }
}