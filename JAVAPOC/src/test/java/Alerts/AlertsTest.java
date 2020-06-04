package Alerts;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertsTest extends BaseTests {

    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickJavascriptAlerts();
        alertsPage.triggerJSAlert();
        alertsPage.clickToAccept();
        assertEquals(alertsPage.getResult(),"You successfuly clicked an alert","Failed assert Ioan");
    }

    @Test
    public void textAlertText(){
        var alertsPage = homePage.clickJavascriptAlerts();
        alertsPage.triggerTextAlert();
        assertEquals(alertsPage.getAlertText(),"I am a JS Confirm","The alert contains a different text");
        alertsPage.clickToDismiss();
    }

    @Test
    public void textAlertInput(){
        var alertsPage = homePage.clickJavascriptAlerts();
        alertsPage.triggerInputAlert();

        var input = "Ioan POC Java";

        alertsPage.addTextToAlert(input);
        alertsPage.clickToAccept();
        assertEquals(alertsPage.getResult(),"You entered: " + input,"Your entered text does not match the result");
    }
}
