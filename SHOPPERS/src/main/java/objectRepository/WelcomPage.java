package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomPage extends BasePage{

	public WelcomPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id="loginBtn")
	private WebElement loginButton;

	public WebElement getLoginButton() {
		return loginButton;
	}
}
