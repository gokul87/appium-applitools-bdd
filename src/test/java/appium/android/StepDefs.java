package appium.android;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.applitools.eyes.Eyes;
import com.applitools.eyes.EyesWebDriverScreenshot;
import com.applitools.eyes.MatchLevel;

import io.appium.java_client.AppiumDriver;

public class StepDefs {

	public WebDriver driver;
	public Eyes eyes;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	}
	
	@Before
	public void setUp(){
		
		    eyes = new Eyes();
		    // This is your api key, make sure you use it in all your tests.
		    eyes.setApiKey("Nkvhzm9DrAOMtkEtQ9uLswbBqRKQ31PDY6dQbY13Y6I110");

		
		    String appPath = "C:\\Users\\Gokul\\Downloads\\org.wordpress.android_4.3.2_free-www.apkhere.com.apk";
	    	
	    	DesiredCapabilities capabilities = new DesiredCapabilities();		
			capabilities.setCapability("platformName","Android");
			capabilities.setCapability("platformVersion","4.3");
			capabilities.setCapability("deviceName","4df7f3ca12f5cf2f");
			capabilities.setCapability("app",appPath);
			
			try{
							
				driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
				// Start visual testing
//	            driver = eyes.open(driver, "Android test application", "test");
//	            eyes.setMatchLevel(MatchLevel.LAYOUT);
			}catch(MalformedURLException e) {
				e.printStackTrace();
			}

			System.out.println("I am the set up method");
	}

	@Given ("^I am on the wordpress app$")
	public void i_am_on_the_wordpress_app() throws Throwable {
		
		// Visual validation point #1
        //eyes.checkWindow("Initial view");
		String title = driver.findElement(By.id("org.wordpress.android:id/my_site_title_label")).getText();
		assertEquals("gocool1511",title);
		
	}
	
	@Then("^I should see my wordpress account page$")
	public void i_should_see_my_wordpress_account_page() throws Throwable {
		
	     String subTitle = driver.findElement(By.id("org.wordpress.android:id/my_site_subtitle_label")).getText();
	     assertEquals("gocool1511.wordpress.com",subTitle);
	}
	
	@When("^I navigate to the \"(.*?)\" section$")
	public void i_navigate_to_the_section(String arg1) throws Throwable {
	    
		driver.findElement(By.id("org.wordpress.android:id/my_site_"+arg1+"_text_view")).click();
	}

	@Then("^I should see my posts$")
	public void i_should_see_my_posts() throws Throwable {
		
		WebElement el = driver.findElement(By.id("org.wordpress.android:id/post_list_title"));
		if(el.getText().equals("About")){
			el.click();
			eyes.checkWindow("Page view");
		}
		driver.findElement(By.id("org.wordpress.android:id/viewPostWebView"));
		eyes.close();
	}

	
	@After
	public void tearDown(){
		//eyes.abortIfNotClosed();
		driver.quit();
	}

}
