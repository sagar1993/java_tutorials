package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {

	/*The object de serialization works using ObjectInputStream*/
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		ObjectInputStream stream = new ObjectInputStream(new FileInputStream("f.txt"));
		Person p = (Person) stream.readObject();
		stream.close();
		
		System.out.println(p.name + " " + p.age);
	}

}
