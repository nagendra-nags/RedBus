package com.Redbus.GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileUtility {
	
	public String getPropertyKeyValue(String key) throws Exception
	{
		FileInputStream fls= new FileInputStream(".\\PropertyFlie\\commondata.properties");
		Properties prop=new Properties();
		prop.load(fls);
		String value = prop.getProperty(key);
		return value;
	}

}
