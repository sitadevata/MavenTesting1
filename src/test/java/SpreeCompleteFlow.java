import Pagefactory.*;
import jdk.jfr.Category;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Locale;


public class SpreeCompleteFlow {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("webdriver.chrome.driver", "src/test/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://spree-vapasi-prod.herokuapp.com/login");
        driver.manage().window().maximize();
    }

    @Test
    public void completeFlow()
    {
        LoginPage loginVariable = new LoginPage(driver);
        Homepage message = new Homepage(driver);
        AddToCart product = new AddToCart(driver);
        CheckOut check = new CheckOut(driver);
        BillingAddress bilAddress = new BillingAddress(driver);

        loginVariable.loginSpree("sita2.devata@test.com","Daddy@12345678");
        message.verifyLoginSuccessful();
        product.cart();
        check.checkOut();
        bilAddress.entryAddress("Sita","Mahalaxmi","Manikonda","Hyderabad","Telangana",
               533001,"India",34567);
    }

   // @AfterMethod
    //public void afterMethod() {
       // driver.close();
        //driver.quit();
    }

