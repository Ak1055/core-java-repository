package demo;

import java.sql.Driver;

import org.testng.annotations.Test;

import BaseClass.BaseClass;
import GenericUtility1.WebDriverUtility;
import fileUtility.ReadExcel;
import objectRepository.HomePage;

public class AddAddressTest extends BaseClass
{
	@Test
	
	public void addAddressTest() {
		
		HomePage homepage=new HomePage(driver);
		WebDriverUtility.clickOnElement(WebDriverUtility) (homepage.getSettingsIcon());
		WebDriverUtility.clickOnElement(homepage.getMyProfile());
		//homepage.getMyProfile().click();
		Myprofile myprofile=new MyProfile(driver);
		WebDriverUtility.clickOnElement(homepage.getMyAddresses());
		//myprofile.getMyAdresses().click();
		AddressPage addresspage=new AddressPage(driver);
		WebDriverUtility.clickOnElement(addresspage.getAddAddress());
		//addresspage.getAddAddress().click();
		WebDriverUtility.clickOnElement(addresspage.getHome());
		//addresspage.getHome().click();
		ReadExcel excel=new ReadExcel();
		String nameValue= excel.fetchSingleData("Address", 1, 0) ;
		
		WebDriverUtility.sendText(addresspage.getNmae(), nameValue);
		String houseInfo=excel.fetchSingleData("Address", 2, 1);
		WebDriverUtility.sendText(addresspage.getHouseInfo(), houseInfo );
		String houseInfo=excel.fetchSingleData("Address", 3, 2);
		WebDriverUtility.sendText(addresspage.getStreetInfo(), StreetInfo );
		String houseInfo=excel.fetchSingleData("Address", 4, 3);
		WebDriverUtility.sendText(addresspage.getStreetInfo(), landmark);
		
		WebDriverUtility.selectByVisibleText(addresspage.getCountry(), "India");


	}
	
}
