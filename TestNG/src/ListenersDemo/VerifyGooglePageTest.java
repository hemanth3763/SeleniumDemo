package ListenersDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners({ListenersDemo.Mylisteners.class})

public class VerifyGooglePageTest {


WebDriver hr;
@BeforeMethod

public void Startapp()
{
	System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	hr = new ChromeDriver();
	hr.navigate().to("http://www.google.com/");
}
@Test

public void Checktitle()
{
	String title = hr.getTitle();
	String expected_title="Google";
	Assert.assertEquals(title, expected_title);
}

@Test(priority=1)

public void CheckLogo()
{
	boolean logo = hr.findElement(By.id("hplogo")).isDisplayed();
	Assert.assertTrue(logo);
}

@AfterMethod

public void Closebrowser()
{
	hr.quit();
}
}
