package commandsdemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver hr=new ChromeDriver();
		hr.get("http://toolsqa.com/automation-practice-switch-windows/");

		String parentWindowHandle = hr.getWindowHandle();
		 System.out.println("Parent window's handle -> " + parentWindowHandle);
		 WebElement clickElement = hr.findElement(By.id("button1")); 
		 
		 for(int i = 0; i < 3; i++)
		 {
		 clickElement.click();
		 Thread.sleep(3000);
		 }
		 
		 Set<String> allWindowHandles = hr.getWindowHandles();
		 String lastWindowHandle = "";
		 for(String handle : allWindowHandles)
		 {
		 System.out.println("Switching to window - > " + handle);
		 System.out.println("Navigating to google.com");
		 hr.switchTo().window(handle); //Switch to the desired window first and then execute commands using driver
		 hr.get("http://google.com");
		 lastWindowHandle = handle;
		 }
	}

}
