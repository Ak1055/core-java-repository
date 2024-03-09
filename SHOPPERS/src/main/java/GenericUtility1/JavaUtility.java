package GenericUtility1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	
	public int getRandomNumber(int limit) {
		Random random=new Random();
		int randomNumber=random.nextInt(limit);
		return randomNumber;
	} 
	public String getSystemDateWithTime() {
		Date dateobj=new Date();
		String dateActualFormat=dateobj.toString();
		String date=dateActualFormat.replace(" ","_").replace(":","_");
		return date;
		}
	public String getSystemDateinDDMMYYYYformat() {
		Date dateobj=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		String date=sdf.format(dateobj);
		
		return date;
		
	}
	public static void main(String[] args) {
		JavaUtility jvn=new JavaUtility();
		System.out.println(jvn.getRandomNumber(1000));
		System.out.println(jvn.getSystemDateinDDMMYYYYformat());
		System.out.println(jvn.getSystemDateWithTime());
	}
}
