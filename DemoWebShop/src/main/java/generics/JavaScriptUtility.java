package generics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility extends BaseClass
{
  public void enteringDataIntoElement(WebElement element,String data)
  {
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  js.executeScript("arguments[0].value='"+data+"'", element);
	  
  }
  public void clickOnElementUsing(WebElement element)
  {
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  js.executeScript("arguments[0].click()", element);
	   
  }
}
