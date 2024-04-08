package com.bob_r.Cucumber.pages;

import com.bob_r.Selenium.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class DashboardPage {

    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[.='View all orders']")
    public WebElement allOrderLink;
}
