package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductsPage;

public class ProductActionsTest extends BaseTest {

    @Test
    public void homePageTest() {
        HomePage homePage = new HomePage(getDriver());
        ProductsPage productsPage = new ProductsPage(getDriver());

        homePage.openHomePage();
        homePage.navigateToCategoriesFromMainPage();
        homePage.navigateToLaptopCategory();
        productsPage.putFirstProductInCart();
        productsPage.clickToHeaderCartButton();
        Assert.assertEquals(productsPage.getFirstProductName(), productsPage.getProductNameInCart());
    }
}