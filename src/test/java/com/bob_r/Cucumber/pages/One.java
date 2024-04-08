package com.bob_r.Cucumber.pages;

import com.bob_r.Selenium.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class One {
    public One() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "input[name='full_name']")
    public WebElement clickThis;

}
