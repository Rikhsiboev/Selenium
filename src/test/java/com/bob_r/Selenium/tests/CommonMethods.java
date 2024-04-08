package com.bob_r.Selenium.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonMethods {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }


 /*
 findElement();     =>   for one Element not String
                    - when element is not found, it gives
                     - no such element exception
 findElement();     =>   for List of Elements not String
                    - when list of elements is not found, it gives
                     - empty list
 getText();
                    - get bottom or messages

 getAttribute():
                    - web class =  id =
 sendKeys();
                    - uploadingFile of location
 click();
  */


    /*
                PAGE OBJECT MODEL Design Pattern
      Organizing packages for clean code purpose of usage

FOR 1-Page 1 Class

  Everytime we create a class; we need to pass
  the following info into the constructor

  PageFactory.initElements(driver,this);

    We don`t use findElement(); method anymore

    instead we use @FindBy annotation or By class

     */

}
