package stepDefinitions;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class classes {

	static AppiumDriver<MobileElement> driver;
	URL url;
	static DesiredCapabilities cap = new DesiredCapabilities();
	
	@Before
	public static void lufthansa() throws Exception {
		
//		Device details		
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("deviceName", "Android SDK built for x86");
		cap.setCapability("udid", "emulator-5554");
		
//		Browser details
		cap.setCapability("appPackage", "com.android.chrome");
		cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		
		cap.setCapability("noReset", true);
		
	}
	
		@Given("User opens Browser")
		public void user_opens_browser() throws Exception {
			System.out.println("1");
			url = new URL("http://127.0.0.1:4723/wd/hub");
			System.out.println("2");
			driver = new AppiumDriver<>(url,cap);
			System.out.println("3");
			Thread.sleep(5000);
			System.out.println("Application started");
		}
		
		@And("User Navigates to Lufthansa.com website")
		public void user_navigates_to_lufthansa_com_website() throws Exception {
		    driver.get("https://www.lufthansa.com/in/en/homepage");
		    
		    Thread.sleep(2000);
		    driver.getCurrentUrl();
		}
	
}
