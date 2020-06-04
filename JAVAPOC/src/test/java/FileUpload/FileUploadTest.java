package FileUpload;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTests {

    @Test
    public void uploadFileTest(){
        var uploadFile = homePage.clickFileUpload();
        uploadFile.uploadFile("C:\\Users\\Ioan\\IdeaProjects\\JAVAPOC\\resources\\chromedriver.exe");
        assertEquals(uploadFile.getUploadedFileName(),"chromedriver.exe","The uploaded file matches");
    }
}
