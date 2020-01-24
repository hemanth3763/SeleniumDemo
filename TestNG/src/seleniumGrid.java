import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class seleniumGrid {
WebDriver driver;
String nodeUrl;


@Test
public void simpletest() throws MalformedURLException
{
	nodeUrl="http://172.23.102.11:3456/wd/hub";
	DesiredCapabilities capability=DesiredCapabilities.chrome();
	capability.setBrowserName("chrome");
	capability.setPlatform(Platform.WINDOWS);
	driver = new RemoteWebDriver(new URL(nodeUrl),capability);
driver.get("http://demowebshop.tricentis.com/");
Assert.assertEquals("Demo Web Shop", driver.getTitle());

//System.out.println("hemanth");
driver.quit();

}
}
