package com.bob_r.Selenium.pages;

import com.bob_r.Selenium.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDownPage {
    /**
     * //TC#1
     * //1. Go to http://practice.cydeo.com/dropdown
     * //2. Select Illinois --> select by visible text
     * //3. Select Virginia --> select by value
     * //4. Select California --> select by index
     * <p>
     * //TC#2
     * //Select “December 1st, 1950g” and verify it is selected.
     * //1. Go to http://practice.cydeo.com/dropdown
     * //2. Select Year --> by visible text
     * //3. Select Month -->  by value
     * //4. Select Day -->  by index
     * <p>
     * //TC#3
     * //1.Go to http://practice.cydeo.com/dropdown
     * //2. Select all the options from multiple language select dropdown.
     * //3. Print out all selected values and verify each is selected.
     * //4. Deselect all values and verify each is deselected.
     */
    public DropDownPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "state")
    public WebElement stateDropDown;

    @FindBy(id="year")
    public WebElement year;
    @FindBy(id="month")
    public WebElement month;
    @FindBy(id="day")
    public WebElement day;

    @FindBy(name = "Languages")
    public WebElement languages;

}
