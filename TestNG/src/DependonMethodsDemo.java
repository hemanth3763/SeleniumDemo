import org.testng.annotations.Test;


public class DependonMethodsDemo {

	@Test
	public void startpage()
	{
		System.out.println("start application");
	}
	
	@Test(dependsOnMethods="startpage")

	public void login()
	{
		System.out.println("log into application");
	}
	
	@Test(dependsOnMethods="login")

	public void logoff()
	{
		System.out.println("logout of application");
	}
}
