package ListenersDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Mylisteners implements ITestListener {

	@Override
	public void onFinish(ITestContext result) {
		// TODO Auto-generated method stub
		System.out.println("test case finised"+result.getName());
	}

	@Override
	public void onStart(ITestContext result) {
		// TODO Auto-generated method stub
		System.out.println("test case started"+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("test case failed"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("test case started"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("test case success"+result.getName());
	}

}
