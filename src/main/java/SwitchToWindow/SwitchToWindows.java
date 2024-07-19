package SwitchToWindow;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindows {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//parent
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();//child
		//1.) Fetch the window id
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowId= it.next();
		System.out.println(parentWindowId);
		
		String childWindowId= it.next();
		System.out.println(childWindowId);
		
		// Switch to Child Window
		driver.switchTo().window(childWindowId);
		
		System.out.println(driver.getTitle());
		driver.close();
		
		// Switch To Parent Window
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
