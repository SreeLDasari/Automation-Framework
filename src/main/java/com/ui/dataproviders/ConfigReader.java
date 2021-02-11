package com.ui.dataproviders;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private static ConfigReader configReader;
	private Properties prop;
	
	private ConfigReader() {}
	
	public static ConfigReader getInstance() {
		if(configReader==null)
			configReader=new ConfigReader();
		return configReader;
	}
	
	public Properties initProp(){
		prop=new Properties();
		try {
			FileInputStream ip=new FileInputStream("C:\\Users\\ramba\\eclipse\\AutomationManagement\\src\\test\\resources\\com\\ui\\config\\config.properties");
			prop.load(ip);
		}
		
		catch (IOException e) {
				e.printStackTrace();
		}
		return prop;
	}
	
}
