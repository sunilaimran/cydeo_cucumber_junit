package com.cydeo.step_definitions;

/*
In the class we will be able to pass pre- & post- conditions to
 each scenario and each step
 */


import com.cydeo.uitilies.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    @Before (order = 0)//import from ip.cucumber.java not from junit
    public void setupScenario(){
        System.out.println("====setting up browser using cucumber @Before======");

    }
    @Before (value = "@login",order = -1)
    public void setupScenarioForLogins() {
        System.out.println("====setting up browser using cucumber @Before======");

    }

    @Before (value = "@db",order = 0)
    public void setupForDatabaseScenario(){
        System.out.println("====setting up browser using cucumber @Before======");

    }

    @After
    public void tearDownScenario(){

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
