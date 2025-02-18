package com.bob_r.Selenium.tests;

import com.bob_r.Selenium.pages.SynchronizationPage;
import com.bob_r.Selenium.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SynchronizationTest {
    SynchronizationPage synPage = new SynchronizationPage();

    WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    @Test
    public void test(){
        //TC#1
        //1. Go to http://practice.cydeo.com/dynamic_loading/1
        driver.get("http://practice.cydeo.com/dynamic_loading/1");

        //2. Click to start
        synPage.startButton.click();

        //3. Wait until loading bar disappears
        wait.until(ExpectedConditions.visibilityOf(synPage.form));

        //4. Assert username inputbox is displayed
        Assert.assertTrue(synPage.userNameInput.isDisplayed());

        //5. Enter username: tomsmith
        synPage.userNameInput.sendKeys("tomsmith");

        //6. Enter password: incorrectpassword
        synPage.passwordInput.sendKeys("incorrectpassword");

        //7. Click to Submit button
        synPage.submitButton.click();

        //8. Assert “Your password is invalid!” text is displayed.
        Assert.assertTrue(synPage.FlashMsg.isDisplayed() );
    }

}
