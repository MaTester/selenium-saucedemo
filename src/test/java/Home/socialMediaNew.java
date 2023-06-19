package Home;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class socialMediaNew {
    private WebDriver driver;

    @BeforeTest
        public void setUp(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");
        driver = new ChromeDriver(chromeOptions);
        System.setProperty("webdriver.chrome.driver", "C:\\Driverapp\\chromedriver_win32_14\\chromedriver.exe");
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
    }

    @Test(priority = 1)
        public void viewSocialMedia(){
            //verify login page
            WebElement page_Login = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span"));
                Assert.assertTrue(page_Login.isDisplayed());

            //View Media Social
            // Create an instance of the JavascriptExecutor interface
            JavascriptExecutor js = (JavascriptExecutor) driver;
            // Scroll to a specific position on the web page
            js.executeScript("window.scrollTo(0, 961);");
            WebElement view_mediaSocial = driver.findElement(By.xpath("/html/body/div/div/footer"));
                Assert.assertTrue(view_mediaSocial.isDisplayed());
        }

    @Test(priority = 2)
        public void web_twitter(){

        // Get the current window handle
        String currentWindowHandle = driver.getWindowHandle();

        // Click a link twitter that opens a new window
        WebElement twitterIcon = driver.findElement(By.xpath("/html/body/div/div/footer/ul/li[1]/a"));
        twitterIcon.click();

        // Wait for the new window to open
        WebDriverWait waitTab = new WebDriverWait(driver, Duration.ofSeconds(5));
        waitTab.until(ExpectedConditions.numberOfWindowsToBe(2));

        try {
            Thread.sleep(3000); // 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Switch back to the original window
        driver.switchTo().window(currentWindowHandle);
    }

    @Test(priority = 3)
        public void web_facebook(){
        // Get the current window handle
        String currentWindowHandle = driver.getWindowHandle();

        // Click a link Facebook that opens a new window
        WebElement facebookIcon = driver.findElement(By.xpath("/html/body/div/div/footer/ul/li[2]/a"));
        facebookIcon.click();

        // Wait for the new window to open
        WebDriverWait waitTab = new WebDriverWait(driver, Duration.ofSeconds(5));
        waitTab.until(ExpectedConditions.numberOfWindowsToBe(3));

        try {
            Thread.sleep(3000); // 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Switch back to the original window
        driver.switchTo().window(currentWindowHandle);
    }

    @Test(priority = 4)
        public void web_linkedln(){
        // Get the current window handle
        String currentWindowHandle = driver.getWindowHandle();

        // Click a link Linkedln that opens a new window
        WebElement linkedlnIcon = driver.findElement(By.xpath("/html/body/div/div/footer/ul/li[3]/a"));
            linkedlnIcon.click();

        // Wait for the new window to open
        WebDriverWait waitTab = new WebDriverWait(driver, Duration.ofSeconds(5));
        waitTab.until(ExpectedConditions.numberOfWindowsToBe(4));

        try {
            Thread.sleep(3000); // 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Switch back to the original window
        driver.switchTo().window(currentWindowHandle);
    }

    @AfterTest
        public void tearDown(){

        driver.quit();
    }
}
