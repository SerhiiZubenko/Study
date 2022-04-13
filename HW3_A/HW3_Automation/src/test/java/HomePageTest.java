import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class HomePageTest {

    private WebDriver driver;
    private static final String COPART_URL = "https://www.copart.com";

    public WebDriver getDriver(){
        return driver;
    }
    public HomePage getHomePage(){
        return new HomePage(getDriver());
    }

    @BeforeTest
    public void profileSetUp(){
        chromedriver().setup();
    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(COPART_URL);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
