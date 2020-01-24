package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class invalidsignin {
	WebDriver hr1;
	@Given("^start application$")
	public void start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		hr1=new ChromeDriver();
		hr1.get("http://demowebshop.tricentis.com/login");
	}
		@When("^I enter invalid username and password$")
	public void i_enter_invalid_username_and_password1() throws Throwable {
		hr1.findElement(By.id("Email")).sendKeys("hemanthkrishna10@gmail.com");
		hr1.findElement(By.name("Password")).sendKeys("Hemanth@3783");
	}

	@Then("It should not login$")
	public void it_should_not_login1() throws Throwable {
		hr1.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		//expected="Login is unsuccessful. Please correct the errors and try again.";
		//result=hr.findElement(By.xpath("//span[contains(text(),'Login was unsuccessful. Please correct the errors and try again.')]")).getText();
		//Assert.assertEquals(expected, result);
	}

}
