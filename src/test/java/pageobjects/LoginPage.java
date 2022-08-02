package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class LoginPage extends BaseClass {

    @FindBy(how = How.XPATH, using = "//div[@class='container']//span[text()='Manage Profile']")
    public static WebElement manage_profile;

    @FindBy(how = How.XPATH, using = "//div[@class='card']//input[@placeholder='Shop Name']")
    public static WebElement shop_name_input;

    @FindBy(how = How.XPATH, using = "//div[@class='card']//input[@placeholder='Confirm Password']")
    public static WebElement confirm_password_input;

    @FindBy(how = How.XPATH, using = "//div[@class='card']//input[@placeholder='New Password']")
    public static WebElement new_password_input;

    @FindBy(how = How.XPATH, using = "//button[text()='Update Profile']")
    public static WebElement update_profile_button;

    @FindBy(how = How.XPATH, using = "//*[text()='Your Profile has been updated successfully!']")
    public static WebElement profile_update_msg;


    @FindBy(how = How.XPATH, using = "//*[text()='A verification mail has been sent to the mail you provided us with.']")
    public static WebElement update_email_msg;

    @FindBy(how = How.XPATH, using = "//input[@name='email' and @placeholder='Your Email']")
    public static WebElement change_email_id_input;

    @FindBy(how = How.XPATH, using = "//span[text()='Products']")
    public static WebElement admin_product;


    @FindBy(how = How.XPATH, using = "//li[@class='aiz-side-nav-item mm-active']//span[text()='Products']")
    public static List<WebElement> admin_product_expand;

    @FindBy(how = How.XPATH, using = "//li[@class='aiz-side-nav-item mm-active']//span[text()='Buyers']")
    public static List<WebElement> admin_buyer_expand;

    @FindBy(how = How.XPATH, using = "//span[text()='Buyers']")
    public static WebElement admin_buyer;

    @FindBy(how = How.XPATH, using = "//span[text()='Buyer list']")
    public static WebElement admin_buyer_list;

    @FindBy(how = How.XPATH, using = "//h1[text()='All Buyers']")
    public static WebElement admin_all_buyer_page;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Type email or name & Enter']")
    public static WebElement admin_search_mobileno_Or_EmailId;

    @FindBy(how = How.XPATH, using = "//div[@class='card-body']/table/tbody/tr")
    public static List<WebElement> admin_search_result;

    @FindBy(how = How.XPATH, using = "//div[@class='card-body']//td[text()='+918898347897']/following-sibling::td/a[@title='Delete']")
    public static WebElement admin_search_delete;

    @FindBy(how = How.XPATH, using = "//div[@id='delete-modal' and @class='modal fade show']//a[text()='Delete']")
    public static WebElement admin_search_delete_button;

    @FindBy(how = How.XPATH, using = "//span[text()='Buyer has been deleted successfully']")
    public static WebElement buyer_deleted_msg;
    @FindBy(how = How.XPATH, using = "//button[text()='Update Email']")
    public static WebElement update_email_button;

    @FindBy(how = How.XPATH, using = "//div[@class='card']//input[@placeholder='Your Phone']")
    public static WebElement phone_no_input;

    @FindBy(how = How.XPATH, using = "//h1[text()='Manage Profile']")
    public static WebElement manage_profile_page;

    @FindBy(how = How.XPATH, using = "//input[@name='mobile']")
    public static WebElement mobileNo_input;


    @FindBy(how = How.XPATH, using = "//button[text()='Get OTP']")
    public static WebElement otp_button;

    @FindBy(how = How.XPATH, using = "//input[@name='otp']")
    public static WebElement otp_input;
    @FindBy(how = How.XPATH, using = "//button[text()='Login as buyer']")
    public static WebElement loginasBuyer_button;
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
