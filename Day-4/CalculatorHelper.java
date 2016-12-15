
public class CalculatorHelper {
	
	public int computeFactorial(String val) throws NumberFormatException{
		// Convert String into int
		int num =0;
		num = Integer.parseInt(val);
//		try{
//		num = Integer.parseInt(val);     // throw new NumberFormatException()
//		}
//		catch(NumberFormatException e ){
//			System.out.println("Only Number Allowed... "+e);
//			return 0;
//		}
		int factorial = 1;
		if(num<0){
			return 0;
		}
		while(num>=1){
			factorial = num * factorial;
			num--;
		}
		return factorial;
	}

}
