package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.uitilies.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepsDefinitions {

   GoogleSearchPage googleSearchPage = new GoogleSearchPage();


    @When("user types apple and clicks enter")
    public void user_types_apple_and_clicks_enter() {
        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);
    }
    @Then("user sees apple in the google title")
    public void user_sees_apple_in_the_google_title() {

         String expectedTitle = "apple - Google search";
         String actualTitle = Driver.getDriver().getTitle();
        //junit assertion accpect first arg as expected, second arg as actual
         Assert.assertEquals("Title is not expected!", expectedTitle,actualTitle);
         //Assert.assertTrue(actualTitle.equals(expectedTitle));
    }


    @When("user is on Google search page")
    public void user_is_on_google_search_page() {

        Driver.getDriver().get("https://www.google.com");

    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        String expectedTitle = "Google";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);



    }


}
