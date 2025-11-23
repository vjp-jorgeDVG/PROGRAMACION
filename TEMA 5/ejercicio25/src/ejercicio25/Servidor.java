/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25;

/**
 *
 * @author jorge
 */
public class Servidor extends Ordenador {

    private int tamanoMonitor;
    private String modeloTeclado;
    private String modeloRaton;

    // Constructor por defecto
    public Servidor() {
        super(); // Llama al constructor por defecto de Ordenador [11]
        this.tamanoMonitor = 0;
        this.modeloTeclado = "N/A";
        this.modeloRaton = "N/A";
    }

    // Constructor por parámetros (incluye parámetros de Ordenador)
    public Servidor(int ram, int discoDuro, String procesador, String grafica, double precio,
                    int tamanoMonitor, String modeloTeclado, String modeloRaton) {
        super(ram, discoDuro, procesador, grafica, precio); // Llama al constructor parametrizado de Ordenador [11]
        this.tamanoMonitor = tamanoMonitor;
        this.modeloTeclado = modeloTeclado;
        this.modeloRaton = modeloRaton;
    }

    // Métodos establecer (Setters)
    public void establecerTamanoMonitor(int tamanoMonitor) {
        this.tamanoMonitor = tamanoMonitor;
    }
    public void establecerModeloTeclado(String modeloTeclado) {
        this.modeloTeclado = modeloTeclado;
    }
    public void establecerModeloRaton(String modeloRaton) {
        this.modeloRaton = modeloRaton;
    }

    // Métodos obtener (Getters)
    public int obtenerTamanoMonitor() {
        return tamanoMonitor;
    }
    public String obtenerModeloTeclado() {
        return modeloTeclado;
    }
    public String obtenerModeloRaton() {
        return modeloRaton;
    }

    // Sobrescribir el método mostrarEstado para incluir atributos específicos
    @Override
    public void mostrarEstado() {
        super.mostrarEstado(); // Muestra los atributos de Ordenador
        System.out.println("Tipo: Servidor");
        System.out.println("Tamaño Monitor: " + this.tamanoMonitor + " pulgadas");
        System.out.println("Modelo Teclado: " + this.modeloTeclado);
        System.out.println("Modelo Ratón: " + this.modeloRaton);
    }
}

