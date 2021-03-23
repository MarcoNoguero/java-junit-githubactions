import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    public void checkSuma(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.suma(1,2);
        assertEquals(3,resultado);
    }
    
}