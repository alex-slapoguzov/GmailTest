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

    @FindBy(xpath = "//tbody/tr[1]/td[@id = \":xq\"]")
    private WebElement firstInboxLetter;

    @FindBy(xpath = "//div[@class=\"adn ads\"]//div[@dir=\"ltr\"]")
    private WebElement bodyOfLetter;


    public void clickWritteButton(){
        writteButton.click();
    }

    public void typeEmailInWhomField(String email){
        toWhomField.clear();
        toWhomField.sendKeys(email);
    }

    public void typeTextInSubjectLetterField(String text){
        bodyOfTheLetterField.sendKeys(text);
    }

    public void clickSendButton(){
        sendButton.click();

    }

    public void clickInboxButton(){
        inboxButton.click();
    }

    public String getInboxButtonName(){
        System.out.println(inboxButton.getText());
       return inboxButton.getText();
    }

    public void openFirstInboxLetter(){
        firstInboxLetter.click();
    }

    public String getTextFromLetter(){
        return bodyOfLetter.getText();

    }


  }



