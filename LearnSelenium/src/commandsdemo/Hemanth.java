package commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Hemanth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver hr=new ChromeDriver();
		hr.get("file:///C:/Users/IBM/Desktop/hemanth.html");
		String hemanth=hr.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]")).getText();
    	System.out.println(hemanth);
	}

}

