import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends HomePageTest{

    private static final String KEY = "Ford Edge 2020";

    @Test
    public void checkSearching (){
    getHomePage().getInputSearch().sendKeys(KEY);
    getHomePage().getSearchButton().click();
    getHomePage().explicitWait(30, getHomePage().getSearchResult());
        Assert.assertTrue(getHomePage().getSearchResult().isDisplayed());
    }
}
