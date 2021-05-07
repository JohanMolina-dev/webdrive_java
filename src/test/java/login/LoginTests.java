package login;

import base.BaseTest;
import org.testng.annotations.Test;
import page.AuthenticationPage;
import page.SecureArea;

import static org.testng.Assert.*;

public class LoginTests extends BaseTest {
    @Test
    public void testSuccessfulLogin(){
      AuthenticationPage authenticationPage = homePage.clickFormsAuthentication();
      authenticationPage.usernameSelected("tomsmith");
      authenticationPage.passwordSelected("SuperSecretPassword!");
      SecureArea secureArea =  authenticationPage.clicLogin();
        assertTrue(secureArea.getAlertText().contains("You logged into a secure area!")
                ,"Error");

    }
}
