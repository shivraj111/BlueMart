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

    @FindBy(how = How.XPATH, using = "//h1")
    public static WebElement element_page;




    public AdminPage(WebDriver driver) {
        super(driver);
    }
}
