package stepDefinations;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.TestBase;

public class Hooks extends TestBase {
	


	 @Before
	    public static void beforeScenario(){
		 TestBase.initialization();
	    } 
	 
	 @After
	    public static void afterScenario(Scenario scenario) throws Exception{
		 if (scenario.isFailed()) {
			    byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			    scenario.attach(screenshot, "image/png", "Bartholomew and the Bytes of the Oobleck");
			   
			}
		
		 
			TestBase.closeSession();
	    }
}
