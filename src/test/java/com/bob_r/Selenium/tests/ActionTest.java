package com.bob_r.Selenium.tests;

import com.bob_r.Selenium.pages.ActionPage;
import com.bob_r.Selenium.utilities.BrowserUtils;
import com.bob_r.Selenium.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionTest {
    ActionPage actionPage = new ActionPage();
    WebDriver webDriver = Driver.getDriver();
    Actions actions = new Actions(webDriver);

    @Test
    public void test_1_Images() {
        //TC#1
        //1. Go to http://practice.cydeo.com/hovers
        webDriver.get(" https://practice.cydeo.com/hovers");
        //2. Hover over to first image
        actions.moveToElement(actionPage.image1).perform();
        //3. Assert: “name: user1” is displayed
        Assert.assertTrue(actionPage.name1.isDisplayed());
        //4. Hover over to second image
        actions.moveToElement(actionPage.image2).perform();
        //5. Assert: “name: user2” is displayed
        Assert.assertTrue(actionPage.name2.isDisplayed());
        //6. Hover over to third image
        actions.moveToElement(actionPage.image3).perform();
        //7. Assert: “name: user3” is displayed
        Assert.assertTrue(actionPage.name3.isDisplayed());
    }


    @Test
    public void  test_2_Images() {
        //TC#2
        //1. Go	to https://practice.cydeo.com/
        webDriver.get("https://practice.cydeo.com/");
        //2. Right-click on A/B Testing link
        actions.contextClick(actionPage.abTesting).perform();
        //3. Open link in the new window
        actions.contextClick(actionPage.abTesting)
                .sendKeys(Keys.ARROW_DOWN
                        ,Keys.ARROW_DOWN)
                .perform();
        actions.sendKeys(Keys.ENTER).perform();
        //4. Verify title is "No A/B Test"
        Assert.assertEquals(webDriver.getTitle(),"No A/B Test");
    }

    @Test
    public void page_Down_And_Up(){
        //1. Go	to https://practice.cydeo.com/
        webDriver.get("https://practice.cydeo.com/");

        //2. Scroll down to "Cydeo" link
        JavascriptExecutor js = (JavascriptExecutor) webDriver;

        js.executeScript("arguments[0].scrollIntoView(true)", actionPage.cydeoLink);

        BrowserUtils.sleep(3);

        js.executeScript("arguments[0].scrollIntoView(true)", actionPage.homeLink);
    }

}
