package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {

    private WebDriver driver;
    private By sliderInput = By.cssSelector(".sliderContainer input");
    private By resultField = By.id("range");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setSliderValue(String value) {
        while (!getSliderValue().equals(value))
            driver.findElement(sliderInput).sendKeys(Keys.ARROW_RIGHT);
    }

    public String getSliderValue() {
        return driver.findElement(resultField).getText();
    }
}