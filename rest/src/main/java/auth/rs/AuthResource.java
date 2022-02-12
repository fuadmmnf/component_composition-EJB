package auth.rs;

import user.ejb.UserManagementEJB;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/")
public class AuthResource {

    @EJB
    private UserManagementEJB userManagementEJB;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getToken(@QueryParam("name") String name) { return userManagementEJB.getTokenEJB().getToken(name); }
}