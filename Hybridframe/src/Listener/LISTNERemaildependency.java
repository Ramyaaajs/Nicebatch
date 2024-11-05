package Listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class LISTNERemaildependency implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
    System.out.println("tc exec started");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{	
		System.out.println("tc exec passed");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{	
		System.out.println("tc exec failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("tc exec skipped");
	}
}
