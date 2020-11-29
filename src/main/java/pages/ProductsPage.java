package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waiters.Waiter;

public class ProductsPage extends BasePage {
    private final Waiter wait;

    @FindBy(xpath = "(//button[@class='buy-button goods-tile__buy-button'])[1]")
    private WebElement cartButtonOnFirstProduct;

    @FindBy(xpath = "(//div[@class='header-actions__button-wrapper'])[3]")
    private WebElement headerCartButton;

    @FindBy(xpath = "//div[@class='cart-product__main']")
    private WebElement productInCart;

    @FindBy(xpath = "(//span[@class='goods-tile__title'])[1]")
    private WebElement firstProduct;

    @FindBy(xpath = "//a[contains(text(),'Приставки PlayStation')]")
    private WebElement playStationCategory;

    @FindBy(xpath = "//span[contains(text(),'PlayStation 5')]")
    private WebElement playStationChoice;

    @FindBy(xpath = "//button[@class='button button_size_small button_color_navy']")
    private WebElement notifyAboutAppearingOfProductButton1;

    @FindBy(xpath = "//*[@class='product__title']")
    private WebElement productTitle;

    public WebElement getCartButtonOnFirstProduct() {
        return cartButtonOnFirstProduct;
    }

    public ProductsPage(WebDriver driver) {
        super(driver);
        wait = new Waiter(driver);
        PageFactory.initElements(driver, this);
    }

    public String getProductNameInCart() {
        wait.untilVisible(productInCart);
        return productInCart.getText();
    }
    public String getProductTitle() {
        wait.untilVisible(productTitle);
        return productTitle.getText();
    }

    public String getFirstProductName() {
        wait.untilVisible(firstProduct);
        return firstProduct.getText();
    }
    @Step
    public void putFirstProductInCart() {
        wait.untilVisible(cartButtonOnFirstProduct).click();

    }
    @Step
    public void clickToHeaderCartButton() {
        wait.untilVisible(headerCartButton).click();
    }
    @Step
    public void playStationCategoryClick() {
        wait.untilVisible(playStationCategory).click();
    }
    @Step
    public void playStationChoiceClick() {
        wait.untilVisible(playStationChoice).click();
    }
    @Step
    public void notifyAboutAppearingOfProductButtonClick() {
        wait.untilVisible(notifyAboutAppearingOfProductButton1).click();
    }
}