/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entrenamiento;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Entrenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        int series;
        int numSeries;

        int pulsaciones;
        int contador2 = 0;
        float peso;
        float altura;
        float imc;
        int aux = 0;
        int suma = 0;
        int segundosSeries = 0;

        do {
            System.out.println("introduce un valor para el menu");
            System.out.println("1. series de velocidad");
            System.out.println("2. entrenamiento de resistencia");
            System.out.println("3. calculadora de IMC");
            System.out.println("4. salir");
            System.out.println(" ");
            System.out.println(" ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("cuántas series de 100 metros va a realizar");
                    series = sc.nextInt();

                    for (numSeries = 1; numSeries <= series; numSeries++) {
                        System.out.println("cuanto segundos has tardado en la serie " + numSeries);
                        segundosSeries = sc.nextInt();
                        suma = suma + segundosSeries;
                    }
                    System.out.println("el tiempo empleado a sido de " + suma);

                    break;
                case 2:
                    for (pulsaciones = 0; pulsaciones < 170) {
                        System.out.println("cuales son tus pulsaciones");
                        pulsaciones = sc.nextInt();
                    }
                    System.out.println("limite alcanzado, deten el entrenamiento");
                    break;
                case 3:
                    System.out.println("introduce tu peso");
                    peso = sc.nextFloat();
                    System.out.println("introduce tu altura");
                    altura = sc.nextFloat();

                    imc = peso / (altura * altura);

                    if (imc < 18.5) {
                        System.out.println("Menor de 18.5 – Bajo Peso");
                    } else if ((imc >= 18.5) && (imc < 25)) {
                        System.out.println("Menor de 18.5 – Bajo Peso");
                    } else if ((imc > 25) && (imc < 30)) {
                        System.out.println("Menor de 30 – Sobre peso.");
                    } else if (imc >= 30) {
                        System.out.println("Mayor o igual de 30 – Obesidad.");

                        break;
                    }
            }
        } while (menu != 4);
        System.out.println("HASTA PRONTO");
    }

}
