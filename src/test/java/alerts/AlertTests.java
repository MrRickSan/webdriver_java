package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert() {
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerAlert();
        alertPage.alert_clickToAccept();
        assertEquals(alertPage.getResult(), "You successfuly clicked an alert",
                "Result text incorrect");
    }

    @Test
    public void testDismissAlert() {
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerConfirm();
        assertEquals(alertPage.alert_getText(), "I am a JS Confirm",
                "Alert text incorrect");
        alertPage.alert_clickToDismiss();
        assertEquals(alertPage.getResult(), "You clicked: Cancel",
                "Result text incorrect");
    }

    @Test
    public void testPromptAlert() {
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerPrompt();

        String text = "automation";
        alertPage.alert_setInput(text);
        alertPage.alert_clickToAccept();
        assertEquals(alertPage.getResult(), "You entered: " + text, "Result text incorrect"); // "You entered: automation"
    }
}
