package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = {"src/test/resources/Features"},      // Path to feature files
	    glue = {"Stepdefinitions"}, 
	    		tags = "@smoke",
	    		plugin = {
	    		        "pretty",
	    		        "html:target/cucumber-html-report",
	    		        "json:target/cucumber.json",
	    		        "rerun:target/rerun.txt",
	    		        "TestRunner.CucumberExtentReportPlugin"
	    		       	    		    },
	    		
	    		 monochrome = false
	    
	   
	)
	public class TestRunner extends AbstractTestNGCucumberTests {
	    // Empty class - the annotations drive the configuration
}