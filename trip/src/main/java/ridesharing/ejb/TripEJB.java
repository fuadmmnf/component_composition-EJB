package ridesharing.ejb;


import location.ejb.LocationEJB;
import route.ejb.RouteEJB;
import user.ejb.ProfileEJB;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class TripEJB { // hierrarchical component composition
    @EJB
    private ProfileEJB profileEJB;
    @EJB
    private LocationEJB locationEJB;
    @EJB
    private RouteEJB routeEJB;

    public void initTrip() { //ideally trip object should be returned, for simplicity string returned
        // get rider and driver by passing their user ID form profileEJB
        // get location of the respected user IDs from locationEJB
        // using locations of the users, calculate the route between them. This is different from sequential call because the routeEJB requires the locationEJB's result from it's provides interface
        // create trip instance from the user IDS and route, also bind the location to the trip
    }
}

