import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResource {

	public static void main(String[] args) {
		try(FileOutputStream fs= new FileOutputStream("abcd.txt")){
		fs.write("amit".getBytes());
		System.out.println("Done...");
		}
		catch(IOException e){
			System.out.println("Unable To Write "+e);
		}
	
		
		// TODO Auto-generated method stub
//		int x = 10/0;   // ArithmeticException
//		int y[] = new int[10];
//		y[11]= 100; // ArrayIndexOutputOfBoundException
//		String temp = null;
//		System.out.println(temp.length()); // NullPointerException
//		try {
//			FileOutputStream fs= new FileOutputStream("abcd.txt");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		

	}

}
