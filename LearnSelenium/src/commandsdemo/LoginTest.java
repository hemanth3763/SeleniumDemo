package commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver hr=new ChromeDriver();
	//System.setProperty("webdriver.gecko.driver","E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	//WebDriver hr=new FirefoxDriver();
	hr.get("http://demowebshop.tricentis.com/login");
	hr.findElement(By.id("Email")).sendKeys("hemanthkrishna20@gmail.com");
	hr.findElement(By.name("Password")).sendKeys("Hemanth@3783");
	hr.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	String expectedname="Demo Web Shop";
	String actualname=hr.getTitle();
	String hemanth=hr.getCurrentUrl();
	System.out.println(hemanth);
	String hemanth1=hr.getPageSource();
	System.out.println(hemanth1);
	if(expectedname.equals(actualname))
	{
		System.out.println("correct page");
	}
	else
	{
		System.out.println("Incorrect page");
	}
	}

}