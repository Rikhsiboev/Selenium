package com.bob_r.Selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    /*
    8 types of Locators

    1. id
    2. name
    3. className
    4. tagName
    5. linkText
    6. partialLinkText

    custom Locators
    7. css
    => 2 Types
              =>      tagName = [attribute = 'value']
          id  =>      tagName#value
       class  =>      div.row

    8. xpath
    => 2 Types
        Absolute xpath      => start "/"  => from top go to element
        Relative xpath    //div[@id='flash-messages']

        xpath methods
        //div[contains(@class,'columns')]
        //div[starts-with(@class,'large')]
        //a[text()='Dropdown']     or    //a[.='Dropdown']



        =================
        //*[.='Dropdown']

          //*[@*='*']    first * means any tags,  second * means any attribute, third * means value = "*"


        parent from child    //div[@id='content']/style
        child from parent    //div[@id='content']/style/..
        //nav[@class='navbar navbar-expand-sm bg-light']/following-sibling::div
        //div[@class='container']/preceding-sibling::nav
        follwing and preceding method is locating all the elements next or previous to it


     */






    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // 1. id
        WebElement webByIdElement = driver.findElement(By.id("content"));// web Element

        // 2. name
        WebElement webByNameElement = driver.findElement(By.name("viewport"));

        // 3. className
        WebElement webByClassNameElement = driver.findElement(By.className("list-group"));

        // 4. tagName
        WebElement webByTagNameElement = driver.findElement(By.tagName("li"));

        // 5. linkText
        WebElement webByLinkTextElement = driver.findElement(By.linkText("Typos"));

        // 6. partialLinkText
        WebElement webByPartialLinkTextElement = driver.findElement(By.partialLinkText("Mailing"));

        // 7. css Locator
        // 1 syntax  =>     tagName = [attribute = 'value']
        WebElement webByCssLocatorElement = driver.findElement(By.cssSelector("div[id='page-footer']"));
        // 2 syntax  =>     tagName#value     => id
        WebElement webByTagNameIdValueElement = driver.findElement(By.cssSelector("div#page-footer"));
        // 2.1 syntax  =>     tagName.value   => class
        WebElement webByTagNameClassValueElement = driver.findElement(By.cssSelector("div.row"));

        // parent > to child
        //li.list-group-item > a
        // in css we can not go from child to parent

        // 8.xpath



    }

}
