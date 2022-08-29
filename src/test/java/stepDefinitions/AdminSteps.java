package stepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.MySqlDB;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.AdminPage;
import pageobjects.LoginPage;
import pageobjects.SellerPage;
import stepDefinitions.setUp.BrowserSetup;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import static pageobjects.AdminPage.menu_search;

public class AdminSteps {
    public WebDriver driver = BrowserSetup.driver;
    public WebDriverWait wait = BrowserSetup.wait;
    public Properties prop = BrowserSetup.prop;

    @Given("Login as {string}")
    public void login_as(String string) throws InterruptedException {
        LoginSteps obj= new LoginSteps();
        obj.adminLogin(prop.getProperty("Admin.username"), prop.getProperty("Admin.password"));


    }

    @Given("Create {string}, {string} and {string} using {string}")
    public void create_and_using(String manufacturer_name, String brand_name, String product, String variant) throws InterruptedException {
        String search_element="Manufacturer";
        PageFactory.initElements(driver, AdminPage.class);
        wait.until(ExpectedConditions.visibilityOf(AdminPage.menu_search)).isDisplayed();
        AdminPage.menu_search.sendKeys(search_element);
       Thread.sleep(2000);
       Assert.assertTrue("More then one matching elements returned",AdminPage.menu_search_elements.size()==1);
        Assert.assertTrue("Expected menu not displayed",AdminPage.menu_search_elements.get(0).getText().equalsIgnoreCase(search_element));
        AdminPage.menu_search_elements.get(0).click();
        Thread.sleep(2000);
        Assert.assertTrue("Expected page not displayed",AdminPage.element_page.getText().contains(search_element));
        



    }
        @When("Seller fetch product")
        public void seller_fetch_product() {

        }

        @Then("product should be in {string} state")
        public void product_should_be_in_state (String string){

        }

        @Then("Seller create {string} with {string}")
        public void seller_create_with (String string, String string2){

        }


}
