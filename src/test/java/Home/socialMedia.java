package Home;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class socialMedia {
    private WebDriver driver;

    @Before
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

    @Test
    public void webTwitter(){


        //Scroll down the page
        // Create an instance of the JavascriptExecutor interface
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll to a specific position on the web page
        js.executeScript("window.scrollTo(0, 961);");

        // Get the current window handle
        String currentWindowHandle = driver.getWindowHandle();

        // Click a link twitter that opens a new window
        WebElement twitterIcon = driver.findElement(By.xpath("/html/body/div/div/footer/ul/li[1]/a"));
        twitterIcon.click();

        // Wait for the new window to open
        WebDriverWait waitTab = new WebDriverWait(driver, Duration.ofSeconds(5));
        waitTab.until(ExpectedConditions.numberOfWindowsToBe(2));

        try {
            Thread.sleep(5000); // 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // Switch back to the original window
        driver.switchTo().window(currentWindowHandle);

    }

    @Test
    public void webFacebook(){
        //Scroll down the page
        // Create an instance of the JavascriptExecutor interface
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll to a specific position on the web page
        js.executeScript("window.scrollTo(0, 961);");

        // Get the current window handle
        String currentWindowHandle = driver.getWindowHandle();

        // Click a link twitter that opens a new window
        WebElement twitterIcon = driver.findElement(By.xpath("/html/body/div/div/footer/ul/li[2]/a"));
        twitterIcon.click();

        // Wait for the new window to open
        WebDriverWait waitTab = new WebDriverWait(driver, Duration.ofSeconds(5));
        waitTab.until(ExpectedConditions.numberOfWindowsToBe(2));

        try {
            Thread.sleep(5000); // 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // Switch back to the original window
        driver.switchTo().window(currentWindowHandle);

    }

    @Test
    public  void weblinkedln(){
        //Scroll down the page
        // Create an instance of the JavascriptExecutor interface
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll to a specific position on the web page
        js.executeScript("window.scrollTo(0, 961);");

        // Get the current window handle
        String currentWindowHandle = driver.getWindowHandle();

        // Click a link twitter that opens a new window
        WebElement twitterIcon = driver.findElement(By.xpath("/html/body/div/div/footer/ul/li[3]/a"));
        twitterIcon.click();

        // Wait for the new window to open
        WebDriverWait waitTab = new WebDriverWait(driver, Duration.ofSeconds(5));
        waitTab.until(ExpectedConditions.numberOfWindowsToBe(2));

        try {
            Thread.sleep(5000); // 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // Switch back to the original window
        driver.switchTo().window(currentWindowHandle);

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}
