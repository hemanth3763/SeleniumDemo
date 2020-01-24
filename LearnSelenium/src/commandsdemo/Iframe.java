package commandsdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver hr=new ChromeDriver();
		hr.get("http://demo.automationtesting.in/Frames.html");
		//hr.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
		List<WebElement> iframecount=hr.findElements(By.tagName("iframe"));
		System.out.println("no.of frames:"+iframecount.size());
		for(int i=0;i<iframecount.size();i++)
		{
			System.out.println(iframecount.get(i).getAttribute("name"));
		}
		WebElement frame=hr.findElement(By.xpath("//iframe[@id='singleframe']"));
		hr.switchTo().frame(frame);
		WebElement textbox=hr.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input"));
		textbox.sendKeys("selenium");
		
		//iframe within a frame
		hr.switchTo().defaultContent();
		
		WebElement second=hr.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]"));
		second.click();
		
		hr.switchTo().frame(1);
		hr.switchTo().frame(0);
		
		WebElement textbox2=hr.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input"));
		textbox2.sendKeys("Webdriver");
		
		Thread.sleep(3000);
		
		hr.switchTo().defaultContent();
		hr.findElement(By.xpath("//a[contains(text(),'Single Iframe')]")).click();
	}

}
