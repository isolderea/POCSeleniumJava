package Login;

import Base.BaseTests;
import Pages.LoginPage;
import Pages.SecureAreaPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTests {

    @Test
    public void testLoginSuccesfull(){
        LoginPage loginPage = homePage.clickFormAuthentification();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.submitForm();
        assertTrue(secureAreaPage.getAlertText()
                        .contains("You logged into a secure area!"),
                      "This has failed because it is a test");
    }

}
