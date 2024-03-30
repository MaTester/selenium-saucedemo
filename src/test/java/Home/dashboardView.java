package Home;
import Intro.openBrowser;
import Login.loginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class dashboardView extends loginPage {

    @Test(priority = 2)
    public void productView(){

        WebDriverWait wait_Backpack = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement sauceLabBackpack = wait_Backpack.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div")));
        String actualTitle_Backpack=sauceLabBackpack.getText();
        String expectedTitle_Backpack = "Sauce Labs Backpack";
        Assert.assertEquals(actualTitle_Backpack, expectedTitle_Backpack, "Title does match");
        System.out.println("sauceLabBackpack");
    }
}
