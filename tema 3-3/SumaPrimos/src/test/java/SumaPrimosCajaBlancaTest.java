/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.mycompany.sumaprimos.SumaPrimos;

/**
 *
 * @author alumno
 */
public class SumaPrimosCajaBlancaTest {

    @Test
    void pruebaCaminoMinimoUnaIteracion() {
        // Cubre do-while con una sola iteración
        assertEquals(2, SumaPrimos.sumaPrimos(2));
    }

    @Test
    void pruebaNumeroPrimoYNoPrimo() {
        // Cubre ramas donde primo queda true y false
        // Resultado real: 2 + 3 + 4 = 9
        assertEquals(9, SumaPrimos.sumaPrimos(4));
    }

    @Test
    void pruebaMultiplesIteraciones() {
        // Cubre múltiples iteraciones del do-while
        // Resultado real: 2+3+4+5 = 14
        assertEquals(14, SumaPrimos.sumaPrimos(5));
    }

    @Test
    void pruebaNumeroMayor() {
        // Cubre ejecución más extensa
        // 2+3+4+5+6+7+8+9+10 = 54
        assertEquals(54, SumaPrimos.sumaPrimos(10));
    }
}
