import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Int");
		int j = scanner.nextInt();
		System.out.println("Enter the Double");
		double y = scanner.nextDouble();
		System.out.println("Enter the String ");
		scanner.nextLine();
		String k = scanner.nextLine();
		System.out.println(" J "+j+" and Y "+y +" and "+k);

	}

}
