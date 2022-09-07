package stepDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.MySqlDB;
import modules.AdminActions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.AdminPage;
import pageobjects.LoginPage;
import pageobjects.SellerPage;
import stepDefinitions.setUp.BrowserSetup;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
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
        AdminActions adminActions = new AdminActions();
        adminActions.adminLogin(prop.getProperty("Admin.username"), prop.getProperty("Admin.password"));


    }

    @Given("Create {string}")
    public void create_and_using(String name) throws InterruptedException {
        manufacturer_creation(name);
    }

    @Given("Create {string} using {string}")
    public void create(String brand, String manufacturer) throws InterruptedException {

        brand_creation(brand, manufacturer);
    }

    @Given("Create new {string} using {string} , {string}")
    public void create_product(String product, String category, String brand) throws InterruptedException {
        String attribute = "SKU";
        String qty_1 = "250ml";
        String qty_2 = "500ml";
        String mrp_qty_1="12";
        String mrp_qty_2="25";
        String price_qty_1="10";
        String price_qty_2="20";
        String product_gallery=product + "_Gallery_Img";
        String product_thumbnail=product + "_Thumbnail_Img";

        String search_element = "Add New Catalog";
        navigateToMenu(search_element);
        wait.until(ExpectedConditions.visibilityOf(AdminPage.addNewCatalog_page));
        Thread.sleep(1000);
        AdminPage.category_dropdown.click();
        Thread.sleep(1000);
        AdminPage.search_name.sendKeys(category);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//ul[@class='dropdown-menu inner show']//span[contains(text(),'" + category + "')]")).click();
        AdminPage.brand_dropdown.click();
        Thread.sleep(1000);
        AdminPage.search_name.sendKeys(brand);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//ul[@class='dropdown-menu inner show']//span[contains(text(),'" + brand + "')]")).click();
        AdminPage.product_name.sendKeys(product);
        Thread.sleep(1000);
        AdminPage.tag.sendKeys(product);
        AdminPage.tag.sendKeys(Keys.ENTER);
        AdminPage.attribute_SKU_dropdown.click();
        Thread.sleep(1000);
        AdminPage.search_name.sendKeys(attribute);
        driver.findElement(By.xpath("//ul[@class='dropdown-menu inner show']//span[contains(text(),'" + attribute + "')]")).click();
        AdminPage.attribute_SKU_dropdown.click();
        AdminPage.search_name.sendKeys(qty_1);
        driver.findElement(By.xpath("//ul[@class='dropdown-menu inner show']//span[(text()='" + qty_1 + "')]")).click();
        AdminPage.search_name.clear();
        AdminPage.search_name.sendKeys(qty_2);
        driver.findElement(By.xpath("//ul[@class='dropdown-menu inner show']//span[(text()='" + qty_2 + "')]")).click();
        driver.findElement(By.xpath("//div[@class='filter-option']//div[text()='" + qty_1 + "' and text()='" + qty_2 + "' ]")).click();
        Thread.sleep(2000);
        //Enter Amount without GST
        driver.findElement(By.xpath("//tr[@class='variant']//label[text()='"+qty_1+"']/ancestor::tr//input[@name='price_"+qty_1+"']")).clear();
        driver.findElement(By.xpath("//tr[@class='variant']//label[text()='"+qty_1+"']/ancestor::tr//input[@name='price_"+qty_1+"']")).sendKeys(price_qty_1);
        //Enter MRP
        driver.findElement(By.xpath("//tr[@class='variant']//label[text()='"+qty_1+"']/ancestor::tr//input[@name='mrp_"+qty_1+"']")).sendKeys(mrp_qty_1);
        //Enter Amount without GST
        driver.findElement(By.xpath("//tr[@class='variant']//label[text()='"+qty_2+"']/ancestor::tr//input[@name='price_"+qty_2+"']")).clear();
        driver.findElement(By.xpath("//tr[@class='variant']//label[text()='"+qty_2+"']/ancestor::tr//input[@name='price_"+qty_2+"']")).sendKeys(price_qty_2);
        //Enter MRP
        driver.findElement(By.xpath("//tr[@class='variant']//label[text()='"+qty_2+"']/ancestor::tr//input[@name='mrp_"+qty_2+"']")).sendKeys(mrp_qty_2);


        AdminPage.gallery_image_browse_button.click();
        Thread.sleep(2000);
        AdminPage.upload_new.click();
        //AdminPage.browse_link.click();
        Thread.sleep(2000);
        WebElement fileInput = driver.findElement(By.name("files[]"));

        fileInput.sendKeys("C:/Users/Om Computers/Documents/Images/" + product_gallery+".jpg");
        Thread.sleep(2000);
        AdminPage.select_file.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='"+ product_gallery+"']")).click();
        Thread.sleep(2000);
        AdminPage.add_files_button.click();
        Thread.sleep(2000);
        Assert.assertEquals("Gallery image not selected", AdminPage.img_box_selectd.getText(),product_gallery );

        AdminPage.thumbnail_image_browse_button.click();
        Thread.sleep(2000);
        AdminPage.upload_new.click();
        //AdminPage.browse_link.click();
        Thread.sleep(2000);
        WebElement fileInput_2 = driver.findElement(By.name("files[]"));

        fileInput_2.sendKeys("C:/Users/Om Computers/Documents/Images/" + product_thumbnail+".jpg");
        Thread.sleep(2000);
        AdminPage.select_file.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='"+ product_thumbnail+"']")).click();
        Thread.sleep(2000);
        AdminPage.add_files_button.click();
        Thread.sleep(2000);
        Assert.assertEquals("Thumbnail image not selected", AdminPage.img_box_selectd.getText(),product_thumbnail );



    }

    public void brand_creation(String brand, String manufacturer) throws InterruptedException {
        String search_element = "Brand";
        navigateToMenu(search_element);
        wait.until(ExpectedConditions.visibilityOf(AdminPage.brand_page));
        Thread.sleep(1000);
        AdminPage.manufacturer_dropdown.click();
        Thread.sleep(1000);
        AdminPage.manufacturer_search_name.sendKeys(manufacturer);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//ul[@class='dropdown-menu inner show']//span[text()='" + manufacturer + "']")).click();
        AdminPage.name.sendKeys(brand);
        AdminPage.browse_button.click();
        Thread.sleep(2000);
        AdminPage.upload_new.click();
        //AdminPage.browse_link.click();
        Thread.sleep(2000);
        WebElement fileInput = driver.findElement(By.name("files[]"));

        fileInput.sendKeys("C:/Users/Om Computers/Documents/Images/" + brand + ".jpg");
        Thread.sleep(2000);
        AdminPage.select_file.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='" + brand + "']")).click();
        Thread.sleep(2000);
        AdminPage.add_files_button.click();
        Thread.sleep(2000);
        Assert.assertEquals("Brand image not selected", AdminPage.img_box_selectd.getText(), brand);
        AdminPage.meta_title.sendKeys(brand + "_Meta");
        AdminPage.meta_description.sendKeys(brand + "meta description");
        AdminPage.save_button.click();
        Assert.assertTrue("Brand added msg not displayd", AdminPage.brand_added_msg.isDisplayed());

    }

    public void product_creation() {


    }

    public void manufacturer_creation(String name) throws InterruptedException {
        String search_element = "Manufacturer";
        navigateToMenu(search_element);
        wait.until(ExpectedConditions.visibilityOf(AdminPage.manufacturer_page));
        AdminPage.name.sendKeys(name);
        AdminPage.browse_button.click();
        Thread.sleep(2000);
        AdminPage.upload_new.click();
        //AdminPage.browse_link.click();
        Thread.sleep(2000);
        WebElement fileInput = driver.findElement(By.name("files[]"));

        fileInput.sendKeys("C:/Users/Om Computers/Documents/Images/" + name + ".jpg");
        Thread.sleep(2000);
        AdminPage.select_file.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='" + name + "']")).click();
        Thread.sleep(2000);
        AdminPage.add_files_button.click();
        Thread.sleep(2000);
        Assert.assertEquals("manufacturer image not selected", AdminPage.img_box_selectd.getText(), name);
        AdminPage.meta_title.sendKeys("Shivraj_Meta");
        AdminPage.meta_description.sendKeys("meta description");
        AdminPage.save_button.click();
        Assert.assertTrue("manufacturer added msg not displayd", AdminPage.manufacturer_added_msg.isDisplayed());

    }

    @Given("Delete {string}")
    public void Delete(String name) throws InterruptedException {

        if (name.contains("Manufacturer")) {
            String search_element = "Manufacturer";
            navigateToMenu(search_element);
            wait.until(ExpectedConditions.visibilityOf(AdminPage.manufacturer_page));
        } else if (name.contains("Brand")) {
            String search_element = "Brand";
            navigateToMenu(search_element);
            wait.until(ExpectedConditions.visibilityOf(AdminPage.brand_page));
        }
        AdminPage.search_textbox.sendKeys(name);
        AdminPage.search_textbox.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOf(AdminPage.search_result));
        driver.findElement(By.xpath("//div[@class='card-body']/table/tbody/tr/td[text()='" + name + "']/../td/a[@title='Delete']")).click();
        AdminPage.delete_button.click();

        if (name.contains("Manufacturer")) {
            Assert.assertTrue("manufacturer delete msg not displayd", AdminPage.manufacturer_delete_msg.isDisplayed());
        } else if (name.contains("Brand")) {
            Assert.assertTrue("Brand delete msg not displayd", AdminPage.brand_delete_msg.isDisplayed());
        }

    }


    public void navigateToMenu(String search_element) throws InterruptedException {

        PageFactory.initElements(driver, AdminPage.class);
        wait.until(ExpectedConditions.visibilityOf(AdminPage.menu_search)).isDisplayed();
        AdminPage.menu_search.sendKeys(search_element);
        Thread.sleep(2000);
        Assert.assertTrue("More then one matching elements returned", AdminPage.menu_search_elements.size() == 1);
        Assert.assertTrue("Expected menu not displayed", AdminPage.menu_search_elements.get(0).getText().equalsIgnoreCase(search_element));
        AdminPage.menu_search_elements.get(0).click();


    }

    @When("Seller fetch product")
    public void seller_fetch_product() {

    }

    @Then("product should be in {string} state")
    public void product_should_be_in_state(String string) {

    }

    @Then("Seller create {string} with {string}")
    public void seller_create_with(String string, String string2) {

    }


}
