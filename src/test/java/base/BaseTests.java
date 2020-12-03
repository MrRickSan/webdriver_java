package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests {

    private WebDriver driver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        // e.g. Iphone X size
        // driver.manage().window().setSize(new Dimension(375, 812));
        // driver.manage().window().maximize();

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        WebElement shiftingContent = driver.findElement(By.linkText("Shifting Content"));
        shiftingContent.click();

        WebElement menu = driver.findElement(By.linkText("Example 1: Menu Element"));
        menu.click();

        List<WebElement> li = driver.findElements(By.xpath("//ul/li"));
        System.out.println(li.size());

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
