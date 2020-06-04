package Waits;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DynamicLoadingTest extends BaseTests {

    @Test
    public void waitForLoadbarTest(){
        var dynamicPage = homePage.clickDynamicLoader().clickExample();
        dynamicPage.clickStart();
        assertEquals(dynamicPage.getLoadedText(),"Hello World!","Not the text you expected");
    }
}
