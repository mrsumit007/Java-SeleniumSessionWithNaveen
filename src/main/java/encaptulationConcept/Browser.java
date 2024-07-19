package encaptulationConcept;

public class Browser {
	
	
	private void browserName() {
		System.out.println("Browser Name -->   ");
	}
	private void browserVersion() {
		System.out.println("Browser version -->   ");
	}
	private void browserURL() {
		System.out.println("Browser URL -->   ");
	}

    public void browserdetails() {
    	Browser br = new Browser();
    	br.browserName();
    	br.browserVersion();
    	br.browserURL();
    }

}
