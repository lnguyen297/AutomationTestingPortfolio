package com.appium.pages;

import com.appium.drivers.DriverManager;
import com.appium.keywords.MobileUI;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ConfigPage extends BasePage {
    public ConfigPage() {
        PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver()), this);
    }

    @AndroidFindBy(accessibility = "Config application")
    @iOSXCUITFindBy(accessibility = "Config application")
    private WebElement headMenuConfigApplication;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@content-desc,\"Product management\")]")
    @iOSXCUITFindBy(xpath = "")
    private WebElement itemProductManagement;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@content-desc,\"Tables management\")]")
    @iOSXCUITFindBy(xpath = "")
    private WebElement itemTableManagement;

    @AndroidFindBy(accessibility = "Config system")
    @iOSXCUITFindBy(accessibility = "Config system")
    private WebElement headMenuConfigSystem;

    @AndroidFindBy(accessibility = "Change to light mode")
    @iOSXCUITFindBy(accessibility = "Change to light mode")
    private WebElement itemChangeToLightMode;

    @AndroidFindBy(accessibility = "Change to dark mode")
    @iOSXCUITFindBy(accessibility = "Change to dark mode")
    private WebElement itemChangeToDarkMode;

    @AndroidFindBy(accessibility = "Database management")
    @iOSXCUITFindBy(accessibility = "Database management")
    private WebElement itemDataBaseManagement;

    @AndroidFindBy(accessibility = "Server database")
    @iOSXCUITFindBy(accessibility = "Server database")
    private WebElement itemServerDatabase;

    @AndroidFindBy(accessibility = "Logout")
    @iOSXCUITFindBy(accessibility = "Logout")
    private WebElement itemLogout;

    public void checkLeftMenuOptionsDisplay(){
        MobileUI.isElementPresentAndDisplayed(headMenuConfigApplication);
        MobileUI.isElementPresentAndDisplayed(itemProductManagement);
        MobileUI.isElementPresentAndDisplayed(itemTableManagement);
        MobileUI.isElementPresentAndDisplayed(headMenuConfigSystem);
        MobileUI.isElementPresentAndDisplayed(itemChangeToLightMode);
        MobileUI.isElementPresentAndDisplayed(itemDataBaseManagement);
        MobileUI.isElementPresentAndDisplayed(itemServerDatabase);
        MobileUI.isElementPresentAndDisplayed(itemLogout);
    }

    public void checkChangeToLightMode(){
        MobileUI.clickElement(itemChangeToLightMode);
        MobileUI.isElementPresentAndDisplayed(itemChangeToDarkMode);
    }


    public ProductPage openProductManagement() {
        itemProductManagement.click();

        return new ProductPage();
    }

    public ServerPage openServerDatabase() {
        itemServerDatabase.click();

        return new ServerPage();
    }

    public TablePage openTableManagement() {
        itemTableManagement.click();

        return new TablePage();
    }

    public LoginPage logout() {
        itemLogout.click();

        return new LoginPage();
    }
}
