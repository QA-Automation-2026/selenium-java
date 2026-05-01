package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Mobiles {

    public static By Icon_IPhones = By.xpath("//div[text()='iPhone ']");

    public static void shouldVerifyMobileScreenIsDisplayed(WebDriver driver){
        common.waitForElementVisible(driver,Icon_IPhones);
        Assert.assertTrue(common.isElementDisplayed(driver,Icon_IPhones));
    }
}
