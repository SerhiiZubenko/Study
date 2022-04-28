import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomePageTests extends BasePageTests{

    private static final String KEY = "Ford Edge 2020";

    @Test(groups = {"funcTest", "checkintest" })
    public void checkSearching (){
        getBasePage().getInputSearch().sendKeys(KEY);
        getBasePage().getSearchButton().click();
        getBasePage().explicitWait(30, getBasePage().getSearchResult());
        Assert.assertTrue(getBasePage().getSearchResult().isDisplayed());
    }

    @Test(groups = {"funcTest"},
            dataProvider = "getEmailAndPassword", dataProviderClass = DataProviderObject.class)
    public void checkEnterInvalidDate(String name, String password){
        getBasePage().getSignInButton().click();
        getBasePage().getUserButton().click();
        getSingInPage().explicitWait(60, getSingInPage().getUserNameField());
        getSingInPage().getUserNameField().sendKeys(name);
        getSingInPage().getPasswordField().sendKeys(password);
        getSingInPage().getSubmitButton().click();
        Assert.assertTrue(getSingInPage().getErrorMessage().isDisplayed());
    }
  }
