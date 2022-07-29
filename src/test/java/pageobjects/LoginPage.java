package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class LoginPage extends BaseClass {


    @FindBy(how = How.XPATH, using = "//input[@name='mobile']")
    public static WebElement mobileNo_input;


    @FindBy(how = How.XPATH, using = "//button[text()='Get OTP']")
    public static WebElement otp_button;

    @FindBy(how = How.XPATH, using = "//a[text()='Login / Sign-up']")
    public static WebElement loginSignUp_link;

    @FindBy(how = How.XPATH, using = "//a[text()='Login with password']")
    public static WebElement loginWithPassword_link;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Dashboard')]")
    public static WebElement dashBoard_page;

    @FindBy(how = How.XPATH, using = "//a[text()='Logout']")
    public static WebElement logout_link;

    @FindBy(how = How.XPATH, using = "//input[@name='email' and @placeholder='Email']")
    public static WebElement email_input;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Password']")
    public static WebElement password_input;

    @FindBy(how = How.XPATH, using = "//span[@class='aiz-square-check']")
    public static WebElement rememberMe_checkBox;


    @FindBy(how = How.XPATH, using = "//form[@action='http://dev.blumart.in/login']//button[contains(text(),'Login')]")
    public static WebElement login_button;

    //-------------------Home Page locator
    @FindBy(how = How.XPATH, using = "(//div[@class='row gutters-5 row-cols-xxl-4 row-cols-xl-3 row-cols-lg-4 row-cols-md-3 row-cols-2']//div[@class='position-relative'])[1]")
    public static WebElement product_image;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary']/i[text()='All']")
    public static WebElement allProduct_link;

    @FindBy(how = How.XPATH, using = "//div[@class='row aiz-steps arrow-divider']//div[contains(@class,'text-center text-primary')]/h3")
    public static WebElement phase;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Continue to Shipping')]")
    public static WebElement continueShipping_button;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'GST Number :')]")
    public static WebElement GST_no;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'PAN Number :')]")
    public static WebElement PAN_no;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Name:')]/following-sibling::span")
    public static WebElement name;


    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Name:')]/ancestor::span//*[contains(text(),'Address:')]/following-sibling::span")
    public static WebElement address;
    //*[contains(text(),'Postal code:')]/following-sibling::span

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Postal code:')]/following-sibling::span")
    public static WebElement postal_code;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'City:')]/following-sibling::span")
    public static WebElement city;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'State:')]/following-sibling::span")
    public static WebElement state;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Country:')]/following-sibling::span")
    public static WebElement country;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Phone:')]/following-sibling::span")
    public static WebElement phone;


    @FindBy(how = How.XPATH, using = "//button[@onclick='buyNow()']")
    public static WebElement buyNow_button;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Continue to Payment')]")
    public static WebElement continueToPayment_button;

    @FindBy(how = How.XPATH, using = "//span[@class='aiz-square-check']")
    public static WebElement agree_checkBox;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Complete Order')]")
    public static WebElement complete_order_button;


//------------------Admin locators



    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
