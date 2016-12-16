import java.util.Scanner;

// Checked Custom Exception
/*
 * 1. Create a Class and Inherit Either Exception(Checked)
 * or Inherit Runtime Exception (Unchecked)
 * Override the toString for Message
 * Also Create Constructors to display the error values enter by the user
 */
class MinorAgeException extends Exception{
	private int age;
	MinorAgeException(){}
	MinorAgeException(int age){
		this.age = age;
	}
	public String toString(){
		return "U Can't Apply for VoterId and DL as Your are a  Minor and Your Age is "+(age>0?age:"");
	}
	
}
public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Age");
		int age =scanner.nextInt();
		try{
		if(age<18){
			// Explicit throw
			throw new MinorAgeException();
		}
		System.out.println("U Can Apply For VoterId ");
		System.out.println("U Can Apply for DL ");
		}
		catch(MinorAgeException e){
			System.out.println(e);
		}
		}

}
