package listenersExample;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerBlog implements ITestListener{
	
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("New Test Started : " +result.getName());
	
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("New Test Successful : " +result.getName());
	
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("New Test Failed : " +result.getName());
	
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("New Test Skipped : " +result.getName());
	
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("New Test Failed on success percentage : " +result.getName());
	
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("onStart Method Started");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("onFInish Method Started");
	}
	
	

}
