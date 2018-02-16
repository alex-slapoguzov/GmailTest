package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class GoogleComPage {

    private WebDriver driver;


    public GoogleComPage(WebDriver driver) {
        this.driver = driver;
    }


    By emailButton = By.xpath("//div/a[@href=\"https://mail.google.com/mail/?tab=wm\"]");


    public AccountsGoogleComPage clickMailButton() {
        driver.findElement(emailButton).click();
        return new AccountsGoogleComPage(driver);
    }

}

