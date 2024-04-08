package com.bob_r.Cucumber.pages;

import com.bob_r.Selenium.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
    public GoogleSearchPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "APjFqb")
    public WebElement googleSearch;
    @FindBy(xpath = "//a[@class='FLP8od']")
    public WebElement capitalName;

}
