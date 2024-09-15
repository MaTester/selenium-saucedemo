package Home;
import Login.loginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class filterProduct extends loginPage {

    @Test(priority = 7)
    public void filterNameAZ(){
        loginTest();
        WebElement filter_NameAZ = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        Select filterDropdown = new Select(filter_NameAZ);
        filterDropdown.selectByValue("az");
        System.out.println("Product was filtered by name A-Z");
    }
    @Test(priority = 8)
    public void filterNameZA(){
        loginTest();
        WebElement filter_NameZA = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        Select filterDropdown = new Select(filter_NameZA);
        filterDropdown.selectByValue("za");
        System.out.println("Product was filtered by name Z-A");
    }
    @Test(priority = 9)
    public void filterPriceLoHi(){
        loginTest();
        WebElement filter_PriceLoHi = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        Select filterDropdown = new Select(filter_PriceLoHi);
        filterDropdown.selectByValue("lohi");
        System.out.println("Product was filtered by price low to high");
    }
    @Test(priority = 10)
    public void filterPriceHiLo(){
        loginTest();
        WebElement filter_PriceHiLo = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        Select filterDropdown = new Select(filter_PriceHiLo);
        filterDropdown.selectByValue("hilo");
        System.out.println("Product was filtered by price high to low");
    }
}
