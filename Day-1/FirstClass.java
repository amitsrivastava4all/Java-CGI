import java.math.BigDecimal;
import java.math.BigInteger;

// IEEE-754 Standard
public strictfp class FirstClass {

	// Java 5 Onwards Var - Args
	static public  void main(String ...arr) {
		// TODO Auto-generated method stub
		// Data Types
		// 1. Primitive and 2. Reference
		// byte 1 Byte  -128 to 127, short -2 Byte , int - 4 Byte , long - 8 Byte
		// 0,1 - Base 2 , 8 Bit, 7 Bit is for number and 1 is for + -
		// -2 ^ 7 to (2 ^ 7) -1
		// float 4 Byte, double 8 Byte
		// boolean 1 true 0 false ( 1 Byte or 2 Byte or 4 Byte)
		// char - 2 Byte (UNICODE)
		String aa = "amit srivastava";
		String bb = aa;
		// Wrapper Classes
		// AutoBoxing
		BigInteger bg = BigInteger.ONE;
		BigDecimal b1 = BigDecimal.valueOf(90.20);
		BigDecimal b2 = BigDecimal.valueOf(990.20);
		BigDecimal b3 = b1.multiply(b2);
		Integer a1 = 99;
		a1++;
		Integer p2 = new Integer(90); //Boxing 
		int t = p2.intValue(); // UnBoxing
		t++;
		p2 = new Integer(t); // Boxing
		//p2++;
		//AutoBoxing (Java 5)
		byte w = p2.byteValue();  //xxxValue()
		Float y1 = 90.10f;
		float y2 = 90.10f;
		int p = 90;
		int p1 = p;
		p++;
		++p;
		byte a = 100;
		byte b = 30;
		byte c = (byte)(a + b);
		
		System.out.println("Hello Java "+c);

	}

}
