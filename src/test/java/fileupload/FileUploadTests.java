package fileupload;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testUploadFile() {
        var fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.uploadFile("/Users/mrricksan/code/java/webdriver_java/resources/chromedriver");
        assertEquals(fileUploadPage.getUploadedFiles(), "chromedriver", "Uploaded file incorrect");
    }
}
