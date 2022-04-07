import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void implicitWait(long timeToWait){
        driver.manage().timeouts().implicitlyWait(timeToWait, TimeUnit.SECONDS);
            }

    public void explicitWait(long timeToWait, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeToWait));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    @FindBy(xpath = "//a[@access-value = 'vehiclesByMakeLink']")
    private WebElement button;

    public WebElement getButton(){
        return button;
    }

    public boolean buttonIsDisplayed(){
        return getButton().isDisplayed();
    }
}
