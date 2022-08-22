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

    @FindBy(how = How.XPATH, using = "//div[@class='form-card']//input[@id='mobile_code']")
    public static WebElement mobile_no;
    @FindBy(how = How.XPATH, using = "//button[text()='Send OTP']")
    public static WebElement send_OTP_button;

    @FindBy(how = How.XPATH, using = "//input[@name='otp']")
    public static WebElement otp_input;

    @FindBy(how = How.XPATH, using = "//input[@name='email' and @placeholder='Email Id']")
    public static WebElement email_input;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Password']")
    public static WebElement password_input;

    @FindBy(how = How.XPATH, using = "//div[@class='form-card']//input[@placeholder='Confirm Password']")
    public static WebElement confirm_password_input;

    @FindBy(how = How.XPATH, using = "//input[@type='button' and @value='Next']")
    public static WebElement next_button;

    @FindBy(how = How.XPATH, using = "//ul[@id='progressbar']/li[@class='active' and @id='account']/parent::ul/li[@id='company' and @class='active']")
    public static WebElement account_company_progressbar;

    @FindBy(how = How.XPATH, using = "//div[@class='form-card']//input[@name='gst' ]")
    public static WebElement gst_input;

    @FindBy(how = How.XPATH, using = "//div[@class='form-card']//button[text()='Fetch']")
    public static WebElement fetch_button;

    @FindBy(how = How.XPATH, using = "//div[@class='form-card']//input[@name='company_name']")
    public static WebElement company_name;

    @FindBy(how = How.XPATH, using = "//div[@class='form-card']//input[@id='shop_mobile']")
    public static WebElement shop_mobile_no;

    @FindBy(how = How.XPATH, using = "//div[@class='form-card']//input[@id='shop_mobile']")
    public static WebElement company_address;

    @FindBy(how = How.XPATH, using = "//div[@class='form-card']//input[@name='pincode']")
    public static WebElement pincode;

    @FindBy(how = How.XPATH, using = "//span[@class='aiz-square-check']")
    public static WebElement agree_checkBox;


    @FindBy(how = How.XPATH, using = "//form[@id='msform']//input[@name='previous']")
    public static WebElement previous_button;

    @FindBy(how = How.XPATH, using = "//form[@id='msform']//input[@value='Finish']")
    public static WebElement finish_button;

    @FindBy(how = How.XPATH, using = "//div[@class='swal-modal']/div[@class='swal-text']")
    public static WebElement registration_error_msg;

    @FindBy(how = How.XPATH, using = "//div[@class='swal-modal']/div//button[text()='OK']")
    public static WebElement ok_button;

    @FindBy(how = How.XPATH, using = "//input[@name='mobile']/following-sibling::span")
    public static WebElement mobile_label_error;

    @FindBy(how = How.XPATH, using = "//input[@name='gst']/following-sibling::span")
    public static WebElement GST_label_error;


    public SellerPage(WebDriver driver) {
        super(driver);
    }



}
