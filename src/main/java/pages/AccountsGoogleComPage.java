package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountsGoogleComPage {

   private WebDriver driver;
   public AccountsGoogleComPage(WebDriver driver){
       this.driver = driver;
   }

    @FindBy(xpath = "//div/input[@id=\"identifierId\"]")
    private WebElement emailUserField;

    @FindBy(xpath = "//input[@name = \"password\"]")
    private WebElement passwordUserField;

    @FindBy(xpath = "//content/span[@class=\"RveJvd snByac\"]")
    private WebElement nextButton;


    private void typeEmailUserField(){
        emailUserField.clear();
        emailUserField.sendKeys("IvanovTestEmail@gmail.com");
    }

    private void typePasswordField(){
        passwordUserField.clear();
        passwordUserField.sendKeys("Qwerty123456");
    }

    private void clickNextButton(){
        nextButton.click();
    }

}
