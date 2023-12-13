package com.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	
	//properties, load

	public static Properties p;
	
	public ConfigurationReader() throws IOException  {
		File f = new File("C:\\Users\\balas\\eclipse-workspace\\Cucumber9AmOct\\Adactin.properties");
		FileInputStream fis = new FileInputStream(f);
		
		p= new Properties();
		p.load(fis);
		
		
	
	}
	
	public String geturl() {
		
		String refurl = p.getProperty("url");
		return refurl;
	}
	
	public String getUser() {
		String user = p.getProperty("user");
		return user;
	}
	
	public String getpass() {
		String pass = p.getProperty("pass");
		return pass;
	}
	
	
	
}
