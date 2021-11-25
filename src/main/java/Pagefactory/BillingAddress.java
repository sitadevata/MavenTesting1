package Pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingAddress {
    @FindBy(name="order[bill_address_attributes][firstname]")
    private WebElement firstname;
    @FindBy(name="order[bill_address_attributes][lastname]")
    private WebElement lastname;
    @FindBy(name="order[bill_address_attributes][address1]")
    private WebElement address;
    @FindBy(name="order[bill_address_attributes][city]")
    private WebElement city;
    @FindBy(name="order[bill_address_attributes][state_id]")
    private WebElement state;
    @FindBy(name="order[bill_address_attributes][zipcode]")
    private WebElement code;
    @FindBy(id="bcountry")
    private WebElement country;
    @FindBy(name="order[bill_address_attributes][phone]")
    private WebElement phnumber;
    @FindBy(name="commit")
    private WebElement saveAndCont;

    public BillingAddress(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void entryAddress(String f1,String l1,String a1,String c1,String s1,int c2,String con,int ph)
    {
        firstname.sendKeys(f1);
        lastname.sendKeys();
        address.sendKeys();
        city.sendKeys();
        state.sendKeys();
        code.sendKeys();
        country.sendKeys();
        phnumber.sendKeys();
        saveAndCont.click();
    }
}
