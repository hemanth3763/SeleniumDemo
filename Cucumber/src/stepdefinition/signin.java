package stepdefinition;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class signin {
WebDriver hr;
String result,expected;
	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		 System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
			hr=new ChromeDriver();
			hr.get("http://demowebshop.tricentis.com/login");
	}

	@When("^I enter valid username and password$")
	public void i_enter_valid_username_and_password() throws Throwable {
		hr.findElement(By.id("Email")).sendKeys("hemanthkrishna20@gmail.com");
		hr.findElement(By.name("Password")).sendKeys("Hemanth@3783");
	}

	@Then("^user should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
		hr.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		hr.close();
	}
	

}
