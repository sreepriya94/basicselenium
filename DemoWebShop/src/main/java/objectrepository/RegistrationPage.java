package objectrepository;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BaseClass;

public class RegistrationPage extends BaseClass
{
  public RegistrationPage(WebDriver driver)
  {
	  PageFactory.initElements(driver,this);
  }
  @FindBy(className = "ico-register")
  private WebElement register;
  @FindBy(name = "Gender")
  private List<WebElement> selectgender;
  
  public List<WebElement> getSelectgender() {
	return selectgender;
}
@FindBy(id="FirstName")
  private WebElement fname;
  
  @FindBy(id="LastName")
  private WebElement lname;
  @FindBy(id="Email")
  private WebElement email;
  @FindBy(id="Password")
  private WebElement pass;
  @FindBy(id="ConfirmPassword")
  private WebElement cnfrmpass;
  @FindBy(id="register-button")
  private WebElement registerbtn;
public WebElement getRegister() {
	return register;
}

public void setRegister(WebElement register) {
	this.register = register;
}

public WebElement getRegisterbtn() {
	return registerbtn;
}

public void setRegisterbtn(WebElement registerbtn) {
	this.registerbtn = registerbtn;
}

public WebElement getFname() {
	return fname;
}

public WebElement getLname() {
	return lname;
}

public WebElement getEmail() {
	return email;
}

public WebElement getPass() {
	return pass;
}

public WebElement getCnfrmpass() {
	return cnfrmpass;
}

}
