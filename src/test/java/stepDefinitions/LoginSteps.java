package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.MySqlDB;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.LoginPage;
import stepDefinitions.setUp.BrowserSetup;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class LoginSteps {
    public WebDriver driver = BrowserSetup.driver;
    public WebDriverWait wait = BrowserSetup.wait;
    public Properties prop = BrowserSetup.prop;

    @Given("^Login \"([^\"]*)\" app with (.*) and (.*)$")
    public void login_application_with(String appName, String username, String password) throws InterruptedException {
        switch(appName)
        {
            case "Buyer":
                driver.get(prop.getProperty("BaseURL"));
                PageFactory.initElements(driver, LoginPage.class);
                LoginPage.loginSignUp_link.click();
                System.out.println("Login link clicked");
                LoginPage.loginWithPassword_link.click();
                System.out.println("login With Password Link  clicked");
                LoginPage.email_input.sendKeys(username);
                LoginPage.password_input.sendKeys(password);
                LoginPage.rememberMe_checkBox.click();
                PageFactory.initElements(driver, LoginPage.class);
                LoginPage.login_button.click();
                Thread.sleep(3000);
                Assert.assertTrue("DashBoard Page is not displayed", LoginPage.dashBoard_page.isDisplayed());

                break;
            case "Admin":
                driver.get(prop.getProperty("BaseURL")+"login");
                PageFactory.initElements(driver, LoginPage.class);
                LoginPage.email_input.sendKeys(username);
                LoginPage.password_input.sendKeys(password);
                LoginPage.rememberMe_checkBox.click();
                LoginPage.login_button.click();
                Thread.sleep(3000);
                Assert.assertTrue("DashBoard Page is not displayed", LoginPage.dashBoard_page.isDisplayed());
                Thread.sleep(1000);
                break;
        }
    }

    @Given("^Login \"([^\"]*)\" app with (.*)$")
    public void login_application_(String mobile_No) throws InterruptedException {
        driver.get(prop.getProperty("BaseURL"));
        PageFactory.initElements(driver, LoginPage.class);
        LoginPage.loginSignUp_link.click();
        System.out.println("Login link clicked");
        LoginPage.mobileNo_input.sendKeys(mobile_No);
        LoginPage.otp_button.click();
    }

    @And("Logout from App")
    public void reset_the_credential() {
        LoginPage.logout_link.click();
        Assert.assertTrue("Logout not happen ", LoginPage.loginSignUp_link.isDisplayed());
    }

    @And("Select product")
    public void select_product() throws InterruptedException {
        String gst_details,pan_details,name,address,postal_code,city,state,country,phone;
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
        gst_details= LoginPage.GST_no.getText();
        pan_details = LoginPage.PAN_no.getText();
         name = LoginPage.name.getText();
         address = LoginPage.address.getText();
        postal_code = LoginPage.postal_code.getText();
         city = LoginPage.city.getText();
         state = LoginPage.state.getText();
        country = LoginPage.country.getText();
         phone = LoginPage.phone.getText();
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

    public static void main(String[] args) throws IOException, SQLException {
        MySqlDB sql= new MySqlDB();
        ResultSet rs=sql.executeQuery("Select * from mobile_verifications as m  where mobile=8898347897;","blumart");
        while(rs.next())
        {
            System.out.println(rs.getString("mobile")+"  "+rs.getInt("otp"));
        }
        sql.closeConnection();
    }




}
