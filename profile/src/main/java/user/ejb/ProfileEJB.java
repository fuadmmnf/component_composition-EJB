package user.ejb;


import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

@Stateless
public class ProfileEJB {

    public String getUserRole(String userId) {
        return (new ArrayList<String>(Arrays.asList("Admin", "Driver", "Rider"))).get(new Random().nextInt(3));
    }

    public String getProfileDetails(String userID){
        return String.format("Fetching profile detials of ID %s!", userID);
    }

    public void createProfile(){

    } // and other crud operations for different users
}

