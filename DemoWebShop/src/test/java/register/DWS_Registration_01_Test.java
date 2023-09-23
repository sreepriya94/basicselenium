package register;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import generics.BaseClass;

public class DWS_Registration_01_Test extends BaseClass
{
  @Test
  public void registration()
  {
	  
	 reg.getRegister().click();
	for (WebElement element : reg.getSelectgender()) 
	{
		if(element.getAttribute("value").equalsIgnoreCase(pu.redaingDataFromPropertyFile("gender")))
		{
			element.click();
		}
		
	}
	 reg.getFname().sendKeys(pu.redaingDataFromPropertyFile("fname"));
	 reg.getLname().sendKeys(pu.redaingDataFromPropertyFile("lname"));
	 reg.getEmail().sendKeys(pu.redaingDataFromPropertyFile("newemail"));
	 reg.getPass().sendKeys(pu.redaingDataFromPropertyFile("pass"));
	 reg.getCnfrmpass().sendKeys(pu.redaingDataFromPropertyFile("pass"));
	 reg.getRegisterbtn().click();
  }


	
}

