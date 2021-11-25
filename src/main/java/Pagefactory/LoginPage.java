package Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
                @FindBy(id = "spree_user_email")
               private WebElement Email;
                @FindBy(name = "spree_user[password]")
                private WebElement Password;
                @FindBy(name = "commit")
               private WebElement Login;
                public LoginPage (WebDriver driver)
                {
                        PageFactory.initElements(driver, this);
                }
                public void loginSpree (String Email1, String Password1)
                {
                         Email.sendKeys(Email1);
                        Password.sendKeys(Password1);
                        Login.click();
                }

        }
