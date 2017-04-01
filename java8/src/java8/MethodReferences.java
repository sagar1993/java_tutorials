package java8;

import java.util.ArrayList;
import java.util.List;

public class MethodReferences {

	/*
	 * Method references help to point to methods by their names. A method
	 * reference is described using :: (double colon) symbol. A method reference
	 * can be used to point the following types of methods −
	 * 
	 * Static methods 
	 * Instance methods 
	 * Constructors using new operator
	 * (TreeSet::new)
	 */
	
	public static void main(String[] args) {
		Test test = (message) -> System.out.println("Got: "+message);
		
		List<String> names = new ArrayList<String>();
		names.add("1");
		names.add("2");
		names.add("3");
		
		names.forEach(System.out::println);
		names.forEach(test::print);
		names.forEach(Test1::print);
	}
}

interface Test{
	public void print(String x);
}

class Test1 {
	static void print(String x){
		System.out.println(" : " + x);
	}
}