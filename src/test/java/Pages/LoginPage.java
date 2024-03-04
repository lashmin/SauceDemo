package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.Keys.ENTER;
import static org.openqa.selenium.Keys.TAB;


public class LoginPage extends BaseTest {

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-name")
    public WebElement usernameField;

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(id = "login-button")
    public WebElement loginButton;

    public void inputUsernameField(String username) {
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    public void inputPasswordField(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public void clickSubmit() {
        loginButton.click();
    }

    public void usernameKeyboardNavigation(String username) {
        usernameField.clear();
        usernameField.sendKeys(username);
        usernameField.sendKeys(TAB);
    }

    public void passwordKeyboardNavigation(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
        passwordField.sendKeys(ENTER);
    }

}
