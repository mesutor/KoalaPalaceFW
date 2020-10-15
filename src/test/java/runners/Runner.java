package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(
            //Path of the features folder
            features = "src/test/resources/features",
            //Path of the stepdefinitionsfolder
            glue = "stepdefinitions",
            tags = "@teapot",
            dryRun = false)

    public class Runner {
        //This runner class Runs the feature files
        //This runner class is used to configure and control the framework
}
