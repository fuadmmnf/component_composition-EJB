package route.ejb;


import javax.ejb.Stateless;
import java.nio.charset.Charset;
import java.util.Random;

@Stateless
public class RouteEJB {


    public void obtainRoute(String src, String dest){
        // calculates route between two points
    }

    public void calculateEstimates(String src, String dest){ // ideally return object or array of numbers
        // calculate estimated time, distance, cost
    }
}

