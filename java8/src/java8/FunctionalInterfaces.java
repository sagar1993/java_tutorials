package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterfaces {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Java 8 has defined a lot of functional interfaces to be used
		 * extensively in lambda expressions.
		 */
		
		
		/*
		 * Predicate <T> interface is a functional interface with a method
		 * test(Object) to return a Boolean value. This interface signifies that
		 * an object is tested to be true or false.
		 * 
		 * There are many more predicates
		 */
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		
		System.out.println("print all");
		eval(numbers, n->true);
		
		System.out.println("print even");
		eval(numbers, n-> n%2 == 0);
	}

	private static void eval(List<Integer> numbers, Predicate<Integer> predicate) {
		// TODO Auto-generated method stub
		for(Integer n: numbers){
			if(predicate.test(n)){
				System.out.println(n);
			}
		}
	}
	
}
