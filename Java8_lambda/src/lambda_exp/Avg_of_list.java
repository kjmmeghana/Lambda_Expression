package lambda_exp;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream; 

public class Avg_of_list {
	static void aver(List<Integer> list) {
		list.stream() 
			    .mapToInt(i -> i) 
			    .average() 
			    .ifPresent(avg -> System.out.println("Average found is " + avg));
	}
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(13, 17, 19, 23, 29);
		aver(list);
		
	}
}
