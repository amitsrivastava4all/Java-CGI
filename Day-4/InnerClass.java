/*
 * Generalization , Specialization , Realization
 * Aggegration , Composition
 */
// Method Local Inner Class
class YY
{
	void show(){
		 int rr=90;
		class B
		{
			void show(){
				System.out.println("Show Call "+rr);
			}
		}
		B obj = new B();
		obj.show();
		//rr++;
	}
}

// Nested Class
class E
{
	static class R
	{
		static void print(){
			System.out.println("R Print Call");
		}
	}
}


interface P
{
	
}
class W implements P{
	
}

class A
{
	static int y = 90;
	int x = 10;
	interface K
	{
		
	}
	class T implements K
	{
		int x = 90;
	}
	class B extends T
	{
		int x = 20;
		class C{
			int x = 30;
			C(int x){
				int z = x + A.y +  this.x + B.this.x + B.super.x + A.this.x;
				System.out.println("Z ");
			}
		}
	}
}


//Inner Class
class Customer{  // Outer Class
	Customer(){
		System.out.println("Customer Call");
		LoanAccount account = new LoanAccount(); //1st way to create inner class object
	}
	class LoanAccount  // Inner Class (Member)
	{
		LoanAccount(){
			System.out.println("Loan Account Call");
		}
	}
}

class Employee{
	Account account;
	Employee(Account account){
		System.out.println("Employee Join..");
		//account = new Account();
		this.account = account;
	}
	@Override
	protected void finalize(){
		System.out.println("Gud Bye Employee...");
	}
}
class Account
{
	Account(){
		System.out.println("Account Created...");
	}
	@Override
	protected void finalize(){
		System.out.println("Account Close...");
	}
	
}
public class InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		W obj = new W();
		P obj2 = new W();
		Customer customer = new Customer();
		// 2nd way to use inner class
		Customer.LoanAccount l = customer.new LoanAccount();
		
		//3rd way
		Customer.LoanAccount obj3 = new Customer().new LoanAccount();
		Account account = new Account();
		Employee ram =new Employee(account);
		ram = null;
		System.gc();
		E.R.print();
		System.out.println("Method Local Inner Class");
		YY obj5 = new YY();
		obj5.show();
	}

}
