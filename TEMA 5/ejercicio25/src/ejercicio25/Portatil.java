/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25;

/**
 *
 * @author jorge
 */
public class Portatil extends Ordenador {
    private String marcaPortatil; // Usamos un nombre diferente para evitar conflicto con herencia si Ordenador tuviera 'marca'
    private int tamanoPantalla;
    private double peso;

    // Constructor por defecto
    public Portatil() {
        super(); // Llama al constructor por defecto de Ordenador
        this.marcaPortatil = "N/A";
        this.tamanoPantalla = 0;
        this.peso = 0.0;
    }

    // Constructor por parámetros
    public Portatil(int ram, int discoDuro, String procesador, String grafica, double precio,
                    String marcaPortatil, int tamanoPantalla, double peso) {
        super(ram, discoDuro, procesador, grafica, precio);
        this.marcaPortatil = marcaPortatil;
        this.tamanoPantalla = tamanoPantalla;
        this.peso = peso;
    }

    // Métodos establecer (Setters)
    public void establecerMarcaPortatil(String marcaPortatil) {
        this.marcaPortatil = marcaPortatil;
    }
    public void establecerTamanoPantalla(int tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }
    public void establecerPeso(double peso) {
        this.peso = peso;
    }

    // Métodos obtener (Getters)
    public String obtenerMarcaPortatil() {
        return marcaPortatil;
    }
    public int obtenerTamanoPantalla() {
        return tamanoPantalla;
    }
    public double obtenerPeso() {
        return peso;
    }

    // Sobrescribir el método mostrarEstado para incluir atributos específicos
    @Override
    public void mostrarEstado() {
        super.mostrarEstado(); // Muestra los atributos de Ordenador
        System.out.println("Tipo: Portátil");
        System.out.println("Marca Portátil: " + this.marcaPortatil);
        System.out.println("Tamaño Pantalla: " + this.tamanoPantalla + " pulgadas");
        System.out.println("Peso: " + this.peso + " kg");
    }
}