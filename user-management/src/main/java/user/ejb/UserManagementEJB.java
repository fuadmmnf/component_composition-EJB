package user.ejb;

import auth.ejb.TokenEJB;
import user.ejb.ProfileEJB;

import javax.ejb.EJB;
import javax.ejb.Stateless;


@Stateless
public class UserManagementEJB {
    @EJB
    private TokenEJB tokenEJB;

    @EJB
    private ProfileEJB profileEJB;


    public TokenEJB getTokenEJB() {
        return tokenEJB;
    }

    public ProfileEJB getProfileEJB() {
        return profileEJB;
    }
}

