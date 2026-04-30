package frameworkDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import pages.flipkarHomePage;

public class frameworkSessionDemo {

    @Test
    public void demoSession(){
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        flipkarHomePage.LaunchFlipkartApplication(driver,"https://www.flipkart.com/");
        flipkarHomePage.verifyFlipkartLogoisDisplayed(driver);
        flipkarHomePage.enterIphoneInSearchBox(driver,"Iphone");
        flipkarHomePage.clearText(driver);
        driver.quit();
    }
}
