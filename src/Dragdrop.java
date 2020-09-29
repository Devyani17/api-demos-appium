import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class Dragdrop extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver;
		driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
		
		WebElement src = driver.findElementsByClassName("android.view.View").get(0);
		WebElement des = driver.findElementsByClassName("android.view.View").get(1);
		
		TouchAction t  = new TouchAction(driver);
		//t.longPress(longPressOptions().withElement(element(src))).moveTo(element(des)).release().perform();
		t.longPress(element(src)).moveTo(element(des)).release().perform();
		
	}

}
