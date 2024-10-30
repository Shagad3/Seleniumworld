package day41ExelDataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
	
		Properties  prop= new Properties();
		
		FileInputStream file = new FileInputStream("C:\\Workspace\\seleniumworld\\src\\testdata\\config.properties");
		Properties  propobj= new Properties();
		propobj.load(file);
		
		String url = propobj.getProperty("appurl");
		String emailID = propobj.getProperty("email");
		System.out.println(url+" "+emailID);
		//to retrive the keys from the properties
	Set<String>	Keys = propobj.stringPropertyNames();
		System.out.println(Keys);
	Set<Object> key=propobj.keySet();
	System.out.println(key);
	//to retrive the values from the properties

Collection<Object> value=propobj.values();
System.out.println(value);
		
	}

}
