package auth.rs;


import rideshare.ejb.RideSharingEJB;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/rideshare")
public class RideSharingResource {

    @EJB
    private RideSharingEJB rideSharingEJB;

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String startDemoRide() { return rideSharingEJB.operateRideShare(); }
}