/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema.pkg5.teoria;

/**
 *
 * @author alumno
 */
public class Bicicleta {
    //atributos
    private int ruedas;
    private String manillar;
    private String pedales;
    private String frenos;
    private boolean estaPedaleando;
    
    private static int numBicicletas = 0;
    
    
    //constructores
    //por defecto
    public Bicicleta () {
        this.ruedas = 0;
        this.manillar = "";
        this.pedales = "";
        this.frenos = "";
        this.estaPedaleando = false;
        
        //incremento el valor del atributo estatico
        incrementarNumBicicletas();
    }
    public Bicicleta (int ruedas, String manillar, String pedales, String frenos, boolean estaPedalenado) {
        this.ruedas = ruedas;
        this.manillar = manillar;
        this.pedales = pedales;
        this.frenos = frenos;
        this.estaPedaleando = estaPedaleando;
        
        //incremento el valor del atributo estatico
        incrementarNumBicicletas();
    }
    
    //getters y setters
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
    public int getRuedas () {
        return this.ruedas;
    }
    public void setManillar(String manillar) {
        this.manillar = manillar;
    }
    public String getManillar () {
        return this.manillar;
    }
    public void setPedales (String pedales) {
        this.pedales = pedales;
    }
    public String getPedales () {
        return this.pedales;
    }
    public void setFrenos(String frenos) {
        this.frenos = frenos;
    }
    public String getFrenos () {
        return this.frenos;
    }
    public void setEstaPedaleando(boolean estaPedaleando) {
        this.estaPedaleando = estaPedaleando;
    }
    public boolean getEstaPedaleando () {
        return this.estaPedaleando;
    }
    public int getNumBicicletas () {
        return this.numBicicletas;
    }
    //metodos
    private void acelerar () {
        System.out.println("acelerando");
    }
    private static void incrementarNumBicicleta () {
        numBicicletas++;
    }

    //to string
    @Override
    public String toString() {
        return "mi bicicleta tiene" + this.ruedas + ", un manillar " +this.manillar + ", pedales" + this.pedales + " y ahora ¿estoy pedaleando? " + this.estaPedaleando;
     }
}
