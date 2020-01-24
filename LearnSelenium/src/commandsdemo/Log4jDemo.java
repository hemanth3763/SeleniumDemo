package commandsdemo;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log=Logger.getLogger(Log4jDemo.class);
		System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver hr=new ChromeDriver();
		hr.get("https://www.google.com/");
		log.info("successfull");
		String expectedtitle="Google";
		String actualtitle=hr.getTitle();
		log.warn("checktitle");
		if(expectedtitle.equals(actualtitle))
		{
			System.out.println("correct page");
		}
		else
		{
			System.out.println("incorrect page");
		}
	}

}
