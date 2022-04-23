import org.testng.Assert;
import org.testng.annotations.Test;

public class TDDTests extends BasePageTests{

    @Test(groups = {"funcTest"}, dataProvider = "dataOfUsers", dataProviderClass = XlsxDataProvider.class)
    public void checkEnterInvalidDateFromXlsx(String name, String password){
        getBasePage().getSignInButton().click();
        getBasePage().getUserButton().click();
        getSingInPage().explicitWait(60, getSingInPage().getUserNameField());
        getSingInPage().getUserNameField().sendKeys(name);
        getSingInPage().getPasswordField().sendKeys(password);
        getSingInPage().getSubmitButton().click();
        Assert.assertTrue(getSingInPage().getErrorMessage().isDisplayed());
    }

    @Test(groups = {"funcTest"})
    public void checkChangeLanguage(){
        getBasePage().getLanguageButton().click();
        getBasePage().getListOfLanguage().click();
        getBasePage().explicitWait(30, getBasePage().getPolskiLanguage());
        getBasePage().getPolskiLanguage().click();
        getBasePage().getYesButton().click();
        getBasePage().explicitWait(30, getBasePage().getLanguageLogo());
        Assert.assertTrue(getBasePage().getLanguageLogo().isDisplayed());
    }
}
