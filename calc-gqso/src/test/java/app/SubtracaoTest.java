package app;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtracaoTest {

    Soma soma;

    @BeforeEach
    public void setup(){
        subratacao = new Subratacao();
    }

    @Test
    public void testSubtracao_ok(){
        
        assertEquals(1, subtracao.rotaSubtracao(3, 2));
    }
}