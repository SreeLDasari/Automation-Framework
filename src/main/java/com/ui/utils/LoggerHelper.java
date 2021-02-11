package com.ui.utils;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggerHelper {
	private static LoggerHelper loggerHelper;
	
	private LoggerHelper() {}
	
	public static LoggerHelper getInstance() {
		if(loggerHelper==null)
			loggerHelper=new LoggerHelper();
		return loggerHelper;
	}
	
	public static Logger getLogger(Class cls) {
	 boolean root=false;
		if(root) {
			return Logger.getLogger(cls);
		}
		PropertyConfigurator.configure("log4j.properties");
		root=true;
		return Logger.getLogger(cls);
	}
}
