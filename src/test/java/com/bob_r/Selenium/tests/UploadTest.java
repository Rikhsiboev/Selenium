package com.bob_r.Selenium.tests;

import com.bob_r.Selenium.utilities.Driver;
import com.bob_r.Selenium.pages.UploadPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadTest {

    WebDriver driver = Driver.getDriver();

    UploadPage uploadPage = new UploadPage();
    @Test
    public void test1(){
        // 1. go to https://practice.cydeo.com/upload
        driver.get("https://practice.cydeo.com/upload");

        // 2. upload file to page
        uploadPage.chooseButton.sendKeys("C:/Users/Zulpikar/Downloads/test.txt");
        uploadPage.uploadButton.click();

        // 3. verfiy file name 'test' is displayed
        Assert.assertTrue(uploadPage.file.getText().contains("test"));

    }
}
