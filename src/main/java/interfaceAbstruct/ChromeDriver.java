package interfaceAbstruct;

public class ChromeDriver implements WebDriver {

	@Override
	public void fiendElement() {
		System.out.println("Chrome Driver Find Element Method");
		
	}

	@Override
	public void fiendElements() {
		System.out.println("Chrome Driver Find Elements Method");
		
		
	}

	@Override
	public void get(String URL) {
		System.out.println("lounch URL->" +URL );
		
	}

	@Override
	public String getTitle() {
		return "Amazone";
		
	}

	@Override
	public void sendKey(String un, String psw) {
		System.out.println("User Id->" + un + "Password->" + psw);
		
	
	}

	@Override
	public void close() {
		System.out.println("Chrome Driver is closed");
		
	}

	@Override
	public void click(String element) {
		System.out.println("Clicked on Element  -->" + element);
		
	}

}
