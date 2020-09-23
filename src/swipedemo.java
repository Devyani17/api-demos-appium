import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;


public class swipedemo extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver;
		driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text = 'Views']").click();
		driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		
		driver.findElementByXPath("//*[@content-desc = '9']").click();
		TouchAction t = new TouchAction(driver);
		//longpress on element for 2 sec// move to other element //release
		
		WebElement ele = driver.findElementByXPath("//*[@content-desc = '15']");
		WebElement ele2 = driver.findElementByXPath("//*[@content-desc = '45']");
		
		t.longPress(longPressOptions().withElement(element(ele)).withDuration(ofSeconds(2))).moveTo(element(ele2)).release().perform();
		

	}

}
