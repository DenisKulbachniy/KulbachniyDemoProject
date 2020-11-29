package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waiters.Waiter;

public class LoginPage extends BasePage {

    private final Waiter wait;

    @FindBy(xpath = "//a[@class='header-topline__user-link link-dashed']")
    private WebElement enterToAccountLink;

    @FindBy(xpath = "//*[@id='auth_email']")
    private WebElement loginField;

    @FindBy(xpath = "//*[@id='auth_pass']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[contains(text(),'Войти')]")
    private WebElement enterButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        wait = new Waiter(driver);
        PageFactory.initElements(driver, this);
    }
    @Step
    public void enterToAccountClick() {
        wait.untilVisible(enterToAccountLink).click();
    }
    @Step
    public void inputLoginField() {
        wait.untilVisible(loginField).sendKeys("Petrovartem01061996@gmail.com");
    }
    @Step
    public void inputPasswordField() {
        passwordField.sendKeys("01061996Artem");
    }
    @Step
    public void enterButtonClick() {
        wait.untilVisible(enterButton).click();
    }

}