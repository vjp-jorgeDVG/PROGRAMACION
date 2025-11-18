/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author alumno
 */
public class main {
    public class jugador extends personaje {
    //ATRIBUTOS
    public String inventario;
    
    //CONSTRUCTORES
    public jugador ()  {
            //llamamos al constructor por defecto de personaje
            super();
            this.inventario = "";       
    }
    public jugador (int vida, String inventario) {
        super(vida);
        this.inventario = inventario;
    }
    }
    //GETTER Y SETTERS
    public String getInventario() {
        return this.inventario;    
    }
    public void setInventario (String inventario) {
        this.inventario = inventario;
        
    }
    //METODOS
    public void reccoger (String inventario){
        System.out.println("recogiendo" + objeto + "...");
    }
    
    //override
    @Override
    public String toString() {
        return super.toString() + "y es un jugador con" + this.inventario;
    }
}
