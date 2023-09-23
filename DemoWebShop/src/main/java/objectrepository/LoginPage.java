package objectrepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generics.BaseClass;
public class LoginPage extends BaseClass
{
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(className ="ico-login")
	private WebElement loginlink;
	@FindBy(id = "Email")
	private  WebElement emailTF;
	@FindBy(id = "Password")
	private  WebElement passwordTF;
	@FindBy(xpath = "(//input[@type='submit'])[2]")
	private WebElement loginbtn;
	
	public WebElement getLogin() {
		return loginlink;
	}
	public WebElement getEmail() {
		return emailTF;
	}
	public WebElement getPassword() {
		return passwordTF;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
}
