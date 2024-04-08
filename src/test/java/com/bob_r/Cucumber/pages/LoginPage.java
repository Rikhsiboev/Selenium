package com.bob_r.Cucumber.pages;

import com.bob_r.Selenium.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name ="username")
    public WebElement userNameInput;
    @FindBy(name ="password")
    public WebElement passwordInput;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;
    @FindBy(xpath = "//p[contains(text(),'Incorrect')]")
    public WebElement popUp;

}
