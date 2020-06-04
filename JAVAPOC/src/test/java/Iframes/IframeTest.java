package Iframes;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class IframeTest extends BaseTests {

    @Test
    public void IframeTest(){
        var editorPage = homePage.clickWYSIWYGEditor();
        editorPage.clearTextArea();
        editorPage.setTextArea("Hello ");
        editorPage.clickDecreaseInremendtButton();
        editorPage.setTextArea("World");
        assertEquals(editorPage.getTextArea(),"Hello World","Your text is not in the area");

    }
}
