package gmailTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountsGoogleComPage;
import pages.GoogleComPage;
import pages.MailGoogleCom;
import settings.ChromeDriverSettings;

public class InputLetterTest extends ChromeDriverSettings {

    @Test
    public void incomingLetterTest() throws InterruptedException {

        String currentTextInboxButton;
        String textInboxButtonAfterSending;

        GoogleComPage googleComPage = new GoogleComPage(driver);

        AccountsGoogleComPage accountsGoogleComPage = googleComPage.clickMailButton();
        accountsGoogleComPage.typeEmailUserField(userEmail);
        accountsGoogleComPage.clickNextButton();
        Thread.sleep(5000);
        accountsGoogleComPage.typePasswordField(userPassword);

        MailGoogleCom mailGoogleCom = accountsGoogleComPage.clickNextButtonAndGoToNextPage();
        mailGoogleCom.clickInboxButton();

        currentTextInboxButton = mailGoogleCom.getInboxButtonName();

        mailGoogleCom.clickWritteButton();
        mailGoogleCom.typeEmailInWhomField(userEmail);
        mailGoogleCom.typeTextInSubjectLetterField(textLetter);
        mailGoogleCom.clickSendButton();
        mailGoogleCom.clickInboxButton();
        Thread.sleep(5000);
        textInboxButtonAfterSending = mailGoogleCom.getInboxButtonName();


        Assert.assertNotEquals(textInboxButtonAfterSending, currentTextInboxButton,"New letter didn't receive");

        mailGoogleCom.openFirstInboxLetter();

        Assert.assertEquals(textLetter, mailGoogleCom.getTextFromLetter(), "'Hello world' isn't in the letter");

    }


}
