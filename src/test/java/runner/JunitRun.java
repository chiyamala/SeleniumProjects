package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features={"src/test/java/features/"},
				 glue={"pages","hooks"},
				 tags={"@sanity"}
				/* dryRun = false,
				 strict= false*/
				 /*plugin = {"pretty",
					"html:result",
					"json:result/cucumber.json",
					"junit:result/cucumber.xmml"*/
				 
				 )

public class JunitRun {
	
	

}





