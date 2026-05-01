package frameworkDesign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.Mobiles;
import pages.common;
import pages.fashion;

import java.time.Duration;

public class session1 {
    WebDriver driver = new EdgeDriver();

    @Test
    public void verifyFlipkartFunctionality(){

        driver.manage().window().maximize();

        HomePage.launchFlipkartApplication(driver,"https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // implicit wait
//        driver.findElement(By.xpath("(//div[text()='Location not set']/../../../../../../../../../../../..//img[@alt='Image'])[2]")).isDisplayed();
//        driver.findElement(By.xpath("//div[text()='Fashion']")).click();
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(25));      // explicit wait
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Wedding Store ']")));
//        driver.findElement(By.xpath("//div[text()='Wedding Store ']")).isDisplayed();
//
//        driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='iPhone ']")));
//        driver.findElement(By.xpath("//div[text()='iPhone ']")).isDisplayed();



        HomePage.shouldVerifyFlipkartLogoisDisplayed(driver);
        HomePage.clickOnPopUpScreenCrossButton(driver);
        HomePage.clickOnFashionButton(driver);
        fashion.shouldVerifyFashionScreenIsDisplayed(driver);
        HomePage.clickOnMobileButton(driver);
        Mobiles.shouldVerifyMobileScreenIsDisplayed(driver);

    }
    @AfterTest
    public void closeBrowser(){
        common.quitBrowser(driver);
    }

}
