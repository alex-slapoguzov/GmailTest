package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MailGoogleCom {

    private WebDriver driver;
    private WebDriverWait wait;

    public MailGoogleCom(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }


    By writteButton = By.xpath("//div[@class=\"T-I J-J5-Ji T-I-KE L3\"]");
    By toWhomField = By.xpath("//tbody//textarea[@role=\"combobox\"]");
    By bodyOfTheLetterField = By.xpath("//div[@class=\"Am Al editable LW-avf\"]");
    By sendButton = By.xpath("//div[@data-tooltip-delay=\"800\"]");
    By inboxButton = By.xpath("//a[@href=\"https://mail.google.com/mail/?tab=wm#inbox\"]");
    By firstInboxLetter = By.xpath("//tbody/tr[1]/td[@class=\"xY a4W\"]");
    By bodyOfLetter = By.xpath("//div[@class=\"adn ads\"]//div[@dir=\"ltr\"]");
    By sentButtonInMalePage = By.xpath("//a[@title=\"Отправленные\"]");

    public void clickWritteButton() {
        wait.until(ExpectedConditions.elementToBeClickable(writteButton));
        driver.findElement(writteButton).click();
    }

    public void typeEmailInWhomField(String email) {
        wait.until(ExpectedConditions.elementToBeClickable(toWhomField));
        driver.findElement(toWhomField).sendKeys(email);
    }

    public void typeTextInSubjectLetterField(String text) {
        wait.until(ExpectedConditions.elementToBeClickable(bodyOfTheLetterField));
        driver.findElement(bodyOfTheLetterField).sendKeys(text);
    }

    public void clickSendButton() {
        wait.until(ExpectedConditions.elementToBeClickable(sendButton));
        driver.findElement(sendButton).click();

    }

    public void clickInboxButton() {
        wait.until(ExpectedConditions.elementToBeClickable(inboxButton));
        driver.findElement(inboxButton).click();
    }

    public String getInboxButtonName() {
        wait.until(ExpectedConditions.elementToBeClickable(inboxButton));
        return driver.findElement(inboxButton).getText();
    }

    public void openFirstInboxLetter() {
        wait.until(ExpectedConditions.elementToBeClickable(firstInboxLetter));
        driver.findElement(firstInboxLetter).click();
    }

    public String getTextFromLetter() {
        wait.until(ExpectedConditions.elementToBeClickable(bodyOfLetter));
        return driver.findElement(bodyOfLetter).getText();
    }

    public void clickSentButtonInMailPage() {
        wait.until(ExpectedConditions.elementToBeClickable(sentButtonInMalePage));
        driver.findElement(sentButtonInMalePage).click();
    }


}



