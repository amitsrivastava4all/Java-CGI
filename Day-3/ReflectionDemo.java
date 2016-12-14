import java.lang.reflect.Method;
import java.util.Scanner;

class Calculator{
	public int add(int x, int y){
		return x + y;
	}
	public int subtract(int x, int y){
		return x - y;
	}
	public int multiply(int x, int y){
		return x * y;
	}
	public int divide(int x, int y){
		return x / y;
	}
}
public class ReflectionDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Name of the Class to Be Load...");
		String className = scanner.next();
		System.out.println("type add for addition");
		System.out.println("type subtract for subtraction");
		System.out.println("type multiply for multiplication");
		System.out.println("type divide for division");
		System.out.println("Enter the Choice");
		
		String methodName = scanner.next().toLowerCase();
		Object object = Class.forName(className).newInstance();
		Method method = object.getClass().getMethod(methodName, int.class,int.class);
		Integer result= (Integer)method.invoke(object, 100,200);
		System.out.println("Result "+result);
		Object o = new TT();
		if(o instanceof TT){
			
		}
		
	}

}
class TT{
	
}
