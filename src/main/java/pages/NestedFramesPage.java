package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

    private WebDriver driver;
    private By topFrame = By.name("frame-top");
    private By bottomFrame = By.name("frame-bottom");
    private By leftFrame = By.name("frame-left");
    private By textArea = By.tagName("body");

    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTextFromLeftFrame() {
        switchToLeftFrame();
        String text = getFrameText();
        switchToParentFrame();
        switchToParentFrame();
        return text;
    }

    public String getTextFromBottomFrame() {
        switchToBottomFrame();
        String text = getFrameText();
        switchToParentFrame();
        return text;
    }

    private void switchToTopFrame() {
        driver.switchTo().frame(driver.findElement(topFrame));
    }

    private void switchToBottomFrame() {
        driver.switchTo().frame(driver.findElement(bottomFrame));
    }

    private void switchToLeftFrame() {
        switchToTopFrame();
        driver.switchTo().frame(driver.findElement(leftFrame));
    }

    private void switchToParentFrame() {
        driver.switchTo().parentFrame();
    }

    private String getFrameText() {
        return driver.findElement(textArea).getText();
    }
}
