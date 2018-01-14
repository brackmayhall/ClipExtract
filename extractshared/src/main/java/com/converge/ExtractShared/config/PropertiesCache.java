package com.converge.ExtractShared.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

import org.apache.log4j.Logger;

/**
 * Singleton class to holder application properties
 * @author Brackston Mayhall
 */
public class PropertiesCache {

	private final static Logger logger = Logger.getLogger(PropertiesCache.class);
	private final Properties configProp = new Properties();


	/**
	 * class used to gather properties from properties resrouces
	 */
	private PropertiesCache() {
		//Private constructor to restrict new instances
		InputStream in = this.getClass().getClassLoader().getResourceAsStream("miner.properties");
		System.out.println("Read all properties from file");
		try {
			configProp.load(in);
			in.close();
		} catch (IOException e) {
			logger.error("IOException occured while trying to read app.properties file.",e);
		}
	}

	/**
	 * Used to get doubles from properties files
	 * @param propName the property
	 * @param def the default value
	 * @return return the property as a double
	 */
	public double getDouble(String propName, double def) {
		String text = configProp.getProperty(propName);
		try {
			double value = Double.parseDouble(text);
			return value;	
		} catch (NumberFormatException | NullPointerException e) {
			logger.error("Exception in confighelper constructor.",e);
			return def;
		}
	}


	/**
	 * Used to get ints from property files
	 * @param propName the property name
	 * @param def the default value
	 * @return returns an int from the property file
	 */
	public int getInt(String propName, int def) {
		String text = configProp.getProperty(propName);
		try {
			int value = Integer.parseInt(text);
			return value;			
		} catch (NumberFormatException nfe) {
			logger.error("NumberFormatException in confighelper constructor.",nfe);
			return def;
		}
	}

	/**
	 * Used to get string from properties files
	 * @param propName the property
	 * @param def the default
	 * @return returns the string from the property file
	 */
	public String getString(String propName, String def) {
		String text = configProp.getProperty(propName);
		if(text != null && text != "") {
			return text;
		} else {
			return def;
		}		
	}

	/**
	 * Class that lazily holds the properties cache
	 * @author Brackston Mayhall
	 */
	private static class LazyHolder	{
		private static final PropertiesCache INSTANCE = new PropertiesCache();
	}

	/**
	 * Gets the singleton instance
	 * @return the single instance
	 */
	public static PropertiesCache getInstance()	{
		return LazyHolder.INSTANCE;
	}

	public String getProperty(String key){
		return configProp.getProperty(key);
	}

	public Set<String> getAllPropertyNames(){
		return configProp.stringPropertyNames();
	}

	public boolean containsKey(String key){
		return configProp.containsKey(key);
	}
}