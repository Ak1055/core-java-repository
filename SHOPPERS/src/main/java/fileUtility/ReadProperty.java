package fileUtility;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.Reporter;

import BaseClass.BaseClass;

public class ReadProperty extends BaseClass{
	FileInputStream path;

	public String fetchProperty(String key) {

		try 
		{
			path=new FileInputStream("./src/test/resources/shopper.properties");
		} 
		catch (FileNotFoundException e) 
		{	
			Reporter.log("path is wrong", true);
		}
		Properties pObj=new Properties();
		try
		{
			pObj.load(path);
		} 
		catch (IOException e) 
		{
			Reporter.log("path is wrong", true);
		}
		String data=pObj.getProperty(key);
		return data;		
	}
}