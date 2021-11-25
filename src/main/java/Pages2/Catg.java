package Pages2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Catg {

    public void clickProduct(WebDriver driver) {
        WebElement dropdown = driver.findElement(By.id("taxon"));
        driver.findElement(By.xpath("//*[@id=\"product_1\"]/div/div[1]/a")).click();

        //Select select = new Select(dropdown);
        //select.selectByValue("3");
    }
}