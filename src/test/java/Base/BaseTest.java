package Base;

import Pages.HeaderPage;
import Pages.InventoryPage;
import Pages.LoginPage;
import Pages.SocialMediaPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;
    public LoginPage loginPage;
    public InventoryPage inventoryPage;
    public HeaderPage headerPage;
    public SocialMediaPage socialMediaPage;


    public WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://www.saucedemo.com/");

        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
        headerPage = new HeaderPage(driver);
        socialMediaPage = new SocialMediaPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }

    }
}
