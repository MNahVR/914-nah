package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTest {
  @Test
  public void welcome() {
    Controlador controlador = new Controlador();
    assertEquals("Welcome to Jooby!", controlador.Dizoi());
  }
}
