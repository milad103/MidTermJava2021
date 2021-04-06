package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */


		List<String> student = new ArrayList<>();
		student.add("Milad");
		student.add("ASM");
		student.add("Rezaul");

		List<String> country = new ArrayList<>();
		country.add("Canada");
		country.add("USA");
		country.add("Bangladesh");

		List<Integer> id = new ArrayList<>();
		id.add(1);
		id.add(2);
		id.add(3);

		Map<String, List<String>> list1 = new LinkedHashMap<>();
		list1.put("student name", student);
		list1.put("country of origin", country);

		Map<String, List<Integer>> list2 = new LinkedHashMap<>();
		list2.put("ID", id);

		for (Map.Entry key : list1.entrySet()) {
			System.out.println(key.getKey()+ " " + key.getValue());

		}
		for (Map.Entry key : list2.entrySet()){
			System.out.println(key.getKey()+ " " + key.getValue());
		}


	}


}









