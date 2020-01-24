package commandsdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver hr=new ChromeDriver();
		hr.navigate().to("http://demo.automationtesting.in/Alerts.html");
		hr.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert a1=hr.switchTo().alert();
		String alertTitle=hr.switchTo().alert().getText();
		System.out.println("alerttitle is:"+alertTitle);
		a1.accept();
		//Thread.sleep(3000);
		hr.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();		
		hr.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	    Alert alert1=hr.switchTo().alert();
	    System.out.println("alerttitle is:"+alert1);
	    alert1.dismiss();
		hr.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		hr.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert a2=hr.switchTo().alert();
		String alert=a2.getText();
		System.out.println(alert);
		a2.sendKeys("hemanth");
		a2.accept();
		
	}

}
