package com.orangehrm.pages;

import com.orangehrm.basepage.BasePage;
import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    //find element link and store  in  veriable
    By feature = By.className("link");

    //create method to use above link
    public void clickOnfeatureTab(){
        clickOnElement(feature);
    }
}
