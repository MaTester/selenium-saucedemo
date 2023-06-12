package Purchase;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class purchaseItem {
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
    public void purchaseSuccessful() {

        // Add item
        WebElement addItem = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button"));
        addItem.click();

        // Click Cart Item
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

    @Test
    public void purchaseMultipleItem(){

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

    @Test
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

        // Locate the element containing the error message
        WebElement errorMessageElementFirstName = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[4]/h3"));

        // Extract the text of the error message
        String actualErrorMessage = errorMessageElementFirstName.getText();

        // Define the expected error message
        String expectedErrorMessage = "Error: First Name is required";

        // Compare the actual and expected error messages using assertion
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error: First Name is required");

    }

    @Test
    public void purchaseWithoutLastName(){

        // Add item
        WebElement addItem = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button"));
        addItem.click();

        // Click Cart Item
        WebElement cartIcon = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a"));
        cartIcon.click();

        // Click Checkout
        WebElement checkoutButton = driver.findElement(By.name("checkout"));
        checkoutButton.click();

        // Input First Name
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Hani");

        // Input Zipcode
        WebElement zipCode = driver.findElement(By.id("postal-code"));
        zipCode.sendKeys("06830");

        // Click Continue
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

        // Locate the element containing the error message
        WebElement errorMessageElementLastName = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[4]/h3"));

        // Extract the text of the error message
        String actualErrorMessage = errorMessageElementLastName.getText();

        // Define the expected error message
        String expectedErrorMessage = "Error: Last Name is required";

        // Compare the actual and expected error messages using assertion
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error: Last Name is required");

    }

    @Test
    public  void purchaseWithoutZipCode(){

        // Add item
        WebElement addItem = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button"));
        addItem.click();

        // Click Cart Item
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

        // Click Continue
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

        // Locate the element containing the error message
        WebElement errorMessageElementZipCode = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[4]/h3"));

        // Extract the text of the error message
        String actualErrorMessage = errorMessageElementZipCode.getText();

        // Define the expected error message
        String expectedErrorMessage = "Error: Postal Code is required";

        // Compare the actual and expected error messages using assertion
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error: Postal Code is required");

    }

    @Test
    public void  cancelPurchase(){

        // Add item
        WebElement addItem = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button"));
        addItem.click();

        // Click Cart Item
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

        // Click Cancel Button
        WebElement cancelButton = driver.findElement(By.id("cancel"));
        cancelButton.click();

        // Back to Previous Page
        WebElement cartPage = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span"));
        Assert.assertTrue(cartPage.isDisplayed());

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}
