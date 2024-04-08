package com.bob_r.Cucumber.step_definitions;

import com.bob_r.Cucumber.pages.DashboardPage;
import com.bob_r.Cucumber.pages.LoginPage;
import com.bob_r.Selenium.utilities.ConfigurationReader;
import com.bob_r.Selenium.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import io.cucumber.java.it.Ma;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Value;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;


public class WebTableLoginSteps {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    Faker faker = new Faker();

    @Given("User goes to web table page")
    public void user_goes_to_web_table_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("User enters username")
    public void user_enters_username() {
        loginPage.userNameInput.sendKeys(ConfigurationReader.getProperty("username"));
    }

    @When("User enters password")
    public void user_enters_password() {
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
    }

    @When("User click login button")
    public void user_click_login_button() {
        loginPage.loginButton.click();
    }

    @Then("User is on dashboard")
    public void user_is_on_dashboard() {
        dashboardPage.allOrderLink.isDisplayed();
    }

    @When("User enters wrong username")
    public void user_enters_wrong_username() {
        loginPage.userNameInput.sendKeys(faker.name().username());
    }

    @When("User enters wrong password")
    public void user_enters_wrong_password() {
        loginPage.userNameInput.sendKeys(faker.phoneNumber().phoneNumber());

    }

    @Then("User see warning popup")
    public void user_see_warning_popup() {
        loginPage.popUp.isDisplayed();
    }

    @When("User enters {string}")
    public void user_enters(String credential) {
        switch (credential) {
            case "username":
                loginPage.userNameInput.sendKeys(ConfigurationReader.getProperty(credential));
                break;
            case ("password"):
                loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty(credential));
                break;
        }
    }

    @When("User enter {string} and {string}")
    public void user_enter_and(String username, String password) {
    loginPage.userNameInput.sendKeys(username);
    loginPage.passwordInput.sendKeys(password);
    }

    @When("User enters below credentials")
    public void user_enters_below_credentials(Map<String, Object> credentials) {
       // {"username":"Test","password":"Tester"}
        loginPage.userNameInput.sendKeys(credentials.get("username").toString());
        loginPage.passwordInput.sendKeys(credentials.get("password").toString());
        loginPage.loginButton.click();
    }
    @When("User get data from excel file")
    public void user_get_data_from_excel_file() throws IOException {
        String path = "/Users/rikhsiboevgmail.com/IdeaProjects/java-version-updates/Bob_R/Selenium/src/test/resources/features/test.xlsx";

        FileInputStream file = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(file);
        Sheet worksheet = workbook.getSheet("test");

        String userName = worksheet.getRow(1).getCell(0).toString(); // Test
        String password = worksheet.getRow(1).getCell(1).toString(); // Tester

        loginPage.userNameInput.sendKeys(userName);
        loginPage.passwordInput.sendKeys(password);
    }


}




