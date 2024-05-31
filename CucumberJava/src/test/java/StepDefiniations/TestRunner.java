package StepDefiniations;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue="StepDefiniations", monochrome = true, 
plugin = {"pretty","junit:target/JUnitReports/reports.xml",
		"json:target/JSONReports/reports.json",
		"html:target/HtmlReports"})

public class TestRunner {
}
