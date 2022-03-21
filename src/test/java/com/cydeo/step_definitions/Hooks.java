package com.cydeo.step_definitions;

/*
In the class we will be able to pass pre- & post- conditions to
 each scenario and each step
 */


import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    //import from io.cucumber.java not from junit
    @Before (order = 1)//import from ip.cucumber.java not from junit
    public void setupScenario(){
        System.out.println("====setting up browser using cucumber @Before======");

    }
    @Before (value = "@login",order = 2)
    public void setupScenarioForLogins() {
        System.out.println("====setting up browser using cucumber @Before======");

    }

    @Before (value = "@db",order = 0)
    public void setupForDatabaseScenario(){
        System.out.println("====setting up browser using cucumber @Before======");

    }

    @After
    public void tearDownScenario(Scenario scenario){



        //scensrio.isfailed()-->is scenario fails this method will return true boolean value
        if (scenario.isFailed()) {

           byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

           scenario.attach(screenshot, "image/png", scenario.getName());

       }

        Driver.closeDriver();


        //System.out.println("===closing browser using cucumber @After====");
        //System.out.println("===scenario ended/ Take screenshot if  ");
    }
     @BeforeStep
    public void setupStep(){
         System.out.println("-----applying setup using @BeforeStep");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("-------applying tearDown using @AfterStep");
    }

}
