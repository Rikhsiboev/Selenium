package com.bob_r.Selenium.pages;

import com.bob_r.Selenium.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SynchronizationPage {
    WebDriver driver = new ChromeDriver();
    public SynchronizationPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //TC#1
    //1. Go to http://practice.cydeo.com/dynamic_loading/1
    //2. Click to start
    //3. Wait until loading bar disappears
    //4. Assert username inputbox is displayed
    //5. Enter username: tomsmith
    //6. Enter password: incorrectpassword
    //7. Click to Submit button
    //8. Assert “Your password is invalid!” text is displayed.

    @FindBy(xpath = "//div[@id='start']/button")
    public WebElement startButton;

    @FindBy(id = "login")
    public WebElement form;

    @FindBy(id = "username")
    public WebElement userNameInput;
    @FindBy(id = "pwd")
    public WebElement passwordInput;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;
    @FindBy(id = "flash")
    public WebElement FlashMsg;


}
