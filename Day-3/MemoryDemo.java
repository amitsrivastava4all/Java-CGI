import java.util.ArrayList;

class Person
{
	long id;
	String name;
	String address;
	Person(long id, String name, String address){
		this.id = id;
		this.name = name;
		this.address = address;
	}
}
public class MemoryDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		long id = 1;
		System.out.println("Program Start");
		ArrayList list =new ArrayList();
		while(true){
			Person person = new Person(id,"Ram"+id,"Delhi"+id);
			list.add(person);
			Thread.sleep(50);
			
		}

	}

}
