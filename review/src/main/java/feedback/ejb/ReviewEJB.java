package feedback.ejb;


import javax.ejb.Stateless;
import java.nio.charset.Charset;
import java.util.Random;

@Stateless
public class ReviewEJB {
    public void storeFeedback(String userId, String feedback){
        System.out.println(String.format("Feedback store for user %s: %s!", userId, feedback));
    }
}

