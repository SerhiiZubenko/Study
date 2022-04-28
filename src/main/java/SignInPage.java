import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage{

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@name ='username']")
    private WebElement userNameField;

    @FindBy(xpath = "//input[@name ='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@class = 'btn btn-lblue loginfloatright margin15']")
    private WebElement submitButton;

    @FindBy(xpath = "//span[@data-uname = 'userLoginAlertMessage']")
    private WebElement errorMessage;

    public WebElement getErrorMessage(){
        return errorMessage;
    }

    public WebElement getSubmitButton(){
        return submitButton;
    }

    public WebElement getPasswordField(){
        return passwordField;
    }

    public WebElement getUserNameField(){
        return userNameField;
    }
}
