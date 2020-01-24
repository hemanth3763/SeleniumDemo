package commandsdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Orangehrm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver hk=new ChromeDriver();
hk.get("https://opensource-demo.orangehrmlive.com/");
hk.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
hk.findElement(By.id("txtUsername")).sendKeys("Admin");
hk.findElement(By.id("txtPassword")).sendKeys("admin123");
hk.findElement(By.xpath("//input[@id='btnLogin']")).click();
hk.findElement(By.id("welcome")).click();
//Thread.sleep(3000);
//hk.close();
hk.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	}

}
