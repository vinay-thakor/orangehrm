package com.orangehrm.testbase;

import com.orangehrm.basepage.BasePage;
import com.orangehrm.browserselector.BrowserSelector;
import com.orangehrm.loadproperty.LoadProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;
    //This class is base of all test case classes
public class TestBase  extends BasePage {

        //object creation
        LoadProperty loadProperty = new LoadProperty();
        BrowserSelector browserSelector = new BrowserSelector();

        String baseUrl = loadProperty.getProperty("baseUrl");
        String browser = loadProperty.getProperty("browser");

    @BeforeMethod(groups = {"Sanity","Smoke","Regression"})
    public void openBrowser(){
        browserSelector.selectBrowser(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @AfterMethod(groups = {"Sanity","Smoke","Regression"})
    public void tearDown(){
        driver.quit();
    }
}
