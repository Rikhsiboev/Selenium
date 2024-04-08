package com.bob_r.Cucumber.step_definitions;

import com.bob_r.Cucumber.pages.GoogleSearchPage;
import com.bob_r.Selenium.utilities.ConfigurationReader;
import com.bob_r.Selenium.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import java.lang.module.Configuration;

public class CapitalCityTest {
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Given("User goes to Google.com")
    public void user_goes_to_google_com() {
        Driver.getDriver().get(ConfigurationReader.getProperty("google"));
    }

    @When("User search for capital of {string}")
    public void user_search_for_capital_of(String countryName) {
        googleSearchPage.googleSearch.sendKeys("capital of " + countryName + Keys.ENTER);
    }

    @Then("User should see capital city as {string}")
    public void user_should_see_capital_city_as(String capitalCity) {
        Assert.assertEquals(googleSearchPage.capitalName.getText(),capitalCity);

    }


}
