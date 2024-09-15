package Home;
import Intro.openBrowser;
import Login.loginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;


public class dashboardView extends loginPage {

    @Test(priority = 2)
    public void productView1() {
        loginTest();
        WebDriverWait wait_Backpack = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement sauceLabBackpack = wait_Backpack.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]")));
        String actualTitle_Backpack = sauceLabBackpack.getText();
        String expectedTitle_Backpack = "Sauce Labs Backpack";
        Assert.assertEquals(actualTitle_Backpack, expectedTitle_Backpack, "Title does match");
        System.out.println("Product view was sauce Labs Backpack");
    }

    @Test(priority = 3)
    public void productView2() {
        loginTest();
        WebDriverWait wait_Bikelight = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement sauceLabBikelight = wait_Bikelight.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Sauce Labs Bike Light')]")));
        String actualTitle_Bikelight = sauceLabBikelight.getText();
        String expectedTitle_Bikelight = "Sauce Labs Bike Light";
        Assert.assertEquals(actualTitle_Bikelight, expectedTitle_Bikelight, "Title does match");
        System.out.println("Product view was Sauce Labs Bike Light");
    }

    @Test(priority = 4)
    public void productView3() {
        loginTest();
        WebDriverWait wait_Bolttshirt = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement sauceLabBolttshirt = wait_Bolttshirt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Sauce Labs Bolt T-Shirt')]")));
        String actualTitle_Bolttshirt = sauceLabBolttshirt.getText();
        String expectedTitle_Bolttshirt = "Sauce Labs Bolt T-Shirt";
        Assert.assertEquals(actualTitle_Bolttshirt, expectedTitle_Bolttshirt, "Title does match");
        System.out.println("Product view was Sauce Labs Bolt T-Shirt");

    }

    @Test(priority = 5)
    public void productView4() {
        loginTest();
        WebDriverWait wait_FleeceJacket = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement sauceLabFleeceJacket = wait_FleeceJacket.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Sauce Labs Fleece Jacket')]")));
        String actualTitle_FleeceJacket = sauceLabFleeceJacket.getText();
        String expectedTitle_FleeceJacket = "Sauce Labs Fleece Jacket";
        Assert.assertEquals(actualTitle_FleeceJacket, expectedTitle_FleeceJacket, "Title does match");
        System.out.println("Product view was Sauce Labs Fleece Jacket");

    }

    @Test(priority = 6)
    public void productView5() {
        loginTest();
        WebDriverWait wait_LabsOnesie = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement sauceLabOnesie = wait_LabsOnesie.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Sauce Labs Onesie')]")));
        String actualTitle_FleeceJacket = sauceLabOnesie.getText();
        String expectedTitle_FleeceJacket = "Sauce Labs Onesie";
        Assert.assertEquals(actualTitle_FleeceJacket, expectedTitle_FleeceJacket, "Title does match");
        System.out.println("Product view was Sauce Labs Onesie");

    }

}