package retryanalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTest 
{
	@Test (retryAnalyzer = RetryAnalyzer.class)
	public void testRetry()
	{
		System.out.println("Executing Test ....");
		Assert.fail("Failing test to demostrate retry..."); //Methods to Fail a Test Case Purposefully
	}

}
