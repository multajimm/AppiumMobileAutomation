import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculator {

	public static  void main(String[] args) throws MalformedURLException, InterruptedException {
		//CReating instance of Desired capabilities which will intiate Browser and mobile device
		DesiredCapabilities dc= new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,12 );
		
		dc.setCapability(MobileCapabilityType.PLATFORM, "Android");
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		
		//Creating instance of URL class which represents the Appium server URL
		URL url= new URL("http://localhost:4723/wd/hub");
		
		dc.setCapability("appPackage", "com.android.calculator2");
		dc.setCapability("appActivity", "com.android.calculator2.calculator");
		
		AndroidDriver driver = new AndroidDriver (url, dc);
		
		//Provided by Java. Same as implicit wait. Its better to use explicit wait
		Thread.sleep(5000);
		
		WebElement seven=driver.findElementById("com.calculator/digit_7");
		seven.click();
		Thread.sleep(5000);
		
		WebElement three=driver.findElementById("com.calculator/digit_3");
		three.click();
		Thread.sleep(5000);
		
		WebElement result=driver.findElementById("com.calculator/result");
		result.getText();
		Thread.sleep(5000);
		
		if(result.equals("10")) {
		System.out.println("Test is Passed");
		}
		else {
			System.out.println("Test is Failed");
	}
}
}
