package pages;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class flipkarHomePage {

    static By hdr_flipkartlogo = By.xpath("(//div[text()='Location not set']/../../../../../../../../../../../..//img[@alt='Image'])[2]");
    static By Txt_searchBox = By.xpath("(//input[@title='Search for Products, Brands and More'])[1]");


    public static void LaunchFlipkartApplication(WebDriver driver,String url){
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
    }

    public static boolean isElementDisplayed(WebDriver driver, By by){
        try{
            driver.findElement(by).isDisplayed();
            return true;
        }catch (Exception ex){
            return false;
        }
    }


    public static void verifyFlipkartLogoisDisplayed(WebDriver driver){
        waitForElementVisible(driver,hdr_flipkartlogo);
        Assert.assertTrue(isElementDisplayed(driver,hdr_flipkartlogo));
    }

    public static void waitForElementVisible(WebDriver driver, By by){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void enterText(WebDriver driver, By by,String input){
        driver.findElement(by).sendKeys(input);
    }

    public static void enterIphoneInSearchBox(WebDriver driver, String input){
        waitForElementVisible(driver,Txt_searchBox);
        enterText(driver,Txt_searchBox,input);
    }
    public static void clearText(WebDriver driver){
        driver.findElement(Txt_searchBox).clear();
    }

}
