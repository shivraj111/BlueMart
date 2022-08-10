package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class SellerPage extends BaseClass {

    @FindBy(how = How.XPATH, using = "//button[text()='Login as Seller']")
    public static WebElement loginasSeller_button;

    @FindBy(how = How.XPATH, using = "//a[text()='Be A Seller']")
    public static WebElement beaSeller_link;

    @FindBy(how = How.XPATH, using = "//h1[text()='Seller Registration']")
    public static WebElement seller_registration_page;

    @FindBy(how = How.XPATH, using = "//div[@class='form-card']//input[@name='name']")
    public static WebElement seller_name;

    public SellerPage(WebDriver driver) {
        super(driver);
    }
}
