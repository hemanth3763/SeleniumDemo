package GroupDemo;

import org.testng.annotations.Test;

public class Group2 {

	@Test(groups={"regression"})
	
	public void test3()
	{
		System.out.println("second regression");
	}
	
	@Test(groups={"smoke"})
	
	public void test4()
	{
		System.out.println("second smoke");
	}

}
