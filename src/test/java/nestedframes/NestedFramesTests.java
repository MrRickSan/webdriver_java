package nestedframes;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NestedFramesTests extends BaseTests {

    @Test
    public void testNestedFrames() {
        var nestedFramesPage = homePage.clickFrames().clickNestedFrames();
        assertEquals(nestedFramesPage.getTextFromLeftFrame(), "LEFT", "Left frame text incorrect");
        assertEquals(nestedFramesPage.getTextFromBottomFrame(), "BOTTOM", "Bottom frame text incorrect");
    }
}
