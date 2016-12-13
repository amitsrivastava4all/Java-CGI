// SAM Interface
@FunctionalInterface
interface Calculator{
	//int add();
	int calc(int x, int y); 
}
// 1st Way (Classical Approach)
// 1st implement the interface
// 2nd override the method
// 3rd Create Object 
//4. Call the Method
class MyCalc implements Calculator{
	@Override
	public int calc(int x, int y){
		return x + y;
	}
}
public class InterfaceUseWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calcObject = new MyCalc();
		System.out.println(calcObject.calc(100,200));
		if(10>2){
		//2nd Approach (Anonymous Class)
			// 1st implement the interface
			// 2nd override the method
			// 3rd Create Object + Upcasted
			//4. Call the Method
		Calculator obj = new Calculator(){
			int p ;
			@Override
			public int calc(int x, int y){
				return x * y;
			}
		};
		System.out.println("Anonymous Call "+obj.calc(90, 2));
		}
		
		// 3rd Way Lambda Expression
		// 1st implement the interface
					// 2nd override the method
					// 3rd Create Object + Upcasted
		Calculator c = (a,b)->{
			System.out.println("A is "+a+" and B is "+b);
			return a-b;
			
		};
		System.out.println("Lamda "+c.calc(90, 10));
		
		

	}

}
