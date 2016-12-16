import java.io.IOException;

/*
 * This Rule is For Checked Exception 
 */
class Parent
{
	void show() throws Exception{
		System.out.println("Parent Show");
	}
}
class Child extends Parent
{
	void show() throws IOException  {
		System.out.println("Child Show");
	}
}
public class OverridingWithExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		try {
			child.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
