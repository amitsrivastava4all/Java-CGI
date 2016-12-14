class R
{
	
}
class Customer implements Cloneable{
	private int id;
	private String name;
	@Override
	public int hashCode(){
		return name.length();
	}
	
	Customer(int id , String name){
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	@Override
	public boolean equals(Object object){
		
		if(object instanceof Customer){
			Customer secondObject = (Customer) object; // Downcasting
			Customer firstObject = this;
			if(firstObject.id==secondObject.id && 
					firstObject.name.equals(secondObject.name)){
				return true;
			}
		}
		return false;
		
		
	}
	
}
public class AllAboutObjectClass {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Integer p  = new Integer(1000);
		System.out.println(p);
		Customer ram = new Customer(1001,"Ram");
		Customer tim =new Customer(1002,"tim");
		System.out.println("Ram HashCode "+ram.hashCode());
		System.out.println("Tim HashCode "+tim.hashCode());
		Customer ram3 = (Customer)ram.clone();
		if(ram==ram3){
			System.out.println("Same Ref Clone is Not Done");
			
		}
		else
		{
			System.out.println("Not Same Ref (Clone is Done)");
			System.out.println(ram +" "+ram3);
		}
		//int x = 10;
		//int y = x;
		Customer ram2 = new Customer(1001,"Ram");
		if(ram.equals(ram2)){
			System.out.println("Same Customer Objects");
		}
		else
		{
			System.out.println("Not Same Customer Objects.");
		}
		System.out.println(ram); // ClassName@HashCode
		String x = new String("Hello");
		String y = new String("Hello");
		if(x.equals(y)){
			System.out.println("Same String");
		}
		else
		{
			System.out.println("Not Same String");
		}
		System.out.println(x); //Hello
		R obj = new R();
		System.out.println(obj);
		System.out.println(obj.hashCode());
		
		
		
		
	}

}
