package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MailGoogleCom {

    private WebDriver driver;
    public MailGoogleCom(WebDriver driver){
        this.driver = driver;
    }


    By writteButton = By.xpath("//div[@class=\"T-I J-J5-Ji T-I-KE L3\"]");
    By toWhomField = By.xpath("//tbody//textarea[@role=\"combobox\"]");
    By bodyOfTheLetterField = By.xpath("//div[@class=\"Am Al editable LW-avf\"]");
    By sendButton = By.xpath("//div[@data-tooltip-delay=\"800\"]");
    By inboxButton = By.xpath("//a[@href=\"https://mail.google.com/mail/?tab=wm#inbox\"]");
    By firstInboxLetter = By.xpath("//tbody/tr[1]/td[@class=\"xY a4W\"]");
    By bodyOfLetter = By.xpath("//div[@class=\"adn ads\"]//div[@dir=\"ltr\"]");


    public void clickWritteButton(){
        driver.findElement(writteButton).click();
    }

    public void typeEmailInWhomField(String email){
        driver.findElement(toWhomField).sendKeys(email);
   }

    public void typeTextInSubjectLetterField(String text){
       driver.findElement(bodyOfTheLetterField).sendKeys(text);
    }

    public void clickSendButton(){
        driver.findElement(sendButton).click();

    }

    public void clickInboxButton(){
        driver.findElement(inboxButton).click();
    }

    public String getInboxButtonName(){
        return driver.findElement(inboxButton).getText();
    }

    public void openFirstInboxLetter(){
        driver.findElement(firstInboxLetter).click();
    }

    public String getTextFromLetter(){
        return driver.findElement(bodyOfLetter).getText();
    }


  }



