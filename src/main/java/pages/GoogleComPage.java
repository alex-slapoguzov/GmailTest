package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleComPage {

    private WebDriver driver;

    public GoogleComPage(WebDriver driver){this.driver = driver;}



        @FindBy(xpath = "//div/a[@href=\"https://mail.google.com/mail/?tab=wm\"]")
        private WebElement emailButton;



        private void clickMailButton(){
            emailButton.click();
        }

    }

