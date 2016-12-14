import java.awt.Frame;
import java.util.ArrayList;

class W
{
	/**
	 * This method is out dated go for W2 Print
	 */
	@Deprecated
	void print(){
		System.out.println("W Print");
	}
}
class W2 extends W
{
	@Override
	void print(){
		System.out.println("W2 Print");
	}
}
public class PreDefineAnnotations {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		ArrayList l = new ArrayList();
		l.add("amit");
		l.add(1);
		Frame frame = new Frame();
		frame.show();
		W obj = new W();
		obj.print();

	}

}
