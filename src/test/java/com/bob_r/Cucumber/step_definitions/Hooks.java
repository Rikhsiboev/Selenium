package com.bob_r.Cucumber.step_definitions;

import com.bob_r.Selenium.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before("@api")
    public void setUpDriver() {
        System.out.println("Driver is set up");
    }

    @After
    public void tearDown() {
        System.out.println("Driver is closing ...");
        Driver.closeDriver();
    }

    @Before("@db")
    public void apiSetUp(){
        System.out.println("Api is set up");
    }

    @After
    public void teardownScenario(Scenario scenario) {
        //System.out.println("It will be closing browser using cucumber @After each scenario");

        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

    }


}
