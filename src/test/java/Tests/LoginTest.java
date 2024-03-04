package Tests;

import Base.BaseTest;
import Pages.LoginPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @BeforeMethod
    public void loginSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
    }

    @Test
    public void userCanLogInWithEnter() {
        loginPage.usernameKeyboardNavigation("standard_user");
        loginPage.passwordKeyboardNavigation("secret_sauce");

        Assert.assertTrue(driver.getCurrentUrl().contains("/inventory.html"), "Should be redirected to the inventory page after login.");
    }
}
