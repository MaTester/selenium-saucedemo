package Home;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.ExecutionException;

public class categories {
    private WebDriver driver;

    @Test
    public void about() {
        //Scenario 1 = User navigate to About subcategory
        //Open Browser
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Driverapp\\chromedriver_win32_14\\chromedriver.exe");
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

        //Click Hamburger Menu
        WebElement hamburgerMenu = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[1]/div/button"));
        hamburgerMenu.click();

        //Click About submenu
        WebDriverWait waitAbout = new WebDriverWait(driver, Duration.ofSeconds(5));
        waitAbout.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/nav/a[2]")));

        WebElement aboutSubmenu = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/nav/a[2]"));
        aboutSubmenu.click();

        try {
            Thread.sleep(3000); // 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.navigate().back();
        try {
            Thread.sleep(3000); // 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    @Test
    public void logoutsubMenu(){
        //Scenario 2 = User logout the webapp
        //Open Browser
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Driverapp\\chromedriver_win32_14\\chromedriver.exe");
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

        //Click Hamburger Menu
        WebElement hamburgerMenu = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[1]/div/button"));
        hamburgerMenu.click();

        //Click Logout submenu
        WebDriverWait waitLogout = new WebDriverWait(driver, Duration.ofSeconds(5));
        waitLogout.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/nav/a[3]")));

        WebElement logoutMenu = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/nav/a[3]"));
        logoutMenu.click();

        try {
            Thread.sleep(3000); // 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();

    }


}
