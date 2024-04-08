package com.bob_r.Cucumber.step_definitions;

import com.bob_r.Selenium.utilities.Driver;
import io.cucumber.java.en.*;

public class oneStep {
    

    @Given("entity")
    public void entity() {

    }
    @When("go to page")
    public void go_to_page() {
        Driver.getDriver().get("https://practice.cydeo.com/sign_up");
      

    }
    @Then("Conforn page")
    public void conforn_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
