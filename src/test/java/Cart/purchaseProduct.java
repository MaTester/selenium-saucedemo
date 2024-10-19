package Cart;
import Login.loginPage;
import Intro.openBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class purchaseProduct extends loginPage {

    @Test(priority = 11)
    public void purchaseSuccess(){
        loginTest();
        // Select the product and Wait until the product is clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement product = wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-sauce-labs-backpack")));
        Assert.assertTrue(product.isDisplayed(), "Product was not visible");   // Assert that the product is visible
        Assert.assertTrue(product.isEnabled(), "Product was not clickable");   // Assert that the product is clickable
        product.click();
        System.out.println("Sauce Labs backpack was selected");

        // Click the add cart icon
        WebElement cartIcon = driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]"));
        Assert.assertTrue(cartIcon.isDisplayed(), "Cart Icon was not visible");
        Assert.assertTrue(cartIcon.isEnabled(), "Cart Icon was not clickable");
        cartIcon.click();
        System.out.println("Cart icon was clickable");

        // Click checkout button from Your cart page
        WebElement checkoutButton = driver.findElement(By.id("checkout"));
        Assert.assertTrue(checkoutButton.isDisplayed(), "Checkout button was not visible");
        Assert.assertTrue(checkoutButton.isEnabled(),"Checkout button was not clickable");
        checkoutButton.click();
        System.out.println("Checkout icon was clickable");

        // Enter Firstname Profile
        WebElement firstNameField = driver.findElement(By.id("first-name"));
        firstNameField.sendKeys(firstName);
        System.out.println("Firstname was filled");
        Assert.assertEquals(firstNameField.getAttribute("value"), firstName, "First name input did not match the expected value.");

        // Enter Lastname Profile
        WebElement lastNameField = driver.findElement(By.id("last-name"));
        lastNameField.sendKeys(lastName);
        System.out.println("Last name was filled");
        Assert.assertEquals(lastNameField.getAttribute("value"), lastName, "Last name did not match the expected value");

        // Enter zipCode Profile
        WebElement zipCodeField = driver.findElement(By.id("postal-code"));
        zipCodeField.sendKeys(zipCode);
        System.out.println("Zipcode was filled");
        Assert.assertEquals(zipCodeField.getAttribute("value"), zipCode, "Zipcode did not match the actual value");

        // Click continue button from Checkout: Your Information
        WebElement continueButton = driver.findElement(By.id("continue"));
        Assert.assertTrue(continueButton.isDisplayed(), "Continue button was not visible");
        Assert.assertTrue(continueButton.isEnabled(), "Continue button was not clickable");
        continueButton.click();
        System.out.println("Continue button was clickable");

        // Click Finish button
        WebElement finishButton = driver.findElement(By.id("finish"));
        Assert.assertTrue(finishButton.isDisplayed(), "Finish button was not visible");
        Assert.assertTrue(finishButton.isEnabled(),"Finish button was not clickable");
        finishButton.click();
        System.out.println("Finish button was clickable");

        // Assert purchase has created successful
        String completeURL = driver.getCurrentUrl();
        Assert.assertTrue(completeURL.contains("checkout-complete"), "URL was not checkout complete");

        WebElement checkoutComplete = driver.findElement(By.xpath("//h2[contains(text(),'Thank you for your order!')]"));
        Assert.assertTrue(checkoutComplete.isDisplayed(), "Thank you for your order page was not displayed");

        // Back to homepage
        WebElement backToHomeButton = driver.findElement(By.id("back-to-products"));
        Assert.assertTrue(backToHomeButton.isDisplayed(), "Back to home button was not visible");
        Assert.assertTrue(backToHomeButton.isEnabled(),"Back to home button was not clickable");
        backToHomeButton.click();
        System.out.println("back to home button was clickable");
    }

    @Test(priority = 12)
    public void removeCart(){
        loginTest();
        // Select the product and Wait until the product is clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement product = wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-sauce-labs-backpack")));
        Assert.assertTrue(product.isDisplayed(), "Product was not visible");   // Assert that the product is visible
        Assert.assertTrue(product.isEnabled(), "Product was not clickable");   // Assert that the product is clickable
        product.click();
        System.out.println("Sauce Labs backpack was selected");

        // Click the add cart icon
        WebElement cartIcon = driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]"));
        Assert.assertTrue(cartIcon.isDisplayed(), "Cart Icon was not visible");
        Assert.assertTrue(cartIcon.isEnabled(), "Cart Icon was not clickable");
        cartIcon.click();
        System.out.println("Cart icon was clickable");

        // Remove product from cart list
        WebElement removeButton = driver.findElement(By.id("remove-sauce-labs-backpack"));
        Assert.assertTrue(removeButton.isDisplayed(), "Remove button was not visible");
        Assert.assertTrue(removeButton.isEnabled(),"Remove button was not clickable");
        removeButton.click();
        System.out.println("Remove button was clickable");

        // Click continue shopping button
        WebElement conShopButton = driver.findElement(By.id("continue-shopping"));
        Assert.assertTrue(conShopButton.isDisplayed(), "Continue shopping button was visible");
        Assert.assertTrue(conShopButton.isEnabled(),"Continue shopping button was clickable");
        conShopButton.click();
        System.out.println("Continue shopping button was clickable");

    }

    @Test(priority = 13)
    public void purchaseWithoutFirstName(){
        loginTest();
        // Select the product and Wait until the product is clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement product = wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-sauce-labs-backpack")));
        Assert.assertTrue(product.isDisplayed(), "Product was not visible");   // Assert that the product is visible
        Assert.assertTrue(product.isEnabled(), "Product was not clickable");   // Assert that the product is clickable
        product.click();
        System.out.println("Sauce Labs backpack was selected");

        // Click the add cart icon
        WebElement cartIcon = driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]"));
        Assert.assertTrue(cartIcon.isDisplayed(), "Cart Icon was not visible");
        Assert.assertTrue(cartIcon.isEnabled(), "Cart Icon was not clickable");
        cartIcon.click();
        System.out.println("Cart icon was clickable");

        // Click checkout button from Your cart page
        WebElement checkoutButton = driver.findElement(By.id("checkout"));
        Assert.assertTrue(checkoutButton.isDisplayed(), "Checkout button was not visible");
        Assert.assertTrue(checkoutButton.isEnabled(),"Checkout button was not clickable");
        checkoutButton.click();
        System.out.println("Checkout icon was clickable");

        // Enter Lastname Profile
        WebElement lastNameField = driver.findElement(By.id("last-name"));
        lastNameField.sendKeys(lastName);
        System.out.println("Last name was filled");
        Assert.assertEquals(lastNameField.getAttribute("value"), lastName, "Last name did not match the expected value");

        // Enter zipCode Profile
        WebElement zipCodeField = driver.findElement(By.id("postal-code"));
        zipCodeField.sendKeys(zipCode);
        System.out.println("Zipcode was filled");
        Assert.assertEquals(zipCodeField.getAttribute("value"), zipCode, "Zipcode did not match the actual value");

        // Click continue button from Checkout: Your Information
        WebElement continueButton = driver.findElement(By.id("continue"));
        Assert.assertTrue(continueButton.isDisplayed(), "Continue button was not visible");
        Assert.assertTrue(continueButton.isEnabled(), "Continue button was not clickable");
        continueButton.click();
        System.out.println("Continue button was clickable");

        // Assert an error message
        WebElement errorFirstName = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[4]/h3[1]"));
        Assert.assertTrue(errorFirstName.isDisplayed(),"An error message was not displayed");
        String errorFirstNameText = errorFirstName.getText();
        System.out.print("An error message was displayed:" + errorFirstNameText);
    }

    @Test(priority = 14)
    public void purchaseWithoutLastName(){
        loginTest();
        // Select the product and Wait until the product is clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement product = wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-sauce-labs-bike-light")));
        Assert.assertTrue(product.isDisplayed(), "Product was not visible");   // Assert that the product is visible
        Assert.assertTrue(product.isEnabled(), "Product was not clickable");   // Assert that the product is clickable
        product.click();
        System.out.println("Sauce Labs backpack was selected");

        // Click the add cart icon
        WebElement cartIcon = driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]"));
        Assert.assertTrue(cartIcon.isDisplayed(), "Cart Icon was not visible");
        Assert.assertTrue(cartIcon.isEnabled(), "Cart Icon was not clickable");
        cartIcon.click();
        System.out.println("Cart icon was clickable");

        // Click checkout button from Your cart page
        WebElement checkoutButton = driver.findElement(By.id("checkout"));
        Assert.assertTrue(checkoutButton.isDisplayed(), "Checkout button was not visible");
        Assert.assertTrue(checkoutButton.isEnabled(),"Checkout button was not clickable");
        checkoutButton.click();
        System.out.println("Checkout icon was clickable");

        // Enter Firstname Profile
        WebElement firstNameField = driver.findElement(By.id("first-name"));
        firstNameField.sendKeys(firstName);
        System.out.println("Firstname was filled");
        Assert.assertEquals(firstNameField.getAttribute("value"), firstName, "First name input did not match the expected value.");

        // Enter zipCode Profile
        WebElement zipCodeField = driver.findElement(By.id("postal-code"));
        zipCodeField.sendKeys(zipCode);
        System.out.println("Zipcode was filled");
        Assert.assertEquals(zipCodeField.getAttribute("value"), zipCode, "Zipcode did not match the actual value");

        // Click continue button from Checkout: Your Information
        WebElement continueButton = driver.findElement(By.id("continue"));
        Assert.assertTrue(continueButton.isDisplayed(), "Continue button was not visible");
        Assert.assertTrue(continueButton.isEnabled(), "Continue button was not clickable");
        continueButton.click();
        System.out.println("Continue button was clickable");

        // Assert an error message
        WebElement errorMessageLastName = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[4]/h3[1]"));
        Assert.assertTrue(errorMessageLastName.isDisplayed(), "An error message was not displayed");
        String errorMessageLastNameText = errorMessageLastName.getText();
        System.out.println("An error message was displayed:" + errorMessageLastNameText);
    }

    @Test(priority = 15)
    public void purchaseWithoutZipcode(){
        loginTest();
        // Select the product and Wait until the product is clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement product = wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-sauce-labs-bolt-t-shirt")));
        Assert.assertTrue(product.isDisplayed(), "Product was not visible");   // Assert that the product is visible
        Assert.assertTrue(product.isEnabled(), "Product was not clickable");   // Assert that the product is clickable
        product.click();
        System.out.println("Sauce Labs backpack was selected");

        // Click the add cart icon
        WebElement cartIcon = driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]"));
        Assert.assertTrue(cartIcon.isDisplayed(), "Cart Icon was not visible");
        Assert.assertTrue(cartIcon.isEnabled(), "Cart Icon was not clickable");
        cartIcon.click();
        System.out.println("Cart icon was clickable");

        // Click checkout button from Your cart page
        WebElement checkoutButton = driver.findElement(By.id("checkout"));
        Assert.assertTrue(checkoutButton.isDisplayed(), "Checkout button was not visible");
        Assert.assertTrue(checkoutButton.isEnabled(),"Checkout button was not clickable");
        checkoutButton.click();
        System.out.println("Checkout icon was clickable");

        // Enter Firstname Profile
        WebElement firstNameField = driver.findElement(By.id("first-name"));
        firstNameField.sendKeys(firstName);
        System.out.println("Firstname was filled");
        Assert.assertEquals(firstNameField.getAttribute("value"), firstName, "First name input did not match the expected value.");

        // Enter Lastname Profile
        WebElement lastNameField = driver.findElement(By.id("last-name"));
        lastNameField.sendKeys(lastName);
        System.out.println("Last name was filled");
        Assert.assertEquals(lastNameField.getAttribute("value"), lastName, "Last name did not match the expected value");

        // Click continue button from Checkout: Your Information
        WebElement continueButton = driver.findElement(By.id("continue"));
        Assert.assertTrue(continueButton.isDisplayed(), "Continue button was not visible");
        Assert.assertTrue(continueButton.isEnabled(), "Continue button was not clickable");
        continueButton.click();
        System.out.println("Continue button was clickable");

        // Assert an error message
        WebElement errorMessageZipcode = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[4]/h3[1]"));
        Assert.assertTrue(errorMessageZipcode.isDisplayed(),"An error message was not displayed");
        String errorMessageZipcodeText = errorMessageZipcode.getText();
        System.out.println("An error message was displayed:" + errorMessageZipcodeText);
    }


}
