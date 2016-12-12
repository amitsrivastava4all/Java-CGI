import java.util.Scanner;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Id");
		int id = scanner.nextInt();
		System.out.println("Enter the Name");
		String name = scanner.next();
		System.out.println("Enter the Phone");
		String phone = scanner.next();
		System.out.println("Enter the Product Type (Electronics, Shoes, Clothes)");
		String productType = scanner.next();
		System.out.println("Enter the Quantity");
		int quantity = scanner.nextInt();
		Customer customer = new Customer(id, name, phone);
		customer.setProductType(productType);
		customer.setQuantity(quantity);
		customer.computeOffers();
		customer.computeDiscount();
		customer.orderSummary();
		customer.billSummary();

	}

}
