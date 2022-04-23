import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BasePageTests {

    private WebDriver driver;
    private static final String COPART_URL = "https://www.copart.com";

    public WebDriver getDriver(){
        return driver;
    }

    public BasePage getBasePage(){
        return new BasePage(getDriver());
    }

    public SignInPage getSingInPage(){
        return new SignInPage(getDriver());
    }

    @BeforeTest(groups = {"funcTest"})
    public void profileSetUp(){
        chromedriver().setup();
    }

    @BeforeMethod(groups = {"funcTest"})
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(COPART_URL);
    }

    @AfterMethod(groups = {"funcTest"})
    public void closeChromedriver(){
        driver.quit();
    }
}
