package settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class ChromeDriverSettings {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected String userEmail = "IvanovTestEmail@gmail.com";
    protected String userPassword = "Qwerty123456";
    protected String textLetter = "Hello, World!";


    @BeforeMethod
    public void setUp() {

        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

    }


    @AfterMethod
    public void setAfter() {
        driver.quit();
    }

}

