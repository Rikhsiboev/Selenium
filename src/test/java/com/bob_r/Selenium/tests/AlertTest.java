package com.bob_r.Selenium.tests;

import com.bob_r.Selenium.pages.AlertPages;
import com.bob_r.Selenium.utilities.Driver;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTest {
    AlertPages alertPages = new AlertPages();


    @Test
    public void checking_alerts(){
        //1. Go to website: http://practice.cydeo.com/javascript_alerts
        Driver.getDriver().get(" http://practice.cydeo.com/javascript_alerts");

        //2. Click for JS Prompt button for alert to be displayed
        alertPages.promptAlert.click();

        //3. Write "hello" in input text
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.sendKeys("hello");

        //4. Click OK button from the alert
        alert.accept();

        //5. Verify "You entered: hello" text is displayed in result
        String actualResultTextText = alertPages.resultText.getText();
        String expectedText = "You entered: hello";
        Assert.assertEquals(actualResultTextText,expectedText);


    }



}
