package Purchase;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class puchaseItemNew {
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
        public void purchaseOneSuccessful(){

        //Select one product
        WebElement product = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div"));
            product.click();

        //Go to Cart
        WebElement cartIcon = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a"));
            cartIcon.click();

        // Click Checkout
        WebElement checkoutButton = driver.findElement(By.name("checkout"));
            checkoutButton.click();

        // Input First Name
        WebElement firstName = driver.findElement(By.id("first-name"));
            firstName.sendKeys("Hani");

        // Input Last Name
        WebElement lastName = driver.findElement(By.id("last-name"));
            lastName.sendKeys("Sarasvati");

        // Input Zipcode
        WebElement zipCode = driver.findElement(By.id("postal-code"));
            zipCode.sendKeys("06830");

        // Click Continue
        WebElement continueButton = driver.findElement(By.id("continue"));
            continueButton.click();

        // See overview checkout
        WebElement overview = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span"));
            Assert.assertTrue(overview.isDisplayed());

        // Click Finish
        WebElement finishButton = driver.findElement(By.id("finish"));
            finishButton.click();

        //Complete the order
        WebElement completeOrder = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/h2"));
            Assert.assertTrue(completeOrder.isDisplayed());

        // Click Back to Home
        WebElement backHome = driver.findElement(By.id("back-to-products"));
            backHome.click();
    }

    @Test(priority = 2)
        public void purchaseMultipleSuccessful(){

        // Add First item
        WebElement addItem = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button"));
        addItem.click();

        // Click Cart Item
        WebElement cartIcon = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a"));
        cartIcon.click();

        // Click Continue Shopping
        WebElement continueShopping = driver.findElement(By.id("continue-shopping"));
        continueShopping.click();

        // Add Second Item
        WebElement secondAddItem = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[2]/button"));
        secondAddItem.click();

        // Click Cart Item
        WebElement SecondCartIcon = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a"));
        SecondCartIcon.click();

        // Click Checkout
        WebElement checkoutButton = driver.findElement(By.name("checkout"));
        checkoutButton.click();

        // Input First Name
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Hani");

        // Input Last Name
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Sarasvati");

        // Input Zipcode
        WebElement zipCode = driver.findElement(By.id("postal-code"));
        zipCode.sendKeys("06830");

        // Click Continue
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

        // See overview checkout
        WebElement overview = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span"));
        Assert.assertTrue(overview.isDisplayed());

        // Click Finish
        WebElement finishButton = driver.findElement(By.id("finish"));
        finishButton.click();

        //Complete the order
        WebElement completeOrder = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/h2"));
        Assert.assertTrue(completeOrder.isDisplayed());

        // Click Back to Home
        WebElement backHome = driver.findElement(By.id("back-to-products"));
        backHome.click();
    }

    @Test(priority = 3)
        public void purchaseWithoutFirstName(){
        // Add item
        WebElement addItem = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button"));
        addItem.click();

        // Click Cart Item
        WebElement cartIcon = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a"));
        cartIcon.click();

        // Click Checkout
        WebElement checkoutButton = driver.findElement(By.name("checkout"));
        checkoutButton.click();

        // Input Last Name
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Sarasvati");

        // Input Zipcode
        WebElement zipCode = driver.findElement(By.id("postal-code"));
        zipCode.sendKeys("06830");

        // Click Continue
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

        // Locate the element containing the error message ( Option 1)
        WebElement errorMessageElementFirstName = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[4]/h3"));

        if (errorMessageElementFirstName.isDisplayed()){
            System.out.println(errorMessageElementFirstName.getText());
        } else {
            System.out.println("The result is not expected");
        }

        driver.navigate().refresh();
        // Locate the element containing the error message ( Option 2)
        // Extract the text of the error message
        //String actualErrorMessage = errorMessageElementFirstName.getText();
        // Define the expected error message
        //String expectedErrorMessage = "Error: First Name is required";
        // Compare the actual and expected error messages using assertion
        //Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error: First Name is required");
    }

    @Test(priority = 4)
        public void purchaseWithoutLastName(){

        // Input First Name
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Hani");

        // Input Zipcode
        WebElement zipCode = driver.findElement(By.id("postal-code"));
        zipCode.sendKeys("06830");

        // Click Continue
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

        // Locate the element containing the error message (Option 1)
        WebElement errorMessageElementLastName = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[4]/h3"));

        if(errorMessageElementLastName.isDisplayed()){
            System.out.println(errorMessageElementLastName.getText());
        } else{
            System.out.println("The result is not expected");
        }

        // Locate the element containing the error message (Option 2)
        // Extract the text of the error message
        //String actualErrorMessage = errorMessageElementLastName.getText();
        // Define the expected error message
        //String expectedErrorMessage = "Error: Last Name is required";
        // Compare the actual and expected error messages using assertion
        //Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error: Last Name is required");

        driver.navigate().refresh();
    }

    @Test(priority = 5)
        public void purchaseWithoutZipcode(){
        // Input First Name
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Hani");

        // Input Last Name
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Sarasvati");

        // Click Continue
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

        // Locate the element containing the error message (Option 1)
        WebElement errorMessageElementZipCode = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[4]/h3"));

        if(errorMessageElementZipCode.isDisplayed()){
            System.out.println(errorMessageElementZipCode.getText());
        } else {
            System.out.println("The result is not expected");
        }

        // Locate the element containing the error message (Option 2)
        // Extract the text of the error message
        //String actualErrorMessage = errorMessageElementZipCode.getText();
        // Define the expected error message
        //String expectedErrorMessage = "Error: Postal Code is required";
        // Compare the actual and expected error messages using assertion
        //Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error: Postal Code is required");

        driver.navigate().refresh();

    }

    @Test(priority = 6)
        public void cancelFromInformationPage(){

        // Input First Name
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Hani");

        // Input Last Name
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Sarasvati");

        // Input Zipcode
        WebElement zipCode = driver.findElement(By.id("postal-code"));
        zipCode.sendKeys("06830");

        //Click Cancel button
        WebElement cancelButton = driver.findElement(By.id("cancel"));
            cancelButton.click();

        //Verify a previous page
        WebElement previousPage = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span"));

        if(previousPage.isDisplayed()){
            System.out.println(previousPage.getText() + " " + "Page");
        } else {
            System.out.println("The result is not expected");
        }

    }

    @Test(priority = 7)
        public void cancelFromCheckout(){

        // Click Checkout
        WebElement checkoutButton = driver.findElement(By.name("checkout"));
        checkoutButton.click();

        // Input First Name
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Hani");

        // Input Last Name
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Sarasvati");

        // Input Zipcode
        WebElement zipCode = driver.findElement(By.id("postal-code"));
        zipCode.sendKeys("06830");

        //Click Cancel button
        WebElement cancelButton = driver.findElement(By.id("cancel"));
        cancelButton.click();

        //Verify the homepage
        WebElement verifyBackPage = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span"));

        if(verifyBackPage.isDisplayed()){
            System.out.println(verifyBackPage.getText() + " " + "Page");
        } else {
            System.out.println("The result is not expected");
        }

    }

    @AfterTest
        public void tearDown(){

        driver.quit();
    }
}
