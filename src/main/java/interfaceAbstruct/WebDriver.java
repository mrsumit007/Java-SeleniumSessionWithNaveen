package interfaceAbstruct;

public interface WebDriver extends SearchContest {
	
	@Override
	public void fiendElement();
	
	@Override
	public void fiendElements();
	
	public void get(String URL);
	public String getTitle();
	public void sendKey(String un, String psw);
	public void click(String element);
	public void close();

}
