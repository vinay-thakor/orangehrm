package com.orangehrm.testsuite;

import com.orangehrm.loadproperty.LoadProperty;
import com.orangehrm.pages.HomePage;
import com.orangehrm.testbase.TestBase;
import org.testng.annotations.Test;

public class ClickOnFeaTab extends TestBase {
    //create an object to use the property of HomePage
    HomePage homepage = new HomePage();
    LoadProperty loadProperty = new LoadProperty();

    @Test(priority = 0,groups = {"Sanity","Smoke","Regression"})
    //create a method to action on it
    public void userSholdClickOnFeatureTabSuccessfully() {
        homepage.clickOnfeatureTab();

    }
}
