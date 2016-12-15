class T1
{
	String w ;
	T1(String w){
		this.w = w;
	}
}
public class StringBufferAndBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringBuffer sb = new StringBuffer("amit");
		//StringBuilder sb = new StringBuilder();
		StringBuffer sb = new StringBuffer();
		sb.append("gdfghfdjkhgjdkfhgdhfgjkdfhfjsdhjkhsdjfhlghdhklfhgjk");
		sb.insert(1, "Hi");
		sb.deleteCharAt(0);
		sb.delete(2, 5);
		sb.reverse();
		sb.ensureCapacity(100);
		sb.trimToSize();
		// new capacity = oldCapacity * 2 + 2
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		int e [] = new int[10];
		System.out.println(e);
		T1 obj2 = new T1("Hello");
		System.out.println(obj2);
		// Literal Way
		String a = "Amit"; //1 or 0
		String b = "Amit";
		a= "Ram";
		System.out.println("Now a is "+a +" and b is "+b);
		String c = new String("Mike"); //2 or 1
		if(a==b){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}
		Integer x = 200;
		Integer y = 200;
		if(x==y){
			System.out.println("Same Integer Ref");
		}
		else
		{
			System.out.println("Not Same Integer Ref");
		}
		//T1 obj2 = "Hello";
		T1 obj =new T1("Hello");
		

	}

}
