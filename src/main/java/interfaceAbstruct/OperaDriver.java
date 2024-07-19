package interfaceAbstruct;

public class OperaDriver implements WebDriver{

	@Override
	public void fiendElement() {
		System.out.println("Opera Driver Find Element Method");
		
	}

	@Override
	public void fiendElements() {
		System.out.println("Opera Driver Find Elements Method");
		
		
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
	public void click(String element) {
		System.out.println("Clicked on Element -->" + element);
		
	}

	@Override
	public void close() {
		System.out.println("Opera Driver is closed");
		
	}

}
