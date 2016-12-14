/*
 * Every Java Class Parent Class is Object Class
 * 
 */
//class V{
//	
//}
class T //extends V
{
	T(){
		System.out.println("I am a Constructor");
	}
	@Override
	protected void finalize(){
		System.out.println("Bye Bye..");
	}
}
public class FinalizeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T obj = new T();
		obj = null;
		System.gc(); //Runtime.getRuntime().gc();
		for(int i = 1 ; i<=10; i++){
			System.out.println("I Is "+i);
		}

	}

}
