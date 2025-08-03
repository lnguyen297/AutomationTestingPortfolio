package com.appium.testcases;

import com.appium.common.BaseTest;
import com.appium.constants.ConfigData;
import com.appium.dataproviders.DataProviderFactory;
import com.appium.pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.appium.helpers.ExcelHelpers;
import java.util.Hashtable;
import java.util.prefs.BackingStoreException;

public class LoginTest extends BaseTest {
    //Khai báo các đối tượng Page class liên quan
    private LoginPage loginPage;

    @Test(dataProvider = "loginDataSuccess", dataProviderClass = DataProviderFactory.class, priority = 2)
    public void testLoginSuccess(Hashtable<String, String> data) {
        loginPage = new LoginPage();
        loginPage.login(data.get("USERNAME"), data.get("PASSWORD"));
        loginPage.verifyLoginSuccess();
    }

    @Test (dataProvider = "loginDataFail", dataProviderClass = DataProviderFactory.class, priority = 1)
    public void testLoginFail(Hashtable<String, String> data) {
        loginPage = new LoginPage();
        loginPage.login(data.get("USERNAME"), data.get("PASSWORD"));
        loginPage.verifyLoginFail();
    }
}
