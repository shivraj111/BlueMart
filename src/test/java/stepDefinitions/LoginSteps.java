package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.LoginPage;
import stepDefinitions.setUp.BrowserSetup;

import java.util.Properties;

public class LoginSteps {
    public WebDriver driver = BrowserSetup.driver;
    public WebDriverWait wait = BrowserSetup.wait;
    public Properties prop = BrowserSetup.prop;

    @Given("Launch the application")
    public void launch_the_application() {
        PageFactory.initElements(driver, LoginPage.class);
        LoginPage.loginSignUp_link.click();
        System.out.println("Login link clicked");

    }

    @And("Logout from App")
    public void reset_the_credential() {
        LoginPage.logout_link.click();
        Assert.assertTrue("Logout not happen ", LoginPage.loginSignUp_link.isDisplayed());
    }

    @And("Login with (.*) and (.*)$")
    public void enter_UserName_and_Password(String username, String password) throws InterruptedException {
        PageFactory.initElements(driver, LoginPage.class);
        LoginPage.loginWithPassword_link.click();
        System.out.println("login With Password Link  clicked");
        LoginPage.email_input.sendKeys(username);
        LoginPage.password_input.sendKeys(password);
        LoginPage.rememberMe_checkBox.click();
        LoginPage.login_button.click();
        Thread.sleep(3000);
        Assert.assertTrue("DashBoard Page is not displayed", LoginPage.dashBoard_page.isDisplayed());
    }

    @And("Select product")
    public void select_product() throws InterruptedException {

        LoginPage.allProduct_link.click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOf(LoginPage.product_image)).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOf(LoginPage.buyNow_button)).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOf(LoginPage.phase));

        Assert.assertTrue("My Cart not displayed or name changed ", LoginPage.phase.getText().equals("1. My Cart"));
        Thread.sleep(1000);
        LoginPage.continueShipping_button.click();
        Assert.assertTrue("2. Shipping info not displayed or name changed", LoginPage.phase.getText().equals("2. Shipping info"));
        String gst_details = LoginPage.GST_no.getText();
        String pan_details = LoginPage.PAN_no.getText();
        String name = LoginPage.name.getText();
        String address = LoginPage.address.getText();
        String postal_code = LoginPage.postal_code.getText();
        String city = LoginPage.city.getText();
        String state = LoginPage.state.getText();
        String country = LoginPage.country.getText();
        String phone = LoginPage.phone.getText();
        Assert.assertEquals("GST number mismatch", prop.getProperty("GST"), gst_details.replaceAll("GST Number :", "").trim());
        Assert.assertEquals("PAN number mismatch", prop.getProperty("PAN"), pan_details.replaceAll("PAN Number :", "").trim());
        Assert.assertEquals("Name mismatch", prop.getProperty("Name"), name.trim());
        Assert.assertEquals("Address mismatch", prop.getProperty("Address"), address.trim());
        Assert.assertEquals("Post Code mismatch", prop.getProperty("Postal_code"), postal_code.trim());
        Assert.assertEquals("City mismatch", prop.getProperty("City"), city.trim());
        Assert.assertEquals("State mismatch", prop.getProperty("State"), state.trim());
        Assert.assertEquals("Country mismatch", prop.getProperty("Country"), country.trim());
        Assert.assertEquals("Phone mismatch", prop.getProperty("Phone"), phone.trim());
        LoginPage.continueToPayment_button.click();
        Assert.assertTrue("3. Payment step not displayed or name changed", LoginPage.phase.getText().equals("3. Payment"));

        LoginPage.agree_checkBox.click();
        LoginPage.complete_order_button.click();
        Assert.assertTrue("4.Confirmation step not displayed or name changed", LoginPage.phase.getText().equals("4. Confirmation"));





    }


}
