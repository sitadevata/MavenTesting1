package Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut {
    @FindBy(id = "checkout-link")
    private WebElement checkOut;

    public CheckOut(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void checkOut() {
        checkOut.click();
    }
}
