package ganeralIVQ;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {
	
	public final static String CONFIG_INPUT_FILE = "./src/main/java/propertiesConcept/config.properties";
	static FileInputStream ip;
	static Properties prop;

	public static void main(String[] args) {
		
			
			try 
			{
				ip = new FileInputStream(CONFIG_INPUT_FILE);
				Properties prop = new Properties();
				prop.load(ip);
				
			} 
			catch (FileNotFoundException e) 
			{
				e.printStackTrace();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		
			Object Browser= prop.get("Browse");
			System.out.println(Browser);
	}

}
