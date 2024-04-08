package com.bob_r.Selenium.pages;

import com.bob_r.Selenium.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadPage {

    public UploadPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "file-upload")
    public WebElement chooseButton;

    @FindBy(id = "file-submit")
    public WebElement uploadButton;

    @FindBy(id = "uploaded-files")
    public WebElement file;
}
