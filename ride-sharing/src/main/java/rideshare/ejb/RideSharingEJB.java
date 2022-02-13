package rideshare.ejb;


import feedback.ejb.ReviewEJB;
import payment.ejb.PaymentEJB;
import ridesharing.ejb.TripEJB;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class RideSharingEJB { // sequential component composition
    @EJB
    private TripEJB tripEJB;
    @EJB
    private PaymentEJB paymentEJB;
    @EJB
    private ReviewEJB reviewEJB;

    public String operateRideShare() { //ideally various data regarding the ride is passed as parameter, incompatibility in operation or parameter would require glue code
        // initiate trip with the passed parameters using tripEJB. That component will further require components handling live tracking
        // after the trip has been completed the payment responsibility is handled by the paymentEJB. Payment logic of cash or using gateways is handled here.
        // After transaction the rider/ driver feedback is maintained using the reviewEJB. After feedback necessary personality trait calculations aer also done here.
        return "Happy Traveling";
    }
}

