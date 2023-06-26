package Home;

import org.openqa.selenium.By;
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

public class homePage {
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
        public void homePage_Navigation(){

        //verify login page and Navigate to HomePage
        WebElement page_Login = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span"));
        Assert.assertTrue(page_Login.isDisplayed());
    }

    @Test(priority = 2)
        public void product_view(){

        //Select one product
        WebElement product = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div"));
        product.click();

        //Back to Home
        WebElement backtohome = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/button"));
        backtohome.click();
    }

    @Test(priority = 3)
        public void AddItem_home(){

        // Add item
        WebElement addItem = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button"));
            addItem.click();

        // Click Cart Item
        WebElement cartIcon = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a"));
            cartIcon.click();

        //Back to HomePage
        driver.navigate().back();

    }

    @Test(priority = 4)
        public void RemoveItem_home(){

        // Remove item
        WebElement RemoveItem = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button"));
            RemoveItem.click();

        // Click Cart Item
        WebElement cartIcon = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a"));
            cartIcon.click();

        //Back to HomePage
        driver.navigate().back();

    }

    @Test(priority = 5)
        public void menu_about(){
        //Click Hamburger Menu
        WebElement hamburgerMenu = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[1]/div/button"));
            hamburgerMenu.click();

        //Click About submenu
        WebDriverWait waitAbout = new WebDriverWait(driver, Duration.ofSeconds(5));
            waitAbout.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/nav/a[2]")));

        WebElement aboutSubmenu = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/nav/a[2]"));
            aboutSubmenu.click();

        //try {
            //Thread.sleep(2000); // 2 seconds
        //} catch (InterruptedException e) {
            //e.printStackTrace();
        //}

        driver.navigate().back();
    }

    @Test(priority = 6)
        public void menu_logout(){

        //Click Logout submenu
        WebDriverWait waitLogout = new WebDriverWait(driver, Duration.ofSeconds(10));
            waitLogout.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/nav/a[3]")));

        WebElement logoutMenu = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/nav/a[3]"));
            logoutMenu.click();

        //Verify login Page
        WebElement login_page = driver.findElement(By.xpath("/html/body/div/div/div[1]"));
            Assert.assertTrue(login_page.isDisplayed());
    }

    @AfterTest
        public void tearDown(){

        driver.quit();
    }
}
