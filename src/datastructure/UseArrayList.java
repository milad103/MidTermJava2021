package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 */


		ArrayList<String> day = new ArrayList<String>();
// adding values to ArrayList
		day.add("Monday");
		day.add("Tuesday");
		day.add("Wednesday");
		day.add("Thursday");

// Print an ArrayList
		System.out.println(day);

		// Print using for each loop
		for (String nameOfDay : day){
			System.out.println(nameOfDay);
		}

// remove a value from Arraylist
		System.out.println("Removed element at Index 2 is: " + day.remove(2));

		// retrieving an element from the ArrayList
		//System.out.println("Retrieving an element from the ArrayList: " + day);

		//Traversing list through Iterator
		Iterator itr = day.iterator();//getting the Iterator
		while(itr.hasNext()){//check if iterator has the elements
			System.out.println(itr.next());//printing the element and move to next

			//Removing specific element from arraylist
			day.remove("Monday");
			System.out.println("After invoking remove(object) method: "+day);

			//Removing element on the basis of specific position
			day.remove(1);
			System.out.println("After invoking remove(index) method: "+day);
		}

	}

}

