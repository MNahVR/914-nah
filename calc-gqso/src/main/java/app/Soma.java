package app;

import io.jooby.annotations.*;
import io.jooby.exception.*;

public class Soma{
    @Path("/soma/{x}/{y}")
    @GET
       public String rotaSoma(@PathParam String x, String y ) {
        try {
            Double z = Double.parseDouble(x) + Double.parseDouble(y);
            return String.format("%.2f", z);
        } catch (NumberFormatException nfe) {
            throw new BadRequestException(String.format("Parâmetro inválido:\"%s\"", x,y));
        }
    }
}
