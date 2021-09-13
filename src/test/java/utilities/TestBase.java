package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
	
   
    public static WebDriver driver;

    public static Properties prop;

   

    /*

    * public TestBaseOne() { try { prop = new Properties(); FileInputStream fis =

    * new FileInputStream("src/test/java/config/config.properties");

    * prop.load(fis);

    *

     * } catch (IOException e) { e.getMessage(); }

    *

     *

     * }

    */

   

   



    public static void initialization() {

         

       /**

        * Uncomment below code to run in headless browser

        */

         

    //   WebDriverManager.chromedriver().setup();

    //   WebDriverManager.chromedriver().proxy("server:port").setup();

    System.setProperty("webdriver.chrome.driver","src/test/java/Driver/chromedriver.exe");

          ChromeOptions options = new ChromeOptions();

    //   options.addArguments("headless");

       options.addArguments("window-size=1200x600");

       options.setExperimentalOption("useAutomationExtension", false);

       options.addArguments("--no-sandbox");

          driver = new ChromeDriver(options);

        

       

    //   driver = new ChromeDriver();

   

   



         

         

    driver.manage().window().maximize();

    driver.manage().deleteAllCookies();

//driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);

//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

    //driver.get(prop.getProperty("url"));

    driver.get("https://www.yahoo.com");

   

   

    }

   

   

   

   

   

   



   





   

    public static void closeSession() throws Exception {

         

           

          driver.close();

         

         

         

   }
}




	
	

	
	

