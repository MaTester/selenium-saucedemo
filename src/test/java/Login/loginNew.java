package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;
import java.time.Duration;

public class loginNew {
     private WebDriver driver;

    @BeforeTest
        public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Driverapp\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");
        driver = new ChromeDriver(chromeOptions);
        //navigate to URL Testing
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
        public void AccountLoginSuccess() throws InterruptedException {
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

        //Logout the webapp
        WebElement hamburger_menu = driver.findElement(By.xpath("//html/body/div/div/div/div[1]/div[1]/div[1]/div/div[1]/div/button"));
            hamburger_menu.click();
        WebDriverWait wait_logout = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement logout_menu = wait_logout.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/nav/a[3]")));
            logout_menu.click();

        Thread.sleep(5000);


    }

    @Test(priority = 2)
        public void AccountLoginFailed(){
        //Enter Username
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        //Enter Password
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret");

        //Click Login Button
        WebElement loginbutton = driver.findElement(By.id("login-button"));
        loginbutton.click();

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement errormessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[3]/h3")));

            System.out.println(errormessage.getText());
        } catch (TimeoutException e) {
            System.out.println("Login Failed");
        }
    }

    @AfterTest
    public void tearDown(){

        driver.quit();
    }


}
