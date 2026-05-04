package frameworkDesign;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class multipleWindows {
    WebDriver driver = new EdgeDriver();

    @Test
    public void multipleWindowsDemo(){
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Welcome to the-internet']")));

        driver.findElement(By.xpath("//h1[text()='Welcome to the-internet']")).isDisplayed();


        WebElement element =  driver.findElement(By.xpath("//a[text()='Multiple Windows']"));

        JavascriptExecutor js  = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].focus();",element);
        element.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Opening a new window']")));

        driver.findElement(By.xpath("//a[text()='Click Here']")).click();

        String parentWindow = driver.getWindowHandle(); // to get the current window handle address

        System.out.println(parentWindow);
        Set<String> allWindows = driver.getWindowHandles();

        for(String w :allWindows){
            if(!w.equals(parentWindow)){
                    driver.switchTo().window(w);
                    driver.findElement(By.xpath("//h3[text()='New Window']")).isDisplayed();
                    driver.close();
            }
            // if condition is true then only execute inside the code in if condition
        }
        driver.switchTo().window(parentWindow);
        driver.close();
    }
}
