package Login;

import Intro.openBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginPage extends openBrowser {

    @Test (priority = 1)
    public void loginTest(){
        driver.get(baseURL);

        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys(username);

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(password);

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        //Verify Account Login
        if (driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html"))
        {
           Assert.assertTrue(true);
           System.out.println("Login Successful");
        }
        else {
            Assert.assertFalse(false, "Login Failed");
            System.out.println("Epic sadface: Username and password do not match any user in this service");
        }
    }
}
