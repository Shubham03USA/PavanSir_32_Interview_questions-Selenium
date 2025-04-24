package retryanalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

// 1. Create a Retry Analyzer Class

public class RetryAnalyzer implements IRetryAnalyzer
{
	/*
	 * In TestNG, you can retry a failed test case by implementing a Retry Analyzer.
	 * This is done using the IRetryAnalyzer interface. The Retry Analyzer allows
	 * you to re-execute a test case a specified number of times if it fails.
	 */

	private int retryCount = 0; // current retry count 
	private static final int maxRetryCount  = 3; // max retry count limit
	
	@Override
	public boolean retry(ITestResult result) 
	{
		if(retryCount < maxRetryCount)
		{
			retryCount++;
			return true;  // retry the test
		}
		return false; // Stop retrying after maxRetryCount
	}
}
