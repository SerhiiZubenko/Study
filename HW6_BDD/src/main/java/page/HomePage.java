package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openHomePage(String url) {
        driver.get(url);
    }

    @FindBy(xpath = "//a[@class = 'HeaderMenu-link flex-shrink-0 d-inline-block " +
            "no-underline border color-border-default rounded px-2 py-1']")
    private WebElement signInButton;

    public WebElement getSignInButton(){
        return signInButton;
    }

    public void clickSingInButton(){
        signInButton.click();
    }
}
