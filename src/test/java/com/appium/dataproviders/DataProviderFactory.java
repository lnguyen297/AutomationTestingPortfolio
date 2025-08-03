package com.appium.dataproviders;

import com.appium.constants.ConfigData;
import com.appium.helpers.ExcelHelpers;
import org.testng.annotations.DataProvider;

public class DataProviderFactory {
    @DataProvider(name = "loginDataSuccess")
    public Object[][] loginDataSuccess() {
        ExcelHelpers excelHelpers = new ExcelHelpers();
        return excelHelpers.getDataHashTable(
                ConfigData.EXCEL_DATA_FILE_PATH,
                "Login",
                1,
                1
        );
    }

    @DataProvider(name = "loginDataFail")
    public Object[][] loginDataFail() {
        ExcelHelpers excelHelpers = new ExcelHelpers();
        return excelHelpers.getDataHashTable(
                ConfigData.EXCEL_DATA_FILE_PATH,
                "Login",
                2,
                3
        );
    }
}
