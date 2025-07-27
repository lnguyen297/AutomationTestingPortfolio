package com.appium.testcases;

import com.appium.common.BaseTest;
import com.appium.pages.LoginPage;
import org.testng.annotations.Test;

import java.util.prefs.BackingStoreException;

public class LoginTest extends BaseTest {
    //Khai báo các đối tượng Page class liên quan
    private LoginPage loginPage;

    @Test
    public void testLoginSuccess() {
        //Khởi tạo đối tượng Page class
        loginPage = new LoginPage();

        //Gọi hàm từ Page class sử dụng
        loginPage.login("admin", "admin");
        loginPage.verifyLoginSuccess();
    }

    @Test
    public void testLoginFailWithUsernameInvalid() {
        //Khởi tạo đối tượng Page class
        loginPage = new LoginPage();

        //Gọi hàm từ Page class sử dụng
        loginPage.login("admin123", "admin");
        loginPage.verifyLoginFail();
    }
}
