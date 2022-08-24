package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.MySqlDB;
import org.junit.Assert;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.SellerPage;
import stepDefinitions.setUp.BrowserSetup;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;

public class SellerSteps {

    public WebDriver driver = BrowserSetup.driver;
    public WebDriverWait wait = BrowserSetup.wait;
    public Properties prop = BrowserSetup.prop;
    MySqlDB sql;

    @Given("^Unregistration of \"([^\"]*)\" through DataBase using (.*)$")
    public void unregistration_of_through_DataBase_using(String userType, String mobile_no) throws SQLException, IOException {
        deletequery(mobile_no, getUserID(mobile_no));
    }

    @When("^Another Seller trying to register with already registered '(.*)' using '(.*)'$")
    public void another_Seller_trying_to_register_with_already_Seller(String mobile_no, String name) {

        driver.get(prop.getProperty("BaseURL"));
        PageFactory.initElements(driver, SellerPage.class);
        SellerPage.beaSeller_link.click();
        System.out.println("Be a Seller link clicked");
        Assert.assertTrue("Seller Registration Page is not displayed", SellerPage.seller_registration_page.isDisplayed());
        SellerPage.seller_name.sendKeys(name);
        SellerPage.mobile_no.sendKeys(mobile_no);
        SellerPage.mobile_no.sendKeys(Keys.ENTER);

    }

    @When("Another Seller trying to register with already registered {string} using different {string} and {string}")
    public void another_Seller_trying_to_register_with_already_registered_using_Auto_Seller(String email_id, String new_mobil_no,String name) {
        driver.get(prop.getProperty("BaseURL"));
        PageFactory.initElements(driver, SellerPage.class);
        SellerPage.beaSeller_link.click();
        System.out.println("Be a Seller link clicked");
        Assert.assertTrue("Seller Registration Page is not displayed", SellerPage.seller_registration_page.isDisplayed());
        SellerPage.seller_name.sendKeys(name);
        SellerPage.mobile_no.sendKeys(new_mobil_no);
        SellerPage.mobile_no.sendKeys(Keys.ENTER);

    }

    @When("Another Seller trying to register with already registered {string} using different {string} , {string} , {string} and {string}")
    public void another_Seller_trying_to_register_with_already_using_Auto_Seller(String GST, String new_mobil_no,String new_email_id,String password,String name) throws InterruptedException, SQLException, IOException {
        driver.get(prop.getProperty("BaseURL"));
        PageFactory.initElements(driver, SellerPage.class);
        SellerPage.beaSeller_link.click();
        System.out.println("Be a Seller link clicked");
        Assert.assertTrue("Seller Registration Page is not displayed", SellerPage.seller_registration_page.isDisplayed());
        SellerPage.seller_name.sendKeys(name);
        SellerPage.mobile_no.sendKeys(new_mobil_no);
        SellerPage.mobile_no.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        SellerPage.send_OTP_button.click();
        Thread.sleep(1000);
        SellerPage.otp_input.sendKeys(String.valueOf(LoginSteps.getOTP(new_mobil_no)));
        Thread.sleep(1000);
        SellerPage.email_input.sendKeys(new_email_id);
        SellerPage.password_input.sendKeys(password);
        SellerPage.confirm_password_input.sendKeys(password);
        SellerPage.next_button.click();
        wait.until(ExpectedConditions.visibilityOf(SellerPage.account_company_progressbar));
        SellerPage.gst_input.sendKeys(GST);


    }


    @Then("^Seller should get (.*)$")
    public void seller_should_get_Mobile_already_exist(String error_msg) throws InterruptedException {

        if(error_msg.contains("Mobile already exist")) {
            wait.until(ExpectedConditions.visibilityOf(SellerPage.registration_error_msg));
            Assert.assertEquals("Error msg pop up not displayd", error_msg + "!", SellerPage.registration_error_msg.getText());
            Thread.sleep(1000);
            SellerPage.ok_button.click();
            Thread.sleep(1000);
            Assert.assertEquals("Error msg not displayd near mobile no input text box", error_msg, SellerPage.mobile_label_error.getText());
        }
        else if(error_msg.contains("GST number already exist"))
        {
            Thread.sleep(1000);
            SellerPage.fetch_button.click();
            Thread.sleep(1000);
            Assert.assertEquals("Error msg not displayd near GST input text box", error_msg, SellerPage.GST_label_error.getText());

        }

    }


    public void deletequery(String mobile_no, String userID) throws IOException, SQLException {
        sql = new MySqlDB();
        List<String> lst = new ArrayList<String>();
        lst.add("delete from users where id=" + userID + ";");
        lst.add("delete from sellers where user_id=" + userID + ";");
        lst.add("delete from blumart.shops where phone like '%" + mobile_no + "';");

        ListIterator<String> it = lst.listIterator();
        while (it.hasNext()) {
            int i = sql.updateQuery(it.next(), "blumart");
            Assert.assertNotEquals("delete Query return value : " + i, 0, i);
        }

        sql.closeConnection();
    }


    public String getUserID(String mobile_no) throws SQLException, IOException {
        String id = null;
        sql = new MySqlDB();
        ResultSet rs = sql.executeQuery("Select * from users where user_type ='seller' and phone like '%" + mobile_no + "';", "blumart");
        while (rs.next()) {
            id = rs.getString("id");
            System.out.println("UserID" + id);
        }
        rs.close();
        sql.closeConnection();
        return id;
    }


}
