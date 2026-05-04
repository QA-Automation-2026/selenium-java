package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    public static By Txt_Username = By.xpath("iuefhoiuhhiuyudyuh");
    public static By Txt_Password = By.xpath("ijdnilnnnjnljn");


    public static void enterUserName(WebDriver driver,String user){
        common.waitForElementVisible(driver,Txt_Username);
        common.enterText(driver,Txt_Username,user);
    }
    public static void enterPassword(WebDriver driver,String password){
        common.enterText(driver,Txt_Password,password);
    }
}
