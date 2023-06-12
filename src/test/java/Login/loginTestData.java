package Login;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class loginTestData {
    private WebDriver driver;

    @Test
    public void loginTest(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Driverapp\\chromedriver_win32_14\\chromedriver.exe");
        driver = new ChromeDriver(chromeOptions);
        //navigate to URL Testing
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        //Define the Test Data for Login Credentials
        List<String> usernames = Arrays.asList("standard_user","asma_user");

        //Iterate over the usernames and perform login for each username
        for (String username : usernames) {
            WebElement usernameField = driver.findElement(By.id("user-name"));
            usernameField.sendKeys("username");

            //Enter Password
            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.sendKeys("secret_sauce");

            //Click Login Button
            WebElement loginButton = driver.findElement(By.id("login-button"));
            loginButton.click();

        // Perform assertions or further actions based on the login result
            String expected_login = "Products";
            String actual_login = driver.getTitle();
                if (expected_login.equals(actual_login)) {
                    // Perform actions after successful login
                    System.out.println("Login successful");
                } else {
                        System.out.println("Login Failed");
                    }

                driver.quit();

        }


    }
}
