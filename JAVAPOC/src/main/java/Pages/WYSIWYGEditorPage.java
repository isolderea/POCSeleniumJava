package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {

    private WebDriver driver;
    private String editorIFrame = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By decreaseIncrementButton = By.cssSelector("#mceu_12 button");


    public WYSIWYGEditorPage(WebDriver driver){
        this.driver = driver;
    }

    private void swithToIFrame(){
        driver.switchTo().frame(editorIFrame);
    }

    public void clearTextArea(){
        swithToIFrame();
        driver.findElement(textArea).clear();
        swithToMainArea();
    }

    public void setTextArea(String text){
        swithToIFrame();
        driver.findElement(textArea).sendKeys(text);
        swithToMainArea();
    }


    public String getTextArea(){
        swithToIFrame();
        String valueTextArea =  driver.findElement(textArea).getText();
        swithToMainArea();
        return valueTextArea;
    }


    public void clickDecreaseInremendtButton(){
        driver.findElement(decreaseIncrementButton).click();
    }

    private void swithToMainArea(){
        driver.switchTo().parentFrame();
    }
}
