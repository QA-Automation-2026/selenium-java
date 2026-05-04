package frameworkDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import pages.LoginPage;

public class Tc_25458
{
    WebDriver driver = new EdgeDriver();

    @Test
    public void verifyingCostCoFunctionalities(){
        LoginPage.enterUserName(driver,"Sireesha"); //User navigated to login page
        LoginPage.enterPassword(driver,"sireesha@123"); //enter credentials





    }

}
