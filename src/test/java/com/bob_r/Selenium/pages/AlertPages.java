package com.bob_r.Selenium.pages;

import com.bob_r.Selenium.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPages {

    public AlertPages() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //1. Go to website: http://practice.cydeo.com/javascript_alerts
    //2. Click for JS Prompt button for alert to be displayed
    //3. Write "hello" in input text
    //4. Click OK button from the alert
    //5. Verify "You entered: hello" text is displayed in result

    @FindBy(xpath = "//button[@onclick='jsPrompt()']")
    public WebElement promptAlert;

    @FindBy(id = "result")
    public WebElement resultText;




}
