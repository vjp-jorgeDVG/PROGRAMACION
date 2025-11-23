/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25;

/**
 *
 * @author jorge
 */
public class Ordenador {

    private int ram;
    private int discoDuro;
    private String procesador;
    private String grafica;
    private double precio;

    // Constructor por defecto
    public Ordenador() {
        // Inicialización por defecto
        this.ram = 0;
        this.discoDuro = 0;
        this.procesador = "N/A";
        this.grafica = "N/A";
        this.precio = 0.0;
    }

    // Constructor por parámetros
    public Ordenador(int ram, int discoDuro, String procesador, String grafica, double precio) {
        this.ram = ram;
        this.discoDuro = discoDuro;
        this.procesador = procesador;
        this.grafica = grafica;
        this.precio = precio;
    }

    // Métodos establecer (Setters)
    public void establecerRam(int ram) {
        this.ram = ram;
    }
    public void establecerDiscoDuro(int discoDuro) {
        this.discoDuro = discoDuro;
    }
    public void establecerProcesador(String procesador) {
        this.procesador = procesador;
    }
    public void establecerGrafica(String grafica) {
        this.grafica = grafica;
    }
    public void establecerPrecio(double precio) {
        this.precio = precio;
    }

    // Métodos obtener (Getters)
    public int obtenerRam() {
        return ram;
    }
    public int obtenerDiscoDuro() {
        return discoDuro;
    }
    public String obtenerProcesador() {
        return procesador;
    }
    public String obtenerGrafica() {
        return grafica;
    }
    public double obtenerPrecio() {
        return precio;
    }

    // Método para mostrar el estado
    public void mostrarEstado() {
        System.out.println("--- Datos del Ordenador ---");
        System.out.println("RAM: " + this.ram + " GB");
        System.out.println("Disco Duro: " + this.discoDuro + " GB");
        System.out.println("Procesador: " + this.procesador);
        System.out.println("Tarjeta Gráfica: " + this.grafica);
        System.out.println("Precio: " + this.precio + " Euros");
    }
}

