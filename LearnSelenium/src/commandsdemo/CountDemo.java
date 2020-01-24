package commandsdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver hr=new ChromeDriver();
		hr.navigate().to("http://demowebshop.tricentis.com/login");
		List<WebElement>ll=hr.findElements(By.tagName("a"));
		System.out.println("count of linked texts:"+ll.size());
		for(int i=0;i<ll.size();i++)
		{
			System.out.println("linkedtexts are:"+ll.get(i).getText());
		}
		List<WebElement>ll1=hr.findElements(By.tagName("div"));
		System.out.println("tags with div"+ll1.size());
		for(int j=0;j<ll1.size();j++)
		{
			System.out.println("div tags are:"+ll1.get(j).getText());
		}
	}

}
