package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class AdminPage extends BaseClass {

    @FindBy(how = How.XPATH, using = "//input[@id='menu-search']")
    public static WebElement menu_search;

    @FindBy(how = How.XPATH, using = "//ul[@id='search-menu']/li/a/span")
    public static List<WebElement> menu_search_elements;

    @FindBy(how = How.XPATH, using = "//h1[text()='All manufacturers']/../../following-sibling::div//h5[text()='Add New Manufacturer']")
    public static WebElement manufacturer_page;

    @FindBy(how = How.XPATH, using = "//label[text()='Name']/../input[@name='name']")
    public static WebElement manufacturer_name;

    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Logo')]/following-sibling::div//div[text()='Browse']")
    public static WebElement browse_button;

    @FindBy(how = How.XPATH, using = "//div[@class='modal-content h-100']//a[text()='Upload New']")
    public static WebElement upload_file;

    @FindBy(how = How.XPATH, using = "//div[@class='modal-content h-100']//button[text()='Browse']")
    public static WebElement browse_link;

    @FindBy(how = How.XPATH, using = "//a[text()='Select File']")
    public static WebElement select_file;

    @FindBy(how = How.XPATH, using = "//button[text()='Add Files']")
    public static WebElement add_files_button;


    @FindBy(how = How.XPATH, using = "//input[@name='meta_title']")
    public static WebElement meta_title;

    @FindBy(how = How.XPATH, using = "//div[@class='file-preview box sm']//h6/span")
    public static WebElement manufacturer_img_box;

    @FindBy(how = How.XPATH, using = "//textarea[@name='meta_description']")
    public static WebElement meta_description;

    @FindBy(how = How.XPATH, using = "//button[text()='Save']")
    public static WebElement save_button;

    @FindBy(how = How.XPATH, using = "//input[@name='search']")
    public static WebElement search_textbox;

    @FindBy(how = How.XPATH, using = "//div[@class='card-body']/table/tbody/tr/td")
    public static WebElement  search_result;

    @FindBy(how = How.XPATH, using = "//h4[text()='Delete Confirmation']/../../div/a[text()='Delete']")
    public static WebElement  delete_button;


    @FindBy(how = How.XPATH, using = "//span[text()='Manufacturer has been deleted successfully']")
    public static WebElement  manufacturer_delete_msg;

    @FindBy(how = How.XPATH, using = "//span[text()='Manufacturer has been inserted successfully']")
    public static WebElement  manufacturer_added_msg;

    public AdminPage(WebDriver driver) {
        super(driver);
    }
}
