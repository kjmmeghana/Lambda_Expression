package lambda_exp;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
public class Strings_a_3 {
	public static List<String> search(List<String> array_a_3) {
		return array_a_3
				.stream()
				.filter(s -> s.startsWith("a") && s.length()==3)
				.collect(Collectors.toList());
	}
	
	public static void main(String args[]) {
		
		List<String> str_list = new ArrayList<String>();
		    str_list.add("ane"); 
		    str_list.add("ace"); 
		    str_list.add("meghana");
		    str_list.add("epam");
		    str_list.add("ahead"); 
		    str_list.add("ant"); 
	        List<String> array_a_3 = search(str_list); 
	        System.out.println(array_a_3);
   	}

}
