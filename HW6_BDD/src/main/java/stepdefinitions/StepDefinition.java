package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.HomePage;
import page.SignInPage;
import pageFactory.PageFactoryManager;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
import static org.junit.Assert.assertTrue;

public class StepDefinition {

    private static final long DEFAULT_TIMEOUT = 5000;

    WebDriver driver;
    HomePage homePage;
    SignInPage signInPage;
    PageFactoryManager pageFactoryManager;


    @Before
    public void testsSetUp() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        pageFactoryManager = new PageFactoryManager(driver);
    }

    @After
    public void tearDown() {
        driver.close();
    }



    @Given("Github {string} is opened")
    public void userOpenHomePage(final String url){
    homePage = pageFactoryManager.getHomePage();
    homePage.openHomePage(url);
    homePage.explicitWait(60, homePage.getSignInButton());
    homePage.clickSingInButton();
    }

    @When("user enters {string} into email field")
    public void userEnterInvalidEmail(final String email){
    signInPage = pageFactoryManager.getSignInPage();
    signInPage.getEmailField().sendKeys(email);
    }

    @And("user enters valid {string} into email field")
    public void userEnterValidEmail(final String email) throws InterruptedException {
        signInPage = pageFactoryManager.getSignInPage();
        signInPage.getEmailField().sendKeys(email);
        Thread.sleep(1000);
        signInPage.getContinueButton().click();
    }

    @Then("error message below email field should be displayed")
    public void checkThatErrorMessageIsDisplayed(){
        signInPage.explicitWait(60, signInPage.getErrorMessage());
        Assert.assertTrue(signInPage.errorMessageIsDisplayed());
    }

    @When("user enters {string} into password field")
    public void userEnterShortPassword(final String password){
        signInPage.explicitWait(60, signInPage.getPasswordField());
        signInPage.getPasswordField().sendKeys(password);
    }

    @Then("“at least 15 characters” message should be marked red")
    public void errorPasswordIsDisplayed(){
        signInPage.explicitWait(60, signInPage.getShortPasswordMessage());
        assertTrue(signInPage.shortPasswordMessageIsDisplayed());
    }

    @When("user enters already existent {string} into username field")
    public void userEnterExistentName(final String name) throws InterruptedException {
        Thread.sleep(1000);
        signInPage.getContinueButtonAfterEnterPassword().click();
        signInPage.explicitWait(60, signInPage.getUserNameField());
        signInPage.getUserNameField().sendKeys(name);
    }

    @Then("suggested usernames in error message contains the username entered")
    public void checkThatErrorNameUnavailableIsDisplayed(){
        signInPage.explicitWait(60, signInPage.getErrorUserNameUnavailable());
        assertTrue(signInPage.getErrorUserNameUnavailable().getText().contains("zubr"));
    }
}
