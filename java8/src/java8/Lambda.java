package java8;

public class Lambda {

	/*parameter -> expression body*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = (message) -> System.out.println("Hello " + message);
		test.display("Sagar");
	}
	
	interface Test{
		void display(String name);
	}

}
