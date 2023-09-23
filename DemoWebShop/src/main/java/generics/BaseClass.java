package generics;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepository.LoginPage;
import objectrepository.RegistrationPage;


public class BaseClass {
	public static WebDriver driver;
	public static JavaScriptUtility ju=new  JavaScriptUtility() ;
	public static PropertyUtility pu=new PropertyUtility();
	public LoginPage ref;
	public RegistrationPage reg;
	
	 
	@BeforeClass
	public void launchngBrowser() {
		if (pu.redaingDataFromPropertyFile("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ref=new LoginPage(driver);
		reg=new RegistrationPage(driver);
	}

	@BeforeMethod
	public void navigateToUrl() {
		driver.get(pu.redaingDataFromPropertyFile("url"));

	}

@AfterClass
	public void closingTheBrowser()
	{
		driver.quit();
	}

		
		
		
		
		
		
		
}


