package com.bob_r.Selenium.tests;

import com.bob_r.Selenium.pages.IframePage;
import com.bob_r.Selenium.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IframeTest {

    IframePage iframePage = new IframePage();

    @Test
    public void test(){
        //1. Go to website: http://practice.cydeo.com/iframe
        Driver.getDriver().get("http://practice.cydeo.com/iframe");
        //2. Assert: "Your content goes here." Text is displayed.
        Driver.getDriver().switchTo().frame(iframePage.iframe);
        Assert.assertTrue(iframePage.text.isDisplayed());

        //3. Assert: "An iFrame containing the TinyMCE WYSIWYG Editor" Text is displayed.
        Driver.getDriver().switchTo().parentFrame();
        Assert.assertTrue(iframePage.title.isDisplayed());

        //4. switch back to default frame
        Driver.getDriver().switchTo().defaultContent();


    }

}
