package StepDefiniations;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeaturesWithTags", 
glue={"StepDefiniations"}, 
tags="@Smoke and @regression")

public class TestRunner_Tags {
}
