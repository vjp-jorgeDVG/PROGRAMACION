/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio20 {
    public final static String RESPUESTA1 = "Madrid";
    public final static String RESPUESTA2 = "Colón";
    
    public final static String PREGUNTA1 = "¿Cúal es la capital de España";
    public final static String PREGUNTA2 = "¿Quién descubrió América?";
    
    public final static int PUNTUACION = 5;
    
    public static String pedirRespuesta(){
        Scanner entrada = new Scanner (System.in);
        String respuestaUsuario = entrada.nextLine();
        return respuestaUsuario;
    }
    /**METODO QUE COMPARA ES FALSA O CORRECTA
     * 
     * @param respuestaUsuario
     * @param respuestaCorrecta
     * @return 
     */
    public static boolean comprobarRespuesta(String respuestaUsuario, String respuestaCorrecta) {
        boolean correcto;
        
        if(respuestaUsuario.equalsIgnoreCase(respuestaCorrecta)) {
            correcto = true;
        } else {
            correcto = false;
        }
        return correcto;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int puntuacionFinal = 0;
        String respuesta;
        
        System.out.println("EXAMEN DE CULTURA GENERAL");
        System.out.println(PREGUNTA1);
        respuesta = pedirRespuesta();
        
        if(comprobarRespuesta(respuesta, RESPUESTA1)) {
            System.out.println("muy bien, respuesta correcta.");
            puntuacionFinal += PUNTUACION;
        } else {
            System.out.println("la respuesta correcta seria: " + RESPUESTA1);
        }
        //segunda pregunta
        System.out.println(PREGUNTA2);
        respuesta = pedirRespuesta();
        
        if(comprobarRespuesta(respuesta, RESPUESTA2)) {
            System.out.println("muy bien, respuesta correcta.");
            puntuacionFinal += PUNTUACION;
        } else {
            System.out.println("la respuesta correcta seria: " + RESPUESTA2);
        }
        System.out.println("NOTA DEL EXAMEN " + puntuacionFinal);
    }
    
}
