import org.openqa.selenium.By;
import org.testng.annotations.Test;
import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CopartTest {

    private final static String BASE_URL = "https://www.copart.com";
    private final static String KEYWORD = "FORD EDGE 2020";


    @Test
    public void checkSearchField(){
        open(BASE_URL);
        $(By.xpath("//input[@id = 'input-search']")).val(KEYWORD);
        $(By.xpath("//button[@aria-label = 'Search Inventory']")).click();
        $(By.xpath("//button[@class = 'tour_nav_btn next_btn ng-star-inserted']")).should(visible, Duration.ofSeconds(30));
        $(By.xpath("//button[@class = 'tour_nav_btn next_btn ng-star-inserted']")).shouldBe(visible);
    }
}
