import org.testng.annotations.Test;


public class AppInDemo {

	@Test
	public void startpage()
	{
		System.out.println("start application");
	}
	
	@Test(priority=1)

	public void login()
	{
		System.out.println("log into application");
	}
	
	@Test(priority=1)

	public void logoff()
	{
		System.out.println("logout of application");
	}
}
