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
public class SumaPrimosCajaNegraTest {

    @Test
    void sumaHasta2_deberiaSer2() {
        assertEquals(2, SumaPrimos.sumaPrimos(2));
    }

    @Test
    void sumaHasta3_deberiaSer5() {
        assertEquals(5, SumaPrimos.sumaPrimos(3));
    }

    @Test
    void sumaHasta10_deberiaSer17() {
        assertEquals(17, SumaPrimos.sumaPrimos(10));
    }

    @Test
    void sumaHasta12_deberiaSer28() {
        assertEquals(28, SumaPrimos.sumaPrimos(12));
    }

    @Test
    void sumaHasta20_deberiaSer77() {
        assertEquals(77, SumaPrimos.sumaPrimos(20));
    }
}