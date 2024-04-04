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
    public void productView1() {

        WebDriverWait wait_Backpack = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement sauceLabBackpack = wait_Backpack.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div")));
        String actualTitle_Backpack = sauceLabBackpack.getText();
        String expectedTitle_Backpack = "Sauce Labs Backpack";
        Assert.assertEquals(actualTitle_Backpack, expectedTitle_Backpack, "Title does match");
        System.out.println("sauce Labs Backpack");
    }

    @Test(priority = 3)
    public void productView2() {
        WebDriverWait wait_Bikelight = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement sauceLabBikelight = wait_Bikelight.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[1]/a/div")));
        String actualTitle_Bikelight = sauceLabBikelight.getText();
        String expectedTitle_Bikelight = "Sauce Labs Bike Light";
        Assert.assertEquals(actualTitle_Bikelight, expectedTitle_Bikelight, "Title does match");
        System.out.println("Sauce Labs Bike Light");
    }

    @Test(priority = 4)
    public void productView3() {
        WebDriverWait wait_Bolttshirt = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement sauceLabBolttshirt = wait_Bolttshirt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[3]/div[2]/div[1]/a/div")));
        String actualTitle_Bolttshirt = sauceLabBolttshirt.getText();
        String expectedTitle_Bolttshirt = "Sauce Labs Bolt T-Shirt";
        Assert.assertEquals(actualTitle_Bolttshirt, expectedTitle_Bolttshirt, "Title does match");
        System.out.println("Sauce Labs Bolt T-Shirt");

    }

    @Test(priority = 5)
    public void productView4() {
        WebDriverWait wait_FleeceJacket = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement sauceLabFleeceJacket = wait_FleeceJacket.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[4]/div[2]/div[1]/a/div")));
        String actualTitle_FleeceJacket = sauceLabFleeceJacket.getText();
        String expectedTitle_FleeceJacket = "Sauce Labs Fleece Jacket";
        Assert.assertEquals(actualTitle_FleeceJacket, expectedTitle_FleeceJacket, "Title does match");
        System.out.println("Sauce Labs Fleece Jacket");

    }
}