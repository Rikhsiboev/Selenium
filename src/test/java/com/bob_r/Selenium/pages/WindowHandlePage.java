package com.bob_r.Selenium.pages;

import com.bob_r.Selenium.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WindowHandlePage {

    public WindowHandlePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //1. Go to website: http://practice.cydeo.com/windows
    //2. Assert: Title is “Windows”
    //3. Click to: “Click Here” link
    //4. Click to: “Cydeo” link
    //5. Switch to Cydeo page
    //6. Assert: Title is “Cydeo”
    //7.Switch back to main handle

    @FindBy(linkText = "Click Here")
    public WebElement clickHere;

    @FindBy(linkText = "CYDEO")
    public WebElement cydeoLink;




}
