package seleniumtrainingpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;
import java.util.Properties;

public class ReadDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(new File(System.getProperty("user.dir")+"\\src\\test\\java\\seleniumtrainingpackage\\config.properties"));
		prop.load(fis);
		
		System.out.println("first name is " +prop.getProperty("firstname"));
		System.out.println("last name is " +prop.getProperty("lastname"));
		System.out.println("location is " +prop.getProperty("location"));
	}

}
