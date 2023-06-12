package Home;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class product {
    private WebDriver driver;

    @Test
    public void productview(){

        //Scenario 1 = User view product details
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Driverapp\\chromedriver_win32_14\\chromedriver.exe");
        driver = new ChromeDriver(chromeOptions);

        //Navigate to URL Testing
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

        //Select one product
        WebElement product = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div"));
        product.click();

        try {
            Thread.sleep(3000); // 3 seconds
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        //Back to Home
        WebElement backtohome = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/button"));
        backtohome.click();

        driver.quit();

    }

    @Test
    public void addItem(){

        //Scenario 2 = User add product into cart
        ChromeOptions  chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Driverapp\\chromedriver_win32_14\\chromedriver.exe");
        driver = new ChromeDriver(chromeOptions);

        //Navigate to URL Testing
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

        //Select one product
        WebElement product = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div"));
        product.click();

        //Add product to cart
        WebElement addproduct = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addproduct.click();

        //Back to Home
        WebElement backtohome = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/button"));
        backtohome.click();

        try {
            Thread.sleep(3000); // 3 seconds
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        driver.quit();

    }

}
