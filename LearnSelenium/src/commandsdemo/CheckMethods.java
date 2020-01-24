package commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver hr=new ChromeDriver();
		hr.get("http://demowebshop.tricentis.com/login");
		boolean checkpresence=hr.findElement(By.id("Email")).isDisplayed();
		System.out.println(checkpresence);
		boolean checkenabled=hr.findElement(By.id("Email")).isEnabled();
		System.out.println(checkenabled);
		if(checkpresence==true && checkenabled==true){
			hr.findElement(By.id("Email")).sendKeys("hemanthkrishna20@gmail.com");
		
		}
	}

}
