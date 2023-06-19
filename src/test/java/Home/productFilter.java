package Home;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class productFilter {
    private WebDriver driver;

    @Test
    public void homenavigation(){
        //Scenario 1 = User land to home successful
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

        try {
            Thread.sleep(3000); // 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    @Test
    public void filterza(){
        //Scenario 2 = User filter products based on Name (Z to A)
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

        //Select filter z to a
        WebElement dropdownfilter = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select"));
        Select dropdownZA = new Select(dropdownfilter);
        dropdownZA.selectByValue("za");

        try {
            Thread.sleep(3000); // 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Create an instance of the JavascriptExecutor interface
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll to a specific position on the web page
        js.executeScript("window.scrollTo(0, 961);");

        try {
            Thread.sleep(3000); // 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();

    }
    @Test
    public void filteraz(){
        //Scenario 2 = User filter products based on Name (A to Z)
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

        //Select filter z to a
        WebElement dropdownfilter = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select"));
        Select dropdownZA = new Select(dropdownfilter);
        dropdownZA.selectByValue("za");

        try {
            Thread.sleep(3000); // 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Select filter a to z
        WebElement dropdownfilterAZ = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select"));
        Select dropdownAZ = new Select(dropdownfilterAZ);
        dropdownAZ.selectByValue("az");

        try {
            Thread.sleep(3000); // 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Create an instance of the JavascriptExecutor interface
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll to a specific position on the web page
        js.executeScript("window.scrollTo(0, 961);");

        try {
            Thread.sleep(3000); // 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();

    }
    @Test
    public void filterlohi(){
        //Scenario 3 = User filter products based on Low to High
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

        //Select filter Low to High
        WebElement dropdownfilterlohi = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select"));
        Select dropdownlohi = new Select(dropdownfilterlohi);
        dropdownlohi.selectByValue("lohi");

        try {
            Thread.sleep(3000); // 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Create an instance of the JavascriptExecutor interface
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll to a specific position on the web page
        js.executeScript("window.scrollTo(0, 961);");

        try {
            Thread.sleep(3000); // 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();

    }

    @Test
    public void filterhilo(){
        //Scenario 4 = User filter products based on High to Low
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

        //Select filter High to Low
        WebElement dropdownfilterhilo = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select"));
        Select dropdownhilo = new Select(dropdownfilterhilo);
        dropdownhilo.selectByValue("hilo");

        try {
            Thread.sleep(3000); // 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Create an instance of the JavascriptExecutor interface
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll to a specific position on the web page
        js.executeScript("window.scrollTo(0, 961);");

        try {
            Thread.sleep(3000); // 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();

    }

}
