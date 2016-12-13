/*
 * Must Be Inheritance
 * Signature of Method Must be Same
 * 1. Rule --> Weaker Access Rule
 *  (Increase or Same the Access Scope in Overridden Method)
 *  Rule -2 CoVariant Return Type (Java 5)
 */
class X
{
	int a,b,c;
	X(){
		a = 10;
		b = 20;
		c = 30;
	}
}
class XPlus extends X
{
	int d;
	XPlus(){
		d = 90;
	}
}
class Z
{
	int r,p;
}
class Parent
{
	 
	protected X show(){
		System.out.println("Parent Show Call");
		X obj= new X();
		return obj;
	}
}
class Child extends Parent{
	@Override
	public XPlus show(){
		System.out.println("Child Show Call");
		XPlus obj= new XPlus();
		return obj;
		
	}
}
public class OverridingRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
