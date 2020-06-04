package DropDown;

import Base.BaseTests;
import Pages.LoginPage;
import Pages.SecureAreaPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTest extends BaseTests {

    @Test
    public void testSelectedoption(){
        var dropdownPage = homePage.clickDropDown();
        String option = "Option 1";

        dropdownPage.selectFromDropDown(option);
        var selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(),1,"You selected more");
        assertTrue(selectedOptions.contains(option), "Option not there");
    }

}
