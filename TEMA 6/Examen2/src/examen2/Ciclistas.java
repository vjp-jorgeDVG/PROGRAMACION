package examen2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author alumno
 */
public abstract class Ciclistas {

    private String nombre;
    private int energia;
    private String escapa;
    private float km;
    private int bidones;
    private float velocidad;
    private int hidratacion;

//constructores
    public Ciclistas() {
        this.nombre = "";
        this.energia = 50;
        this.escapa = "";
        this.km = 120;
        this.bidones = 2;
        this.velocidad = 0;
        this.hidratacion = 50;
    }

    public Ciclistas(String nombre, int energia, String escapa, float km, int bidones, float velocidad, int hidratacion) {
        this.nombre = nombre;
        this.energia = energia;
        this.escapa = escapa;
        this.km = km;
        this.bidones = bidones;
        this.velocidad = velocidad;
        this.hidratacion = hidratacion;
    }
//getters y setters

    public String getNombre() {
        return nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public String getEscapa() {
        return escapa;
    }

    public float getKm() {
        return km;
    }

    public int getBidones() {
        return bidones;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public int getHidratacion() {
        return hidratacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void setEscapa(String escapa) {
        this.escapa = escapa;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public void setBidones(int bidones) {
        this.bidones = bidones;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public void setHidratacion(int hidratacion) {
        this.hidratacion = hidratacion;
    }
// metodos

    public abstract void Comer();

    public abstract void Beber();

    public static void CiclistasCreados(int CiclistasCreados) {
        CiclistasCreados++;
    }
//to string

    @Override
    public String toString() {
        return "el ciclista" + this.nombre + "con energia de " + this.energia + "esta intentando escapar " + this.escapa + " a estos km de meta " + this.km + " tiene estos bidones " + this.bidones + " va a una velocidad de " + this.velocidad + " y tiene un novel de hidratacion " + this.hidratacion;
    }

}
