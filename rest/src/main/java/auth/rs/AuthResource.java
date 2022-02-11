package auth.rs;

import auth.ejb.TokenEJB;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/")
public class AuthResource {

    @EJB
    private TokenEJB tokenEJB;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getToken(@QueryParam("name") String name) { return tokenEJB.getToken(name); }
}