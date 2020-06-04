package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    private WebDriver driver;
    private By triggerAlertButton = By.xpath("//button[text()='Click for JS Alert']");
    private By triggerConfirmButton = By.xpath("//button[text()='Click for JS Confirm']");
    private By triggerInputButton = By.xpath("//button[text()='Click for JS Prompt']");
    private By resultAlert = By.id("result");

    public AlertsPage(WebDriver driver){
        this.driver = driver;
    }

    public void triggerJSAlert(){
        driver.findElement(triggerAlertButton).click();
    }

    public void triggerTextAlert(){
        driver.findElement(triggerConfirmButton).click();
    }

    public void triggerInputAlert(){
        driver.findElement(triggerInputButton).click();
    }

    public void clickToAccept(){
        driver.switchTo().alert().accept();
    }

    public void clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }

    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }

    public String getResult(){
        return driver.findElement(resultAlert).getText();
    }

    public void addTextToAlert(String input){
        driver.switchTo().alert().sendKeys(input);
    }
}
