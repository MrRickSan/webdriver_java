package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    private WebDriver driver;
    private By emailInput = By.id("email");
    private By submitbutton = By.id("form_submit");

    public ForgotPasswordPage (WebDriver driver) {
        this.driver = driver;
    }

    public void setEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    public EmailSentPage clickRetrievePassword() {
        driver.findElement(submitbutton).click();
        return new EmailSentPage(driver);
    }

    public EmailSentPage retrievePassword(String email){
        setEmail(email);
        return clickRetrievePassword();
    }
}
