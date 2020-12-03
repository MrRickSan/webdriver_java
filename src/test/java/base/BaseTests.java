package base;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {

    private WebDriver driver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        // e.g. Iphone X size
        // driver.manage().window().setSize(new Dimension(375, 812));
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());

        // closes the browser and ends the session.
        // p.s. close() closes the window but not necessarily the entire session.
        driver.quit();
    }

    public static void main(String[] args) {
        BaseTests test = new BaseTests();
        test.setUp();
    }
}
