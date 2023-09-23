package login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generics.BaseClass;
import generics.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)
public class NavigatingToUrl extends BaseClass
{
	@Test
	public void navigatingToApplication()
	{
	driver.get(pu.redaingDataFromPropertyFile("url"));	
	}
}
