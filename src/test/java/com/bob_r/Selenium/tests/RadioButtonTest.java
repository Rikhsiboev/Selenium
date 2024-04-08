package com.bob_r.Selenium.tests;

import com.bob_r.Selenium.pages.RadioButtonPage;
import com.bob_r.Selenium.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.*;


public class RadioButtonTest {

    RadioButtonPage radioButtonPage = new RadioButtonPage();

    @Test
    public void radio_Button_Test() {
        //1.Go TO: https://practice.cydeo.com/radio_buttons
        Driver.getDriver().get("https://practice.cydeo.com/radio_buttons");

        //2. Confirm radio button #Blue is selected by default
        //   radioButtonPage.BlueButton.isSelected();  // boolean

        // Assertion TestUnit
        Assert.assertTrue(radioButtonPage.blueButton.isSelected());

        //3. Confirm radio button #Football is NOT selected by default
        Assert.assertTrue(!radioButtonPage.footballButton.isSelected());
        Assert.assertFalse(radioButtonPage.footballButton.isSelected());

        //4. Click radio button #Football to select it.
        radioButtonPage.footballButton.click();

        //5. Verify radio button #Football is selected.
        Assert.assertTrue(radioButtonPage.footballButton.isSelected());

        //6. Click radio button #Red to select it
        radioButtonPage.redButton.click();

        // 7. Verify radio button #Red is selected.
        Assert.assertTrue(radioButtonPage.redButton.isSelected());

        //8. Verify radio button #Blue is not selected.
        Assert.assertFalse(radioButtonPage.blueButton.isSelected());

        //9. Verify radio button #Green is not Enabled.
        Assert.assertFalse(radioButtonPage.greenButton.isEnabled());
    }
}
