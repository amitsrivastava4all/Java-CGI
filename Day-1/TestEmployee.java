import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		//object is a instance of a class
		System.out.println("Enter the Id");
		int id = scanner.nextInt();
		System.out.println("Enter the Name");
		String name = scanner.next();
		System.out.println("Enter the Salary");
		double salary = scanner.nextDouble();
		Employee mike = new Employee(id,name,salary);
		scanner.close();
		//mike = new Employee();
		mike.print();
		mike.setSalary(mike.getSalary()+1000);
		System.out.println(mike.getName()+" "+mike.getSalary());
		//mike.id = -1002;
		//mike.salary=-9999;
		//mike.takeInput(1002, "Mike", 8888);
		//mike.print();
		//System.out.println("************************");
		//Employee tom = new Employee();
		//tom.takeInput(1001, "Tom", 9999);
		//tom.print();
//		System.out.println("Id "+tom.id);
//		System.out.println("Name "+tom.name);
//		System.out.println("Salary "+tom.salary);
		//id = 1002;
		//tom.id = 1001; // 77.id = 1001
		//tom.name = "Tom";
		//tom.salary=9999;
		
//		System.out.println("Id "+tom.id);
//		System.out.println("Name "+tom.name);
//		System.out.println("Salary "+tom.salary);
		int a = 10;

	}

}
