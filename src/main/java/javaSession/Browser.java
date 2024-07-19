package javaSession;

public class Browser {
	
	//WRT: To lounch a Browser(String BrowserName): (Chrome, Firefox, Eadge, Safari, IE)
	// if correct BrowserName is given then return true else false
	
	public boolean LounchBrowser(String BrowserName) {
		
		if(BrowserName.trim().toLowerCase().equals("chrome") ) {
			System.out.println("Lounch Chrome Brosser" );
			return(true);
		}
		else if (BrowserName.trim().toLowerCase().equals("firefox")){
			System.out.println("Lounch Chrome Brosser" );
			return(true);
		}
		else if (BrowserName.trim().toLowerCase().equals("safari")){
			System.out.println("Lounch Safari Brosser" );
			return(true);
		}
		else if (BrowserName.trim().toLowerCase().equals("ie") ){
			System.out.println("Lounch Safari Brosser" );
			return(true);
		}
		else {
			System.out.println("Wrong Browser Name");
			return(false);
		}
	}
	
	
	// Using Switch Case
	
	public boolean lounchBrowserApp(String BrowserName) {
		
		String Name = BrowserName.trim().toLowerCase();
		boolean flag2 = true;
		
		switch (Name) {
		case "chrome":
			System.out.println("Lounch Chrome Brosser" );
			//return(true);
			break;
			
		case "shafari":
			System.out.println("Lounch Chrome Brosser" );
			//return(true);
			break;
			
		case "firefox":
			System.out.println("Lounch Chrome Brosser" );
			//return(true);
			break;
			
		case "ie":
			System.out.println("Lounch Chrome Brosser" );
			//return(true);
			break;

		default:
			System.out.println("Wrong Browser Name");
			//return(true);
			flag2 = false;
			break;
			
			}
		return(flag2);
		
	}
	
	

	public static void main(String[] args) {
		
		Browser obj = new Browser();
		
		
		System.out.println("Using Switch");
		boolean flag2 =obj.lounchBrowserApp("FireFox");
		if(flag2) {
			System.out.println("Enter URL - www.google.com");
		}else {
			System.out.println("Please provide the correct browser name from the list");
		}
		
		

		System.out.println("=========================================");
		System.out.println("Using If Else statement");
		boolean flag = obj.LounchBrowser("Chrome");
		if(flag) {
			System.out.println("Enter URL - www.google.com");
		}else {
			System.out.println("Please provide the correct browser name from the list");
		}
	}
	
	

}
