/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;
import java.util.Scanner;
/**
 *
 * @author jorge
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // El usuario elige cuántos empleados introducir [2]
        System.out.print("¿Cuántos empleados desea introducir? ");
        int cantidad = entrada.nextInt();
        entrada.nextLine();
        
        // Creamos el array de objetos de la clase Empleado [1]
        Empleado[] listaEmpleados = new Empleado[cantidad];

        // Bucle para rellenar la información de cada empleado [1, 2]
        for (int i = 0; i < listaEmpleados.length; i++) {
            System.out.println("- EMPLEADO " + (i + 1) + " -");
            
            System.out.print("Introduzca el nombre del empleado: ");
            String nombre = entrada.nextLine();
            
            System.out.print("¿Cuántas horas trabajó este mes? ");
            int horas = entrada.nextInt();
            
            System.out.print("¿Cuál es su tarifa por hora de trabajo? ");
            double tarifa = entrada.nextDouble();

            // Instanciamos el objeto y lo metemos en el array [1]
            listaEmpleados[i] = new Empleado(nombre, horas, tarifa);
            System.out.println("EMPLEADO " + (i + 1) + " ALMACENADO CON ÉXITO –");
        }

        // Determinar y mostrar el sueldo bruto de cada empleado [1]
        System.out.println("SUELDO BRUTO DE LOS EMPLEADOS");
        for (Empleado emp : listaEmpleados) {
            if (emp != null) {
                emp.mostrarResultado();
            }
        }
    }
}
