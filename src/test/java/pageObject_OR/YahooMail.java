package pageObject_OR;

import org.openqa.selenium.By;

import utilities.TestBase;
import utilities.Wait;

public class YahooMail extends TestBase { 
	
	Wait wait = new Wait();
	
	public YahooMail() {
		super();
	}
	
	/*******************************************************************************************************************************************************
	 * OBJECT REPO For Yahoo page
	 *
	 *****************************************************************************************************************************************************/

	By Yahoo_signinLink = By.xpath("//a[@class='_yb_4oyyo'][contains(text(),'Sign in')]");
	By Username = By.xpath("//*[@id='login-username']");
	By Next_Button = By.xpath("//*[@id='login-signin']");
	
	/*******************************************************************************************************************************************************
	 * Action Method for yahoo page
	 * @throws Exception 
	 *
	 *****************************************************************************************************************************************************/
	
	public void clickYahooLink() {
		driver.findElement(Yahoo_signinLink).click();
	}

	
	public void userNameField() throws Exception {
		driver.findElement(Username).click();
		wait.syschoManualWaitTime(3000);
		driver.findElement(Username).sendKeys("johnemail@yahoo.com");
	}
	
	
	public void clickNext_Button() throws Exception {
		wait.syschoManualWaitTime(3000);
		driver.findElement(Next_Button).click();
	}

}



