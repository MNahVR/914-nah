package app;

import io.jooby.annotations.*;

@Path("/")
public class Controlador {

  @GET
  public String Dizoi() {
    return "Bem-vidos(as) a API calculadora!";
  }
}