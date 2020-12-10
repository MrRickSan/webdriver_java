package slider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTests extends BaseTests {

    @Test
    public void testHorizontalSlider() {
        var sliderPage = homePage.clickHorizontalSlider();

        String value = "4";
        sliderPage.setSliderValue(value);

        assertEquals(sliderPage.getSliderValue(), value, "Slider value is incorrect");
    }
}
