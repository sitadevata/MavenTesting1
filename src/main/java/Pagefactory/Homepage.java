package Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Homepage {
    @FindBy(css = "div[class=\"alert alert-success\"]")
    WebElement message1;

    public Homepage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void verifyLoginSuccessful() {
        String actual ="Logged in successfully";
        String excepted = message1.getText() ;
        Assert.assertEquals(actual,excepted,"Login didn't match");
        System.out.println("Logged in successfully"+message1);
    }
}