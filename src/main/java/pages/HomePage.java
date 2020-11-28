package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waiters.Waiter;

public class HomePage extends BasePage {

    private final Waiter wait;

    @FindBy(xpath = "//button[@class='menu-toggler']")
    private WebElement productsCatalogue;

    @FindBy(xpath = "(//a[@class='menu__hidden-title'])[1]")
    private WebElement laptopCategory;

    @FindBy(xpath = "(//a[contains(text(),'Товары для геймеров')])[1]")
    private WebElement productForGamersCategory;

    @FindBy(xpath = "//a[contains(text(),'Playstation Store')]")
    private WebElement playstationStoreCategory;

    @FindBy(xpath = "//a[@class='header-actions__button header-actions__button_type_wish']")
    private WebElement wishListButton;

    public HomePage(WebDriver driver) {
        super(driver);
        wait = new Waiter(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateToCategoriesFromMainPage() {
        wait.untilVisible(productsCatalogue).click();
    }

    public void navigateToLaptopCategory() {
        wait.untilVisible(laptopCategory).click();
    }

    public void ProductForGamersCategoryClick() {
        wait.untilVisible(productForGamersCategory).click();
    }

    public void playstationStoreCategoryClick() {
        wait.untilVisible(playstationStoreCategory).click();
    }

    public void wishListButtonClick() {
        wait.untilVisible(wishListButton).click();
    }

}