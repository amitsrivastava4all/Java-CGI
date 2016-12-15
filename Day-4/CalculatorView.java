import java.io.IOException;
import java.util.Scanner;

public class CalculatorView {
	
	void takeInput(){
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Number");
		String val = scanner.next();
		FileOperations fp = new FileOperations();
		// Reading The Data from a File
		try {
			Store store = fp.readObject();
			if(store!=null){
				if(store.actualNumber == Integer.parseInt(val)){
					System.out.println("Coming From a File "+store.resultComputed);
					return ;
				}
			}
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("I am Going to Calculate....");
		CalculatorHelper helper = new CalculatorHelper();
		try{
		int result = helper.computeFactorial(val);
		// Writing the Data in a File
		
		try {
			if(fp.writeObject(Integer.parseInt(val), result)){
				System.out.println("Data Store in a File");
			}
			else
			{
				System.out.println("Some Problem , Can't Store in a file");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result);
		}
		catch(NumberFormatException e){
			System.out.println("Can't Compute The Factorial for Non Digits");
		}
		scanner.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorView view =new CalculatorView();
		view.takeInput();

	}

}
