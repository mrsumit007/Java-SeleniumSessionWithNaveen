import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) throws InterruptedException {
		
	By options	= By.xpath("//a[text() = 'Joe.Root']/parent::td/ following-sibling :: td");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://selectorshub.com/xpath-practice-page/");
	Thread.sleep(2000);
	List<WebElement> list = driver.findElements(options);
	
	List<String> custDetails = new ArrayList();
	
	for(WebElement e : list) {
		String text= e.getText();
		custDetails.add(text);
	}
	System.out.println(custDetails);
	
	driver.quit();

	}

}
