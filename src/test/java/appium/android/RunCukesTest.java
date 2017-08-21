package appium.android;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "html: target/cucumber-report-html/"},
				  features = {"src/test/resources/appium/"})
public class RunCukesTest {
}

