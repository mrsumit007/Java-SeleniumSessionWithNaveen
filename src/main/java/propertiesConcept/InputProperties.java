package propertiesConcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class InputProperties {
	
	
	static String CONFIG_INPUT_FILE= "./src/main/java/propertiesConcept/config.properties";
	static Properties prop;
	
	public static void main(String a[]) {
		
		try {
			FileInputStream ip = new FileInputStream(CONFIG_INPUT_FILE);
			prop = new Properties();
			prop.load(ip);
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
//			catch (IOException e) {
//			e.printStackTrace();
//		}
		
		Object Browser = prop.get("Browser");
		System.out.println(Browser);
		
		prop.setProperty("Test", "Test");
		Object Test = prop.get("Test");
		System.out.println(Test);
		
		
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//	public final static String CONFIG_INPUT_PATH = "./src/main/java/propertiesConcept/config.properties";
//	static Properties prop;
//	
//	public static void main(String[] args) {
//		
//		try {
//			FileInputStream ip = new FileInputStream(CONFIG_INPUT_PATH);
//			prop = new Properties();
//			prop.load(ip);
//			
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		Object Browser =prop.get("Browser");
//		System.out.println(Browser);
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
