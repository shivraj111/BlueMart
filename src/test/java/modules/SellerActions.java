package modules;

import helpers.MySqlDB;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

import static helpers.CommonActionHelpers.getOTP;

public class SellerActions {

    public WebDriver driver = BrowserSetup.driver;
    public WebDriverWait wait = BrowserSetup.wait;
    public Properties prop = BrowserSetup.prop;
    MySqlDB sql;

    public void seller_registration(String appName, String mobile_no, String GST, String sellerName, String email_id, String password) throws SQLException, IOException, InterruptedException {
        String Company_name, shop_mobile_no, company_address, postal_code, city, state, country, phone;
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
    public void deletequery(String mobile_no, String userID) throws IOException, SQLException {
        sql = new MySqlDB();
        List<String> lst = new ArrayList<String>();
        lst.add("delete from users where id=" + userID + ";");
        lst.add("delete from sellers where user_id=" + userID + ";");
        lst.add("delete from blumart.shops where phone like '%" + mobile_no + "';");

        ListIterator<String> it = lst.listIterator();
        while (it.hasNext()) {
            String query=it.next();
            int i = sql.updateQuery(query, "blumart");
            System.out.println(query + " going to execute");
            Assert.assertNotEquals("delete Query return value : " + i, 0, i);
            System.out.println(query + " executed successfully");
        }
        System.out.println("Seller with mobile no: "+mobile_no +" unregistered successfully");
        sql.closeConnection();
    }

}
