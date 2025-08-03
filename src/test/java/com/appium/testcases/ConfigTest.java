package com.appium.testcases;

import com.appium.common.BaseTest;
import com.appium.dataproviders.DataProviderFactory;
import com.appium.pages.BasePage;
import com.appium.pages.ConfigPage;
import com.appium.pages.LoginPage;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.apache.logging.log4j.core.net.Priority;
import org.testng.annotations.Test;
import java.util.Hashtable;

public class ConfigTest extends BaseTest {
    private LoginPage loginPage;
    private ConfigPage configPage;
    private BasePage basePage;

    @Test(dataProvider = "loginDataSuccess", dataProviderClass = DataProviderFactory.class, priority = 3)
    public void testItemLeftMenuDisplay(Hashtable <String, String> data){
        loginPage = new LoginPage();
        loginPage.login(data.get("USERNAME"), data.get("PASSWORD"));
        basePage = new BasePage();
        basePage.clickMenuConfig();
        configPage = new ConfigPage();
        configPage.checkLeftMenuOptionsDisplay();
    }

    @Test(priority = 4)
        public void testChangeToLightMode(){
            configPage = new ConfigPage();
            configPage.checkChangeToLightMode();
        }









}
