//final class A{


class A{
	final int MAX = 100;
	protected void show(){
		System.out.println("A Show Call");
	}
	final void show(int x ){
		System.out.println("A Show Call Overloading...");
	}
}
class B extends A
{
	@Override
	public  void show(){
		System.out.println("B Show Call");
	}
	void show(int x, int y){
		System.out.println("B Show Overloading...");
	}
}

class TT{
	int x,y;
}
public class OverrideDemo {

	public static void main(String[] args) {
		B obj = new B();
		obj.show(100);
		obj.show();
		 final TT obj2 = new TT();
		//obj2 = new TT();
		obj2.x = 100;
		obj2.x++;
		final int P = 10;
		
		// TODO Auto-generated method stub

	}

}
