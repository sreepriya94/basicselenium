package generics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerUtility  extends BaseClass implements ITestListener
{
public void onTestFailure(ITestResult result)
{
	TakesScreenshot ts=(TakesScreenshot) driver;
	File photo=ts.getScreenshotAs(OutputType.FILE);
	File destination=new File("./errorshots/"+result.getName()+".png");

	try {
		FileUtils.copyFile(photo,destination);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
		

	
		
	}
}

