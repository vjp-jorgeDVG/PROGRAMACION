/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imports;

/**
 *
 * @author alumno
 */
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.*;

import java.io.File;

public class Imports {

    public static void main(String[] args) {
        try {
            File archivo = new File("d:/empresaGroovy.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document documento = builder.parse(archivo);

            documento.getDocumentElement().normalize();

            NodeList listaEmpleados = documento.getElementsByTagName("empleado");

            for (int i = 0; i < listaEmpleados.getLength(); i++) {
                Node nodo = listaEmpleados.item(i);

                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    Element empleado = (Element) nodo;

                    String nombre = empleado.getElementsByTagName("nombre")
                                           .item(0).getAttributes()
                                           .getNamedItem("value").getTextContent();

                    String puesto = empleado.getElementsByTagName("puesto")
                                           .item(0).getAttributes()
                                           .getNamedItem("value").getTextContent();

                    String antiguedad = empleado.getElementsByTagName("antiguedad")
                                               .item(0).getAttributes()
                                               .getNamedItem("value").getTextContent();

                    System.out.println("\nEl empleado " + nombre);
                    System.out.println("\tocupa el puesto de: " + puesto);
                    System.out.println("\tcon : " + antiguedad + " año(s) de antigüedad");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}