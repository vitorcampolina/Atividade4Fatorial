package fatorial;

import static org.junit.Assert.*;
import org.junit.Test;

public class TesteDeCalculadoraFatorial {

    @Test
    public void testFactorialOf0() {
        assertEquals(1, CalculadoraFatorial.factorial(0));
    }
    
    @Test
    public void testFactorialOf5() {
        assertEquals(120, CalculadoraFatorial.factorial(5));
    }
}
