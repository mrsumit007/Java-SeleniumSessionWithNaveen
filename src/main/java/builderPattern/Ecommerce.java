package builderPattern;

public class Ecommerce {
	
	int orderId;
	
	// builder approach concept
	
	public Ecommerce getURL(String URL){
		System.out.println("Lounch URL Method");
		return this;
	}
	public Ecommerce login(String userName, String password){
		System.out.println("User LogedIn Username/Password-->" +userName +"/"+ password );
		return this;
	}
	public Ecommerce search(){
		System.out.println("Default Product");
		return this;
	}
	public Ecommerce search(String productName){
		System.out.println(productName);
		return this;
	}
	public Ecommerce addToCart(String productName){
		System.out.println("Product added To Cart--> " +productName );
		return this;
	}
	public Ecommerce uPIPayment(String UPIno){
		System.out.println("UPI Payment");
		return this;
	}
	public Ecommerce cardPayment(int cardNo, int cvp){
		System.out.println("Card Payment-->" +cardNo + "/" + cvp);
		return this;
	}
	
	public Ecommerce orderID(){
		System.out.println("Order ID" + 1234);
		return this;
	}
	public Ecommerce logout(){
		System.out.println("Logout");
		return this;
	}
	
}
