package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage{


    public SignInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailField;

    @FindBy(xpath = "//p[@id = 'email-err']")
    private WebElement errorMessage;

    @FindBy(xpath = "(//button[contains(text(),'Continue')])[1]")
    private WebElement continueButton;

    @FindBy(xpath = "//input[@id = 'password']")
    private WebElement passwordField;

    @FindBy(xpath = "//span[contains(text(), 'at least 15 characters')]")
    private WebElement shortPasswordMessage;

    @FindBy(xpath = "//button[@data-continue-to = 'username-container'] ")
    private WebElement continueButtonAfterEnterPassword;

    @FindBy(xpath = "//input[@id='login']")
    private WebElement userNameField;

    @FindBy(xpath = "//div[contains(text(),'Username zubr is not available.')]")
    private WebElement userNameUnavailable;

    public WebElement getErrorUserNameUnavailable(){
        return userNameUnavailable;
    }

    public WebElement getUserNameField(){
        return userNameField;
    }

    public WebElement getContinueButtonAfterEnterPassword(){
        return continueButtonAfterEnterPassword;
    }

    public WebElement getShortPasswordMessage(){
        return shortPasswordMessage;
    }

    public boolean shortPasswordMessageIsDisplayed(){
       return shortPasswordMessage.isDisplayed();
    }

    public WebElement getPasswordField(){
        return passwordField;
    }

    public WebElement getContinueButton(){
        return continueButton;
    }

    public WebElement getErrorMessage(){
        return errorMessage;
    }

    public boolean errorMessageIsDisplayed(){
        return  errorMessage.isDisplayed();
    }

    public WebElement getEmailField(){
        return emailField;
    }
}
