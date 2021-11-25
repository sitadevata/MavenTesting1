import Pages2.CartTotal;
import Pages2.Catg;
import Pages2.Homepage;
import Pages2.ProductPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Driver;

import static org.testng.Assert.assertEquals;

public class ShoppingPom {
    public WebDriver driver;

    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("webdriver.chrome.driver", "src/test/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://spree-vapasi-prod.herokuapp.com/login");
    }

    @Test
    public void addItem(){
        Homepage homepage = new Homepage();
        homepage.login(driver, "sita2.devata@test.com", "Daddy@12345678");
        Catg catg = new Catg();
        catg.clickProduct(driver);
        ProductPage productPage = new ProductPage();
        productPage.add(driver);
        //CartTotal total1 = new CartTotal();
        //Assert.assertEquals(total1.getItemTotal(driver),"4924.92");
        System.out.println("total is ");
    }

    //@AfterMethod
    public void afterMethod()
    {
        driver.quit();
    }
}