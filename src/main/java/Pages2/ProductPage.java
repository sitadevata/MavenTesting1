package Pages2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    public void add(WebDriver driver)
    {
        driver.findElement(By.name("quantity")).sendKeys("123456");
        driver.findElement(By.name("quantity")).clear();
        driver.findElement(By.id("add-to-cart-button")).click();
        //driver.findElement(By.name("button")).click();
    }
}