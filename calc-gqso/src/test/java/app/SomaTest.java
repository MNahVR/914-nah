package app;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomaTest {

    Soma soma;

    @BeforeEach
    public void setup(){
        soma = new Soma();
    }

    @Test
    public void testSoma_ok(){
        
        assertEquals(5, soma.rotaSoma(3, 2));
    }
}