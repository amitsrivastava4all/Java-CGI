
public class Customer {
	// Instance Member Variables
	private int id;
	private String name;
	private String phone;
	private String address;
	private int orderId;
	private String productType;
	private double price;
	private String offers;
	private double discount;
	private int quantity;
	private final int VAT ; 
	
	Customer(){
		VAT = 3;
	}
	
	
	
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getOffers() {
		return offers;
	}
	public void setOffers(String offers) {
		this.offers = offers;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	// Param Cons
	Customer(int id , String name, String phone){
		// Assign Local Variable into Instance Variable
		this();
		this.id = id;
		this.name = name;
		this.phone = phone;
				
	}
	public void computeOffers(){
		if(productType.equalsIgnoreCase("shoes")){
			if(quantity>=2){
				System.out.println("Shinner is Free for U");
			}
			else{
				System.out.println("No Offers for Shoes...");
			}
		}
		else
		if(productType.equalsIgnoreCase("Shirt")){
			if(quantity>=4){
				System.out.println("Get the Lowest Price in All Shirt");
			}
			else
			{
				System.out.println("No Offers for Shirt...");
			}
		}
	}
	
	public int computeDiscount(){
		if(productType.equalsIgnoreCase("shoes")){
			return 50;
		}
		else
		if(productType.equalsIgnoreCase("shirt")){
			return 30;
		}
		else
			if(productType.equalsIgnoreCase("Electronics")){
				return 20;
			}
		return 0;
		
	}
	
	public void orderSummary(){
		System.out.println("Order Summary ");
		System.out.println("Order Id "+orderId);
		System.out.println("Product "+productType);
		System.out.println("Offers ");
		this.computeOffers();
		System.out.println("Discount "+this.computeDiscount());
		System.out.println("VAT "+VAT);
	}
	
	public void billSummary(){
		System.out.println("Id "+id);
		System.out.println(" Name "+name);
		System.out.println(" Phone "+phone);
	}
	

}
