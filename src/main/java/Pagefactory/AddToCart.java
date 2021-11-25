package Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
    @FindBy(xpath = "//*[@id=\"product_3\"]")
    private WebElement item;
    @FindBy(id = "quantity")
    private WebElement value;
    @FindBy(id = "add-to-cart-button")
    private WebElement button1;

    public AddToCart(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void cart(){
        item.click();
        value.sendKeys("4");
        button1.click();
    }
}
