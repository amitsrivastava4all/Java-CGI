// Class has only one moto
// S O L I D
// S - SRP 
// D - DRY
// O - Open / Close Principle
// OOPS - Encapsulation 
// Good Encapsulation - private variables + public methods
// Data Hiding
public class Employee {
	// Instance Member Variable of a class
	private int id;
	private String name;
	private double salary;
	private String managerName;
	private String deptName;
	private String phone;
	private String companyName;
	
	
	
	
public int getId() {
		return id;
	}

public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	//	{
//		System.out.println("I am Init Block and I am Pre Cons Call");
//		id = 1000;
//		this.print();
//	}
//	{
//		System.out.println("I am the Second Block...");
//	}
	// Param Cons
	Employee(int id , String name , double salary){
		//Employee();
		this();
		this.id= id + companyName.length();
		this.name = name;
		this.salary = salary;
		//this();
	}
	
	// Default Cons
	Employee(){
		companyName ="CGI";
		//id = 1001;
		//System.out.println("Default Cons I Will Call When Object is Created...");
	}
	
	// Local Variables
//	public void takeInput(int id , String name, double salary){
//		// Local Variable Value Assign to Instance Variables
//		if(id>0 && name!=null && salary>0){
//		this.id = id;
//		this.name = name;
//		this.salary = salary;
//		}
//		else
//		{
//			System.err.println("Invalid Data...");
//			System.exit(0);
//		}
//	}
	
	public void print(){
		// this hold the current reference
		System.out.println("Id "+this.id);
		System.out.println("Name "+name);
		System.out.println("Salary "+salary);
		System.out.println("Company Name "+companyName);
	}
	
	
}
