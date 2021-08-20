package app;

import io.jooby.annotations.*;
import io.jooby.exception.*;

public class Soma{
    @Path("/soma/{x}/{y}")
    @GET
       public Double rotaSoma(@PathParam double x, double y ) {
        try {
            Double z=0;
            Z=x+y;
            return z;
        } catch (NumberFormatException nfe) {
            throw new BadRequestException(z("Parâmetro inválido:\"%s\"", x,y));
        }
    }
}
