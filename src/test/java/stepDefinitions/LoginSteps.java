package stepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import helpers.MySqlDB;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.LoginPage;
import pageobjects.SellerPage;
import stepDefinitions.setUp.BrowserSetup;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class LoginSteps {
    public WebDriver driver = BrowserSetup.driver;
    public WebDriverWait wait = BrowserSetup.wait;
    public Properties prop = BrowserSetup.prop;


    @Given("^Unregistration of \"([^\"]*)\" using (.*) on \"([^\"]*)\" app$")
    public void unregistration_of_using_on_app(String buyer, String mobile_no, String admin) throws InterruptedException {
        adminLogin(prop.getProperty("Admin.username"), prop.getProperty("Admin.password"));
//        if (LoginPage.admin_product_expand.size() != 0) {
//            LoginPage.admin_product.click();
//        }
//        if (LoginPage.admin_buyer_expand.size() == 0) {
//            LoginPage.admin_buyer.click();
//        }
        LoginPage.admin_buyer.click();
        Thread.sleep(2000);
        LoginPage.admin_buyer_list.click();
        LoginPage.admin_all_buyer_page.isDisplayed();
        LoginPage.admin_search_mobileno_Or_EmailId.sendKeys(mobile_no);
        LoginPage.admin_search_mobileno_Or_EmailId.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        if (LoginPage.admin_search_result.size() != 1) {
            LoginPage.admin_search_mobileno_Or_EmailId.sendKeys(Keys.ENTER);
            Thread.sleep(1000);
        }
        Assert.assertEquals("More result with one mobile no search ", 1, LoginPage.admin_search_result.size());
        //Assert.assertEquals();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='card-body']//td[text()='111shivraj@gmail.com']/following-sibling::td[text()='+918898347897']/following-sibling::td/a[@title='Delete']")).click();
        //LoginPage.admin_search_delete.click();
        Thread.sleep(1000);
        LoginPage.admin_search_delete_button.click();
        Assert.assertTrue("buyer deleted msg not displayed", LoginPage.buyer_deleted_msg.isDisplayed());


    }

    @Given("^Login \"([^\"]*)\" app with (.*) and (.*)$")
    public void login_application_with(String appName, String username, String password) throws InterruptedException {
        switch (appName) {
            case "Buyer":
                buyerLogin(username, password);
                break;
            case "Admin":
                adminLogin(username, password);
                break;
        }
    }


    @Given("^Registration of \"([^\"]*)\" app using (.*) , (.*) and (.*)$")
    public void registration_of_app_using(String appName, String mobile_no, String userName, String password) throws SQLException, IOException, InterruptedException {

        buyer_registration(appName, mobile_no, userName, password);

    }

    @Given("^Registration of \"([^\"]*)\" application using (.*) , (.*) , (.*) , (.*) , (.*) and (.*)$")
    public void registration_of_app_using_GST_PAN_Seller_Name_Email_id_and_Test(String appName, String mobile_no, String GST, String PAN, String sellerName, String email_id, String password) throws SQLException, IOException, InterruptedException {
        seller_registration(appName, mobile_no, GST, PAN, sellerName, email_id, password);

    }


    @And("Logout from App")
    public void reset_the_credential() {
        LoginPage.logout_link.click();
        Assert.assertTrue("Logout not happen ", LoginPage.loginSignUp_link.isDisplayed());
    }

    @And("^Buyer buying product of (.*) for \"([^\"]*)\" time")
    public void select_product(String pin_no, String noOfTimes) throws InterruptedException, SQLException, IOException {
        String gst_details, pan_details, name, address, postal_code, city, state, country, phone;
        LoginPage.allProduct_link.click();
        if (noOfTimes.equalsIgnoreCase("First")) {
            //--Pin code selection
            driver.findElement(By.xpath("//span[text()='400001']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//span[@class='select2 select2-container select2-container--default']//span[text()='Enter pincode']")).click();
            driver.findElement(By.xpath("//span[@class='select2-container select2-container--default select2-container--open']//input[@aria-label='Search']")).sendKeys("400078");
            driver.findElement(By.xpath("//li[text()='" + pin_no + "']")).click();
            Thread.sleep(2000);
        }
        Assert.assertTrue("Expected Pin no not reflected", driver.findElement(By.xpath("//span[text()='" + pin_no + "']")).isDisplayed());
        //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='400078']"))));
        wait.until(ExpectedConditions.visibilityOf(LoginPage.product_image)).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOf(LoginPage.buyNow_button)).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOf(LoginPage.phase));


        Assert.assertTrue("My Cart not displayed or name changed ", LoginPage.phase.getText().equals("1. My Cart"));
        Thread.sleep(1000);
        LoginPage.continueShipping_button.click();
        Assert.assertTrue("2. Shipping info not displayed or name changed", LoginPage.phase.getText().equals("2. Shipping info"));
        Thread.sleep(2000);
        if (noOfTimes.equalsIgnoreCase("First")) {
            driver.findElement(By.xpath("//div[@onclick='add_new_address()']/div[text()='Add New Address']")).click();
            Assert.assertTrue("New Address pop up not displayed", driver.findElement(By.xpath("//div[@class='modal fade show']//h5[text()='New Address']")).isDisplayed());
            driver.findElement(By.xpath("//input[@name='full_name']")).sendKeys(prop.getProperty("Name"));
            driver.findElement(By.xpath("//input[@id='shop_name']")).sendKeys(prop.getProperty("Shop_name"));
            driver.findElement(By.xpath("//input[@id='gst_number']")).sendKeys(prop.getProperty("GST"));
            driver.findElement(By.xpath("//input[@id='pan_number']")).sendKeys(prop.getProperty("PAN"));
            Thread.sleep(5000);
            Assert.assertEquals("Incorrect Pin code fetched with provided GST", "400078", driver.findElement(By.xpath("//span[@id='select2-pincode-container']")).getText());
            driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(prop.getProperty("Phone"));
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@id='submit_btn' and text()='Save']")).click();
        }
        //-------Below code if alredy added address
        gst_details = LoginPage.GST_no.getText();
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
        //Assert.assertEquals("Address mismatch", prop.getProperty("Address"), address.trim());
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
        LoginPage.logout_link.click();
        Assert.assertTrue("Logout not happen ", LoginPage.loginSignUp_link.isDisplayed());

    }

    public static String getOTP(String mobile_no) throws IOException, SQLException {
        String OTP = null;
        MySqlDB sql = new MySqlDB();
        ResultSet rs = sql.executeQuery("Select * from mobile_verifications as m  where mobile=" + mobile_no + ";", "blumart");
        //ResultSet rs = sql.executeQuery("update users set email ='111shivraj@gmail.com' where name='Auto_test';", "blumart");
        while (rs.next()) {
            System.out.println(rs.getString("mobile") + "  " + rs.getInt("otp"));
            OTP = rs.getString("otp");
        }
        rs.close();
        sql.closeConnection();
        return OTP;
    }

    public void updateEmailId(String dbName) throws IOException, SQLException {
        MySqlDB sql = new MySqlDB();
        //ResultSet rs = sql.executeQuery("Select","Select * from mobile_verifications as m  where mobile=8898347897;", "");
        int i = sql.updateQuery(prop.getProperty("update_Email_id"), dbName);
        Assert.assertNotEquals("Update Query return value : " + i, 0, i);
        sql.closeConnection();
    }

    public static void main(String[] args) throws IOException, SQLException {
        //System.out.println(getOTP());
        String phone = "+918898347897";
        System.out.println(phone.substring(3));

    }

    public void adminLogin(String username, String password) throws InterruptedException {
        driver.get(prop.getProperty("BaseURL") + "login");
        PageFactory.initElements(driver, LoginPage.class);
        LoginPage.email_input.sendKeys(username);
        LoginPage.password_input.sendKeys(password);
        LoginPage.rememberMe_checkBox.click();
        LoginPage.login_button.click();
        Thread.sleep(3000);
        Assert.assertTrue("DashBoard Page is not displayed", LoginPage.dashBoard_page.isDisplayed());
        Thread.sleep(1000);
    }

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
        updateEmailId("blumart");
        Thread.sleep(1000);
        LoginPage.logout_link.click();
        Assert.assertTrue("Logout not happen ", LoginPage.loginSignUp_link.isDisplayed());


    }

    public void seller_registration(String appName, String mobile_no, String GST, String PAN, String sellerName, String email_id, String password) throws SQLException, IOException, InterruptedException {
        String Company_name, pan_details, shop_mobile_no, company_address, postal_code, city, state, country, phone;
        driver.get(prop.getProperty("BaseURL"));
        PageFactory.initElements(driver, SellerPage.class);
        SellerPage.beaSeller_link.click();
        System.out.println("Be a Seller link clicked");
        Assert.assertTrue("Seller Registration Page is not displayed", SellerPage.seller_registration_page.isDisplayed());
        SellerPage.seller_name.sendKeys(sellerName);
        SellerPage.mobile_no.sendKeys(mobile_no);
        SellerPage.mobile_no.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        SellerPage.send_OTP_button.click();
        Thread.sleep(1000);
        SellerPage.otp_input.sendKeys(String.valueOf(getOTP(mobile_no)));
        Thread.sleep(1000);
        SellerPage.email_input.sendKeys(email_id);
        SellerPage.password_input.sendKeys(password);
        SellerPage.confirm_password_input.sendKeys(password);
        SellerPage.next_button.click();
        wait.until(ExpectedConditions.visibilityOf(SellerPage.account_company_progressbar));
        SellerPage.gst_input.sendKeys(GST);
        SellerPage.fetch_button.click();
        wait.until(ExpectedConditions.visibilityOf(SellerPage.company_name));
        //-------Below code if alredy added address
        Company_name = SellerPage.company_name.getText();
        shop_mobile_no = SellerPage.shop_mobile_no.getText();
        company_address = SellerPage.company_address.getText();
        postal_code = SellerPage.pincode.getText();
       /* Assert.assertEquals("Company name mismatch", prop.getProperty("Seller.Company_name"), Company_name);
        Assert.assertEquals("Mobile number mismatch", mobile_no, shop_mobile_no);
        Assert.assertEquals(" Company_address mismatch", prop.getProperty("Seller.Company_address"), company_address);
        Assert.assertEquals("Post Code mismatch", prop.getProperty("Seller.Pincode"), postal_code);
        */SellerPage.agree_checkBox.click();
        Thread.sleep(2000);
        SellerPage.previous_button.click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOf(SellerPage.next_button)).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOf(SellerPage.previous_button));
        Thread.sleep(2000);
        SellerPage.finish_button.click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='Logout']"))));


    }


}
