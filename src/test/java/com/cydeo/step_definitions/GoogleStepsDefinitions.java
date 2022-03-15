package com.cydeo.step_definitions;

import com.cydeo.uitilies.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GoogleStepsDefinitions {
    @When("user should Google search page")
    public void user_should_google_search_page() {
        Driver.getDriver().get("https://www.google.com");

    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        String expectedTitle = "google";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);

        Driver.closeDriver();
    }

}
