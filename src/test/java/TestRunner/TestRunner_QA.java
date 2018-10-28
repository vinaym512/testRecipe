package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
		plugin = {"pretty", "html:target/CucumberReport"}
		,features = "src/main/resources"
		,glue = { "step.definition" }
		,tags = {"@RecipePage, @ShoppingItemUpdate"}
		)


public class TestRunner_QA {

//	@AfterClass
//	public static void close() {
//		DriverUtil.quitBrowser();
//	}
} 