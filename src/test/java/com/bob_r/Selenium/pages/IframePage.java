package com.bob_r.Selenium.pages;

import com.bob_r.Selenium.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IframePage {

    public IframePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //1. Go to website: http://practice.cydeo.com/iframe
    //2. Assert: "Your content goes here." Text is displayed.
    //3. Assert: "An iFrame containing the TinyMCE WYSIWYG Editor" Text is displayed.
    //4. switch back to default frame

    @FindBy(id = "mce_0_ifr")
    public WebElement iframe;

    @FindBy(xpath = "//p[.='Your content goes here.']")
    public WebElement text;

    @FindBy(xpath = "//h3[.='An iFrame containing the TinyMCE WYSIWYG Editor']")
    public WebElement title;

}
