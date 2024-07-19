package javaSession;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LounchChromeDriver {

	public static void main(String[] args) {
		System.out.println("Hello World - My First Program for lounching the Browser");
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\inbox\\OneDrive\\Desktop\\Selenium_app\\WebDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Maximize the size of window
		driver.manage().window().maximize();
		// Navigate to a website
        driver.get("https://www.facebook.com");
        
        System.out.println(driver.getTitle());
        // Close the browser
        driver.quit();
		

	}

}
