package SiriPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.common;

public class  Shop1 {

 public static By Icon_Appliances=By.xpath("//div[text()='Shop'])[2]");

    public static void shouldVerifyFashionScreenIsDisplayed(WebDriver driver){
        common.waitForElementVisible(driver,Icon_Appliances);
        Assert.assertTrue(common.isElementDisplayed(driver,Icon_Appliances));
    }
}
