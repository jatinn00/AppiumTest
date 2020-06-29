package shoppingapplication;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class openApp {

		static AppiumDriver<MobileElement> driver;
		
	public static void openApplication() throws Exception {
		DesiredCapabilities caps= new DesiredCapabilities();
		caps.setCapability("deviceName", "Mi A1");
		caps.setCapability("udid", "79529a630404");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "9");

		caps.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		caps.setCapability("appActivity", "com.amazon.mShop.navigation.MainActivity");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver= new AppiumDriver<MobileElement>(url,caps);
		
		System.out.println("Application Started...");

	}
}
