import java.util.ArrayList;
import java.util.function.Consumer;

class MyMethod2 implements Consumer{

	@Override
	public void accept(Object t) {
		System.out.println("Repeat This "+t);
		
	}
	
}
class MyMethod implements Consumer{

	@Override
	public void accept(Object t) {
		System.out.println("Call Me "+t);
		
	}
	
}

class R1
{
	static void myloop(Consumer c){
		for(int i = 1; i<=10; i++){
			c.accept(i); // checkEvenOdd(i)
		}
	}
}

public class MethodReferenceExample {
	//static void checkEvenOdd(int p){
	 void checkEvenOdd(int p){
		if(p%2==0){
		System.out.println("Even No"+p);
		}
		else{
			System.out.println("odd No "+p);
			
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Generic ArrayList
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(10);
		list.add(90);
		list.add(3);
		list.add(5);
		// How to Traverse It
		// Enhance For Loop
//		for(Integer i : list){
//			checkEvenOdd(i);
//			//System.out.println(i);
//		}
		//list.forEach(System.out::println);
		//list.forEach(MethodReferenceExample::checkEvenOdd);
		MethodReferenceExample obj = new MethodReferenceExample();
		list.forEach(obj::checkEvenOdd);
		list.forEach((x)->System.out.println(x));
		//MethodReferenceExample obj = new MethodReferenceExample();
		MyMethod m = new MyMethod();
		R1.myloop(new MyMethod2());
	}

}
