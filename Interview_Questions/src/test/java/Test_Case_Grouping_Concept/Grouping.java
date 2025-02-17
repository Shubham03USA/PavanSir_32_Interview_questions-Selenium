package Test_Case_Grouping_Concept;

import org.testng.annotations.Test;

public class Grouping 
{
	@Test (groups= {"smoke"})
	public void group_1()
	{
		System.out.println("This is group 1 for Smoke testing ...");
	}
	
	@Test (groups= {"integration"})
	public void group_2()
	{
		System.out.println("This is group 2 for integration testing ...");
	}
	
	@Test (groups= {"sanity"})
	public void group_3()
	{
		System.out.println("This is group 3 for Sanity testing");
	}
	
	@Test (groups= {"smoke", "integration"})
	public void group_4()
	{
		System.out.println("This is group 4 for intigration and smoke testing ...");
	}

}
