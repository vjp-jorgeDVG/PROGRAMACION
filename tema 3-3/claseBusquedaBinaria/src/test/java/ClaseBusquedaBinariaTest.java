/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

/**
 *
 * @author jorge
 */
public class ClaseBusquedaBinariaTest {

    ClaseBusquedaBinaria buscador;

    @BeforeEach
    void setUp() {
        buscador = new ClaseBusquedaBinaria();
    }

    @Test
    void testNumeroInicio() {
        assertEquals(0, buscador.busquedaBinaria(1));
    }

    @Test
    void testNumeroMedio() {
        assertEquals(4, buscador.busquedaBinaria(5));
    }

    @Test
    void testNumeroFinal() {
        assertEquals(9, buscador.busquedaBinaria(10));
    }

    @Test
    void testNumeroNoExisteMenor() {
        assertEquals(-1, buscador.busquedaBinaria(0));
    }

    @Test
    void testNumeroNoExisteMayor() {
        assertEquals(-1, buscador.busquedaBinaria(20));
    }
}