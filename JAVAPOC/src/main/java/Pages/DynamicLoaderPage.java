package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoaderPage {

    private WebDriver driver;
    private String linkXpath_Format = ".//a[contains(text(), '%s')]";
    private By link_Example1 = By.xpath(String.format(linkXpath_Format, "Example 1"));

    public DynamicLoaderPage(WebDriver driver){
        this.driver = driver;
    }

    public DynamicLoaderExamplePage1 clickExample(){
        driver.findElement(link_Example1).click();
        return new DynamicLoaderExamplePage1(driver);
    }
}
