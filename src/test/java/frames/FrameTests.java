package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test
    public void testWysiwyg() {
        var editorPage = homePage.clickWysiwygEditorPage();
        editorPage.clearTextArea();

        String text1 = "hello ";
        String text2 = "world";
        editorPage.sendTextToArea(text1);
        editorPage.increaseIdentation();
        editorPage.sendTextToArea(text2);
        assertEquals(editorPage.getTextFromEditor(), text1+text2,
                "Editor text incorrect");
    }
}
