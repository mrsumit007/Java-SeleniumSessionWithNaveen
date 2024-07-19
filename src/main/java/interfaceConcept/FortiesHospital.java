package interfaceConcept;

public class FortiesHospital implements USMedical, UkMedical, IndiaMedical{
	
	public void gestroServices() {
		System.out.println("FH --  gestroServices");
		
	}
	public void emergencyServices() {
		System.out.println("FH --  emergencyServices");
		
	}
	@Override
	public void oncologyServices() {
		System.out.println("FH --  oncologyServices");
		
	}
	@Override
	public void gynecServices() {
		System.out.println("FH --  gynecServices");
		
	}
	@Override
	public void pediatricServices() {
		System.out.println("FH --  pediatricServices");
		
	}
	@Override
	public void eNTServices() {
		System.out.println("FH --  eNTServices");
		
	}
	@Override
	public void orthoServices() {
		System.out.println("FH --  orthoServices");
		
	}
	@Override
	public void anesthesiaServices() {
		System.out.println("FH --  anesthesiaServices");
		
	}

}
