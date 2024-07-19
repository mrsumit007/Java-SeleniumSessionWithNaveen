package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import interfaceAbstruct.WebDriver;

public class LounchBrowser {

	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://google.com");
		String title =driver.getTitle();
		System.out.println("Title =  " + title);
		
		try {
			driver.findElement(By.id("   ")).click();
		}
		catch(NoSuchElementException e){
			System.out.println(e);
			e.getStackTrace();
			
		}
		finally{
			driver.quit();
			
		}
		
				

	}

}
