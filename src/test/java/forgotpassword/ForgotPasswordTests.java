package forgotpassword;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void testForgotPassword() {
        var forgotPasswordPage = homePage.clickForgotPassword();
        var emailSentPage = forgotPasswordPage.retrievePassword("odin@asgard.com");
        assertEquals(emailSentPage.getEmailSentText(),
                "Your e-mail's been sent!", "Text is incorrect");
    }
}
