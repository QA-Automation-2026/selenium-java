package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class fashion {

    public static By Icon_WeddingStore = By.xpath("//div[text()='Wedding Store ']");


    public static void shouldVerifyFashionScreenIsDisplayed(WebDriver driver){
        common.waitForElementVisible(driver,Icon_WeddingStore);
        Assert.assertTrue(common.isElementDisplayed(driver,Icon_WeddingStore));
    }
}
