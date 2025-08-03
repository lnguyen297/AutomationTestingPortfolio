package com.appium.testcases;


import com.appium.pages.ConfigPage;
import com.appium.pages.LoginPage;
import com.appium.pages.ProductPage;
import com.appium.common.BaseTest;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest {

    private LoginPage loginPage;
    private ConfigPage configPage;
    private ProductPage productPage;

    @Test
    public void testAddNewProduct() {
        loginPage = new LoginPage();
        //productPage = loginPage.login("admin", "admin");

        configPage = new ConfigPage();
        productPage = configPage.openProductManagement();

        //productPage = new ProductPage();
        productPage.addNewProduct();
    }
}
