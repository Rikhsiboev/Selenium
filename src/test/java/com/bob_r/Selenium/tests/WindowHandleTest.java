package com.bob_r.Selenium.tests;

import com.bob_r.Selenium.pages.WindowHandlePage;
import com.bob_r.Selenium.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandleTest {

    WindowHandlePage windowHandlePage = new WindowHandlePage();

    @Test
    public void test1() {
        //1. Go to website: http://practice.cydeo.com/windows
        Driver.getDriver().get("http://practice.cydeo.com/windows");
        String windowHandle = Driver.getDriver().getWindowHandle();


        //2. Assert: Title is “Windows”
        Assert.assertEquals(Driver.getDriver().getTitle(), "Windows");

        //3. Click to: “Click Here” link
        windowHandlePage.clickHere.click();

        //4. Click to: “Cydeo” link
        windowHandlePage.cydeoLink.click();

        //   5. Switch to Cydeo page
        Set<String> windowHandles = Driver.getDriver().getWindowHandles();
        for (String handle : windowHandles) {
            Driver.getDriver().switchTo().window(handle);
            System.out.println(Driver.getDriver().getTitle());
            if (Driver.getDriver().getTitle().equals("New Window")) {
                break;
            }
        }

        //6. Assert: Title is “Cydeo”
        Assert.assertEquals(Driver.getDriver().getTitle(), "New Window");

        //7.Switch back to main handle
        Driver.getDriver().switchTo().window(windowHandle);
        Assert.assertEquals(Driver.getDriver().getTitle(),"Windows");

    }


}
