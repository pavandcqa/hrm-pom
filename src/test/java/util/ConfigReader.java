package util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	File file;
	FileInputStream fis;
	static Properties prop;
	
	public ConfigReader() {
		try {
		file = new File("./Configuration/config.properties");
		fis = new FileInputStream(file);
	    prop = new Properties();
	    prop.load(fis);
	    }
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getAppUrl() {
		
		return prop.getProperty("appUrl");
	}
	
	public String getBrowserOption() {
		return prop.getProperty("browser");
	}
	
	public String getChromeKey() {
		return prop.getProperty("chromekey");
	}
	
	public String getChromePath(){
		return prop.getProperty("chromepath");
	}
	
	public String getFirefoxKey() {
		return prop.getProperty("firefoxkey");
	}
	
	public String getFirefoxPath() {
		return prop.getProperty("firefoxpath");
	}
	
	public String getUserName() {
		return prop.getProperty("username");
	}
	
	public String getPassword() {
		return prop.getProperty("password");
	}
	
	// Code is to test Config file
	public static void main(String[] args) {
		
		ConfigReader r = new ConfigReader();
		
		System.out.println(prop.getProperty("appUrl"));
		System.out.println(prop.getProperty("browswer"));
		System.out.println(prop.getProperty("chromekey"));
		System.out.println(prop.getProperty("chromepath"));
		System.out.println(prop.getProperty("firefoxkey"));
		System.out.println(prop.getProperty("firefoxpath"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));

		} 

	}

