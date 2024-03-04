package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SocialMediaPage {
    private WebDriver driver;

    @FindBy(xpath = "//a[@href='https://twitter.com/saucelabs']")
    public WebElement twitterButton;

    @FindBy(xpath = "//a[@href='https://www.facebook.com/saucelabs']")
    public WebElement facebookButton;

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/company/sauce-labs/']")
    public WebElement linkedinButton;

    public SocialMediaPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnTwitterButton() {
        twitterButton.click();
    }

    public void clickOnFacebookButton() {
        facebookButton.click();
    }

    public void clickOnLinkedinButton() {
        linkedinButton.click();
    }
}
