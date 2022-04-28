import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

/**
 * The base class of the site
 */

public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver){
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

    @FindBy(xpath = "//input[@id = 'input-search']")
    private WebElement inputSearch;

    @FindBy(xpath = "//button[@aria-label = 'Search Inventory']")
    private WebElement searchButton;

    @FindBy(xpath = "//button[@class = 'tour_nav_btn next_btn ng-star-inserted']")
    private WebElement searchResult;

    @FindBy(xpath = "//a[@class = 'btn btn-sign-in']")
    private WebElement signInButton;

    @FindBy(xpath = "//a[@access-value = 'member']")
    private WebElement userButton;

    @FindBy(xpath = "//span[@class='header-sprite arrow-icon']")
    private WebElement languageButton;

    @FindBy(xpath = "//select[@data-uname = 'homepageDdlanguage'] ")
    private WebElement listOfLanguage;

    @FindBy(xpath = "(//option[@label='Polski'])[1]")
    private WebElement polskiLanguage;

    @FindBy(xpath = "(//button[@class='yes-btn'])[1]")
    private WebElement yesButton;

    @FindBy(xpath = "//label[@class='cursor-pointer']")
    private WebElement languageLogo;

    public WebElement getLanguageLogo(){
        return languageLogo;
    }

    public WebElement getYesButton(){
        return yesButton;
    }

    public WebElement getPolskiLanguage(){
        return polskiLanguage;
    }

    public WebElement getListOfLanguage(){
        return listOfLanguage;
    }

    public WebElement getLanguageButton(){
        return languageButton;
    }

    public WebElement getUserButton(){
        return userButton;
    }

    public WebElement getSignInButton(){
        return signInButton;
    }

    public WebElement getInputSearch(){
        return inputSearch;
    }

    public WebElement getSearchButton(){
        return searchButton;
    }

    public WebElement getSearchResult() {
        return searchResult;
    }
}
