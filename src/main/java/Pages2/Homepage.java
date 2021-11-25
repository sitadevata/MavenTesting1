package Pages2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {
    public void login(WebDriver driver,String email, String password )
    {
        driver.findElement(By.id("link-to-login")).click();
        driver.findElement(By.id("spree_user_email")).sendKeys(email);
        driver.findElement(By.name("spree_user[password]")).sendKeys(password);
        driver.findElement(By.name("commit")).click();
    }
}