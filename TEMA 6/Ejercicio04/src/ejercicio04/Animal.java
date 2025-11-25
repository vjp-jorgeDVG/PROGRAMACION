/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author alumno
 */
public abstract class Animal {

    private String nombre;
    private int edad;
    private int peso;

    public Animal() {

        this.nombre = "";
        this.edad = 0;
        this.peso = 0;
    }

    public Animal(String nombre, int edad, int peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }
    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    // metodos

    public abstract void sonido();

    public abstract void alimentacion(String carnivoro);

    public abstract void habitat(String domestico);

    public abstract void nombreCientifico();

    
    public void mostrar() {
        System.out.println("El nombre del animal es: " + nombre);
        System.out.println("Su edad es de: " + edad + " anios");
        System.out.println("Su peso es de: " + peso + " KG");
     
    }
}


