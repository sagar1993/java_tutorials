package java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * stream() − Returns a sequential stream considering collection as its
		 * source.
		 * 
		 * parallelStream() − Returns a parallel Stream considering collection
		 * as its source.
		 */
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

		/*
		 * Stream has provided a new method ‘forEach’ to iterate each element of
		 * the stream. The following code segment shows how to print 10 random
		 * numbers using forEach.
		 */
		filtered.forEach(System.out::println);

		/*
		 * The ‘map’ method is used to map each element to its corresponding
		 * result. The following code segment prints unique squares of numbers
		 * using map.
		 */

		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		// get list of unique squares
		List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());

		squaresList.forEach(x -> System.out.println(x));

		/*
		 * The ‘filter’ method is used to eliminate elements based on a
		 * criteria. The following code segment prints a count of empty strings
		 * using filter.
		 */

		// get count of empty string
		int count = (int) strings.stream().filter(string -> string.isEmpty()).count();

		System.out.println(count);

		/*
		 * The ‘limit’ method is used to reduce the size of the stream. The
		 * following code segment shows how to print 10 random numbers using
		 * limit.
		 */

		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);

		/*
		 * The ‘sorted’ method is used to sort the stream. The following code
		 * segment shows how to print 10 random numbers in a sorted order.
		 */

		random.ints().limit(10).sorted().forEach(System.out::println);

		/*
		 * parallelStream is the alternative of stream for parallel processing.
		 * Take a look at the following code segment that prints a count of
		 * empty strings using parallelStream.
		 */

		count = (int) strings.parallelStream().filter(string -> string.isEmpty()).count();
		System.out.println(count);

		/*
		 * Collectors are used to combine the result of processing on the
		 * elements of a stream. Collectors can be used to return a list or a
		 * string.
		 */
		
		/*
		 * With Java 8, statistics collectors are introduced to calculate all
		 * statistics when stream processing is being done.
		 */
		List<Integer> integers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		IntSummaryStatistics stats = integers.stream().mapToInt((x) -> x).summaryStatistics();

		System.out.println("Highest number in List : " + stats.getMax());
		System.out.println("Lowest number in List : " + stats.getMin());
		System.out.println("Sum of all numbers : " + stats.getSum());
		System.out.println("Average of all numbers : " + stats.getAverage());
		
		
		
	}

}
