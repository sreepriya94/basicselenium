package login;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generics.BaseClass;
import generics.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)
public class DWS_Login_01_Test extends BaseClass 
{
	
   @Test
   public void login_With_Valid_Credentials() 
   {
                                    //using javascriptutility
	   
//	  
//	   ju.clickOnElementUsing(ref.getLogin());
//	   ju.enteringDataIntoElement(ref.getEmail(), pu.redaingDataFromPropertyFile("email"));
//	   ju.enteringDataIntoElement(ref.getPassword(), pu.redaingDataFromPropertyFile("pass"));
//	   ju.clickOnElementUsing(ref.getLoginbtn());
	   
                                         //using pom
	   
	   ref.getLogin().click();
	   ref.getEmail().sendKeys(pu.redaingDataFromPropertyFile("email"));
	   ref.getPassword().sendKeys(pu.redaingDataFromPropertyFile("pass"));
	   ref.getLoginbtn().click();
   }
}
