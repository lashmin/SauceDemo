package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {
    private WebDriver driver;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement addToCartButton;

    @FindBy(className = "shopping_cart_link")
    public WebElement cartIcon;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnAddToCart() {
        addToCartButton.click();
    }

    public void clickOnCartIcon() {
        cartIcon.click();
    }
}
