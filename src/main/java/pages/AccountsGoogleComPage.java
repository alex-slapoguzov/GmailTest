package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AccountsGoogleComPage {

    private WebDriver driver;
    public AccountsGoogleComPage(WebDriver driver){
        this.driver = driver;
    }

    By emailUserField = By.xpath("//div/input[@id=\"identifierId\"]");
    By passwordUserField = By.xpath("//input[@type=\"password\"]");
    By nextButton = By.xpath("//content/span[@class=\"RveJvd snByac\"]");


    public void typeEmailUserField(String email){
       WebElement field = driver.findElement(emailUserField);
       field.click();
       field.clear();
       field.sendKeys(email);
    }

    public void typePasswordField(String password){
        WebElement field = driver.findElement(passwordUserField);
        field.click();
        field.clear();
        field.sendKeys(password);
    }

    public void clickNextButton(){
        driver.findElement(nextButton).click();
    }


    public MailGoogleCom clickNextButtonAndGoToNextPage(){
        driver.findElement(nextButton).click();
        return new MailGoogleCom(driver);
    }


}


