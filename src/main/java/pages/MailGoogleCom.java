package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MailGoogleCom {

    private WebDriver driver;

    public MailGoogleCom(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(xpath = "//div[@class=\"T-I J-J5-Ji T-I-KE L3\"]")
    private WebElement writteButton;

    @FindBy(id = ":j3")
    private WebElement toWhomField;

    @FindBy(xpath = "//input[@id = \":jk\"]")
    private WebElement subjectLetterField;

    @FindBy(xpath = "//div[@id = \":ii\"]")
    private WebElement bodyOfTheLetterField;

    @FindBy(xpath = "//div[@id = \":x1\"]")
    private WebElement sendButton;

    @FindBy(xpath = "//a[@href=\"https://mail.google.com/mail/u/0/?tab=wm#inbox\"]")
    private WebElement inboxButton;


    private void clickWritteButton(){
        writteButton.click();
    }

    private void typeEmailInWhomField(){
        toWhomField.clear();
        toWhomField.sendKeys("IvanovTestEmail@gmail.com");
    }

    private void typeTextInSubjectLetterField(String text){
        text = "Hello, World!";
        bodyOfTheLetterField.sendKeys(text);
    }

    private void clickSendButton(){
        sendButton.click();

    }

    private void clickInboxButton(){
        inboxButton.click();
    }



    }



