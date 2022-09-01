package modules;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.LoginPage;
import stepDefinitions.setUp.BrowserSetup;

import java.util.Properties;

public class AdminActions {

    public WebDriver driver = BrowserSetup.driver;
    public WebDriverWait wait = BrowserSetup.wait;
    public Properties prop = BrowserSetup.prop;

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
}
