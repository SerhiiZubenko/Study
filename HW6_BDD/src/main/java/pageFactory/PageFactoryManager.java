package pageFactory;

import org.openqa.selenium.WebDriver;
import page.HomePage;
import page.SignInPage;

public class PageFactoryManager {

    WebDriver driver;

    public PageFactoryManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage(){
        return new HomePage(driver);
    }

    public SignInPage getSignInPage(){
        return new SignInPage(driver);
    }
}
