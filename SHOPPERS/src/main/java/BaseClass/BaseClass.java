package BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


import fileUtility.ReadProperty;
import objectRepository.LoginPage;
import objectRepository.LogoutPage;
import objectRepository.WelcomPage;

public class BaseClass {

	public WebDriver driver; 
	public static WebDriver sdriver;
	
	//@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void openBrowser ()
	{
		/*if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equals("Edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}*/
		driver=new ChromeDriver();
		sdriver=driver;
		driver.manage().window().maximize();
		
		ReadProperty properties=new ReadProperty();
		String url=properties.fetchProperty("url");
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		WelcomPage welcomepage=new WelcomPage(driver);
		welcomepage.getLoginButton();
		//driver.findElement(By.id("loginBtn")).click();
		Reporter.log("Browser opened Successfully",true);	
	}
	
	@BeforeMethod(alwaysRun = true)
	public void login()
	{
		ReadProperty properties=new ReadProperty();
		
		String username=properties.fetchProperty("username");
		String password=properties.fetchProperty("password");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.getEmailTextFields().sendKeys(username);
		loginpage.getPasswordTextFields().sendKeys(password);
		loginpage.getLoginButton().click();
			
	}
	@AfterMethod(alwaysRun = true)
	public void logout() 
	{
		LogoutPage logoutpage=new LogoutPage(driver);
		logoutpage.getSettingsIcon().click();
		logoutpage.getLogout().click();
		
		Reporter.log("Logged out Successfully",true);
	
}

	@AfterClass(alwaysRun=true)
	public void closeBrowser()
	{
		driver.quit();
		Reporter.log("Browser Closed Successfully", true);
		}
	
}
