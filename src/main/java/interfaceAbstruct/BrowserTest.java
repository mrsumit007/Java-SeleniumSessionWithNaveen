package interfaceAbstruct;

public class BrowserTest {

	public static void main(String[] args) {
		
		String browserName = "firefox";
//		FireFoxDriver driver = new FireFoxDriver();
//		OperaDriver driver = new OperaDriver)();
		
//		ChromeDriver driver	= new ChromeDriver();

		WebDriver driver = null;
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
			
		
		case "firefox":
			driver = new FireFoxDriver();
			break;
			
		
		case "Opera":
			driver = new FireFoxDriver();
			break;

		default:
			System.out.println("Please enter correct URL");
			break;
		}
		
		driver.fiendElement();
		
		driver.get("www.amazone.com");
		String title= driver.getTitle();
		System.out.println("Title is --> " + title);
		if(title.equals("Amazone")) {
			System.out.println("Title is correct");
		}
		else {
			System.out.println("Title is incorrect");
		}
		
		driver.sendKey("Admin", "Admin@123");
		driver.click("Home Page");
		driver.close();

	}
	
}
