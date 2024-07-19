package SwitchToWindow;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindows1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//01--520856278
		// 866 605 2171
		
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();//child
		
		Set<String> handler= driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		
		String parentWindowID= it.next();
		String childWindowID= it.next();
		
		driver.switchTo().window(childWindowID);
		driver.getCurrentUrl();
		
		driver.close();
		
		driver.switchTo()
		

	}

}
