class Person{
	int age;
	String name;
	Person(){
		age = 0;
		name="N/A";
		System.out.println("Parent Default Call");
	}
	Person(int age, String name){
		this();
		this.age = age;
		this.name = name;
		System.out.println("Parent Param Call");
	}
	void print(){
		System.out.println("Age "+age);
		System.out.println("Name "+name);
	}
}
class MyCustomer extends Person{
	int id;
	MyCustomer(){
		super(21,"Mike");
		// super();
		id = 1;
		System.out.println("Child Default Call");
	}
	MyCustomer(int id){
		this();
		//super(21,"Mike");
		this.id = id;
		System.out.println("Child Param Call");
	}
	@Override
	void print(){
		super.print();
		System.out.println(" Id "+id);
	}
}
public class ISA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCustomer customer = new MyCustomer(999);
		customer.print();
		

	}

}
