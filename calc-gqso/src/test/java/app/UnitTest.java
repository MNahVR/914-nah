package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTest {
  @Test
  public void welcome() {
    Controlador controlador = new Controlador();
    assertEquals("Bem-vidos(as) a API calculadora!", controlador.Dizoi());
  }
}
