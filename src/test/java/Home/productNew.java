package Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class productNew {
    private WebDriver driver;

    @BeforeTest
        public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Driverapp\\chromedriver_win32_14\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");
        driver = new ChromeDriver(chromeOptions);
        //navigate to URL Testing
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        //Enter Username
        WebElement username = driver.findElement(By.id("user-name"));
            username.sendKeys("standard_user");

        //Enter Password
        WebElement password = driver.findElement(By.id("password"));
            password.sendKeys("secret_sauce");

        //Click Login Button
        WebElement loginbutton = driver.findElement(By.id("login-button"));
            loginbutton.click();

        //verify login page
        WebElement page_Login = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span"));
            Assert.assertTrue(page_Login.isDisplayed());
    }

    @Test(priority = 1)
        public void product_View(){
        //Select one product
        WebElement product = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div"));
            product.click();

        //Verify Product
        WebElement product_check = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div[2]/div[1]"));

        String expected_product = "Sauce Labs Backpack";
        String actual_product = product_check.getText();

        Assert.assertEquals(actual_product, expected_product, "Sauce Labs Backpack");
    }

    @Test(priority = 2)
        public void addItem_product(){
        //Click Add to cart product
        WebElement addtocart_inside = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
            addtocart_inside.click();

        // Click Cart Item
        WebElement cartIcon = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a"));
        cartIcon.click();

        //Back to HomePage
        driver.navigate().back();
    }

    @AfterTest
        public void tearDown(){

        driver.quit();
    }


}
