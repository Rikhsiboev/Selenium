package com.bob_r.Selenium.pages;

import com.bob_r.Selenium.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonPage {
    /// Only for one option to select than checkBoxButton

    /**
     //TC #1:radio buttons
     //1.Go TO: https://practice.cydeo.com/radio_buttons
     //2. Confirm radio button #Blue is selected by default
     //3. Confirm radio button #Football is NOT selected by default
     //4. Click radio button #Football to select it.
     //5. Verify radio button #Football is selected.
     116. Click radio button #Red to select it //7. Verify radio button #Red is selected.
     //8. Verify radio button #Blue is not selected.
     //9. Verify radio button #Green is not Enabled.
     */

  /*
//    // driver
//    WebDriver webDriver = new ChromeDriver();
*/
    // constructor adding our driver
    public RadioButtonPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // webElement but we will use @FindBy annotation
    //    WebElement bottom1 = webDriver.findElement(By.id("sdfsd"));

    // why we use @FindBy InstallElement Exception creating scope singleton each tyPe when ever
    @FindBy(id="blue")
    public WebElement blueButton;
    @FindBy(id="football")
    public WebElement footballButton;
    @FindBy(id="red")
    public WebElement redButton;
    @FindBy(id="green")
    public WebElement greenButton;



}
