import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Test1 {
	@Test
	public void mytest(){
		Assert.assertEquals(10, 10);
	}
	
	 @Test(expected = ArithmeticException.class)
	   public void test2() {	
	      
	   }
	
	 @Test(timeout = 1000)
	   public void test3() {	
	       
	   }
	
	@Ignore
	   @Test
	   public void testPrintMessage() {
	      
	   }
}
