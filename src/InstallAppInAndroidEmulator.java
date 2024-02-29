
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class InstallAppInAndroidEmulator {

	public static void main(String[] args) throws MalformedURLException {
		
		//Initializing the Browser and or Mobile Device
		DesiredCapabilities dc= new DesiredCapabilities();					
		
		//Setting up Appium Auto engine under desired capability
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,12 );
		dc.setCapability(MobileCapabilityType.PLATFORM, "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		dc.setCapability(MobileCapabilityType.APP, "C:\\apkfiles\\com.facebook.lite-390.0.0.8.116-APK4Fun.com.apk");
		//Initialzing new Url Object that reperesents the Appium server URL	
		URL url= new URL("http://localhost:4723/wd/hub");
		//Initializing the instance of the AndroidDriver class
		AndroidDriver  driver = new AndroidDriver  (url, dc);				
	}
}
