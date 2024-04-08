package com.bob_r.Selenium.tests;

import com.bob_r.Selenium.pages.CheckBoxPage;
import com.bob_r.Selenium.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxButtonTest {

    @Test
    public void checkBozTest() {
        CheckBoxPage checkBoxPage = new CheckBoxPage();

        //1.GO TO: http://practice.cydeo.com/radio_buttons
        Driver.getDriver().get("https://practice.cydeo.com/checkboxes");

        //2. Confirm checkbox #1 is NOT selected by default
        Assert.assertFalse(checkBoxPage.checkBox1.isSelected());

        //3. Confirm checkbox #2 is SELECTED by default.
        Assert.assertTrue(checkBoxPage.checkBox2.isSelected());

        //4. Click checkbox #1 to select it
        checkBoxPage.checkBox1.click();

        //5. Click checkbox #2 to deselect it.
        checkBoxPage.checkBox2.click();

        //6. Confirm checkbox #1 is SELECTED.
        Assert.assertTrue(checkBoxPage.checkBox1.isSelected());

        //7. Confirm checkbox #2 is NOT selected.
        Assert.assertFalse(checkBoxPage.checkBox2.isSelected());

    }
}
