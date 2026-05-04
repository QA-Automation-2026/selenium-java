package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {

    public static By Hdr_FlipkartLogo = By.xpath("(//div[text()='Location not set']/../../../../../../../../../../../..//img[@alt='Image'])[2]");
    public static By Btn_Fashion = By.xpath("//div[text()='Fashion']");
    public static By Btn_Mobile = By.xpath("//div[text()='Mobiles']");
    public static By Btn_Cross = By.xpath("//span[@class='b3wTlE']");

    public static void launchFlipkartApplication(WebDriver driver, String url){
        driver.get(url);
    }

    public static void shouldVerifyFlipkartLogoisDisplayed(WebDriver driver){
        common.waitForElementVisible(driver,Hdr_FlipkartLogo);
        Assert.assertTrue(common.isElementDisplayed(driver,Hdr_FlipkartLogo));
    }
    public static void clickOnFashionButton(WebDriver driver){
        common.waitForElementVisible(driver,Btn_Fashion);
        common.tap(driver,Btn_Fashion);
    }
    public static void clickOnMobileButton(WebDriver driver){
        common.waitForElementVisible(driver,Btn_Mobile);
        common.tap(driver,Btn_Mobile);
    }
    public static void clickOnPopUpScreenCrossButton(WebDriver driver){
        common.waitForElementVisible(driver,Btn_Cross);
        common.tap(driver,Btn_Cross);
    }

}
