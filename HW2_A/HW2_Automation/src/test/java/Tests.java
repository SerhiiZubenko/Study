
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends HomePageTest{

    @Test
    public void checkThatElementIsDisplayed_ImplicitWait(){
        getHomePage().implicitWait(500);
        Assert.assertTrue(getHomePage().getButton().isDisplayed());
    }

    @Test
    public void checkThatElementIsDisplayed_ExplicitWait(){
        getHomePage().explicitWait(500, getHomePage().getButton());
        Assert.assertTrue(getHomePage().buttonIsDisplayed());
    }
}
