package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


/*Class to test object serialization - ObjectOutputStream which is used to write object on OutStream*/

public class Serialization {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Person person = new Person("Sagar", 24);
		
		FileOutputStream file = new FileOutputStream("f.txt");
		ObjectOutputStream obj = new ObjectOutputStream(file);
		
		obj.writeObject(person);
		obj.close();
		
		System.out.println("Done");
		
	}

}
