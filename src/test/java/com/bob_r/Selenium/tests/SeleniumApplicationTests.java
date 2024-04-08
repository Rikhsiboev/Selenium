package com.bob_r.Selenium.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SeleniumApplicationTests {

    @Test
    void contextLoads() {
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        // set up driver object
        driver.get("https://www.google.com");
//        driver.navigate().to("https://www.google.com");
        Thread.sleep(2000);
        driver.get("https://www.amazon.com");
        // navigate back
        Thread.sleep(2000);
        driver.navigate().back();
        //navigate forward
        Thread.sleep(2000);
        driver.navigate().forward();
        //refresh
        Thread.sleep(2000);
        driver.navigate().refresh();
        // close
//        driver.close();

        // get Title
        System.out.println("Page title: " + driver.getTitle());

        // get current url
        System.out.println("driver.getCurrentUrl() "+driver.getCurrentUrl());

    }

}
