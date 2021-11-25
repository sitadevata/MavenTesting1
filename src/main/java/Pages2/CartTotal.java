package Pages2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartTotal {
    public String total ;

    public String getItemTotal(WebDriver driver)
    {
        total=driver.findElement(By.cssSelector("td[data-hook=\"cart_item_price\"]")).getText();
        //String total = tableElement.findElement(By.id("td.lead")).getText();
        return total;
    }
}