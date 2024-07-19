package interfaceConcept;

public class FortiesTest {

	public static void main(String[] args) {
		
		FortiesHospital fh = new FortiesHospital();
		
		//US Method
		fh.oncologyServices();
		fh.gynecServices();
		fh.pediatricServices();
		
		//UK Methods
		fh.orthoServices();
		fh.eNTServices();
		
		//India Method
		fh.anesthesiaServices();
		
		// Common Method
		fh.emergencyServices();
		
		// Top Casting
		USMedical us = new FortiesHospital();
		us.emergencyServices();
		us.gynecServices();
		us.oncologyServices();
		us.pediatricServices();

	}

}
