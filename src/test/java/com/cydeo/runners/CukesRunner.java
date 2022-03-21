package com.cydeo.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = "html:target/cucumber-report.html",//determines what type of report we want to generate with our project, and also where we want to store
        features = "src/test/resources/features",//we provide the path of the 'feature' directory and let
        glue = "com/cydeo/step_definitions",
        dryRun = false,
        tags = "@wip"

)
public class CukesRunner {
}
