import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Store implements Serializable{
	int actualNumber;
	int resultComputed;
	Store(int actualNumber , int resultComputed){
		this.actualNumber = actualNumber;
		this.resultComputed = resultComputed;
	}
}
public class FileOperations {
	
	public Store readObject() throws IOException, ClassNotFoundException{
		String path = "/Users/amit/Documents/test1/fact.dat";
		FileInputStream fs = null;
		ObjectInputStream os = null;
		Store store  = null;
		// FileInputStream is Used to read the Bytes from a File
		try{
		File file = new File(path);
		if(!file.exists()){
			return null;
		}
		 fs = new FileInputStream(path);
		// ObjectInputStream is used to convert the Bytes into Object
		// this Process is called DeSerialization
		 os = new ObjectInputStream(fs);
		 store =(Store)os.readObject();
		}
		finally{
		if(os!=null){	
			os.close();
		}
		if(fs!=null){
			fs.close();
		}
		}
		return store;
		
		
	}
	
	public boolean writeObject(int num1 , int num2) throws IOException{
		// Object Need to be Convert into Bytes
		// and Only Bytes will be store in a file
		FileOutputStream fs = null;
		ObjectOutputStream os = null;
		Store store =new Store(num1,num2);
		// To Write Bytes in a File (FileOutputStream)
		String filePath = "/Users/amit/Documents/test1/fact.dat";
		try{
		 fs= new FileOutputStream(filePath);
		 os=new ObjectOutputStream(fs);
		os.writeObject(store);
		
		}
		finally{
			if(os!=null){
				os.close();
			}
			if(fs!=null){
				fs.close();
			}
			
		}
		return true;
		
	}

}
