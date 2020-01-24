package commandsdemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class imageRobot {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver hr=new ChromeDriver();
		hr.get("https://smallpdf.com/pdf-to-word");
		Robot robo=new Robot();
		robo.setAutoDelay(3000);
		hr.findElement(By.xpath("//div[@class='l0v3m7-6 hIetmX']")).click();
		
		StringSelection stringselect=new StringSelection("C:\\Users\\IBM\\Desktop\\SQL-F1-V1-D17108GC30_sg1");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselect, null);
		robo.setAutoDelay(3000);
		
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);
		robo.setAutoDelay(3000);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		//robo.keyPress(KeyEvent.VK_ENTER);
		//robo.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
