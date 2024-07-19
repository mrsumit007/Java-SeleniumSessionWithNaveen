package builderPattern;

public class EcommerceTest {

	public static void main(String[] args) {
		
		Ecommerce e1= new Ecommerce();
		e1.getURL(null)
			.login("TestUser", "Password@123")
				.search("Laptop")
					.addToCart("Laptop")
						.logout();
			
			
	}

}
