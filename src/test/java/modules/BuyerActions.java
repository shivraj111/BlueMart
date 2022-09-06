package modules;

import helpers.CommonActionHelpers;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.LoginPage;
import stepDefinitions.setUp.BrowserSetup;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

import static helpers.CommonActionHelpers.getOTP;

public class BuyerActions {
    public WebDriver driver = BrowserSetup.driver;
    public WebDriverWait wait = BrowserSetup.wait;
    public Properties prop = BrowserSetup.prop;

    public void buyerLogin(String username, String password) throws InterruptedException {
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

    }


    public void buyer_registration(String appName, String mobile_no, String userName, String password) throws SQLException, IOException, InterruptedException {
        CommonActionHelpers commonActionHelpers = new CommonActionHelpers();
        driver.get(prop.getProperty("BaseURL"));
        PageFactory.initElements(driver, LoginPage.class);
        LoginPage.loginSignUp_link.click();
        System.out.println("Login link clicked");
        LoginPage.mobileNo_input.sendKeys(mobile_no);
        LoginPage.otp_button.click();
        LoginPage.otp_input.sendKeys(String.valueOf(getOTP(mobile_no)));
        LoginPage.loginasBuyer_button.click();
        Assert.assertTrue("DashBoard Page is not displayed", LoginPage.dashBoard_page.isDisplayed());
        //((JavascriptExecutor) driver).executeScript("window.scrollBy(0,250)");
        //Actions act= new Actions(driver);
        //act.moveToElement(LoginPage.manage_profile).click().build().perform();
        //PageFactory.initElements(driver, LoginPage.class);
        Thread.sleep(1000);
        LoginPage.manage_profile.click();
        Assert.assertTrue("Manage Profile Page is not displayed", LoginPage.manage_profile_page.isDisplayed());
        LoginPage.shop_name_input.clear();
        LoginPage.shop_name_input.sendKeys(prop.getProperty("Shop_name"));
        String manage_profile_phone_no = LoginPage.phone_no_input.getAttribute("value").substring(3);
        Assert.assertEquals("Manage Profile Phone No mismatch", mobile_no, manage_profile_phone_no);
        LoginPage.new_password_input.sendKeys(password);
        LoginPage.confirm_password_input.sendKeys(password);
        LoginPage.update_profile_button.click();
        Assert.assertTrue("Profile Updated message not displayed", LoginPage.profile_update_msg.isDisplayed());
        LoginPage.change_email_id_input.clear();
        LoginPage.change_email_id_input.sendKeys(userName);
        LoginPage.update_email_button.click();
        Assert.assertTrue("Email Updated message not displayed", LoginPage.update_email_msg.isDisplayed());
        commonActionHelpers.updateEmailId("blumart");
        Thread.sleep(1000);
        LoginPage.logout_link.click();
        Assert.assertTrue("Logout not happen ", LoginPage.loginSignUp_link.isDisplayed());


    }
}
