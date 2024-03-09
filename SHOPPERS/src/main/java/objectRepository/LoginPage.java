package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(id="Email")
	private WebElement emailTextFields;
	
	@FindBy(id="password")
	private WebElement passwordTextFields;
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement loginButton;

	public  WebElement getEmailTextFields() {
		return emailTextFields;
	}

	public WebElement getPasswordTextFields() {
		return passwordTextFields;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	}