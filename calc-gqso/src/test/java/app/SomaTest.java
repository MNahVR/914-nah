package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomaTest {
    @Test
    public void testSoma_ok(){
        Soma soma = new Soma();
        
        assertEquals(5, soma.rotaSoma(3, 2));
    }
}