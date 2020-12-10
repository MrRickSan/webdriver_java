package slider;

import base.BaseTests;
import org.testng.annotations.Test;

public class HorizontalSliderTests extends BaseTests {

    @Test
    public void testHorizontalSlider() {
        var sliderPage = homePage.clickHorizontalSlider();
        sliderPage.setSliderValue("4");
    }
}
