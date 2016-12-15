
public class FunctionalityClass {
	public int add(int x, int y){
		if(x==0 && y==0){
			throw new ArithmeticException();
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x + y;
	}

}
