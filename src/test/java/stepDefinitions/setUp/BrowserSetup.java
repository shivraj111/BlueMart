package stepDefinitions.setUp;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BrowserSetup {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Properties prop;

    @Before
    public void setup(Scenario scenario) throws Exception {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        System.setProperty("browser", "chrome");
        System.setProperty("env", "dev");
        if (System.getProperty("browser").contains("chrome") && System.getProperty("env").contains("dev")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);
            driver.get("http://dev.blumart.in/");
        }
        wait = new WebDriverWait(driver, 180);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        InputStream details= new FileInputStream("src//test//resources//details.properties");
        prop=new Properties();
        prop.load(details);
    }

    @After
    public void tearDown() throws Exception {
        //driver.quit();
        //driver.close();
    }


}
