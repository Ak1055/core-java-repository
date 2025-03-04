package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressPage extends BasePage  {

	public AddressPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//button[text()='Add Address']")
	private WebElement addAddress;
	public WebElement getAddAddress() {
		return addAddress;
	}
	@FindBy(id="Home")
	private WebElement home;
	
	public WebElement getHome() {
		return home;
	}
	@FindBy(id="Name")
	private WebElement name;
	public WebElement getName() {
		return name;
	}
	
	@FindBy(id="House/office info")
	private WebElement houseInfo;
	
	public WebElement getHouseInfo() {
		return houseInfo;
	}
	
	@FindBy(id="Streetn Info")
	private WebElement streetInfo;
	
	public WebElement getStreerInfo() {
		return streetInfo;
	}
	@FindBy(id="Landmark")
	private WebElement landmark;
	public WebElement getLandmark() {
		return landmark;
	}
	@FindBy(id="country")
		private WebElement country;
		public WebElement getcountry() {
			return country;
		}
		@FindBy(id="state")
			private WebElement state;
			public WebElement getState() {
				return state;
			}
		@FindBy(id="City")
		private WebElement city;
		public WebElement getCity() {
			return city;
		}
		@FindBy(id="pincode")
		private WebElement pincode;
		public WebElement getPincode() {
			return pincode;
		}
		@FindBy(id="phone Number")
		private WebElement phoneNumber;
		public WebElement getPhoneNumber() {
			return phoneNumber;
		}
		@FindBy(xpath="//button[text()='Add Address']")
		private WebElement addAddress1;
		public WebElement getAddAddress1() {
			return addAddress1;
		}
		
	}
	


