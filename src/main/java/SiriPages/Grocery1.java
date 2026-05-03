package SiriPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.common;

public class Grocery1 {

    public static By Icon_Grocery = By.xpath("//a[text()='Grocery']");

    public static void shouldVerifyMobileScreenIsDisplayed(WebDriver driver){
        common.waitForElementVisible(driver,Icon_Grocery);
        Assert.assertTrue(common.isElementDisplayed(driver,Icon_Grocery));
    }
}
