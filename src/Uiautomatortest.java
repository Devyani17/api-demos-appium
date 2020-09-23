import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Uiautomatortest extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver;
		driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
//		driver.findElementByAndroidUIAutomator("attribute(value)");
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
//		validate clickable feature for all options
//		driver.findElementsByAndroidUIAutomator("new UiSelector().property(value)");
		
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());

	}

}
