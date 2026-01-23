/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author jorge
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        
        // ----------------------------------------------------
        // PARTE 1: Creación de objetos y prueba de métodos (Instanciación normal)
        // ----------------------------------------------------
        
        System.out.println("***** PRUEBA DE INSTANCIACIÓN NORMAL *****");
        
        // 1. Círculo
        Circulo circuloRojo = new Circulo(5.0, "Rojo");
        circuloRojo.mostrarDatos();
        
        // 2. Rectángulo
        Rectangulo rectanguloAzul = new Rectangulo(4.0, 6.0, "Azul");
        rectanguloAzul.mostrarDatos();
        
        // 3. Cuadrado
        Cuadrado cuadradoVerde = new Cuadrado(8.0, "Verde");
        cuadradoVerde.mostrarDatos();

        // 4. Triángulo Rectángulo (Ejemplo 1: Escaleno, Base 3, Altura 4, Hipotenusa 5)
        TrianguloRectangulo trEscaleno = new TrianguloRectangulo(3.0, 4.0, "Amarillo");
        trEscaleno.mostrarDatos();

        // Triángulo Rectángulo (Ejemplo 2: Isósceles, Base 5, Altura 5, Hipotenusa ~7.07)
        TrianguloRectangulo trIsosceles = new TrianguloRectangulo(5.0, 5.0, "Morado");
        System.out.println("\n--- Triángulo Rectángulo Isósceles ---");
        System.out.println("Tipo: " + trIsosceles.determinarTipoTriangulo());
        System.out.println("Perímetro: " + trIsosceles.calcularPerimetro());
        
        
        // ----------------------------------------------------
        // PARTE 2: Polimorfismo
        // ----------------------------------------------------
        
        System.out.println("\n***** PRUEBA DE POLIMORFISMO *****");
        
        // Declaramos una variable de tipo FiguraGeometrica (Superclase abstracta) [7]
        FiguraGeometrica figura;
        
        // Asignamos un objeto Círculo
        figura = new Circulo(10.0, "Naranja"); // figura ahora referencia a un objeto Círculo [6]
        System.out.println("\nFigura: " + figura.getColor() + " Círculo");
        // Invocamos métodos abstractos implementados en la subclase:
        System.out.println("Área (Polimorfismo): " + figura.calcularArea());
        System.out.println("Perímetro (Polimorfismo): " + figura.calcularPerimetro());
        // Nota: No se puede llamar a métodos específicos de Circulo si la variable es FiguraGeometrica [7, 8]
        // figura.mostrarDatos(); // Esto fallaría si mostrarDatos no estuviera en FiguraGeometrica

        // Reasignamos a un objeto Rectángulo
        figura = new Rectangulo(7.0, 3.0, "Cian"); 
        System.out.println("\nFigura: " + figura.getColor() + " Rectángulo");
        System.out.println("Área (Polimorfismo): " + figura.calcularArea());
        System.out.println("Perímetro (Polimorfismo): " + figura.calcularPerimetro());
        
        // Reasignamos a un objeto Cuadrado
        figura = new Cuadrado(6.0, "Gris");
        System.out.println("\nFigura: " + figura.getColor() + " Cuadrado");
        System.out.println("Área (Polimorfismo): " + figura.calcularArea());
        System.out.println("Perímetro (Polimorfismo): " + figura.calcularPerimetro());
        
        // Reasignamos a un objeto TrianguloRectangulo
        figura = new TrianguloRectangulo(8.0, 15.0, "Marrón"); 
        System.out.println("\nFigura: " + figura.getColor() + " Triángulo Rectángulo");
        System.out.println("Área (Polimorfismo): " + figura.calcularArea());
        System.out.println("Perímetro (Polimorfismo): " + figura.calcularPerimetro());
        
        // El polimorfismo permite reutilizar la variable 'figura' para llamar a la implementación correcta de calcularArea/calcularPerimetro, 
        // promoviendo la reutilización de código [9].
        
        // Ejemplo de error si intentamos llamar a un método exclusivo desde la superclase:
        // figura.calcularHipotenusa(); // ERROR, este método solo existe en TrianguloRectangulo/Triangulo.
    }
}