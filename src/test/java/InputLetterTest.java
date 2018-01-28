import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountsGoogleComPage;
import pages.GoogleComPage;
import pages.MailGoogleCom;
import settings.ChromeDriverSettings;

public class InputLetterTest extends ChromeDriverSettings {

    @Test
    public void incomingLetterTest() throws NullPointerException {
        System.out.println("0. Start test");
        GoogleComPage googleComPage = new GoogleComPage(driver);
        System.out.println("1. After new googleComPage");
        AccountsGoogleComPage accountsGoogleComPage = googleComPage.clickMailButton();
        System.out.println("2. After clickMailButton");
        MailGoogleCom mailGoogleCom = accountsGoogleComPage.login(userEmail, userPassword);
        mailGoogleCom.clickInboxButton();

        currentTextInboxButton = mailGoogleCom.getInboxButtonName();

        mailGoogleCom.clickWritteButton();
        mailGoogleCom.typeEmailInWhomField(userEmail);
        mailGoogleCom.typeTextInSubjectLetterField(textLetter);
        mailGoogleCom.clickSendButton();
        mailGoogleCom.clickInboxButton();

        textInboxButtonAfterSending = mailGoogleCom.getInboxButtonName();

        Assert.assertEquals("New letter didn't receive", currentTextInboxButton, textInboxButtonAfterSending);

        mailGoogleCom.openFirstInboxLetter();

        Assert.assertEquals("'Hello world' isn't in the letter", textLetter, mailGoogleCom.getTextFromLetter());

    }


}
