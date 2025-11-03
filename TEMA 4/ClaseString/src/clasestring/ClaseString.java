/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasestring;

/**
 *
 * @author alumno
 */
public class ClaseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar una variable de tipo string
        String nombre;
        //inciamos la variable
        nombre = "Manolo";
        nombre1 = "manolo"
        //declarar e inciar la variable
        String apellido = "Arsanaliev";
        //pedir cadena a usuario
        Scanner entrada = new Scanner (System.in);
        System.out.print("¿Cuantos trofeos tienes en el Clash Royale: ");
        String trofeos = entrada.nextLine();
        System.out.println("Tienes " + trofeos);
        
        //comparar dos valores (.equeals() e , equalsIgnoreCase();
        if(nombre.equals(apellido)) {
            System.out.println("son iguales ");
        } else {
            System.out.println("son distintos");
        }
        // si usamos ignorecase serian iguales nombre y nombre1
        if(nombre.equalsIgnoreCase(apellido)) {
            System.out.println("son iguales ");
        } else {
            System.out.println("son distintos");
        }
        
        
        
        
    }
    
}
