//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Homepage {
//
//    WebDriver driver ;
//
//    public static void homePage(WebDriver driver) {
//        System.setProperty("webdriver.chrome.driver", "src/test/chromedriver");
//        driver = new ChromeDriver();
//        driver.get("https://spree-vapasi-prod.herokuapp.com/login");
//        driver.findElement(By.id("link-to-login")).click();
//        driver.findElement(By.id("spree_user_email")).sendKeys("sita2.devata@test.com");
//        driver.findElement(By.name("spree_user[password]")).sendKeys("Daddy@12345678");
//        driver.findElement(By.name("commit")).click();
//    }
//}