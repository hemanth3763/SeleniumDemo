package commandsdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver hr=new ChromeDriver();
		FileInputStream fis = new FileInputStream("E:\\datadriven\\New Microsoft Excel Worksheet.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		int rowcount=sheet1.getLastRowNum();
		//System.out.println(rowcount);
		for(int i=0;i<=rowcount;i++)
		{
			String username=sheet1.getRow(i).getCell(0).getStringCellValue();
			String password=sheet1.getRow(i).getCell(1).getStringCellValue();
			hr.get("http://demowebshop.tricentis.com/login");
			hr.findElement(By.id("Email")).sendKeys(username);
			hr.findElement(By.name("Password")).sendKeys(password);
			hr.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
			Thread.sleep(3000);
			hr.findElement(By.xpath("//a[@class='ico-logout']")).click();;
			hr.close();
		}
	}

}
