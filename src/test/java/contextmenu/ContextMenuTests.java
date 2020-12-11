package contextmenu;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testRightClick() {
        var contextMenuPage = homePage.clickContextMenuPage();

        contextMenuPage.triggerContextMenu();
        assertEquals(contextMenuPage.alert_getText(), "You selected a context menu",
                "Context Menu text incorrect");
        contextMenuPage.alert_accept();
    }
}
