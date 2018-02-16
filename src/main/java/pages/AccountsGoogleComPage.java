package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AccountsGoogleComPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public AccountsGoogleComPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    By emailUserField = By.xpath("//div/input[@id=\"identifierId\"]");
    By passwordUserField = By.xpath("//input[@type=\"password\"]");
    By nextButton = By.xpath("//content/span[@class=\"RveJvd snByac\"]");


    public void typeEmailUserField(String email) {
        wait.until(ExpectedConditions.presenceOfElementLocated(emailUserField));
        WebElement field = driver.findElement(emailUserField);
        field.click();
        field.clear();
        field.sendKeys(email);
    }

    public void typePasswordField(String password) {
        wait.until(ExpectedConditions.elementToBeClickable(passwordUserField));
        WebElement field = driver.findElement(passwordUserField);
        field.click();
        field.clear();
        field.sendKeys(password);
    }

    public void clickNextButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(nextButton));
        driver.findElement(nextButton).click();
    }


    public MailGoogleCom clickNextButtonAndGoToNextPage() {
        driver.findElement(nextButton).click();
        return new MailGoogleCom(driver);
    }


}


