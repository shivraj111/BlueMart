package helpers;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefinitions.setUp.BrowserSetup;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class CommonActionHelpers {
    public WebDriver driver = BrowserSetup.driver;
    public WebDriverWait wait = BrowserSetup.wait;
    public Properties prop = BrowserSetup.prop;

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
}
