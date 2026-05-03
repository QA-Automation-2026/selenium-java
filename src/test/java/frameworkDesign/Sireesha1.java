package frameworkDesign;

import SiriPages.HomePage1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.common;

import java.time.Duration;

public class Sireesha1 {

    WebDriver driver = new EdgeDriver();

    @Test
    public void verifyCostcofunctionlity(){



        driver.manage().window().maximize();
        HomePage1.launchCostcoApplication(driver,"https://www.costco.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicity wait
        driver.findElement(By.xpath(("//div[@class='MuiBox-root mui-saptuz']"))).isDisplayed();
        driver.findElement(By.xpath("(//div[text()='Shop'])[2]")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(25)); // explicit wait
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("////h1[text()='Appliances']")));
       driver.findElement(By.xpath("//h1[text()='Appliances']")).isDisplayed();

        driver.findElements(By.xpath("//a[text()='Grocery']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Grocery & Household Essentials']")));
        driver.findElement(By.xpath("//h1[text()='Grocery & Household Essentials']")).isDisplayed();
    }


}
      HomePage.shouldVerifyCostcoLogoisDisplayed(driver);
        HomePage.clickOnPopUpScreenCrossButton(driver);
        HomePage.clickOnShop1Button(driver);
        fashion.shouldVerifyFashionScreenIsDisplayed(driver);
        HomePage.clickOnGrocery1Button(driver);

@AfterTest
public void closeBrowser() {
    common.quitBrowser(driver);
}




