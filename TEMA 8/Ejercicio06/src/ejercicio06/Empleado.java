/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author jorge
 */
public class Empleado {
    private String nombre;
    private int horasTrabajadas;
    private double tarifaHora;

    // Constructor para inicializar los datos del empleado
    public Empleado(String nombre, int horas, double tarifa) {
        this.nombre = nombre;
        this.horasTrabajadas = horas;
        this.tarifaHora = tarifa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }
    
    // Método para calcular el sueldo bruto según la regla de la fuente [1]
    public double calcularSueldoBruto() {
        double sueldo;
        if (horasTrabajadas <= 40) {
            sueldo = horasTrabajadas * tarifaHora;
        } else {
            int horasExtra = horasTrabajadas - 40;
            // 40 horas normales + horas extra con recargo del 50%
            sueldo = (40 * tarifaHora) + (horasExtra * tarifaHora * 1.5);
        }
        return sueldo;
    }

    // Método para mostrar la información formateada como pide el ejemplo [2]
    public void mostrarResultado() {
        System.out.println(nombre + " trabajó " + horasTrabajadas + " horas, cobra " 
            + tarifaHora + " euros la hora por lo que le corresponde un sueldo de " 
            + calcularSueldoBruto() + " euros.");
    }
}
