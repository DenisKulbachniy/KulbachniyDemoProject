package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductsPage;

public class ProductMissingTest extends BaseTest {

    @Test
    public void checkMissingProductsTest() {
        HomePage homePage = new HomePage(getDriver());
        ProductsPage productsPage = new ProductsPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());

        homePage.openHomePage();
        loginPage.enterToAccountClick();
        loginPage.inputLoginField();
        loginPage.inputPasswordField();
        loginPage.enterButtonClick();
        homePage.navigateToCategoriesFromMainPage();
        homePage.ProductForGamersCategoryClick();
        homePage.playstationStoreCategoryClick();
        productsPage.playStationCategoryClick();
        productsPage.playStationChoiceClick();
        String product = productsPage.getProductTitle();
        productsPage.notifyAboutAppearingOfProductButtonClick();
        homePage.wishListButtonClick();
        Assert.assertTrue(product.contains("PlayStation"));


    }
}