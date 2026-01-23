/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    
 public final static int SEMANAS = 4;
 public final static int DIAS = 7;
 
    public static void main(String[] args) {

        //1º. INTRODUCZCO LAS VARIABLES Y LAS MATRICES NECESARIAS
  
        float [][] temperaturas = new float [4][7];
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        float tmpMedia = SEMANAS*DIAS/28;
        
        //2º. CREAMOS EL MENU
        
        do{ 
        System.out.println("Introduce una opción: ");
        System.out.println("1.Rellenar las temperaturas.");
        System.out.println("2.Mostrar las temperaturas.");
        System.out.println("3.Visualizar la temperatura media del mes.");
        System.out.println("4.Día o días más calurosos del mes.");
        System.out.println("5.Salir del programa.");
        
        Scanner scanner = new Scanner(System.in);
        
        int menu = scanner.nextInt();
        int opcion = scanner.nextInt();
        // INTRODUCIMOS EL MENU DENTRO DE UN DO-WHILE PARA QUE NUESTRO PROGRAMA NO TERMINE Y CIERRE, DE ESTE MODO MANTENEMOS LAS VARIABLES EN LAS MATRICEs
        
        switch (menu) {
    case 1 -> {     //RELLENO LAS TEMPERATURAS CON EL SCANNER DESPLAZANDO LA MATRIZ CADA VEZ QUE INTRODUZCO UN VALOR 
        System.out.println("Rellenar las temperaturas.");
        for (int i = 0; i < SEMANAS; i++) {
            for (int j = 0; j < DIAS; j++) {
                System.out.print("Semana " + (i + 1) + ", " + diasSemana[j] + ": ");
                temperaturas[i][j] = scanner.nextFloat();
            }
        }
    }
    case 2 -> {     //PONGO UN SOUT PARA MOSTRAR LAS TEMPERATURAS DE TODO EL MES
        System.out.println(" Mostrar las temperaturas.");
        for (int i = 0; i < SEMANAS; i++) {
            System.out.println("Semana " + (i + 1));
            for (int j = 0; j < DIAS; j++) {
                System.out.println(diasSemana[j] + ": " + temperaturas[i][j]);
            }
        }
    }
    case 3 -> {
        System.out.println("Visualizar la temperatura media del mes."); 
        for (int i = 0; i < SEMANAS; i++) {
            for (int j = 0; j < DIAS; j++) {
                System.out.println("La temperatura media es: " + tmpMedia);
                }
            }
        }
        
    case 4 -> System.out.println("Día o días más calurosos del mes.");
    case 5 -> System.out.println("Salir del programa.");
    
    }while (opcion != 5);
    
        
    
        }

