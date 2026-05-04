package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class common {

    public static void waitForElementVisible(WebDriver driver, By element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public static boolean isElementDisplayed(WebDriver driver,By by){
        try{
            driver.findElement(by).isDisplayed();
            return true;
        }catch (Exception exception){
            return false;
        }
    }
    public static void tap(WebDriver driver,By element){
        driver.findElement(element).click();
    }
    public static void quitBrowser(WebDriver driver){
        driver.quit();
    }
    public static void enterText(WebDriver driver,By by,String input){
        driver.findElement(by).sendKeys(input);
    }
}
