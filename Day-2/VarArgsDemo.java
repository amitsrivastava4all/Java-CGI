
public class VarArgsDemo {

	public static int sum(String e,int ...x){
		int s = 0;
		for(int i : x){
			s = s + i;
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sum is "+sum(""));
		System.out.println("Sum is "+sum("",10));
		System.out.println("Sum is "+sum("",10,20));
		System.out.println("Sum is "+sum("",10,20,30));
	}

}
