package SiriPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.common;

public class HomePage1 {
    public static By Hdr_CostcoLogo = By.xpath("(//div[@class='MuiBox-root mui-saptuz']");
    public static By Btn_Shop1 = By.xpath("//div[text()='Shop'])[2]");
    public static By Btn_Grocery1 = By.xpath("//a[text()='Grocery'])[2]");


    public static void launchCostcoApplication(WebDriver driver, String var) {
        driver.get(var);
        common.waitForElementVisible(driver, Hdr_CostcoLogo);
        Assert.assertTrue(common.isElementDisplayed(driver, Hdr_CostcoLogo));

    }

    public static void clickOnShop1Button(WebDriver driver) {
        common.waitForElementVisible(driver, Btn_Shop1);
        common.tap(driver, Btn_Shop1);
    }

    public static void clickOnMobileGrocery1(WebDriver driver) {
        common.waitForElementVisible(driver, Btn_Grocery1);
        common.tap(driver, Btn_Grocery1);
    }
}
