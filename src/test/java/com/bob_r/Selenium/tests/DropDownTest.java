package com.bob_r.Selenium.tests;

import com.bob_r.Selenium.pages.DropDownPage;
import com.bob_r.Selenium.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class DropDownTest {
    DropDownPage dropDownPage = new DropDownPage();

    @BeforeMethod
    public void goToPage() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void checking_State_Selection_Of_Form_DropDown() {
        //1. Go to http://practice.cydeo.com/dropdown
//        Driver.getDriver().get("http://practice.cydeo.com/dropdown");

        //2. Select Illinois --> selectState by visible text
        // create object and pass page method
        Select selectState = new Select(dropDownPage.stateDropDown);
        selectState.selectByVisibleText("Illinois");

        //3. Select Virginia --> selectState by value
        selectState.selectByValue("VA");

        //4. Select California --> selectState by index
        selectState.selectByIndex(5);

        //5. Verify the Final selected Option is California.
        // Creating actual and expected elements
        String actualOption = selectState.getFirstSelectedOption().getText(); // California
        String expectedOption = "California";

        Assert.assertEquals(actualOption, expectedOption);

    }

    //TC#2
    //Select “December 1st, 1950g” and verify it is selected.
    //1. Go to http://practice.cydeo.com/dropdown
    //2. Select Year --> by visible text
    //3. Select Month -->by value
    //4. Select Day -->by index

    @Test
    public void checking_Select_Your_Date_Of_Birth_Of_Form_DropDown() {
        //1. Go to http://practice.cydeo.com/dropdown
//        Driver.getDriver().get("http://practice.cydeo.com/dropdown");
        //2. Select Year --> by visible text
        Select selectYear = new Select(dropDownPage.year);
        selectYear.selectByVisibleText("1950");
        //3. Select Month -->by value
        Select selectMonth = new Select(dropDownPage.month);
        selectMonth.selectByValue("11");
        //4. Select Day -->by index
        Select selectDay = new Select(dropDownPage.day);
        selectDay.selectByIndex(0);

        String actualYear = selectYear.getFirstSelectedOption().getText();
        String expectedYear = "1950";
        Assert.assertEquals(actualYear, expectedYear);

        String actualMonth = selectMonth.getFirstSelectedOption().getText();
        String expectedMonth = "December";
        Assert.assertEquals(actualMonth, expectedMonth);

        String actualDay = selectDay.getFirstSelectedOption().getText();
        String expectedDay = "1";
        Assert.assertEquals(actualDay, expectedDay);
    }

    //TC#3
    //1.Go to http://practice.cydeo.com/dropdown
    //2. Select all the options from multiple language select dropdown.
    //3. Print out all selected values and verify each is selected.
    //4. Deselect all values and verify each is deselected.

    @Test
    public void checking_Which_Programming_Languages_Do_You_Know_Of_Form_DropDown() {
        //1.Go to http://practice.cydeo.com/dropdown
//        Driver.getDriver().get("http://practice.cydeo.com/dropdown");

        //2. Select all the options from multiple language select dropdown.
        Select selectLanguages = new Select(dropDownPage.languages);
        List<WebElement> listLanguages = selectLanguages.getOptions();

        for (WebElement eachListLanguage : listLanguages) {
            // we have option by value, index or by text,
            // but index not good why list can be increase in future

            String allMyLanguages = eachListLanguage.getText(); // all my text
            selectLanguages.selectByVisibleText(allMyLanguages);

            System.out.println(eachListLanguage.getText());
            Assert.assertTrue(eachListLanguage.isSelected());
        }

        selectLanguages.deselectAll();

        for (WebElement eachListLanguage : listLanguages) {
            Assert.assertFalse(eachListLanguage.isSelected());
        }
    }
}
