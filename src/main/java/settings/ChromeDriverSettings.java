package settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class ChromeDriverSettings {

    protected WebDriver driver;
    protected String userEmail = "IvanovTestEmail@gmail.com";
    protected String userPassword = "Qwerty123456";
    protected String textLetter = "Hello, World!";
    protected String currentTextInboxButton;
    protected String textInboxButtonAfterSending;



    @BeforeMethod

    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }


    @AfterMethod

    public void setAfter(){
        driver.quit();
    }


}

