package com.propertiesFile;

import java.io.FileInputStream;
import java.util.Properties;

public class WorkWithPropertiesFile {

	public static void main(String[] args) throws Throwable {
		
		FileInputStream fip=new FileInputStream(".\\src\\com\\propertiesFile\\GlobalVariable.Properties");
		Properties prop=new Properties();
		prop.load(fip);
		
		System.out.println(prop.getProperty("Browser"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("TestEnvi"));
	}

}
