import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddItem {

    WebDriver driver;
    public static void add(WebDriver driver)
    {
        driver.findElement(By.xpath("//*[@id=\"product_1\"]/div/div[1]/a")).click();
        driver.findElement(By.name("quantity")).sendKeys("59");
        driver.findElement(By.name("button")).click();
    }
}
