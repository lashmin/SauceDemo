package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HeaderPage {


    @FindBy(id = "react-burger-menu-btn")
    public WebElement burgerMenuButton;

    @FindBy(css = ".bm-item.menu-item")
    public List<WebElement> HamburgerMenuItems;

    @FindBy(id = "about_sidebar_link")
    public WebElement aboutButton;

    @FindBy(id = "logout_sidebar_link")
    public WebElement LogoutButton;

    public HeaderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickOnBurgerMenuButton() {
        burgerMenuButton.click();
    }

    public void clickOnAboutButton() {
        aboutButton.click();
    }

    public void clickOnLogoutButton() {
        LogoutButton.click();
    }
}
