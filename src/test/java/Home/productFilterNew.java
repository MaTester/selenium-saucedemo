package Home;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class productFilterNew {

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
    }

    @Test(priority = 1)
        public void home_navigation(){
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

    @Test(priority = 2)
        public void filter_za(){
        //Select filter z to a
        WebElement dropdownfilter = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select"));
            Select dropdownZA = new Select(dropdownfilter);
                dropdownZA.selectByValue("za");

        try {
            Thread.sleep(2000); // 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Create an instance of the JavascriptExecutor interface
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll to a specific position on the web page
        js.executeScript("window.scrollTo(0, 961);");
    }

    @Test(priority = 3)
        public void filter_az(){
        //Select filter a to z
        WebElement dropdownfilterAZ = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select"));
            Select dropdownAZ = new Select(dropdownfilterAZ);
                dropdownAZ.selectByValue("az");

        try {
            Thread.sleep(2000); // 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Create an instance of the JavascriptExecutor interface
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll to a specific position on the web page
        js.executeScript("window.scrollTo(0, 961);");

    }

    @Test(priority = 4)
        public void filter_lohi(){
        //Select filter Low to High
        WebElement dropdownfilterlohi = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select"));
            Select dropdownlohi = new Select(dropdownfilterlohi);
                dropdownlohi.selectByValue("lohi");

        try {
            Thread.sleep(2000); // 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Create an instance of the JavascriptExecutor interface
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll to a specific position on the web page
        js.executeScript("window.scrollTo(0, 961);");
    }

    @Test(priority = 5)
        public void filter_hilo(){
        //Select filter High to Low
        WebElement dropdownfilterhilo = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select"));
            Select dropdownhilo = new Select(dropdownfilterhilo);
                dropdownhilo.selectByValue("hilo");

        try {
            Thread.sleep(2000); // 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Create an instance of the JavascriptExecutor interface
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll to a specific position on the web page
        js.executeScript("window.scrollTo(0, 961);");
    }

    @AfterTest
    public void tearDown(){

        driver.quit();
    }
}
