/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author alumno
 */
public class Coche {

    //atributos
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;
    private boolean motorEncendido;

    //contructores
    public Coche() {
        this.marca = "";
        this.modelo = "";
        this.color = "";
        this.velocidad = 0;
        this.motorEncendido = false;
    }

    //constructores parametrizados
    public Coche(String marca, String modelo, String color, int velocidad, boolean motorEncendido) {
        this.marca = "toyota";
        this.modelo = "yaris";
        this.color = "blanco";
        this.velocidad = 120;
        this.motorEncendido = true;
    }
    //getters y setters 

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isMotorEncendido() {
        return motorEncendido;
    }

    public void setMotorEncendido(boolean motorEncendido) {
        this.motorEncendido = motorEncendido;
    }
    //otros metodos
    //metodos
    public void establecerMarca() {
        System.out.println("toyota");
    }

    public static void establecerModelo() {
        System.out.println("yaris");
    }

    public void establecerColor() {
        System.out.println("blanco");
    }

    public void arrancarCoche() {
        motorEncendido = true;
        velocidad = 10;
        System.out.println("El coche ha arrancado. Velocidad inicial: " + velocidad);
    }

    public void apagarCoche() {
        motorEncendido = false;
        velocidad = 0;
        System.out.println("El coche se ha apagado.");
    }

    public void acelerarCoche() {
        if (motorEncendido) {
            velocidad += 20;
            System.out.println("Acelerando. Velocidad actual: " + velocidad);
        } else {
            System.out.println("No se puede acelerar. El motor está apagado.");
        }
    }

    public void frenarCoche() {
        if (motorEncendido && velocidad > 0) {
            velocidad -= 6;
            if (velocidad < 0) {
                velocidad = 0;
            }
            System.out.println("Frenando. Velocidad actual: " + velocidad);
        } else {
            System.out.println("El coche ya está detenido o apagado.");
        }
    }

    public void obtenerEstado() {
        System.out.println("Motor encendido: " + motorEncendido);
        System.out.println("Velocidad: " + velocidad);
    }
}
