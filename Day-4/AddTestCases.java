import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class AddTestCases {
	
	//@Ignore
	@Test(timeout=10)
	public void testAdd(){
		FunctionalityClass f =new FunctionalityClass();
		int result = f.add(10, 20);
		Assert.assertEquals(30, result);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testAdd2(){
		FunctionalityClass f =new FunctionalityClass();
		int result = f.add(0, 0);
		//Assert.assertEquals(130, result);
	}

}
