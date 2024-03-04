package Tests;

import Base.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HeaderPageTest extends BaseTest {

    @BeforeMethod
    public void setupPages() {

        getDriver().get("https://www.saucedemo.com/");
        loginPage.inputUsernameField("standard_user");
        loginPage.inputPasswordField("secret_sauce");
        loginPage.clickSubmit();
    }

    @Test
    public void testBurgerMenuOpens() { //Opening burger menu
        headerPage.clickOnBurgerMenuButton();
        wait.until(ExpectedConditions.visibilityOfAllElements(headerPage.HamburgerMenuItems));

        Assert.assertFalse(headerPage.HamburgerMenuItems.isEmpty(), "Menu items visible after clicking the burger menu.");
    }

    @Test
    public void testNavigateToAbout() { //Navigation to "About"
        headerPage.clickOnBurgerMenuButton();
        headerPage.clickOnAboutButton();

        wait.until(ExpectedConditions.urlContains("about"));
        Assert.assertTrue(driver.getCurrentUrl().contains("about"), "Should navigate to the About page.");
    }

    @Test
    public void testLogout() {
        headerPage.clickOnBurgerMenuButton();
        headerPage.clickOnLogoutButton();

        wait.until(ExpectedConditions.visibilityOf(loginPage.getLoginButton()));

        Assert.assertTrue(loginPage.getLoginButton().isDisplayed(), "Login button is visible.");
    }
}
